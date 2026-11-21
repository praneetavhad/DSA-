package Neetcode250.MathAndGeometry;

import Neetcode250.common.*;
import java.util.*;

/*
 * 66. Plus One   [Easy]
 * LeetCode: https://leetcode.com/problems/plus-one/
 * NeetCode: https://neetcode.io/problems/plus-one
 *
 * You are given a large integer represented as an integer array digits, where each digits[i] is the
 * i^th digit of the integer. The digits are ordered from most significant to least significant in
 * left-to-right order. The large integer does not contain any leading 0's.
 *
 * Increment the large integer by one and return the resulting array of digits.
 *
 * Example 1:
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 *
 * Example 2:
 * Input: digits = [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 * Incrementing by one gives 4321 + 1 = 4322.
 * Thus, the result should be [4,3,2,2].
 *
 * Example 3:
 * Input: digits = [9]
 * Output: [1,0]
 * Explanation: The array represents the integer 9.
 * Incrementing by one gives 9 + 1 = 10.
 * Thus, the result should be [1,0].
 *
 * Constraints:
 *   - 1 <= digits.length <= 100
 *   - 0 <= digits[i] <= 9
 *   - digits does not contain any leading 0's.
 */
public class Q09_PlusOne {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int[] plusOne(int[] digits) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("66. Plus One");

        tester.check("digits = [1,2,3]", "[1,2,4]", () -> {
            int[] digits = new int[]{1, 2, 3};
            return new Solution().plusOne(digits);
        });
        tester.check("digits = [4,3,2,1]", "[4,3,2,2]", () -> {
            int[] digits = new int[]{4, 3, 2, 1};
            return new Solution().plusOne(digits);
        });
        tester.check("digits = [9]", "[1,0]", () -> {
            int[] digits = new int[]{9};
            return new Solution().plusOne(digits);
        });

        tester.done();
    }
}
