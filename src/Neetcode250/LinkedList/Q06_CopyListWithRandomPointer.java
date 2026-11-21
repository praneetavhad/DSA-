package Neetcode250.LinkedList;

import Neetcode250.common.*;
import java.util.*;

/*
 * 138. Copy List with Random Pointer   [Medium]
 * LeetCode: https://leetcode.com/problems/copy-list-with-random-pointer/
 * NeetCode: https://neetcode.io/problems/copy-linked-list-with-random-pointer
 *
 * A linked list of length n is given such that each node contains an additional random pointer, which
 * could point to any node in the list, or null.
 *
 * Construct a deep copy of the list. The deep copy should consist of exactly n brand new nodes, where
 * each new node has its value set to the value of its corresponding original node. Both the next and
 * random pointer of the new nodes should point to new nodes in the copied list such that the pointers
 * in the original list and copied list represent the same list state. None of the pointers in the new
 * list should point to nodes in the original list.
 *
 * For example, if there are two nodes X and Y in the original list, where X.random --> Y, then for the
 * corresponding two nodes x and y in the copied list, x.random --> y.
 *
 * Return the head of the copied linked list.
 *
 * The linked list is represented in the input/output as a list of n nodes. Each node is represented as
 * a pair of [val, random_index] where:
 *   - val: an integer representing Node.val
 *   - random_index: the index of the node (range from 0 to n-1) that the random pointer points to, or
 *     null if it does not point to any node.
 *
 * Your code will only be given the head of the original linked list.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2019/12/18/e1.png]
 * Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
 * Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]
 *
 * Example 2:
 * [image: https://assets.leetcode.com/uploads/2019/12/18/e2.png]
 * Input: head = [[1,1],[2,1]]
 * Output: [[1,1],[2,1]]
 *
 * Example 3:
 * [image: https://assets.leetcode.com/uploads/2019/12/18/e3.png]
 * Input: head = [[3,null],[3,0],[3,null]]
 * Output: [[3,null],[3,0],[3,null]]
 *
 * Constraints:
 *   - 0 <= n <= 1000
 *   - -10^4 <= Node.val <= 10^4
 *   - Node.random is null or is pointing to some node in the linked list.
 */
public class Q06_CopyListWithRandomPointer {

    // Write your solution here - same code you would submit on LeetCode.
    // Definition for a Node (given by LeetCode).
    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    static class Solution {
        public Node copyRandomList(Node head) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // ---- test helpers: build a list from [[val, randomIndex], ...] and print it back ----
    static Node build(String s) {
        List<List<Integer>> a = P.lli(s);
        List<Node> nodes = new ArrayList<>();
        for (List<Integer> pair : a) nodes.add(new Node(pair.get(0)));
        for (int i = 0; i < nodes.size(); i++) {
            if (i + 1 < nodes.size()) nodes.get(i).next = nodes.get(i + 1);
            Integer r = a.get(i).get(1);
            nodes.get(i).random = r == null ? null : nodes.get(r);
        }
        return nodes.isEmpty() ? null : nodes.get(0);
    }

    static List<List<Integer>> dump(Node copy, Node original) {
        Set<Node> old = Collections.newSetFromMap(new IdentityHashMap<>());
        for (Node n = original; n != null; n = n.next) old.add(n);
        Map<Node, Integer> idx = new IdentityHashMap<>();
        int i = 0;
        for (Node n = copy; n != null; n = n.next) idx.put(n, i++);
        List<List<Integer>> out = new ArrayList<>();
        for (Node n = copy; n != null; n = n.next) {
            if (old.contains(n) || (n.random != null && old.contains(n.random)))
                throw new IllegalStateException("result points to nodes of the original list - must be a deep copy");
            out.add(Arrays.asList(n.val, n.random == null ? null : idx.get(n.random)));
        }
        return out;
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("138. Copy List with Random Pointer");

        tester.check("head = [[7,null],[13,0],[11,4],[10,2],[1,0]]", "[[7,null],[13,0],[11,4],[10,2],[1,0]]", () -> {
            Node head = build("[[7,null],[13,0],[11,4],[10,2],[1,0]]");
            return dump(new Solution().copyRandomList(head), head);
        });
        tester.check("head = [[1,1],[2,1]]", "[[1,1],[2,1]]", () -> {
            Node head = build("[[1,1],[2,1]]");
            return dump(new Solution().copyRandomList(head), head);
        });
        tester.check("head = [[3,null],[3,0],[3,null]]", "[[3,null],[3,0],[3,null]]", () -> {
            Node head = build("[[3,null],[3,0],[3,null]]");
            return dump(new Solution().copyRandomList(head), head);
        });

        tester.done();
    }
}
