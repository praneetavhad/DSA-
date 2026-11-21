package Neetcode250.BinarySearch;

import Neetcode250.common.*;
import java.util.*;

/*
 * 69. Sqrt(x)   [Easy]
 * LeetCode: https://leetcode.com/problems/sqrtx/
 * NeetCode: https://neetcode.io/problems/sqrtx
 *
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The
 * returned integer should be non-negative as well.
 *
 * You must not use any built-in exponent function or operator.
 *   - For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 *
 * Example 1:
 * Input: x = 4
 * Output: 2
 * Explanation: The square root of 4 is 2, so we return 2.
 *
 * Example 2:
 * Input: x = 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer,
 * 2 is returned.
 *
 * Constraints:
 *   - 0 <= x <= 2^31 - 1
 */
public class Q04_SqrtX {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int mySqrt(int x) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("69. Sqrt(x)");

        tester.check("x = 4", "2", () -> {
            int x = 4;
            return new Solution().mySqrt(x);
        });
        tester.check("x = 8", "2", () -> {
            int x = 8;
            return new Solution().mySqrt(x);
        });

        tester.done();
    }
}
