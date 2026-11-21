package Neetcode250.TwoPointers;

import Neetcode250.common.*;
import java.util.*;

/*
 * 680. Valid Palindrome II   [Easy]
 * LeetCode: https://leetcode.com/problems/valid-palindrome-ii/
 * NeetCode: https://neetcode.io/problems/valid-palindrome-ii
 *
 * Given a string s, return true if the s can be palindrome after deleting at most one character from
 * it.
 *
 * Example 1:
 * Input: s = "aba"
 * Output: true
 *
 * Example 2:
 * Input: s = "abca"
 * Output: true
 * Explanation: You could delete the character 'c'.
 *
 * Example 3:
 * Input: s = "abc"
 * Output: false
 *
 * Constraints:
 *   - 1 <= s.length <= 10^5
 *   - s consists of lowercase English letters.
 */
public class Q03_ValidPalindromeII {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public boolean validPalindrome(String s) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("680. Valid Palindrome II");

        tester.check("s = \"aba\"", "true", () -> {
            String s = "aba";
            return new Solution().validPalindrome(s);
        });
        tester.check("s = \"abca\"", "true", () -> {
            String s = "abca";
            return new Solution().validPalindrome(s);
        });
        tester.check("s = \"abc\"", "false", () -> {
            String s = "abc";
            return new Solution().validPalindrome(s);
        });

        tester.done();
    }
}
