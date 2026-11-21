package Neetcode250.BitManipulation;

import Neetcode250.common.*;
import java.util.*;

/*
 * 67. Add Binary   [Easy]
 * LeetCode: https://leetcode.com/problems/add-binary/
 * NeetCode: https://neetcode.io/problems/add-binary
 *
 * Given two binary strings a and b, return their sum as a binary string.
 *
 * Example 1:
 * Input: a = "11", b = "1"
 * Output: "100"
 *
 * Example 2:
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 *
 * Constraints:
 *   - 1 <= a.length, b.length <= 10^4
 *   - a and b consist only of '0' or '1' characters.
 *   - Each string does not contain leading zeros except for the zero itself.
 */
public class Q04_AddBinary {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public String addBinary(String a, String b) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("67. Add Binary");

        tester.check("a = \"11\", b = \"1\"", "\"100\"", () -> {
            String a = "11";
            String b = "1";
            return new Solution().addBinary(a, b);
        });
        tester.check("a = \"1010\", b = \"1011\"", "\"10101\"", () -> {
            String a = "1010";
            String b = "1011";
            return new Solution().addBinary(a, b);
        });

        tester.done();
    }
}
