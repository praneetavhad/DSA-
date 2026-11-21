package Neetcode250.Backtracking;

import Neetcode250.common.*;
import java.util.*;

/*
 * 131. Palindrome Partitioning   [Medium]
 * LeetCode: https://leetcode.com/problems/palindrome-partitioning/
 * NeetCode: https://neetcode.io/problems/palindrome-partitioning
 *
 * Given a string s, partition s such that every substring of the partition is a palindrome. Return all
 * possible palindrome partitioning of s.
 *
 * Example 1:
 * Input: s = "aab"
 * Output: [["a","a","b"],["aa","b"]]
 *
 * Example 2:
 * Input: s = "a"
 * Output: [["a"]]
 *
 * Constraints:
 *   - 1 <= s.length <= 16
 *   - s contains only lowercase English letters.
 */
public class Q11_PalindromePartitioning {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public List<List<String>> partition(String s) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("131. Palindrome Partitioning");
        // Answers are compared ignoring the order of the outer list (problem allows any order).

        tester.check("s = \"aab\"", "[[\"a\",\"a\",\"b\"],[\"aa\",\"b\"]]", Tester.Order.ANY, () -> {
            String s = "aab";
            return new Solution().partition(s);
        });
        tester.check("s = \"a\"", "[[\"a\"]]", Tester.Order.ANY, () -> {
            String s = "a";
            return new Solution().partition(s);
        });

        tester.done();
    }
}
