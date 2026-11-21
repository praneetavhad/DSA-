package Neetcode250.common;

import java.util.*;

/** Turns any answer (arrays, lists, ListNode, TreeNode, ...) into LeetCode's printed format. */
public final class Fmt {
    private Fmt() {}

    public static String str(Object o) {
        StringBuilder sb = new StringBuilder();
        write(o, sb);
        return sb.toString();
    }

    private static void write(Object o, StringBuilder sb) {
        if (o == null) { sb.append("null"); return; }
        if (o instanceof String) { quote((String) o, sb); return; }
        if (o instanceof Character) { quote(String.valueOf(o), sb); return; }
        if (o instanceof Double || o instanceof Float) {
            double d = ((Number) o).doubleValue();
            sb.append(d == Math.rint(d) && Math.abs(d) < 1e15 ? String.format("%.1f", d) : String.valueOf(d));
            return;
        }
        if (o instanceof ListNode) { listNode((ListNode) o, sb); return; }
        if (o instanceof TreeNode) { treeNode((TreeNode) o, sb); return; }
        if (o.getClass().isArray()) {
            int n = java.lang.reflect.Array.getLength(o);
            sb.append('[');
            for (int k = 0; k < n; k++) {
                if (k > 0) sb.append(',');
                write(java.lang.reflect.Array.get(o, k), sb);
            }
            sb.append(']');
            return;
        }
        if (o instanceof Iterable) {
            sb.append('[');
            boolean first = true;
            for (Object x : (Iterable<?>) o) {
                if (!first) sb.append(',');
                first = false;
                write(x, sb);
            }
            sb.append(']');
            return;
        }
        sb.append(o);
    }

    private static void quote(String s, StringBuilder sb) {
        sb.append('"');
        for (char c : s.toCharArray()) {
            if (c == '"' || c == '\\') sb.append('\\');
            sb.append(c);
        }
        sb.append('"');
    }

    private static void listNode(ListNode head, StringBuilder sb) {
        sb.append('[');
        int count = 0;
        for (ListNode cur = head; cur != null; cur = cur.next) {
            if (count > 0) sb.append(',');
            if (++count > 10_000) { sb.append("...cycle?"); break; }
            sb.append(cur.val);
        }
        sb.append(']');
    }

    private static void treeNode(TreeNode root, StringBuilder sb) {
        List<String> out = new ArrayList<>();
        // level-order with explicit nulls (LeetCode serialization)
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode t = queue.poll();
            if (t == null) { out.add("null"); continue; }
            out.add(String.valueOf(t.val));
            queue.add(t.left);
            queue.add(t.right);
            if (out.size() > 100_000) break;
        }
        while (!out.isEmpty() && out.get(out.size() - 1).equals("null")) out.remove(out.size() - 1);
        sb.append('[').append(String.join(",", out)).append(']');
    }
}
