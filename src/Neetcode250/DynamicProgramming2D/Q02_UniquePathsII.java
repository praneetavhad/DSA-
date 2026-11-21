package Neetcode250.DynamicProgramming2D;

import Neetcode250.common.*;
import java.util.*;

/*
 * 63. Unique Paths II   [Medium]
 * LeetCode: https://leetcode.com/problems/unique-paths-ii/
 * NeetCode: https://neetcode.io/problems/unique-paths-ii
 *
 * You are given an m x n integer array grid. There is a robot initially located at the top-left corner
 * (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]).
 * The robot can only move either down or right at any point in time.
 *
 * An obstacle and space are marked as 1 or 0 respectively in grid. A path that the robot takes cannot
 * include any square that is an obstacle.
 *
 * Return the number of possible unique paths that the robot can take to reach the bottom-right corner.
 *
 * The testcases are generated so that the answer will be less than or equal to 2 * 10^9.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2020/11/04/robot1.jpg]
 * Input: obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]
 * Output: 2
 * Explanation: There is one obstacle in the middle of the 3x3 grid above.
 * There are two ways to reach the bottom-right corner:
 * 1. Right -> Right -> Down -> Down
 * 2. Down -> Down -> Right -> Right
 *
 * Example 2:
 * [image: https://assets.leetcode.com/uploads/2020/11/04/robot2.jpg]
 * Input: obstacleGrid = [[0,1],[0,0]]
 * Output: 1
 *
 * Constraints:
 *   - m == obstacleGrid.length
 *   - n == obstacleGrid[i].length
 *   - 1 <= m, n <= 100
 *   - obstacleGrid[i][j] is 0 or 1.
 */
public class Q02_UniquePathsII {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int uniquePathsWithObstacles(int[][] obstacleGrid) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("63. Unique Paths II");

        tester.check("obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]", "2", () -> {
            int[][] obstacleGrid = new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
            return new Solution().uniquePathsWithObstacles(obstacleGrid);
        });
        tester.check("obstacleGrid = [[0,1],[0,0]]", "1", () -> {
            int[][] obstacleGrid = new int[][]{{0, 1}, {0, 0}};
            return new Solution().uniquePathsWithObstacles(obstacleGrid);
        });

        tester.done();
    }
}
