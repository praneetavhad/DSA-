package Neetcode250.SlidingWindow;

import Neetcode250.common.*;
import java.util.*;

/*
 * 76. Minimum Window Substring   [Hard]
 * LeetCode: https://leetcode.com/problems/minimum-window-substring/
 * NeetCode: https://neetcode.io/problems/minimum-window-with-characters
 *
 * Given two strings s and t of lengths m and n respectively, return the minimum window substring of s
 * such that every character in t (including duplicates) is included in the window. If there is no such
 * substring, return the empty string "".
 *
 * The testcases will be generated such that the answer is unique.
 *
 * Example 1:
 * Input: s = "ADOBECODEBANC", t = "ABC"
 * Output: "BANC"
 * Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
 *
 * Example 2:
 * Input: s = "a", t = "a"
 * Output: "a"
 * Explanation: The entire string s is the minimum window.
 *
 * Example 3:
 * Input: s = "a", t = "aa"
 * Output: ""
 * Explanation: Both 'a's from t must be included in the window.
 * Since the largest window of s only has one 'a', return empty string.
 *
 * Constraints:
 *   - m == s.length
 *   - n == t.length
 *   - 1 <= m, n <= 10^5
 *   - s and t consist of uppercase and lowercase English letters.
 *
 * Follow up: Could you find an algorithm that runs in O(m + n) time?
 */
public class Q08_MinimumWindowSubstring {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public String minWindow(String s, String t) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("76. Minimum Window Substring");

        tester.check("s = \"ADOBECODEBANC\", t = \"ABC\"", "\"BANC\"", () -> {
            String s = "ADOBECODEBANC";
            String t = "ABC";
            return new Solution().minWindow(s, t);
        });
        tester.check("s = \"a\", t = \"a\"", "\"a\"", () -> {
            String s = "a";
            String t = "a";
            return new Solution().minWindow(s, t);
        });
        tester.check("s = \"a\", t = \"aa\"", "\"\"", () -> {
            String s = "a";
            String t = "aa";
            return new Solution().minWindow(s, t);
        });

        tester.done();
    }
}
