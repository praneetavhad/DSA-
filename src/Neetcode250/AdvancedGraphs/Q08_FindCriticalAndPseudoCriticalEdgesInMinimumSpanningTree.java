package Neetcode250.AdvancedGraphs;

import Neetcode250.common.*;
import java.util.*;

/*
 * 1489. Find Critical and Pseudo-Critical Edges in Minimum Spanning Tree   [Hard]
 * LeetCode: https://leetcode.com/problems/find-critical-and-pseudo-critical-edges-in-minimum-spanning-tree/
 * NeetCode: https://neetcode.io/problems/find-critical-and-pseudo-critical-edges-in-minimum-spanning-tree
 *
 * Given a weighted undirected connected graph with n vertices numbered from 0 to n - 1, and an array
 * edges where edges[i] = [a_i, b_i, weight_i] represents a bidirectional and weighted edge between
 * nodes a_i and b_i. A minimum spanning tree (MST) is a subset of the graph's edges that connects all
 * vertices without cycles and with the minimum possible total edge weight.
 *
 * Find all the critical and pseudo-critical edges in the given graph's minimum spanning tree (MST). An
 * MST edge whose deletion from the graph would cause the MST weight to increase is called a critical
 * edge. On the other hand, a pseudo-critical edge is that which can appear in some MSTs but not all.
 *
 * Note that you can return the indices of the edges in any order.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2020/06/04/ex1.png]
 * Input: n = 5, edges = [[0,1,1],[1,2,1],[2,3,2],[0,3,2],[0,4,3],[3,4,3],[1,4,6]]
 * Output: [[0,1],[2,3,4,5]]
 * Explanation: The figure above describes the graph.
 * The following figure shows all the possible MSTs:
 * [image: https://assets.leetcode.com/uploads/2020/06/04/msts.png]
 * Notice that the two edges 0 and 1 appear in all MSTs, therefore they are critical edges, so we
 * return them in the first list of the output.
 * The edges 2, 3, 4, and 5 are only part of some MSTs, therefore they are considered pseudo-critical
 * edges. We add them to the second list of the output.
 *
 * Example 2:
 * [image: https://assets.leetcode.com/uploads/2020/06/04/ex2.png]
 * Input: n = 4, edges = [[0,1,1],[1,2,1],[2,3,1],[0,3,1]]
 * Output: [[],[0,1,2,3]]
 * Explanation: We can observe that since all 4 edges have equal weight, choosing any 3 edges from the
 * given 4 will yield an MST. Therefore all 4 edges are pseudo-critical.
 *
 * Constraints:
 *   - 2 <= n <= 100
 *   - 1 <= edges.length <= min(200, n * (n - 1) / 2)
 *   - edges[i].length == 3
 *   - 0 <= a_i < b_i < n
 *   - 1 <= weight_i <= 1000
 *   - All pairs (a_i, b_i) are distinct.
 */
public class Q08_FindCriticalAndPseudoCriticalEdgesInMinimumSpanningTree {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public List<List<Integer>> findCriticalAndPseudoCriticalEdges(int n, int[][] edges) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("1489. Find Critical and Pseudo-Critical Edges in Minimum Spanning Tree");
        // Answers are compared ignoring the order of the outer list (problem allows any order).

        tester.check("n = 5, edges = [[0,1,1],[1,2,1],[2,3,2],[0,3,2],[0,4,3],[3,4,3],[1,4,6]]", "[[0,1],[2,3,4,5]]", Tester.Order.ANY, () -> {
            int n = 5;
            int[][] edges = new int[][]{{0, 1, 1}, {1, 2, 1}, {2, 3, 2}, {0, 3, 2}, {0, 4, 3}, {3, 4, 3}, {1, 4, 6}};
            return new Solution().findCriticalAndPseudoCriticalEdges(n, edges);
        });
        tester.check("n = 4, edges = [[0,1,1],[1,2,1],[2,3,1],[0,3,1]]", "[[],[0,1,2,3]]", Tester.Order.ANY, () -> {
            int n = 4;
            int[][] edges = new int[][]{{0, 1, 1}, {1, 2, 1}, {2, 3, 1}, {0, 3, 1}};
            return new Solution().findCriticalAndPseudoCriticalEdges(n, edges);
        });

        tester.done();
    }
}
