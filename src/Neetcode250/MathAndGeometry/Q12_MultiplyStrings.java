package Neetcode250.MathAndGeometry;

import Neetcode250.common.*;
import java.util.*;

/*
 * 43. Multiply Strings   [Medium]
 * LeetCode: https://leetcode.com/problems/multiply-strings/
 * NeetCode: https://neetcode.io/problems/multiply-strings
 *
 * Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and
 * num2, also represented as a string.
 *
 * Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.
 *
 * Example 1:
 * Input: num1 = "2", num2 = "3"
 * Output: "6"
 *
 * Example 2:
 * Input: num1 = "123", num2 = "456"
 * Output: "56088"
 *
 * Constraints:
 *   - 1 <= num1.length, num2.length <= 200
 *   - num1 and num2 consist of digits only.
 *   - Both num1 and num2 do not contain any leading zero, except the number 0 itself.
 */
public class Q12_MultiplyStrings {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public String multiply(String num1, String num2) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("43. Multiply Strings");

        tester.check("num1 = \"2\", num2 = \"3\"", "\"6\"", () -> {
            String num1 = "2";
            String num2 = "3";
            return new Solution().multiply(num1, num2);
        });
        tester.check("num1 = \"123\", num2 = \"456\"", "\"56088\"", () -> {
            String num1 = "123";
            String num2 = "456";
            return new Solution().multiply(num1, num2);
        });

        tester.done();
    }
}
