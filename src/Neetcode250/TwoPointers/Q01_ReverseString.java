package Neetcode250.TwoPointers;

import Neetcode250.common.*;
import java.util.*;

/*
 * 344. Reverse String   [Easy]
 * LeetCode: https://leetcode.com/problems/reverse-string/
 * NeetCode: https://neetcode.io/problems/reverse-string
 *
 * Write a function that reverses a string. The input string is given as an array of characters s.
 *
 * You must do this by modifying the input array in-place with O(1) extra memory.
 *
 * Example 1:
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 *
 * Example 2:
 * Input: s = ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 *
 * Constraints:
 *   - 1 <= s.length <= 10^5
 *   - s[i] is a printable ascii character.
 */
public class Q01_ReverseString {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public void reverseString(char[] s) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("344. Reverse String");

        tester.check("s = [\"h\",\"e\",\"l\",\"l\",\"o\"]", "[\"o\",\"l\",\"l\",\"e\",\"h\"]", () -> {
            char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
            new Solution().reverseString(s);
            return s;
        });
        tester.check("s = [\"H\",\"a\",\"n\",\"n\",\"a\",\"h\"]", "[\"h\",\"a\",\"n\",\"n\",\"a\",\"H\"]", () -> {
            char[] s = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};
            new Solution().reverseString(s);
            return s;
        });

        tester.done();
    }
}
