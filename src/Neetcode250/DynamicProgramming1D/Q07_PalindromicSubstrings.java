package Neetcode250.DynamicProgramming1D;

import Neetcode250.common.*;
import java.util.*;

/*
 * 647. Palindromic Substrings   [Medium]
 * LeetCode: https://leetcode.com/problems/palindromic-substrings/
 * NeetCode: https://neetcode.io/problems/palindromic-substrings
 *
 * Given a string s, return the number of palindromic substrings in it.
 *
 * A string is a palindrome when it reads the same backward as forward.
 *
 * A substring is a contiguous sequence of characters within the string.
 *
 * Example 1:
 * Input: s = "abc"
 * Output: 3
 * Explanation: Three palindromic strings: "a", "b", "c".
 *
 * Example 2:
 * Input: s = "aaa"
 * Output: 6
 * Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
 *
 * Constraints:
 *   - 1 <= s.length <= 1000
 *   - s consists of lowercase English letters.
 */
public class Q07_PalindromicSubstrings {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int countSubstrings(String s) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("647. Palindromic Substrings");

        tester.check("s = \"abc\"", "3", () -> {
            String s = "abc";
            return new Solution().countSubstrings(s);
        });
        tester.check("s = \"aaa\"", "6", () -> {
            String s = "aaa";
            return new Solution().countSubstrings(s);
        });

        tester.done();
    }
}
