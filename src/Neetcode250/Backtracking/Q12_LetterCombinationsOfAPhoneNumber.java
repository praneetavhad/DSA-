package Neetcode250.Backtracking;

import Neetcode250.common.*;
import java.util.*;

/*
 * 17. Letter Combinations of a Phone Number   [Medium]
 * LeetCode: https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 * NeetCode: https://neetcode.io/problems/combinations-of-a-phone-number
 *
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that
 * the number could represent. Return the answer in any order.
 *
 * A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does
 * not map to any letters.
 *
 * [image: https://assets.leetcode.com/uploads/2022/03/15/1200px-telephone-keypad2svg.png]
 *
 * Example 1:
 * Input: digits = "23"
 * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
 *
 * Example 2:
 * Input: digits = "2"
 * Output: ["a","b","c"]
 *
 * Constraints:
 *   - 1 <= digits.length <= 4
 *   - digits[i] is a digit in the range ['2', '9'].
 */
public class Q12_LetterCombinationsOfAPhoneNumber {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public List<String> letterCombinations(String digits) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("17. Letter Combinations of a Phone Number");
        // Answers are compared ignoring the order of the outer list (problem allows any order).

        tester.check("digits = \"23\"", "[\"ad\",\"ae\",\"af\",\"bd\",\"be\",\"bf\",\"cd\",\"ce\",\"cf\"]", Tester.Order.ANY, () -> {
            String digits = "23";
            return new Solution().letterCombinations(digits);
        });
        tester.check("digits = \"2\"", "[\"a\",\"b\",\"c\"]", Tester.Order.ANY, () -> {
            String digits = "2";
            return new Solution().letterCombinations(digits);
        });

        tester.done();
    }
}
