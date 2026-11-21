package Neetcode250.SlidingWindow;

import Neetcode250.common.*;
import java.util.*;

/*
 * 3. Longest Substring Without Repeating Characters   [Medium]
 * LeetCode: https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * NeetCode: https://neetcode.io/problems/longest-substring-without-duplicates
 *
 * Given a string s, find the length of the longest substring without duplicate characters.
 *
 * Example 1:
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct
 * answers.
 *
 * Example 2:
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 *
 * Example 3:
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 * Constraints:
 *   - 0 <= s.length <= 10^5
 *   - s consists of English letters, digits, symbols and spaces.
 */
public class Q03_LongestSubstringWithoutRepeatingCharacters {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int lengthOfLongestSubstring(String s) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("3. Longest Substring Without Repeating Characters");

        tester.check("s = \"abcabcbb\"", "3", () -> {
            String s = "abcabcbb";
            return new Solution().lengthOfLongestSubstring(s);
        });
        tester.check("s = \"bbbbb\"", "1", () -> {
            String s = "bbbbb";
            return new Solution().lengthOfLongestSubstring(s);
        });
        tester.check("s = \"pwwkew\"", "3", () -> {
            String s = "pwwkew";
            return new Solution().lengthOfLongestSubstring(s);
        });

        tester.done();
    }
}
