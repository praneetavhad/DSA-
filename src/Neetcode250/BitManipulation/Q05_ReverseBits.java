package Neetcode250.BitManipulation;

import Neetcode250.common.*;
import java.util.*;

/*
 * 190. Reverse Bits   [Easy]
 * LeetCode: https://leetcode.com/problems/reverse-bits/
 * NeetCode: https://neetcode.io/problems/reverse-bits
 *
 * Reverse bits of a given 32 bits signed integer.
 *
 * Example 1:
 * Input: n = 43261596
 * Output: 964176192
 * Explanation:
 * 			Integer
 * 			Binary
 *
 * 			43261596
 * 			00000010100101000001111010011100
 *
 * 			964176192
 * 			00111001011110000010100101000000
 *
 * Example 2:
 * Input: n = 2147483644
 * Output: 1073741822
 * Explanation:
 * 			Integer
 * 			Binary
 *
 * 			2147483644
 * 			01111111111111111111111111111100
 *
 * 			1073741822
 * 			00111111111111111111111111111110
 *
 * Constraints:
 *   - 0 <= n <= 2^31 - 2
 *   - n is even.
 *
 * Follow up: If this function is called many times, how would you optimize it?
 */
public class Q05_ReverseBits {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int reverseBits(int n) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("190. Reverse Bits");

        tester.check("n = 43261596", "964176192", () -> {
            int n = 43261596;
            return new Solution().reverseBits(n);
        });
        tester.check("n = 2147483644", "1073741822", () -> {
            int n = 2147483644;
            return new Solution().reverseBits(n);
        });

        tester.done();
    }
}
