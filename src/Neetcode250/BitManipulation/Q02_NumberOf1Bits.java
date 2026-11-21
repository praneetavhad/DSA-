package Neetcode250.BitManipulation;

import Neetcode250.common.*;
import java.util.*;

/*
 * 191. Number of 1 Bits   [Easy]
 * LeetCode: https://leetcode.com/problems/number-of-1-bits/
 * NeetCode: https://neetcode.io/problems/number-of-one-bits
 *
 * Given a positive integer n, write a function that returns the number of set bits in its binary
 * representation (also known as the Hamming weight).
 *
 * Example 1:
 * Input: n = 11
 * Output: 3
 * Explanation:
 * The input binary string 1011 has a total of three set bits.
 *
 * Example 2:
 * Input: n = 128
 * Output: 1
 * Explanation:
 * The input binary string 10000000 has a total of one set bit.
 *
 * Example 3:
 * Input: n = 2147483645
 * Output: 30
 * Explanation:
 * The input binary string 1111111111111111111111111111101 has a total of thirty set bits.
 *
 * Constraints:
 *   - 1 <= n <= 2^31 - 1
 *
 * Follow up: If this function is called many times, how would you optimize it?
 */
public class Q02_NumberOf1Bits {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int hammingWeight(int n) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("191. Number of 1 Bits");

        tester.check("n = 11", "3", () -> {
            int n = 11;
            return new Solution().hammingWeight(n);
        });
        tester.check("n = 128", "1", () -> {
            int n = 128;
            return new Solution().hammingWeight(n);
        });
        tester.check("n = 2147483645", "30", () -> {
            int n = 2147483645;
            return new Solution().hammingWeight(n);
        });

        tester.done();
    }
}
