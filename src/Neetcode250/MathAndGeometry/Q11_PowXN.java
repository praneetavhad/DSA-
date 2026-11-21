package Neetcode250.MathAndGeometry;

import Neetcode250.common.*;
import java.util.*;

/*
 * 50. Pow(x, n)   [Medium]
 * LeetCode: https://leetcode.com/problems/powx-n/
 * NeetCode: https://neetcode.io/problems/pow-x-n
 *
 * Implement pow(x, n), which calculates x raised to the power n (i.e., x^n).
 *
 * Example 1:
 * Input: x = 2.00000, n = 10
 * Output: 1024.00000
 *
 * Example 2:
 * Input: x = 2.10000, n = 3
 * Output: 9.26100
 *
 * Example 3:
 * Input: x = 2.00000, n = -2
 * Output: 0.25000
 * Explanation: 2^-2 = 1/2^2 = 1/4 = 0.25
 *
 * Constraints:
 *   - -100.0 < x < 100.0
 *   - -2^31 <= n <= 2^31-1
 *   - n is an integer.
 *   - Either x is not zero or n > 0.
 *   - -10^4 <= x^n <= 10^4
 */
public class Q11_PowXN {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public double myPow(double x, int n) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("50. Pow(x, n)");

        tester.check("x = 2.00000, n = 10", "1024.00000", () -> {
            double x = 2.00000;
            int n = 10;
            return new Solution().myPow(x, n);
        });
        tester.check("x = 2.10000, n = 3", "9.26100", () -> {
            double x = 2.10000;
            int n = 3;
            return new Solution().myPow(x, n);
        });
        tester.check("x = 2.00000, n = -2", "0.25000", () -> {
            double x = 2.00000;
            int n = -2;
            return new Solution().myPow(x, n);
        });

        tester.done();
    }
}
