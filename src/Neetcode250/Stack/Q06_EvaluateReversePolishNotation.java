package Neetcode250.Stack;

import Neetcode250.common.*;
import java.util.*;

/*
 * 150. Evaluate Reverse Polish Notation   [Medium]
 * LeetCode: https://leetcode.com/problems/evaluate-reverse-polish-notation/
 * NeetCode: https://neetcode.io/problems/evaluate-reverse-polish-notation
 *
 * You are given an array of strings tokens that represents an arithmetic expression in a Reverse
 * Polish Notation.
 *
 * Evaluate the expression. Return an integer that represents the value of the expression.
 *
 * Note that:
 *   - The valid operators are '+', '-', '*', and '/'.
 *   - Each operand may be an integer or another expression.
 *   - The division between two integers always truncates toward zero.
 *   - There will not be any division by zero.
 *   - The input represents a valid arithmetic expression in a reverse polish notation.
 *   - The answer and all the intermediate calculations can be represented in a 32-bit integer.
 *
 * Example 1:
 * Input: tokens = ["2","1","+","3","*"]
 * Output: 9
 * Explanation: ((2 + 1) * 3) = 9
 *
 * Example 2:
 * Input: tokens = ["4","13","5","/","+"]
 * Output: 6
 * Explanation: (4 + (13 / 5)) = 6
 *
 * Example 3:
 * Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
 * Output: 22
 * Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
 * = ((10 * (6 / (12 * -11))) + 17) + 5
 * = ((10 * (6 / -132)) + 17) + 5
 * = ((10 * 0) + 17) + 5
 * = (0 + 17) + 5
 * = 17 + 5
 * = 22
 *
 * Constraints:
 *   - 1 <= tokens.length <= 10^4
 *   - tokens[i] is either an operator: "+", "-", "*", or "/", or an integer in the range [-200, 200].
 */
public class Q06_EvaluateReversePolishNotation {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int evalRPN(String[] tokens) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("150. Evaluate Reverse Polish Notation");

        tester.check("tokens = [\"2\",\"1\",\"+\",\"3\",\"*\"]", "9", () -> {
            String[] tokens = new String[]{"2", "1", "+", "3", "*"};
            return new Solution().evalRPN(tokens);
        });
        tester.check("tokens = [\"4\",\"13\",\"5\",\"/\",\"+\"]", "6", () -> {
            String[] tokens = new String[]{"4", "13", "5", "/", "+"};
            return new Solution().evalRPN(tokens);
        });
        tester.check("tokens = [\"10\",\"6\",\"9\",\"3\",\"+\",\"-11\",\"*\",\"/\",\"*\",\"17\",\"+\",\"5\",\"+\"]", "22", () -> {
            String[] tokens = new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
            return new Solution().evalRPN(tokens);
        });

        tester.done();
    }
}
