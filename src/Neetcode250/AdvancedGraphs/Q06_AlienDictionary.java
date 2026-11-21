package Neetcode250.AdvancedGraphs;

import Neetcode250.common.*;
import java.util.*;

/*
 * 269. Alien Dictionary   [Hard]
 * LeetCode: https://leetcode.com/problems/alien-dictionary/
 * NeetCode: https://neetcode.io/problems/foreign-dictionary
 *
 * (LeetCode Premium - free version on NeetCode)
 *
 * There is a new alien language that uses the English alphabet, but the order of the letters is
 * unknown. You are given a list of strings words from the alien language's dictionary, where the
 * strings are sorted lexicographically by the rules of this new language.
 *
 * Return a string of the unique letters in the new alien language sorted in lexicographically
 * increasing order by the new language's rules. If there is no valid order, return "".
 * If there are multiple valid orders, return any of them.
 *
 * Note: if a word is a prefix of the word before it (e.g. ["abc","ab"]), the order is invalid.
 *
 * Example 1:
 * Input: words = ["wrt","wrf","er","ett","rftt"]
 * Output: "wertf"
 *
 * Example 2:
 * Input: words = ["z","x"]
 * Output: "zx"
 *
 * Example 3:
 * Input: words = ["z","x","z"]
 * Output: ""
 * Explanation: The order is invalid, so return "".
 *
 * Constraints:
 *   - 1 <= words.length <= 100
 *   - 1 <= words[i].length <= 100
 *   - words[i] consists of only lowercase English letters.
 */
public class Q06_AlienDictionary {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public String alienOrder(String[] words) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("269. Alien Dictionary");

        tester.check("words = [\"wrt\",\"wrf\",\"er\",\"ett\",\"rftt\"]", "\"wertf\"", () -> {
            String[] words = new String[]{"wrt", "wrf", "er", "ett", "rftt"};
            return new Solution().alienOrder(words);
        });
        tester.check("words = [\"z\",\"x\"]", "\"zx\"", () -> {
            String[] words = new String[]{"z", "x"};
            return new Solution().alienOrder(words);
        });
        tester.check("words = [\"z\",\"x\",\"z\"]", "\"\"", () -> {
            String[] words = new String[]{"z", "x", "z"};
            return new Solution().alienOrder(words);
        });
        tester.check("words = [\"abc\",\"ab\"]", "\"\"", () -> {
            String[] words = new String[]{"abc", "ab"};
            return new Solution().alienOrder(words);
        });

        tester.done();
    }
}
