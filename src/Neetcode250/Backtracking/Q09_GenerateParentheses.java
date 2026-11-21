package Neetcode250.Backtracking;

import Neetcode250.common.*;
import java.util.*;

/*
 * 22. Generate Parentheses   [Medium]
 * LeetCode: https://leetcode.com/problems/generate-parentheses/
 * NeetCode: https://neetcode.io/problems/generate-parentheses
 *
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed
 * parentheses.
 *
 * Example 1:
 * Input: n = 3
 * Output: ["((()))","(()())","(())()","()(())","()()()"]
 *
 * Example 2:
 * Input: n = 1
 * Output: ["()"]
 *
 * Constraints:
 *   - 1 <= n <= 8
 */
public class Q09_GenerateParentheses {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public List<String> generateParenthesis(int n) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("22. Generate Parentheses");
        // Answers are compared ignoring the order of the outer list (problem allows any order).

        tester.check("n = 3", "[\"((()))\",\"(()())\",\"(())()\",\"()(())\",\"()()()\"]", Tester.Order.ANY, () -> {
            int n = 3;
            return new Solution().generateParenthesis(n);
        });
        tester.check("n = 1", "[\"()\"]", Tester.Order.ANY, () -> {
            int n = 1;
            return new Solution().generateParenthesis(n);
        });

        tester.done();
    }
}
