package Neetcode250.Backtracking;

import Neetcode250.common.*;
import java.util.*;

/*
 * 52. N-Queens II   [Hard]
 * LeetCode: https://leetcode.com/problems/n-queens-ii/
 * NeetCode: https://neetcode.io/problems/n-queens-ii
 *
 * The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two
 * queens attack each other.
 *
 * Given an integer n, return the number of distinct solutions to the n-queens puzzle.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2020/11/13/queens.jpg]
 * Input: n = 4
 * Output: 2
 * Explanation: There are two distinct solutions to the 4-queens puzzle as shown.
 *
 * Example 2:
 * Input: n = 1
 * Output: 1
 *
 * Constraints:
 *   - 1 <= n <= 9
 */
public class Q16_NQueensII {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int totalNQueens(int n) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("52. N-Queens II");

        tester.check("n = 4", "2", () -> {
            int n = 4;
            return new Solution().totalNQueens(n);
        });
        tester.check("n = 1", "1", () -> {
            int n = 1;
            return new Solution().totalNQueens(n);
        });

        tester.done();
    }
}
