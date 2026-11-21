package Neetcode250.DynamicProgramming2D;

import Neetcode250.common.*;
import java.util.*;

/*
 * 1143. Longest Common Subsequence   [Medium]
 * LeetCode: https://leetcode.com/problems/longest-common-subsequence/
 * NeetCode: https://neetcode.io/problems/longest-common-subsequence
 *
 * Given two strings text1 and text2, return the length of their longest common subsequence. If there
 * is no common subsequence, return 0.
 *
 * A subsequence of a string is a new string generated from the original string with some characters
 * (can be none) deleted without changing the relative order of the remaining characters.
 *   - For example, "ace" is a subsequence of "abcde".
 *
 * A common subsequence of two strings is a subsequence that is common to both strings.
 *
 * Example 1:
 * Input: text1 = "abcde", text2 = "ace"
 * Output: 3
 * Explanation: The longest common subsequence is "ace" and its length is 3.
 *
 * Example 2:
 * Input: text1 = "abc", text2 = "abc"
 * Output: 3
 * Explanation: The longest common subsequence is "abc" and its length is 3.
 *
 * Example 3:
 * Input: text1 = "abc", text2 = "def"
 * Output: 0
 * Explanation: There is no such common subsequence, so the result is 0.
 *
 * Constraints:
 *   - 1 <= text1.length, text2.length <= 1000
 *   - text1 and text2 consist of only lowercase English characters.
 */
public class Q04_LongestCommonSubsequence {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int longestCommonSubsequence(String text1, String text2) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("1143. Longest Common Subsequence");

        tester.check("text1 = \"abcde\", text2 = \"ace\"", "3", () -> {
            String text1 = "abcde";
            String text2 = "ace";
            return new Solution().longestCommonSubsequence(text1, text2);
        });
        tester.check("text1 = \"abc\", text2 = \"abc\"", "3", () -> {
            String text1 = "abc";
            String text2 = "abc";
            return new Solution().longestCommonSubsequence(text1, text2);
        });
        tester.check("text1 = \"abc\", text2 = \"def\"", "0", () -> {
            String text1 = "abc";
            String text2 = "def";
            return new Solution().longestCommonSubsequence(text1, text2);
        });

        tester.done();
    }
}
