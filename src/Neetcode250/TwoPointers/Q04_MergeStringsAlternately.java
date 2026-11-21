package Neetcode250.TwoPointers;

import Neetcode250.common.*;
import java.util.*;

/*
 * 1768. Merge Strings Alternately   [Easy]
 * LeetCode: https://leetcode.com/problems/merge-strings-alternately/
 * NeetCode: https://neetcode.io/problems/merge-strings-alternately
 *
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order,
 * starting with word1. If a string is longer than the other, append the additional letters onto the
 * end of the merged string.
 *
 * Return the merged string.
 *
 * Example 1:
 * Input: word1 = "abc", word2 = "pqr"
 * Output: "apbqcr"
 * Explanation: The merged string will be merged as so:
 * word1:  a   b   c
 * word2:    p   q   r
 * merged: a p b q c r
 *
 * Example 2:
 * Input: word1 = "ab", word2 = "pqrs"
 * Output: "apbqrs"
 * Explanation: Notice that as word2 is longer, "rs" is appended to the end.
 * word1:  a   b
 * word2:    p   q   r   s
 * merged: a p b q   r   s
 *
 * Example 3:
 * Input: word1 = "abcd", word2 = "pq"
 * Output: "apbqcd"
 * Explanation: Notice that as word1 is longer, "cd" is appended to the end.
 * word1:  a   b   c   d
 * word2:    p   q
 * merged: a p b q c   d
 *
 * Constraints:
 *   - 1 <= word1.length, word2.length <= 100
 *   - word1 and word2 consist of lowercase English letters.
 */
public class Q04_MergeStringsAlternately {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public String mergeAlternately(String word1, String word2) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("1768. Merge Strings Alternately");

        tester.check("word1 = \"abc\", word2 = \"pqr\"", "\"apbqcr\"", () -> {
            String word1 = "abc";
            String word2 = "pqr";
            return new Solution().mergeAlternately(word1, word2);
        });
        tester.check("word1 = \"ab\", word2 = \"pqrs\"", "\"apbqrs\"", () -> {
            String word1 = "ab";
            String word2 = "pqrs";
            return new Solution().mergeAlternately(word1, word2);
        });
        tester.check("word1 = \"abcd\", word2 = \"pq\"", "\"apbqcd\"", () -> {
            String word1 = "abcd";
            String word2 = "pq";
            return new Solution().mergeAlternately(word1, word2);
        });

        tester.done();
    }
}
