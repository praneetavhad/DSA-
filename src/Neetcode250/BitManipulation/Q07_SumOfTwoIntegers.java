package Neetcode250.BitManipulation;

import Neetcode250.common.*;
import java.util.*;

/*
 * 371. Sum of Two Integers   [Medium]
 * LeetCode: https://leetcode.com/problems/sum-of-two-integers/
 * NeetCode: https://neetcode.io/problems/sum-of-two-integers
 *
 * Given two integers a and b, return the sum of the two integers without using the operators + and -.
 *
 * Example 1:
 * Input: a = 1, b = 2
 * Output: 3
 *
 * Example 2:
 * Input: a = 2, b = 3
 * Output: 5
 *
 * Constraints:
 *   - -1000 <= a, b <= 1000
 */
public class Q07_SumOfTwoIntegers {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int getSum(int a, int b) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("371. Sum of Two Integers");

        tester.check("a = 1, b = 2", "3", () -> {
            int a = 1;
            int b = 2;
            return new Solution().getSum(a, b);
        });
        tester.check("a = 2, b = 3", "5", () -> {
            int a = 2;
            int b = 3;
            return new Solution().getSum(a, b);
        });

        tester.done();
    }
}
