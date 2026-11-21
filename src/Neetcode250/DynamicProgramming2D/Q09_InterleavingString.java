package Neetcode250.DynamicProgramming2D;

import Neetcode250.common.*;
import java.util.*;

/*
 * 97. Interleaving String   [Medium]
 * LeetCode: https://leetcode.com/problems/interleaving-string/
 * NeetCode: https://neetcode.io/problems/interleaving-string
 *
 * Given strings s1, s2, and s3, find whether s3 is formed by an interleaving of s1 and s2.
 *
 * An interleaving of two strings s and t is a configuration where s and t are divided into n and m
 * substrings respectively, such that:
 *   - s = s_1 + s_2 + ... + s_n
 *   - t = t_1 + t_2 + ... + t_m
 *   - |n - m| <= 1
 *   - The interleaving is s_1 + t_1 + s_2 + t_2 + s_3 + t_3 + ... or t_1 + s_1 + t_2 + s_2 + t_3 + s_3
 *     + ...
 *
 * Note: a + b is the concatenation of strings a and b.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2020/09/02/interleave.jpg]
 * Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"
 * Output: true
 * Explanation: One way to obtain s3 is:
 * Split s1 into s1 = "aa" + "bc" + "c", and s2 into s2 = "dbbc" + "a".
 * Interleaving the two splits, we get "aa" + "dbbc" + "bc" + "a" + "c" = "aadbbcbcac".
 * Since s3 can be obtained by interleaving s1 and s2, we return true.
 *
 * Example 2:
 * Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc"
 * Output: false
 * Explanation: Notice how it is impossible to interleave s2 with any other string to obtain s3.
 *
 * Example 3:
 * Input: s1 = "", s2 = "", s3 = ""
 * Output: true
 *
 * Constraints:
 *   - 0 <= s1.length, s2.length <= 100
 *   - 0 <= s3.length <= 200
 *   - s1, s2, and s3 consist of lowercase English letters.
 *
 * Follow up: Could you solve it using only O(s2.length) additional memory space?
 */
public class Q09_InterleavingString {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public boolean isInterleave(String s1, String s2, String s3) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("97. Interleaving String");

        tester.check("s1 = \"aabcc\", s2 = \"dbbca\", s3 = \"aadbbcbcac\"", "true", () -> {
            String s1 = "aabcc";
            String s2 = "dbbca";
            String s3 = "aadbbcbcac";
            return new Solution().isInterleave(s1, s2, s3);
        });
        tester.check("s1 = \"aabcc\", s2 = \"dbbca\", s3 = \"aadbbbaccc\"", "false", () -> {
            String s1 = "aabcc";
            String s2 = "dbbca";
            String s3 = "aadbbbaccc";
            return new Solution().isInterleave(s1, s2, s3);
        });
        tester.check("s1 = \"\", s2 = \"\", s3 = \"\"", "true", () -> {
            String s1 = "";
            String s2 = "";
            String s3 = "";
            return new Solution().isInterleave(s1, s2, s3);
        });

        tester.done();
    }
}
