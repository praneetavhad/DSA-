package Neetcode250.Graphs;

import Neetcode250.common.*;
import java.util.*;

/*
 * 684. Redundant Connection   [Medium]
 * LeetCode: https://leetcode.com/problems/redundant-connection/
 * NeetCode: https://neetcode.io/problems/redundant-connection
 *
 * In this problem, a tree is an undirected graph that is connected and has no cycles.
 *
 * You are given a graph that started as a tree with n nodes labeled from 1 to n, with one additional
 * edge added. The added edge has two different vertices chosen from 1 to n, and was not an edge that
 * already existed. The graph is represented as an array edges of length n where edges[i] = [a_i, b_i]
 * indicates that there is an edge between nodes a_i and b_i in the graph.
 *
 * Return an edge that can be removed so that the resulting graph is a tree of n nodes. If there are
 * multiple answers, return the answer that occurs last in the input.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2021/05/02/reduntant1-1-graph.jpg]
 * Input: edges = [[1,2],[1,3],[2,3]]
 * Output: [2,3]
 *
 * Example 2:
 * [image: https://assets.leetcode.com/uploads/2021/05/02/reduntant1-2-graph.jpg]
 * Input: edges = [[1,2],[2,3],[3,4],[1,4],[1,5]]
 * Output: [1,4]
 *
 * Constraints:
 *   - n == edges.length
 *   - 3 <= n <= 1000
 *   - edges[i].length == 2
 *   - 1 <= a_i < b_i <= edges.length
 *   - a_i != b_i
 *   - There are no repeated edges.
 *   - The given graph is connected.
 */
public class Q17_RedundantConnection {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int[] findRedundantConnection(int[][] edges) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("684. Redundant Connection");

        tester.check("edges = [[1,2],[1,3],[2,3]]", "[2,3]", () -> {
            int[][] edges = new int[][]{{1, 2}, {1, 3}, {2, 3}};
            return new Solution().findRedundantConnection(edges);
        });
        tester.check("edges = [[1,2],[2,3],[3,4],[1,4],[1,5]]", "[1,4]", () -> {
            int[][] edges = new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}};
            return new Solution().findRedundantConnection(edges);
        });

        tester.done();
    }
}
