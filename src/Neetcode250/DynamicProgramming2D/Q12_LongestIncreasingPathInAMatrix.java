package Neetcode250.DynamicProgramming2D;

import Neetcode250.common.*;
import java.util.*;

/*
 * 329. Longest Increasing Path in a Matrix   [Hard]
 * LeetCode: https://leetcode.com/problems/longest-increasing-path-in-a-matrix/
 * NeetCode: https://neetcode.io/problems/longest-increasing-path-in-matrix
 *
 * Given an m x n integers matrix, return the length of the longest increasing path in matrix.
 *
 * From each cell, you can either move in four directions: left, right, up, or down. You may not move
 * diagonally or move outside the boundary (i.e., wrap-around is not allowed).
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2021/01/05/grid1.jpg]
 * Input: matrix = [[9,9,4],[6,6,8],[2,1,1]]
 * Output: 4
 * Explanation: The longest increasing path is [1, 2, 6, 9].
 *
 * Example 2:
 * [image: https://assets.leetcode.com/uploads/2021/01/27/tmp-grid.jpg]
 * Input: matrix = [[3,4,5],[3,2,6],[2,2,1]]
 * Output: 4
 * Explanation: The longest increasing path is [3, 4, 5, 6]. Moving diagonally is not allowed.
 *
 * Example 3:
 * Input: matrix = [[1]]
 * Output: 1
 *
 * Constraints:
 *   - m == matrix.length
 *   - n == matrix[i].length
 *   - 1 <= m, n <= 200
 *   - 0 <= matrix[i][j] <= 2^31 - 1
 */
public class Q12_LongestIncreasingPathInAMatrix {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int longestIncreasingPath(int[][] matrix) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("329. Longest Increasing Path in a Matrix");

        tester.check("matrix = [[9,9,4],[6,6,8],[2,1,1]]", "4", () -> {
            int[][] matrix = new int[][]{{9, 9, 4}, {6, 6, 8}, {2, 1, 1}};
            return new Solution().longestIncreasingPath(matrix);
        });
        tester.check("matrix = [[3,4,5],[3,2,6],[2,2,1]]", "4", () -> {
            int[][] matrix = new int[][]{{3, 4, 5}, {3, 2, 6}, {2, 2, 1}};
            return new Solution().longestIncreasingPath(matrix);
        });
        tester.check("matrix = [[1]]", "1", () -> {
            int[][] matrix = new int[][]{{1}};
            return new Solution().longestIncreasingPath(matrix);
        });

        tester.done();
    }
}
