package Neetcode250.common;

import java.util.*;
import java.util.function.Supplier;

/**
 * Minimal test runner used by every NeetCode 250 problem's main().
 *
 * <pre>
 *   Tester t = new Tester("Two Sum");
 *   t.check("nums = [2,7,11,15], target = 9", "[0,1]", () -> sol.twoSum(new int[]{2,7,11,15}, 9));
 *   t.done();
 * </pre>
 *
 * The expected value is written in LeetCode's output format. Doubles are compared with a
 * 1e-5 tolerance. Use {@link Order#ANY} when the problem says "return the answer in any order".
 */
public class Tester {

    public enum Order {
        /** Exact match, order matters. */
        EXACT,
        /** The outer list may be in any order (e.g. Top K Frequent, Permutations). */
        ANY,
        /** Every nested list may be in any order (e.g. Subsets, Group Anagrams, 3Sum). */
        ANY_DEEP
    }

    private static final long TIME_LIMIT_MS = 3000;

    private final String name;
    private int total, passed, todo;

    public Tester(String name) {
        this.name = name;
        System.out.println("=== " + name + " ===");
    }

    public void check(String input, String expected, Supplier<Object> run) {
        check(input, expected, Order.EXACT, run);
    }

    public void check(String input, String expected, Order order, Supplier<Object> run) {
        total++;
        String label = "Test " + total;
        Object[] result = new Object[1];
        Throwable[] error = new Throwable[1];
        Thread worker = new Thread(null, () -> {
            try { result[0] = run.get(); } catch (Throwable e) { error[0] = e; }
        }, "solution", 512L * 1024 * 1024); // big stack for deep recursion
        worker.setDaemon(true);
        long start = System.nanoTime();
        worker.start();
        try { worker.join(TIME_LIMIT_MS); } catch (InterruptedException ignored) { }
        long ms = (System.nanoTime() - start) / 1_000_000;

        if (worker.isAlive()) {
            fail(label, input, expected, "TIME LIMIT EXCEEDED (> " + TIME_LIMIT_MS + " ms, infinite loop?)");
            return;
        }
        if (error[0] != null) {
            Throwable e = error[0];
            if (e instanceof UnsupportedOperationException && "TODO".equals(e.getMessage())) {
                todo++;
                System.out.println(label + "  TODO  (not solved yet)");
                return;
            }
            fail(label, input, expected, "EXCEPTION " + e + at(e));
            return;
        }

        Object actual = result[0];
        boolean ok;
        String shown;
        try {
            Object exp = Json.parse(expected);
            // e.g. Lowest Common Ancestor: LeetCode prints just the node's value
            if (!(exp instanceof List) && actual instanceof TreeNode) actual = ((TreeNode) actual).val;
            if (!(exp instanceof List) && actual instanceof ListNode) actual = ((ListNode) actual).val;
            shown = Fmt.str(actual);
            Object act = Json.parse(shown);
            // an empty linked list / tree is a null node in Java but prints as [] on LeetCode
            if (act == null && exp instanceof List && ((List<?>) exp).isEmpty()) act = exp;
            ok = same(normalize(exp, order, 0), normalize(act, order, 0));
        } catch (RuntimeException parseProblem) {
            shown = Fmt.str(actual);
            ok = expected.replaceAll("\\s", "").equals(shown.replaceAll("\\s", ""));
        }

        if (ok) {
            passed++;
            System.out.println(label + "  PASS  (" + ms + " ms)");
        } else {
            fail(label, input, expected, shown);
        }
    }

    /** Prints the summary line. Call once at the end of main(). */
    public void done() {
        System.out.println("-----");
        if (todo == total) {
            System.out.println(name + ": not solved yet - replace the TODO in Solution and run again.");
        } else if (passed == total) {
            System.out.println(name + ": ALL " + total + " TESTS PASSED");
        } else {
            System.out.println(name + ": passed " + passed + "/" + total);
        }
        System.out.println();
    }

    // ---------------------------------------------------------------------------------------

    private void fail(String label, String input, String expected, String got) {
        System.out.println(label + "  FAIL");
        System.out.println("    input:    " + input);
        System.out.println("    expected: " + expected);
        System.out.println("    got:      " + got);
    }

    private static String at(Throwable e) {
        for (StackTraceElement el : e.getStackTrace()) {
            if (el.getClassName().startsWith("Neetcode250.") && !el.getClassName().startsWith("Neetcode250.common")) {
                return "  at " + el.getFileName() + ":" + el.getLineNumber();
            }
        }
        return "";
    }

    private static Object normalize(Object v, Order order, int depth) {
        if (!(v instanceof List) || order == Order.EXACT) return v;
        List<Object> copy = new ArrayList<>();
        for (Object x : (List<?>) v) copy.add(order == Order.ANY_DEEP ? normalize(x, order, depth + 1) : x);
        if (order == Order.ANY_DEEP || depth == 0) copy.sort(Comparator.comparing(Fmt::str));
        return copy;
    }

    private static boolean same(Object a, Object b) {
        if (a == null || b == null) return a == b;
        if (a instanceof Number && b instanceof Number) {
            double x = ((Number) a).doubleValue(), y = ((Number) b).doubleValue();
            return Math.abs(x - y) <= 1e-5 * Math.max(1, Math.abs(x));
        }
        if (a instanceof List && b instanceof List) {
            List<?> x = (List<?>) a, y = (List<?>) b;
            if (x.size() != y.size()) return false;
            for (int k = 0; k < x.size(); k++) if (!same(x.get(k), y.get(k))) return false;
            return true;
        }
        return a.equals(b);
    }
}
