package Neetcode250.Backtracking;

import Neetcode250.common.*;
import java.util.*;

/*
 * 79. Word Search   [Medium]
 * LeetCode: https://leetcode.com/problems/word-search/
 * NeetCode: https://neetcode.io/problems/search-for-word
 *
 * Given an m x n grid of characters board and a string word, return true if word exists in the grid.
 *
 * The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are
 * horizontally or vertically neighboring. The same letter cell may not be used more than once.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2020/11/04/word2.jpg]
 * Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
 * Output: true
 *
 * Example 2:
 * [image: https://assets.leetcode.com/uploads/2020/11/04/word-1.jpg]
 * Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
 * Output: true
 *
 * Example 3:
 * [image: https://assets.leetcode.com/uploads/2020/10/15/word3.jpg]
 * Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
 * Output: false
 *
 * Constraints:
 *   - m == board.length
 *   - n = board[i].length
 *   - 1 <= m, n <= 6
 *   - 1 <= word.length <= 15
 *   - board and word consists of only lowercase and uppercase English letters.
 *
 * Follow up: Could you use search pruning to make your solution faster with a larger board?
 */
public class Q10_WordSearch {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public boolean exist(char[][] board, String word) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("79. Word Search");

        tester.check("board = [[\"A\",\"B\",\"C\",\"E\"],[\"S\",\"F\",\"C\",\"S\"],[\"A\",\"D\",\"E\",\"E\"]], word = \"ABCCED\"", "true", () -> {
            char[][] board = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
            String word = "ABCCED";
            return new Solution().exist(board, word);
        });
        tester.check("board = [[\"A\",\"B\",\"C\",\"E\"],[\"S\",\"F\",\"C\",\"S\"],[\"A\",\"D\",\"E\",\"E\"]], word = \"SEE\"", "true", () -> {
            char[][] board = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
            String word = "SEE";
            return new Solution().exist(board, word);
        });
        tester.check("board = [[\"A\",\"B\",\"C\",\"E\"],[\"S\",\"F\",\"C\",\"S\"],[\"A\",\"D\",\"E\",\"E\"]], word = \"ABCB\"", "false", () -> {
            char[][] board = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
            String word = "ABCB";
            return new Solution().exist(board, word);
        });

        tester.done();
    }
}
