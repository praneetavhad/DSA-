package Neetcode250.BitManipulation;

import Neetcode250.common.*;
import java.util.*;

/*
 * 338. Counting Bits   [Easy]
 * LeetCode: https://leetcode.com/problems/counting-bits/
 * NeetCode: https://neetcode.io/problems/counting-bits
 *
 * Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i]
 * is the number of 1's in the binary representation of i.
 *
 * Do not solve it with built-in functions (i.e., like __builtin_popcount in C++).
 *
 * Example 1:
 * Input: n = 2
 * Output: [0,1,1]
 * Explanation:
 * 0 --> 0
 * 1 --> 1
 * 2 --> 10
 *
 * Example 2:
 * Input: n = 5
 * Output: [0,1,1,2,1,2]
 * Explanation:
 * 0 --> 0
 * 1 --> 1
 * 2 --> 10
 * 3 --> 11
 * 4 --> 100
 * 5 --> 101
 *
 * Constraints:
 *   - 0 <= n <= 10^5
 *
 * Follow up:
 *   - It is very easy to come up with a solution with a runtime of O(n log n). Can you do it in linear
 *     time O(n) and possibly in a single pass?
 */
public class Q03_CountingBits {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int[] countBits(int n) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("338. Counting Bits");

        tester.check("n = 2", "[0,1,1]", () -> {
            int n = 2;
            return new Solution().countBits(n);
        });
        tester.check("n = 5", "[0,1,1,2,1,2]", () -> {
            int n = 5;
            return new Solution().countBits(n);
        });

        tester.done();
    }
}
