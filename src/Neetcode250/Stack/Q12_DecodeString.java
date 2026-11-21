package Neetcode250.Stack;

import Neetcode250.common.*;
import java.util.*;

/*
 * 394. Decode String   [Medium]
 * LeetCode: https://leetcode.com/problems/decode-string/
 * NeetCode: https://neetcode.io/problems/decode-string
 *
 * Given an encoded string, return its decoded string.
 *
 * The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is
 * being repeated exactly k times. Note that k is guaranteed to be a positive integer.
 *
 * You may assume that the input string is always valid; there are no extra white spaces, square
 * brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain
 * any digits and that digits are only for those repeat numbers, k. For example, there will not be
 * input like 3a or 2[4].
 *
 * The test cases are generated so that the length of the output will never exceed 10^5.
 *
 * Example 1:
 * Input: s = "3[a]2[bc]"
 * Output: "aaabcbc"
 *
 * Example 2:
 * Input: s = "3[a2[c]]"
 * Output: "accaccacc"
 *
 * Example 3:
 * Input: s = "2[abc]3[cd]ef"
 * Output: "abcabccdcdcdef"
 *
 * Constraints:
 *   - 1 <= s.length <= 30
 *   - s consists of lowercase English letters, digits, and square brackets '[]'.
 *   - s is guaranteed to be a valid input.
 *   - All the integers in s are in the range [1, 300].
 */
public class Q12_DecodeString {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public String decodeString(String s) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("394. Decode String");

        tester.check("s = \"3[a]2[bc]\"", "\"aaabcbc\"", () -> {
            String s = "3[a]2[bc]";
            return new Solution().decodeString(s);
        });
        tester.check("s = \"3[a2[c]]\"", "\"accaccacc\"", () -> {
            String s = "3[a2[c]]";
            return new Solution().decodeString(s);
        });
        tester.check("s = \"2[abc]3[cd]ef\"", "\"abcabccdcdcdef\"", () -> {
            String s = "2[abc]3[cd]ef";
            return new Solution().decodeString(s);
        });

        tester.done();
    }
}
