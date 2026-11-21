package Neetcode250.TwoPointers;

import Neetcode250.common.*;
import java.util.*;

/*
 * 125. Valid Palindrome   [Easy]
 * LeetCode: https://leetcode.com/problems/valid-palindrome/
 * NeetCode: https://neetcode.io/problems/is-palindrome
 *
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and
 * removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric
 * characters include letters and numbers.
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 *
 * Example 1:
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 *
 * Example 2:
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 *
 * Example 3:
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric characters.
 * Since an empty string reads the same forward and backward, it is a palindrome.
 *
 * Constraints:
 *   - 1 <= s.length <= 2 * 10^5
 *   - s consists only of printable ASCII characters.
 */
public class Q02_ValidPalindrome {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public boolean isPalindrome(String s) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("125. Valid Palindrome");

        tester.check("s = \"A man, a plan, a canal: Panama\"", "true", () -> {
            String s = "A man, a plan, a canal: Panama";
            return new Solution().isPalindrome(s);
        });
        tester.check("s = \"race a car\"", "false", () -> {
            String s = "race a car";
            return new Solution().isPalindrome(s);
        });
        tester.check("s = \" \"", "true", () -> {
            String s = " ";
            return new Solution().isPalindrome(s);
        });

        tester.done();
    }
}
