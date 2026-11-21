package Neetcode250.common;

import java.util.*;

/**
 * Parse helpers: build inputs from LeetCode-style text, so you can copy test cases straight
 * from the LeetCode "Testcase" panel.
 *
 *   P.tree("[3,9,20,null,null,15,7]")   -> TreeNode
 *   P.list("[1,2,3]")                   -> ListNode
 *   P.li("[1,2,3]")                     -> List&lt;Integer&gt;  (mutable)
 *   P.iaa("[[1,2],[3,4]]")              -> int[][]
 */
public final class P {
    private P() {}

    /** Parses a list; "null" or "" is treated as an empty list. */
    @SuppressWarnings("unchecked")
    private static List<Object> arr(String s) {
        if (s == null || s.isBlank()) return new ArrayList<>();
        Object v = Json.parse(s);
        return v == null ? new ArrayList<>() : (List<Object>) v;
    }

    private static int toInt(Object o) { return ((Number) o).intValue(); }

    // ---------- arrays ----------
    public static int[] ia(String s) { return toIntArr(arr(s)); }
    public static int[][] iaa(String s) {
        List<Object> a = arr(s);
        int[][] out = new int[a.size()][];
        for (int k = 0; k < a.size(); k++) out[k] = toIntArr(asList(a.get(k)));
        return out;
    }
    public static long[] la(String s) {
        List<Object> a = arr(s);
        long[] out = new long[a.size()];
        for (int k = 0; k < out.length; k++) out[k] = ((Number) a.get(k)).longValue();
        return out;
    }
    public static double[] da(String s) {
        List<Object> a = arr(s);
        double[] out = new double[a.size()];
        for (int k = 0; k < out.length; k++) out[k] = ((Number) a.get(k)).doubleValue();
        return out;
    }
    public static String[] sa(String s) { return arr(s).stream().map(o -> (String) o).toArray(String[]::new); }
    public static char[] ca(String s) {
        List<Object> a = arr(s);
        char[] out = new char[a.size()];
        for (int k = 0; k < out.length; k++) out[k] = ((String) a.get(k)).charAt(0);
        return out;
    }
    public static char[][] caa(String s) {
        List<Object> a = arr(s);
        char[][] out = new char[a.size()][];
        for (int k = 0; k < a.size(); k++) {
            List<Object> row = asList(a.get(k));
            out[k] = new char[row.size()];
            for (int j = 0; j < row.size(); j++) out[k][j] = ((String) row.get(j)).charAt(0);
        }
        return out;
    }

    // ---------- lists (always mutable ArrayLists) ----------
    public static List<Integer> li(String s) {
        List<Integer> out = new ArrayList<>();
        for (Object o : arr(s)) out.add(o == null ? null : toInt(o));
        return out;
    }
    public static List<String> ls(String s) {
        List<String> out = new ArrayList<>();
        for (Object o : arr(s)) out.add((String) o);
        return out;
    }
    public static List<List<Integer>> lli(String s) {
        List<List<Integer>> out = new ArrayList<>();
        for (Object o : arr(s)) out.add(li(Fmt.str(o)));
        return out;
    }
    public static List<List<String>> lls(String s) {
        List<List<String>> out = new ArrayList<>();
        for (Object o : arr(s)) out.add(ls(Fmt.str(o)));
        return out;
    }

    // ---------- linked lists ----------
    public static ListNode list(String s) {
        ListNode dummy = new ListNode(), tail = dummy;
        for (Object o : arr(s)) { tail.next = new ListNode(toInt(o)); tail = tail.next; }
        return dummy.next;
    }
    public static ListNode[] lists(String s) {
        List<Object> a = arr(s);
        ListNode[] out = new ListNode[a.size()];
        for (int k = 0; k < out.length; k++) out[k] = list(Fmt.str(a.get(k)));
        return out;
    }
    /** Builds a list whose tail points back to the node at index pos (pos = -1 means no cycle). */
    public static ListNode cycle(String s, int pos) {
        ListNode head = list(s);
        if (pos < 0 || head == null) return head;
        ListNode tail = head, target = null;
        for (int k = 0; ; k++) {
            if (k == pos) target = tail;
            if (tail.next == null) break;
            tail = tail.next;
        }
        tail.next = target;
        return head;
    }

    // ---------- trees ----------
    public static TreeNode tree(String s) {
        List<Object> a = arr(s);
        if (a.isEmpty() || a.get(0) == null) return null;
        TreeNode root = new TreeNode(toInt(a.get(0)));
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int k = 1;
        while (!q.isEmpty() && k < a.size()) {
            TreeNode cur = q.poll();
            if (k < a.size() && a.get(k) != null) { cur.left = new TreeNode(toInt(a.get(k))); q.add(cur.left); }
            k++;
            if (k < a.size() && a.get(k) != null) { cur.right = new TreeNode(toInt(a.get(k))); q.add(cur.right); }
            k++;
        }
        return root;
    }
    /** Finds the node with the given value (used when a problem passes nodes p / q from the tree). */
    public static TreeNode find(TreeNode root, int val) {
        if (root == null || root.val == val) return root;
        TreeNode l = find(root.left, val);
        return l != null ? l : find(root.right, val);
    }

    // ---------- internals ----------
    @SuppressWarnings("unchecked")
    private static List<Object> asList(Object o) { return (List<Object>) o; }
    private static int[] toIntArr(List<Object> a) {
        int[] out = new int[a.size()];
        for (int k = 0; k < out.length; k++) out[k] = toInt(a.get(k));
        return out;
    }
}
