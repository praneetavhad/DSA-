package Neetcode250.Graphs;

import Neetcode250.common.*;
import java.util.*;

/*
 * 261. Graph Valid Tree   [Medium]
 * LeetCode: https://leetcode.com/problems/graph-valid-tree/
 * NeetCode: https://neetcode.io/problems/valid-tree
 *
 * (LeetCode Premium - free version on NeetCode)
 *
 * You have a graph of n nodes labeled from 0 to n - 1. You are given an integer n and a list of
 * undirected edges where edges[i] = [a_i, b_i].
 *
 * Return true if the edges of the given graph make up a valid tree, and false otherwise.
 * (A valid tree is connected and has no cycles.)
 *
 * Example 1:
 * Input: n = 5, edges = [[0,1],[0,2],[0,3],[1,4]]
 * Output: true
 *
 * Example 2:
 * Input: n = 5, edges = [[0,1],[1,2],[2,3],[1,3],[1,4]]
 * Output: false
 *
 * Constraints:
 *   - 1 <= n <= 2000
 *   - 0 <= edges.length <= 5000
 *   - edges[i].length == 2, 0 <= a_i, b_i < n, a_i != b_i
 *   - There are no self-loops or repeated edges.
 */
public class Q14_GraphValidTree {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public boolean validTree(int n, int[][] edges) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("261. Graph Valid Tree");

        tester.check("n = 5, edges = [[0,1],[0,2],[0,3],[1,4]]", "true", () -> {
            int n = 5;
            int[][] edges = new int[][]{{0, 1}, {0, 2}, {0, 3}, {1, 4}};
            return new Solution().validTree(n, edges);
        });
        tester.check("n = 5, edges = [[0,1],[1,2],[2,3],[1,3],[1,4]]", "false", () -> {
            int n = 5;
            int[][] edges = new int[][]{{0, 1}, {1, 2}, {2, 3}, {1, 3}, {1, 4}};
            return new Solution().validTree(n, edges);
        });
        tester.check("n = 4, edges = [[0,1],[2,3]]", "false", () -> {
            int n = 4;
            int[][] edges = new int[][]{{0, 1}, {2, 3}};
            return new Solution().validTree(n, edges);
        });
        tester.check("n = 1, edges = []", "true", () -> {
            int n = 1;
            int[][] edges = new int[][]{};
            return new Solution().validTree(n, edges);
        });

        tester.done();
    }
}
