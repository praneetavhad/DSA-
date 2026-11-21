package Neetcode250.DynamicProgramming2D;

import Neetcode250.common.*;
import java.util.*;

/*
 * 115. Distinct Subsequences   [Hard]
 * LeetCode: https://leetcode.com/problems/distinct-subsequences/
 * NeetCode: https://neetcode.io/problems/count-subsequences
 *
 * Given two strings s and t, return the number of distinct subsequences of s which equals t.
 *
 * The test cases are generated so that the answer fits on a 32-bit signed integer.
 *
 * Example 1:
 * Input: s = "rabbbit", t = "rabbit"
 * Output: 3
 * Explanation:
 * As shown below, there are 3 ways you can generate "rabbit" from s.
 * rabbbit
 * rabbbit
 * rabbbit
 *
 * Example 2:
 * Input: s = "babgbag", t = "bag"
 * Output: 5
 * Explanation:
 * As shown below, there are 5 ways you can generate "bag" from s.
 * babgbag
 * babgbag
 * babgbag
 * babgbag
 * babgbag
 *
 * Constraints:
 *   - 1 <= s.length, t.length <= 1000
 *   - s and t consist of English letters.
 */
public class Q13_DistinctSubsequences {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int numDistinct(String s, String t) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("115. Distinct Subsequences");

        tester.check("s = \"rabbbit\", t = \"rabbit\"", "3", () -> {
            String s = "rabbbit";
            String t = "rabbit";
            return new Solution().numDistinct(s, t);
        });
        tester.check("s = \"babgbag\", t = \"bag\"", "5", () -> {
            String s = "babgbag";
            String t = "bag";
            return new Solution().numDistinct(s, t);
        });

        tester.done();
    }
}
