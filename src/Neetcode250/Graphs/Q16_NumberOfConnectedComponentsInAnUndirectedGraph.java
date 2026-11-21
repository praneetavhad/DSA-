package Neetcode250.Graphs;

import Neetcode250.common.*;
import java.util.*;

/*
 * 323. Number of Connected Components In An Undirected Graph   [Medium]
 * LeetCode: https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/
 * NeetCode: https://neetcode.io/problems/count-connected-components
 *
 * (LeetCode Premium - free version on NeetCode)
 *
 * You have a graph of n nodes. You are given an integer n and an array edges where
 * edges[i] = [a_i, b_i] indicates that there is an undirected edge between a_i and b_i.
 *
 * Return the number of connected components in the graph.
 *
 * Example 1:
 * Input: n = 5, edges = [[0,1],[1,2],[3,4]]
 * Output: 2
 *
 * Example 2:
 * Input: n = 5, edges = [[0,1],[1,2],[2,3],[3,4]]
 * Output: 1
 *
 * Constraints:
 *   - 1 <= n <= 2000
 *   - 1 <= edges.length <= 5000
 *   - edges[i].length == 2, 0 <= a_i <= b_i < n, a_i != b_i
 *   - There are no repeated edges.
 */
public class Q16_NumberOfConnectedComponentsInAnUndirectedGraph {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int countComponents(int n, int[][] edges) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("323. Number of Connected Components In An Undirected Graph");

        tester.check("n = 5, edges = [[0,1],[1,2],[3,4]]", "2", () -> {
            int n = 5;
            int[][] edges = new int[][]{{0, 1}, {1, 2}, {3, 4}};
            return new Solution().countComponents(n, edges);
        });
        tester.check("n = 5, edges = [[0,1],[1,2],[2,3],[3,4]]", "1", () -> {
            int n = 5;
            int[][] edges = new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 4}};
            return new Solution().countComponents(n, edges);
        });
        tester.check("n = 3, edges = []", "3", () -> {
            int n = 3;
            int[][] edges = new int[][]{};
            return new Solution().countComponents(n, edges);
        });

        tester.done();
    }
}
