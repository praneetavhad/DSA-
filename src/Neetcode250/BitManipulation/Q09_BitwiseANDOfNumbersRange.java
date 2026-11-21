package Neetcode250.BitManipulation;

import Neetcode250.common.*;
import java.util.*;

/*
 * 201. Bitwise AND of Numbers Range   [Medium]
 * LeetCode: https://leetcode.com/problems/bitwise-and-of-numbers-range/
 * NeetCode: https://neetcode.io/problems/bitwise-and-of-numbers-range
 *
 * Given two integers left and right that represent the range [left, right], return the bitwise AND of
 * all numbers in this range, inclusive.
 *
 * Example 1:
 * Input: left = 5, right = 7
 * Output: 4
 *
 * Example 2:
 * Input: left = 0, right = 0
 * Output: 0
 *
 * Example 3:
 * Input: left = 1, right = 2147483647
 * Output: 0
 *
 * Constraints:
 *   - 0 <= left <= right <= 2^31 - 1
 */
public class Q09_BitwiseANDOfNumbersRange {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int rangeBitwiseAnd(int left, int right) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("201. Bitwise AND of Numbers Range");

        tester.check("left = 5, right = 7", "4", () -> {
            int left = 5;
            int right = 7;
            return new Solution().rangeBitwiseAnd(left, right);
        });
        tester.check("left = 0, right = 0", "0", () -> {
            int left = 0;
            int right = 0;
            return new Solution().rangeBitwiseAnd(left, right);
        });
        tester.check("left = 1, right = 2147483647", "0", () -> {
            int left = 1;
            int right = 2147483647;
            return new Solution().rangeBitwiseAnd(left, right);
        });

        tester.done();
    }
}
