package Neetcode250.Greedy;

import Neetcode250.common.*;
import java.util.*;

/*
 * 763. Partition Labels   [Medium]
 * LeetCode: https://leetcode.com/problems/partition-labels/
 * NeetCode: https://neetcode.io/problems/partition-labels
 *
 * You are given a string s. We want to partition the string into as many parts as possible so that
 * each letter appears in at most one part. For example, the string "ababcc" can be partitioned into
 * ["abab", "cc"], but partitions such as ["aba", "bcc"] or ["ab", "ab", "cc"] are invalid.
 *
 * Note that the partition is done so that after concatenating all the parts in order, the resultant
 * string should be s.
 *
 * Return a list of integers representing the size of these parts.
 *
 * Example 1:
 * Input: s = "ababcbacadefegdehijhklij"
 * Output: [9,7,8]
 * Explanation:
 * The partition is "ababcbaca", "defegde", "hijhklij".
 * This is a partition so that each letter appears in at most one part.
 * A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits s into less parts.
 *
 * Example 2:
 * Input: s = "eccbbbbdec"
 * Output: [10]
 *
 * Constraints:
 *   - 1 <= s.length <= 500
 *   - s consists of lowercase English letters.
 */
public class Q12_PartitionLabels {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public List<Integer> partitionLabels(String s) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("763. Partition Labels");

        tester.check("s = \"ababcbacadefegdehijhklij\"", "[9,7,8]", () -> {
            String s = "ababcbacadefegdehijhklij";
            return new Solution().partitionLabels(s);
        });
        tester.check("s = \"eccbbbbdec\"", "[10]", () -> {
            String s = "eccbbbbdec";
            return new Solution().partitionLabels(s);
        });

        tester.done();
    }
}
