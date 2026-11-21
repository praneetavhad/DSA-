package Neetcode250.SlidingWindow;

import Neetcode250.common.*;
import java.util.*;

/*
 * 567. Permutation in String   [Medium]
 * LeetCode: https://leetcode.com/problems/permutation-in-string/
 * NeetCode: https://neetcode.io/problems/permutation-string
 *
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
 *
 * In other words, return true if one of s1's permutations is the substring of s2.
 *
 * Example 1:
 * Input: s1 = "ab", s2 = "eidbaooo"
 * Output: true
 * Explanation: s2 contains one permutation of s1 ("ba").
 *
 * Example 2:
 * Input: s1 = "ab", s2 = "eidboaoo"
 * Output: false
 *
 * Constraints:
 *   - 1 <= s1.length, s2.length <= 10^4
 *   - s1 and s2 consist of lowercase English letters.
 */
public class Q05_PermutationInString {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public boolean checkInclusion(String s1, String s2) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("567. Permutation in String");

        tester.check("s1 = \"ab\", s2 = \"eidbaooo\"", "true", () -> {
            String s1 = "ab";
            String s2 = "eidbaooo";
            return new Solution().checkInclusion(s1, s2);
        });
        tester.check("s1 = \"ab\", s2 = \"eidboaoo\"", "false", () -> {
            String s1 = "ab";
            String s2 = "eidboaoo";
            return new Solution().checkInclusion(s1, s2);
        });

        tester.done();
    }
}
