package Neetcode250.DynamicProgramming2D;

import Neetcode250.common.*;
import java.util.*;

/*
 * 72. Edit Distance   [Medium]
 * LeetCode: https://leetcode.com/problems/edit-distance/
 * NeetCode: https://neetcode.io/problems/edit-distance
 *
 * Given two strings word1 and word2, return the minimum number of operations required to convert word1
 * to word2.
 *
 * You have the following three operations permitted on a word:
 *   - Insert a character
 *   - Delete a character
 *   - Replace a character
 *
 * Example 1:
 * Input: word1 = "horse", word2 = "ros"
 * Output: 3
 * Explanation:
 * horse -> rorse (replace 'h' with 'r')
 * rorse -> rose (remove 'r')
 * rose -> ros (remove 'e')
 *
 * Example 2:
 * Input: word1 = "intention", word2 = "execution"
 * Output: 5
 * Explanation:
 * intention -> inention (remove 't')
 * inention -> enention (replace 'i' with 'e')
 * enention -> exention (replace 'n' with 'x')
 * exention -> exection (replace 'n' with 'c')
 * exection -> execution (insert 'u')
 *
 * Constraints:
 *   - 0 <= word1.length, word2.length <= 500
 *   - word1 and word2 consist of lowercase English letters.
 */
public class Q14_EditDistance {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int minDistance(String word1, String word2) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("72. Edit Distance");

        tester.check("word1 = \"horse\", word2 = \"ros\"", "3", () -> {
            String word1 = "horse";
            String word2 = "ros";
            return new Solution().minDistance(word1, word2);
        });
        tester.check("word1 = \"intention\", word2 = \"execution\"", "5", () -> {
            String word1 = "intention";
            String word2 = "execution";
            return new Solution().minDistance(word1, word2);
        });

        tester.done();
    }
}
