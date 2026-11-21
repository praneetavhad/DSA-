package Neetcode250.DynamicProgramming1D;

import Neetcode250.common.*;
import java.util.*;

/*
 * 1137. N-th Tribonacci Number   [Easy]
 * LeetCode: https://leetcode.com/problems/n-th-tribonacci-number/
 * NeetCode: https://neetcode.io/problems/n-th-tribonacci-number
 *
 * The Tribonacci sequence T_n is defined as follows:
 * T_0 = 0, T_1 = 1, T_2 = 1, and T_n+3 = T_n + T_n+1 + T_n+2 for n >= 0.
 *
 * Given n, return the value of T_n.
 *
 * Example 1:
 * Input: n = 4
 * Output: 4
 * Explanation:
 * T_3 = 0 + 1 + 1 = 2
 * T_4 = 1 + 1 + 2 = 4
 *
 * Example 2:
 * Input: n = 25
 * Output: 1389537
 *
 * Constraints:
 *   - 0 <= n <= 37
 *   - The answer is guaranteed to fit within a 32-bit integer, ie. answer <= 2^31 - 1.
 */
public class Q03_NThTribonacciNumber {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int tribonacci(int n) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("1137. N-th Tribonacci Number");

        tester.check("n = 4", "4", () -> {
            int n = 4;
            return new Solution().tribonacci(n);
        });
        tester.check("n = 25", "1389537", () -> {
            int n = 25;
            return new Solution().tribonacci(n);
        });

        tester.done();
    }
}
