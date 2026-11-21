package Neetcode250.DynamicProgramming1D;

import Neetcode250.common.*;
import java.util.*;

/*
 * 343. Integer Break   [Medium]
 * LeetCode: https://leetcode.com/problems/integer-break/
 * NeetCode: https://neetcode.io/problems/integer-break
 *
 * Given an integer n, break it into the sum of k positive integers, where k >= 2, and maximize the
 * product of those integers.
 *
 * Return the maximum product you can get.
 *
 * Example 1:
 * Input: n = 2
 * Output: 1
 * Explanation: 2 = 1 + 1, 1 x 1 = 1.
 *
 * Example 2:
 * Input: n = 10
 * Output: 36
 * Explanation: 10 = 3 + 3 + 4, 3 x 3 x 4 = 36.
 *
 * Constraints:
 *   - 2 <= n <= 58
 */
public class Q16_IntegerBreak {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int integerBreak(int n) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("343. Integer Break");

        tester.check("n = 2", "1", () -> {
            int n = 2;
            return new Solution().integerBreak(n);
        });
        tester.check("n = 10", "36", () -> {
            int n = 10;
            return new Solution().integerBreak(n);
        });

        tester.done();
    }
}
