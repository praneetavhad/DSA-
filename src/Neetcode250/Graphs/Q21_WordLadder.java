package Neetcode250.Graphs;

import Neetcode250.common.*;
import java.util.*;

/*
 * 127. Word Ladder   [Hard]
 * LeetCode: https://leetcode.com/problems/word-ladder/
 * NeetCode: https://neetcode.io/problems/word-ladder
 *
 * A transformation sequence from word beginWord to word endWord using a dictionary wordList is a
 * sequence of words beginWord -> s_1 -> s_2 -> ... -> s_k such that:
 *   - Every adjacent pair of words differs by a single letter.
 *   - Every s_i for 1 <= i <= k is in wordList. Note that beginWord does not need to be in wordList.
 *   - s_k == endWord
 *
 * Given two words, beginWord and endWord, and a dictionary wordList, return the number of words in the
 * shortest transformation sequence from beginWord to endWord, or 0 if no such sequence exists.
 *
 * Example 1:
 * Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]
 * Output: 5
 * Explanation: One shortest transformation sequence is "hit" -> "hot" -> "dot" -> "dog" -> cog", which
 * is 5 words long.
 *
 * Example 2:
 * Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log"]
 * Output: 0
 * Explanation: The endWord "cog" is not in wordList, therefore there is no valid transformation
 * sequence.
 *
 * Constraints:
 *   - 1 <= beginWord.length <= 10
 *   - endWord.length == beginWord.length
 *   - 1 <= wordList.length <= 5000
 *   - wordList[i].length == beginWord.length
 *   - beginWord, endWord, and wordList[i] consist of lowercase English letters.
 *   - beginWord != endWord
 *   - All the words in wordList are unique.
 */
public class Q21_WordLadder {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int ladderLength(String beginWord, String endWord, List<String> wordList) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("127. Word Ladder");

        tester.check("beginWord = \"hit\", endWord = \"cog\", wordList = [\"hot\",\"dot\",\"dog\",\"lot\",\"log\",\"cog\"]", "5", () -> {
            String beginWord = "hit";
            String endWord = "cog";
            List<String> wordList = P.ls("[\"hot\",\"dot\",\"dog\",\"lot\",\"log\",\"cog\"]");
            return new Solution().ladderLength(beginWord, endWord, wordList);
        });
        tester.check("beginWord = \"hit\", endWord = \"cog\", wordList = [\"hot\",\"dot\",\"dog\",\"lot\",\"log\"]", "0", () -> {
            String beginWord = "hit";
            String endWord = "cog";
            List<String> wordList = P.ls("[\"hot\",\"dot\",\"dog\",\"lot\",\"log\"]");
            return new Solution().ladderLength(beginWord, endWord, wordList);
        });

        tester.done();
    }
}
