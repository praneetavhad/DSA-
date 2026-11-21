package Neetcode250.DynamicProgramming1D;

import Neetcode250.common.*;
import java.util.*;

/*
 * 279. Perfect Squares   [Medium]
 * LeetCode: https://leetcode.com/problems/perfect-squares/
 * NeetCode: https://neetcode.io/problems/perfect-squares
 *
 * Given an integer n, return the least number of perfect square numbers that sum to n.
 *
 * A perfect square is an integer that is the square of an integer; in other words, it is the product
 * of some integer with itself. For example, 1, 4, 9, and 16 are perfect squares while 3 and 11 are
 * not.
 *
 * Example 1:
 * Input: n = 12
 * Output: 3
 * Explanation: 12 = 4 + 4 + 4.
 *
 * Example 2:
 * Input: n = 13
 * Output: 2
 * Explanation: 13 = 4 + 9.
 *
 * Constraints:
 *   - 1 <= n <= 10^4
 */
public class Q15_PerfectSquares {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int numSquares(int n) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("279. Perfect Squares");

        tester.check("n = 12", "3", () -> {
            int n = 12;
            return new Solution().numSquares(n);
        });
        tester.check("n = 13", "2", () -> {
            int n = 13;
            return new Solution().numSquares(n);
        });

        tester.done();
    }
}
