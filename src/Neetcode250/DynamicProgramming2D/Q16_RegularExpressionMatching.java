package Neetcode250.DynamicProgramming2D;

import Neetcode250.common.*;
import java.util.*;

/*
 * 10. Regular Expression Matching   [Hard]
 * LeetCode: https://leetcode.com/problems/regular-expression-matching/
 * NeetCode: https://neetcode.io/problems/regular-expression-matching
 *
 * Given an input string s and a pattern p, implement regular expression matching with support for '.'
 * and '*' where:
 *   - '.' Matches any single character.
 *   - '*' Matches zero or more of the preceding element.
 *
 * Return a boolean indicating whether the matching covers the entire input string (not partial).
 *
 * Example 1:
 * Input: s = "aa", p = "a"
 * Output: false
 * Explanation: "a" does not match the entire string "aa".
 *
 * Example 2:
 * Input: s = "aa", p = "a*"
 * Output: true
 * Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once,
 * it becomes "aa".
 *
 * Example 3:
 * Input: s = "ab", p = ".*"
 * Output: true
 * Explanation: ".*" means "zero or more (*) of any character (.)".
 *
 * Constraints:
 *   - 1 <= s.length <= 20
 *   - 1 <= p.length <= 20
 *   - s contains only lowercase English letters.
 *   - p contains only lowercase English letters, '.', and '*'.
 *   - It is guaranteed for each appearance of the character '*', there will be a previous valid
 *     character to match.
 */
public class Q16_RegularExpressionMatching {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public boolean isMatch(String s, String p) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("10. Regular Expression Matching");

        tester.check("s = \"aa\", p = \"a\"", "false", () -> {
            String s = "aa";
            String p = "a";
            return new Solution().isMatch(s, p);
        });
        tester.check("s = \"aa\", p = \"a*\"", "true", () -> {
            String s = "aa";
            String p = "a*";
            return new Solution().isMatch(s, p);
        });
        tester.check("s = \"ab\", p = \".*\"", "true", () -> {
            String s = "ab";
            String p = ".*";
            return new Solution().isMatch(s, p);
        });

        tester.done();
    }
}
