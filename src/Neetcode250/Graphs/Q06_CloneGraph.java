package Neetcode250.Graphs;

import Neetcode250.common.*;
import java.util.*;

/*
 * 133. Clone Graph   [Medium]
 * LeetCode: https://leetcode.com/problems/clone-graph/
 * NeetCode: https://neetcode.io/problems/clone-graph
 *
 * Given a reference of a node in a connected undirected graph.
 *
 * Return a deep copy (clone) of the graph.
 *
 * Each node in the graph contains a value (int) and a list (List[Node]) of its neighbors.
 *
 * class Node {
 *     public int val;
 *     public List<Node> neighbors;
 * }
 *
 * Test case format:
 * For simplicity, each node's value is the same as the node's index (1-indexed). For example, the
 * first node with val == 1, the second node with val == 2, and so on. The graph is represented in the
 * test case using an adjacency list.
 *
 * An adjacency list is a collection of unordered lists used to represent a finite graph. Each list
 * describes the set of neighbors of a node in the graph.
 *
 * The given node will always be the first node with val = 1. You must return the copy of the given
 * node as a reference to the cloned graph.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2019/11/04/133_clone_graph_question.png]
 * Input: adjList = [[2,4],[1,3],[2,4],[1,3]]
 * Output: [[2,4],[1,3],[2,4],[1,3]]
 * Explanation: There are 4 nodes in the graph.
 * 1st node (val = 1)'s neighbors are 2nd node (val = 2) and 4th node (val = 4).
 * 2nd node (val = 2)'s neighbors are 1st node (val = 1) and 3rd node (val = 3).
 * 3rd node (val = 3)'s neighbors are 2nd node (val = 2) and 4th node (val = 4).
 * 4th node (val = 4)'s neighbors are 1st node (val = 1) and 3rd node (val = 3).
 *
 * Example 2:
 * [image: https://assets.leetcode.com/uploads/2020/01/07/graph.png]
 * Input: adjList = [[]]
 * Output: [[]]
 * Explanation: Note that the input contains one empty list. The graph consists of only one node with
 * val = 1 and it does not have any neighbors.
 *
 * Example 3:
 * Input: adjList = []
 * Output: []
 * Explanation: This an empty graph, it does not have any nodes.
 *
 * Constraints:
 *   - The number of nodes in the graph is in the range [0, 100].
 *   - 1 <= Node.val <= 100
 *   - Node.val is unique for each node.
 *   - There are no repeated edges and no self-loops in the graph.
 *   - The Graph is connected and all nodes can be visited starting from the given node.
 */
public class Q06_CloneGraph {

    // Write your solution here - same code you would submit on LeetCode.
    // Definition for a Node (given by LeetCode).
    static class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    static class Solution {
        public Node cloneGraph(Node node) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // ---- test helpers: adjacency list (node i+1 -> adjList[i]) <-> graph ----
    static List<Node> originals = new ArrayList<>();

    static Node build(String adj) {
        List<List<Integer>> a = P.lli(adj);
        originals = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) originals.add(new Node(i + 1));
        for (int i = 0; i < a.size(); i++) for (int nb : a.get(i)) originals.get(i).neighbors.add(originals.get(nb - 1));
        return originals.isEmpty() ? null : originals.get(0);
    }

    static List<List<Integer>> dump(Node start) {
        Set<Node> old = Collections.newSetFromMap(new IdentityHashMap<>());
        old.addAll(originals);
        Map<Integer, Node> seen = new TreeMap<>();
        Deque<Node> stack = new ArrayDeque<>();
        if (start != null) stack.push(start);
        while (!stack.isEmpty()) {
            Node n = stack.pop();
            if (old.contains(n)) throw new IllegalStateException("result contains original nodes - must be a deep copy");
            if (seen.containsKey(n.val)) continue;
            seen.put(n.val, n);
            for (Node nb : n.neighbors) stack.push(nb);
        }
        List<List<Integer>> out = new ArrayList<>();
        for (Node n : seen.values()) {
            List<Integer> row = new ArrayList<>();
            for (Node nb : n.neighbors) row.add(nb.val);
            out.add(row);
        }
        return out;
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("133. Clone Graph");

        tester.check("adjList = [[2,4],[1,3],[2,4],[1,3]]", "[[2,4],[1,3],[2,4],[1,3]]", () -> {
            Node node = build("[[2,4],[1,3],[2,4],[1,3]]");
            return dump(new Solution().cloneGraph(node));
        });
        tester.check("adjList = [[]]", "[[]]", () -> {
            Node node = build("[[]]");
            return dump(new Solution().cloneGraph(node));
        });
        tester.check("adjList = []", "[]", () -> {
            Node node = build("[]");
            return dump(new Solution().cloneGraph(node));
        });

        tester.done();
    }
}
