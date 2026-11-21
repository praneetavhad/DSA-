package Neetcode250.DynamicProgramming2D;

import Neetcode250.common.*;
import java.util.*;

/*
 * 64. Minimum Path Sum   [Medium]
 * LeetCode: https://leetcode.com/problems/minimum-path-sum/
 * NeetCode: https://neetcode.io/problems/minimum-path-sum
 *
 * Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right,
 * which minimizes the sum of all numbers along its path.
 *
 * Note: You can only move either down or right at any point in time.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2020/11/05/minpath.jpg]
 * Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
 * Output: 7
 * Explanation: Because the path 1 -> 3 -> 1 -> 1 -> 1 minimizes the sum.
 *
 * Example 2:
 * Input: grid = [[1,2,3],[4,5,6]]
 * Output: 12
 *
 * Constraints:
 *   - m == grid.length
 *   - n == grid[i].length
 *   - 1 <= m, n <= 200
 *   - 0 <= grid[i][j] <= 200
 */
public class Q03_MinimumPathSum {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int minPathSum(int[][] grid) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("64. Minimum Path Sum");

        tester.check("grid = [[1,3,1],[1,5,1],[4,2,1]]", "7", () -> {
            int[][] grid = new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
            return new Solution().minPathSum(grid);
        });
        tester.check("grid = [[1,2,3],[4,5,6]]", "12", () -> {
            int[][] grid = new int[][]{{1, 2, 3}, {4, 5, 6}};
            return new Solution().minPathSum(grid);
        });

        tester.done();
    }
}
