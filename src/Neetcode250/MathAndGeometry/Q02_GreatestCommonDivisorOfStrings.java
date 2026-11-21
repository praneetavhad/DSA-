package Neetcode250.MathAndGeometry;

import Neetcode250.common.*;
import java.util.*;

/*
 * 1071. Greatest Common Divisor of Strings   [Easy]
 * LeetCode: https://leetcode.com/problems/greatest-common-divisor-of-strings/
 * NeetCode: https://neetcode.io/problems/greatest-common-divisor-of-strings
 *
 * For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is
 * concatenated with itself one or more times).
 *
 * Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 *
 * Example 1:
 * Input: str1 = "ABCABC", str2 = "ABC"
 * Output: "ABC"
 *
 * Example 2:
 * Input: str1 = "ABABAB", str2 = "ABAB"
 * Output: "AB"
 *
 * Example 3:
 * Input: str1 = "LEET", str2 = "CODE"
 * Output: ""
 *
 * Example 4:
 * Input: str1 = "AAAAAB", str2 = "AAA"
 * Output: ""
 *
 * Constraints:
 *   - 1 <= str1.length, str2.length <= 1000
 *   - str1 and str2 consist of English uppercase letters.
 */
public class Q02_GreatestCommonDivisorOfStrings {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public String gcdOfStrings(String str1, String str2) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("1071. Greatest Common Divisor of Strings");

        tester.check("str1 = \"ABCABC\", str2 = \"ABC\"", "\"ABC\"", () -> {
            String str1 = "ABCABC";
            String str2 = "ABC";
            return new Solution().gcdOfStrings(str1, str2);
        });
        tester.check("str1 = \"ABABAB\", str2 = \"ABAB\"", "\"AB\"", () -> {
            String str1 = "ABABAB";
            String str2 = "ABAB";
            return new Solution().gcdOfStrings(str1, str2);
        });
        tester.check("str1 = \"LEET\", str2 = \"CODE\"", "\"\"", () -> {
            String str1 = "LEET";
            String str2 = "CODE";
            return new Solution().gcdOfStrings(str1, str2);
        });
        tester.check("str1 = \"AAAAAB\", str2 = \"AAA\"", "\"\"", () -> {
            String str1 = "AAAAAB";
            String str2 = "AAA";
            return new Solution().gcdOfStrings(str1, str2);
        });

        tester.done();
    }
}
