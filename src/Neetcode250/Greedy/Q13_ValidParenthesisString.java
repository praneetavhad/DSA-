package Neetcode250.Greedy;

import Neetcode250.common.*;
import java.util.*;

/*
 * 678. Valid Parenthesis String   [Medium]
 * LeetCode: https://leetcode.com/problems/valid-parenthesis-string/
 * NeetCode: https://neetcode.io/problems/valid-parenthesis-string
 *
 * Given a string s containing only three types of characters: '(', ')' and '*', return true if s is
 * valid.
 *
 * The following rules define a valid string:
 *   - Any left parenthesis '(' must have a corresponding right parenthesis ')'.
 *   - Any right parenthesis ')' must have a corresponding left parenthesis '('.
 *   - Left parenthesis '(' must go before the corresponding right parenthesis ')'.
 *   - '*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an
 *     empty string "".
 *
 * Example 1:
 * Input: s = "()"
 * Output: true
 *
 * Example 2:
 * Input: s = "(*)"
 * Output: true
 *
 * Example 3:
 * Input: s = "(*))"
 * Output: true
 *
 * Example 4:
 * Input: s = "("
 * Output: false
 *
 * Constraints:
 *   - 1 <= s.length <= 100
 *   - s[i] is '(', ')' or '*'.
 */
public class Q13_ValidParenthesisString {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public boolean checkValidString(String s) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("678. Valid Parenthesis String");

        tester.check("s = \"()\"", "true", () -> {
            String s = "()";
            return new Solution().checkValidString(s);
        });
        tester.check("s = \"(*)\"", "true", () -> {
            String s = "(*)";
            return new Solution().checkValidString(s);
        });
        tester.check("s = \"(*))\"", "true", () -> {
            String s = "(*))";
            return new Solution().checkValidString(s);
        });
        tester.check("s = \"(\"", "false", () -> {
            String s = "(";
            return new Solution().checkValidString(s);
        });

        tester.done();
    }
}
