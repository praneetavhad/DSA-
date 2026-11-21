package Neetcode250.SlidingWindow;

import Neetcode250.common.*;
import java.util.*;

/*
 * 424. Longest Repeating Character Replacement   [Medium]
 * LeetCode: https://leetcode.com/problems/longest-repeating-character-replacement/
 * NeetCode: https://neetcode.io/problems/longest-repeating-substring-with-replacement
 *
 * You are given a string s and an integer k. You can choose any character of the string and change it
 * to any other uppercase English character. You can perform this operation at most k times.
 *
 * Return the length of the longest substring containing the same letter you can get after performing
 * the above operations.
 *
 * Example 1:
 * Input: s = "ABAB", k = 2
 * Output: 4
 * Explanation: Replace the two 'A's with two 'B's or vice versa.
 *
 * Example 2:
 * Input: s = "AABABBA", k = 1
 * Output: 4
 * Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
 * The substring "BBBB" has the longest repeating letters, which is 4.
 * There may exists other ways to achieve this answer too.
 *
 * Constraints:
 *   - 1 <= s.length <= 10^5
 *   - s consists of only uppercase English letters.
 *   - 0 <= k <= s.length
 */
public class Q04_LongestRepeatingCharacterReplacement {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int characterReplacement(String s, int k) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("424. Longest Repeating Character Replacement");

        tester.check("s = \"ABAB\", k = 2", "4", () -> {
            String s = "ABAB";
            int k = 2;
            return new Solution().characterReplacement(s, k);
        });
        tester.check("s = \"AABABBA\", k = 1", "4", () -> {
            String s = "AABABBA";
            int k = 1;
            return new Solution().characterReplacement(s, k);
        });

        tester.done();
    }
}
