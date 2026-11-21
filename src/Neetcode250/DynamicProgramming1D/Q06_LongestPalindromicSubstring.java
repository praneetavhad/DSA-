package Neetcode250.DynamicProgramming1D;

import Neetcode250.common.*;
import java.util.*;

/*
 * 5. Longest Palindromic Substring   [Medium]
 * LeetCode: https://leetcode.com/problems/longest-palindromic-substring/
 * NeetCode: https://neetcode.io/problems/longest-palindromic-substring
 *
 * Given a string s, return the longest palindromic substring in s.
 *
 * Example 1:
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 *
 * Example 2:
 * Input: s = "cbbd"
 * Output: "bb"
 *
 * Constraints:
 *   - 1 <= s.length <= 1000
 *   - s consist of only digits and English letters.
 */
public class Q06_LongestPalindromicSubstring {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public String longestPalindrome(String s) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("5. Longest Palindromic Substring");

        tester.check("s = \"babad\"", "\"bab\"", () -> {
            String s = "babad";
            return new Solution().longestPalindrome(s);
        });
        tester.check("s = \"cbbd\"", "\"bb\"", () -> {
            String s = "cbbd";
            return new Solution().longestPalindrome(s);
        });

        tester.done();
    }
}
