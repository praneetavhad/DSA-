package Neetcode250.Backtracking;

import Neetcode250.common.*;
import java.util.*;

/*
 * 140. Word Break II   [Hard]
 * LeetCode: https://leetcode.com/problems/word-break-ii/
 * NeetCode: https://neetcode.io/problems/word-break-ii
 *
 * Given a string s and a dictionary of strings wordDict, add spaces in s to construct a sentence where
 * each word is a valid dictionary word. Return all such possible sentences in any order.
 *
 * Note that the same word in the dictionary may be reused multiple times in the segmentation.
 *
 * Example 1:
 * Input: s = "catsanddog", wordDict = ["cat","cats","and","sand","dog"]
 * Output: ["cats and dog","cat sand dog"]
 *
 * Example 2:
 * Input: s = "pineapplepenapple", wordDict = ["apple","pen","applepen","pine","pineapple"]
 * Output: ["pine apple pen apple","pineapple pen apple","pine applepen apple"]
 * Explanation: Note that you are allowed to reuse a dictionary word.
 *
 * Example 3:
 * Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
 * Output: []
 *
 * Constraints:
 *   - 1 <= s.length <= 20
 *   - 1 <= wordDict.length <= 1000
 *   - 1 <= wordDict[i].length <= 10
 *   - s and wordDict[i] consist of only lowercase English letters.
 *   - All the strings of wordDict are unique.
 *   - Input is generated in a way that the length of the answer doesn't exceed 10^5.
 */
public class Q17_WordBreakII {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public List<String> wordBreak(String s, List<String> wordDict) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("140. Word Break II");
        // Answers are compared ignoring the order of the outer list (problem allows any order).

        tester.check("s = \"catsanddog\", wordDict = [\"cat\",\"cats\",\"and\",\"sand\",\"dog\"]", "[\"cats and dog\",\"cat sand dog\"]", Tester.Order.ANY, () -> {
            String s = "catsanddog";
            List<String> wordDict = P.ls("[\"cat\",\"cats\",\"and\",\"sand\",\"dog\"]");
            return new Solution().wordBreak(s, wordDict);
        });
        tester.check("s = \"pineapplepenapple\", wordDict = [\"apple\",\"pen\",\"applepen\",\"pine\",\"pineapple\"]", "[\"pine apple pen apple\",\"pineapple pen apple\",\"pine applepen apple\"]", Tester.Order.ANY, () -> {
            String s = "pineapplepenapple";
            List<String> wordDict = P.ls("[\"apple\",\"pen\",\"applepen\",\"pine\",\"pineapple\"]");
            return new Solution().wordBreak(s, wordDict);
        });
        tester.check("s = \"catsandog\", wordDict = [\"cats\",\"dog\",\"sand\",\"and\",\"cat\"]", "[]", Tester.Order.ANY, () -> {
            String s = "catsandog";
            List<String> wordDict = P.ls("[\"cats\",\"dog\",\"sand\",\"and\",\"cat\"]");
            return new Solution().wordBreak(s, wordDict);
        });

        tester.done();
    }
}
