package Neetcode250.Tries;

import Neetcode250.common.*;
import java.util.*;

/*
 * 212. Word Search II   [Hard]
 * LeetCode: https://leetcode.com/problems/word-search-ii/
 * NeetCode: https://neetcode.io/problems/search-for-word-ii
 *
 * Given an m x n board of characters and a list of strings words, return all words on the board.
 *
 * Each word must be constructed from letters of sequentially adjacent cells, where adjacent cells are
 * horizontally or vertically neighboring. The same letter cell may not be used more than once in a
 * word.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2020/11/07/search1.jpg]
 * Input: board = [["o","a","a","n"],["e","t","a","e"],["i","h","k","r"],["i","f","l","v"]], words =
 * ["oath","pea","eat","rain"]
 * Output: ["eat","oath"]
 *
 * Example 2:
 * [image: https://assets.leetcode.com/uploads/2020/11/07/search2.jpg]
 * Input: board = [["a","b"],["c","d"]], words = ["abcb"]
 * Output: []
 *
 * Constraints:
 *   - m == board.length
 *   - n == board[i].length
 *   - 1 <= m, n <= 12
 *   - board[i][j] is a lowercase English letter.
 *   - 1 <= words.length <= 3 * 10^4
 *   - 1 <= words[i].length <= 10
 *   - words[i] consists of lowercase English letters.
 *   - All the strings of words are unique.
 */
public class Q04_WordSearchII {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public List<String> findWords(char[][] board, String[] words) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("212. Word Search II");
        // Answers are compared ignoring the order of the outer list (problem allows any order).

        tester.check("board = [[\"o\",\"a\",\"a\",\"n\"],[\"e\",\"t\",\"a\",\"e\"],[\"i\",\"h\",\"k\",\"r\"],[\"i\",\"f\",\"l\",\"v\"]], words = [\"oath\",\"pea\",\"eat\",\"rain\"]", "[\"eat\",\"oath\"]", Tester.Order.ANY, () -> {
            char[][] board = new char[][]{{'o', 'a', 'a', 'n'}, {'e', 't', 'a', 'e'}, {'i', 'h', 'k', 'r'}, {'i', 'f', 'l', 'v'}};
            String[] words = new String[]{"oath", "pea", "eat", "rain"};
            return new Solution().findWords(board, words);
        });
        tester.check("board = [[\"a\",\"b\"],[\"c\",\"d\"]], words = [\"abcb\"]", "[]", Tester.Order.ANY, () -> {
            char[][] board = new char[][]{{'a', 'b'}, {'c', 'd'}};
            String[] words = new String[]{"abcb"};
            return new Solution().findWords(board, words);
        });

        tester.done();
    }
}
