package Neetcode250.HeapPriorityQueue;

import Neetcode250.common.*;
import java.util.*;

/*
 * 767. Reorganize String   [Medium]
 * LeetCode: https://leetcode.com/problems/reorganize-string/
 * NeetCode: https://neetcode.io/problems/reorganize-string
 *
 * Given a string s, rearrange the characters of s so that any two adjacent characters are not the
 * same.
 *
 * Return any possible rearrangement of s or return "" if not possible.
 *
 * Example 1:
 * Input: s = "aab"
 * Output: "aba"
 *
 * Example 2:
 * Input: s = "aaab"
 * Output: ""
 *
 * Constraints:
 *   - 1 <= s.length <= 500
 *   - s consists of lowercase English letters.
 */
public class Q08_ReorganizeString {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public String reorganizeString(String s) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("767. Reorganize String");

        tester.check("s = \"aab\"", "\"aba\"", () -> {
            String s = "aab";
            return new Solution().reorganizeString(s);
        });
        tester.check("s = \"aaab\"", "\"\"", () -> {
            String s = "aaab";
            return new Solution().reorganizeString(s);
        });

        tester.done();
    }
}
