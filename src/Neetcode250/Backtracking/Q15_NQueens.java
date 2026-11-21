package Neetcode250.Backtracking;

import Neetcode250.common.*;
import java.util.*;

/*
 * 51. N-Queens   [Hard]
 * LeetCode: https://leetcode.com/problems/n-queens/
 * NeetCode: https://neetcode.io/problems/n-queens
 *
 * The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two
 * queens attack each other.
 *
 * Given an integer n, return all distinct solutions to the n-queens puzzle. You may return the answer
 * in any order.
 *
 * Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.'
 * both indicate a queen and an empty space, respectively.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2020/11/13/queens.jpg]
 * Input: n = 4
 * Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
 * Explanation: There exist two distinct solutions to the 4-queens puzzle as shown above
 *
 * Example 2:
 * Input: n = 1
 * Output: [["Q"]]
 *
 * Constraints:
 *   - 1 <= n <= 9
 */
public class Q15_NQueens {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public List<List<String>> solveNQueens(int n) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("51. N-Queens");
        // Answers are compared ignoring the order of the outer list (problem allows any order).

        tester.check("n = 4", "[[\".Q..\",\"...Q\",\"Q...\",\"..Q.\"],[\"..Q.\",\"Q...\",\"...Q\",\".Q..\"]]", Tester.Order.ANY, () -> {
            int n = 4;
            return new Solution().solveNQueens(n);
        });
        tester.check("n = 1", "[[\"Q\"]]", Tester.Order.ANY, () -> {
            int n = 1;
            return new Solution().solveNQueens(n);
        });

        tester.done();
    }
}
