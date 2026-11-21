package Neetcode250.MathAndGeometry;

import Neetcode250.common.*;
import java.util.*;

/*
 * 202. Happy Number   [Easy]
 * LeetCode: https://leetcode.com/problems/happy-number/
 * NeetCode: https://neetcode.io/problems/non-cyclical-number
 *
 * Write an algorithm to determine if a number n is happy.
 *
 * A happy number is a number defined by the following process:
 *   - Starting with any positive integer, replace the number by the sum of the squares of its digits.
 *   - Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a
 *     cycle which does not include 1.
 *   - Those numbers for which this process ends in 1 are happy.
 *
 * Return true if n is a happy number, and false if not.
 *
 * Example 1:
 * Input: n = 19
 * Output: true
 * Explanation:
 * 1^2 + 9^2 = 82
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
 *
 * Example 2:
 * Input: n = 2
 * Output: false
 *
 * Constraints:
 *   - 1 <= n <= 2^31 - 1
 */
public class Q08_HappyNumber {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public boolean isHappy(int n) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("202. Happy Number");

        tester.check("n = 19", "true", () -> {
            int n = 19;
            return new Solution().isHappy(n);
        });
        tester.check("n = 2", "false", () -> {
            int n = 2;
            return new Solution().isHappy(n);
        });

        tester.done();
    }
}
