package Neetcode250.Stack;

import Neetcode250.common.*;
import java.util.*;

/*
 * 20. Valid Parentheses   [Easy]
 * LeetCode: https://leetcode.com/problems/valid-parentheses/
 * NeetCode: https://neetcode.io/problems/validate-parentheses
 *
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the
 * input string is valid.
 *
 * An input string is valid if:
 *   - Open brackets must be closed by the same type of brackets.
 *   - Open brackets must be closed in the correct order.
 *   - Every close bracket has a corresponding open bracket of the same type.
 *
 * Example 1:
 * Input: s = "()"
 * Output: true
 *
 * Example 2:
 * Input: s = "()[]{}"
 * Output: true
 *
 * Example 3:
 * Input: s = "(]"
 * Output: false
 *
 * Example 4:
 * Input: s = "([])"
 * Output: true
 *
 * Example 5:
 * Input: s = "([)]"
 * Output: false
 *
 * Constraints:
 *   - 1 <= s.length <= 10^4
 *   - s consists of parentheses only '()[]{}'.
 */
public class Q02_ValidParentheses {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public boolean isValid(String s) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("20. Valid Parentheses");

        tester.check("s = \"()\"", "true", () -> {
            String s = "()";
            return new Solution().isValid(s);
        });
        tester.check("s = \"()[]{}\"", "true", () -> {
            String s = "()[]{}";
            return new Solution().isValid(s);
        });
        tester.check("s = \"(]\"", "false", () -> {
            String s = "(]";
            return new Solution().isValid(s);
        });
        tester.check("s = \"([])\"", "true", () -> {
            String s = "([])";
            return new Solution().isValid(s);
        });
        tester.check("s = \"([)]\"", "false", () -> {
            String s = "([)]";
            return new Solution().isValid(s);
        });

        tester.done();
    }
}
