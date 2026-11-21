package Neetcode250.DynamicProgramming2D;

import Neetcode250.common.*;
import java.util.*;

/*
 * 62. Unique Paths   [Medium]
 * LeetCode: https://leetcode.com/problems/unique-paths/
 * NeetCode: https://neetcode.io/problems/count-paths
 *
 * There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e.,
 * grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The
 * robot can only move either down or right at any point in time.
 *
 * Given the two integers m and n, return the number of possible unique paths that the robot can take
 * to reach the bottom-right corner.
 *
 * The test cases are generated so that the answer will be less than or equal to 2 * 10^9.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2018/10/22/robot_maze.png]
 * Input: m = 3, n = 7
 * Output: 28
 *
 * Example 2:
 * Input: m = 3, n = 2
 * Output: 3
 * Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
 * 1. Right -> Down -> Down
 * 2. Down -> Down -> Right
 * 3. Down -> Right -> Down
 *
 * Constraints:
 *   - 1 <= m, n <= 100
 */
public class Q01_UniquePaths {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int uniquePaths(int m, int n) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("62. Unique Paths");

        tester.check("m = 3, n = 7", "28", () -> {
            int m = 3;
            int n = 7;
            return new Solution().uniquePaths(m, n);
        });
        tester.check("m = 3, n = 2", "3", () -> {
            int m = 3;
            int n = 2;
            return new Solution().uniquePaths(m, n);
        });

        tester.done();
    }
}
