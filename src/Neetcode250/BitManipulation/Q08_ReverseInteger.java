package Neetcode250.BitManipulation;

import Neetcode250.common.*;
import java.util.*;

/*
 * 7. Reverse Integer   [Medium]
 * LeetCode: https://leetcode.com/problems/reverse-integer/
 * NeetCode: https://neetcode.io/problems/reverse-integer
 *
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value
 * to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.
 *
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 *
 * Example 1:
 * Input: x = 123
 * Output: 321
 *
 * Example 2:
 * Input: x = -123
 * Output: -321
 *
 * Example 3:
 * Input: x = 120
 * Output: 21
 *
 * Constraints:
 *   - -2^31 <= x <= 2^31 - 1
 */
public class Q08_ReverseInteger {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int reverse(int x) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("7. Reverse Integer");

        tester.check("x = 123", "321", () -> {
            int x = 123;
            return new Solution().reverse(x);
        });
        tester.check("x = -123", "-321", () -> {
            int x = -123;
            return new Solution().reverse(x);
        });
        tester.check("x = 120", "21", () -> {
            int x = 120;
            return new Solution().reverse(x);
        });

        tester.done();
    }
}
