package Neetcode250.Graphs;

import Neetcode250.common.*;
import java.util.*;

/*
 * 130. Surrounded Regions   [Medium]
 * LeetCode: https://leetcode.com/problems/surrounded-regions/
 * NeetCode: https://neetcode.io/problems/surrounded-regions
 *
 * You are given an m x n matrix board containing letters 'X' and 'O', capture regions that are
 * surrounded:
 *   - Connect: A cell is connected to adjacent cells horizontally or vertically.
 *   - Region: To form a region connect every 'O' cell.
 *   - Surround: A region is surrounded if none of the 'O' cells in that region are on the edge of the
 *     board. Such regions are completely enclosed by 'X' cells.
 *
 * To capture a surrounded region, replace all 'O's with 'X's in-place within the original board. You
 * do not need to return anything.
 *
 * Example 1:
 * Input: board = [["X","X","X","X"],["X","O","O","X"],["X","X","O","X"],["X","O","X","X"]]
 * Output: [["X","X","X","X"],["X","X","X","X"],["X","X","X","X"],["X","O","X","X"]]
 * Explanation:
 * [image: https://assets.leetcode.com/uploads/2021/02/19/xogrid.jpg]
 *
 * In the above diagram, the bottom region is not captured because it is on the edge of the board and
 * cannot be surrounded.
 *
 * Example 2:
 * Input: board = [["X"]]
 * Output: [["X"]]
 *
 * Constraints:
 *   - m == board.length
 *   - n == board[i].length
 *   - 1 <= m, n <= 200
 *   - board[i][j] is 'X' or 'O'.
 */
public class Q10_SurroundedRegions {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public void solve(char[][] board) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("130. Surrounded Regions");

        tester.check("board = [[\"X\",\"X\",\"X\",\"X\"],[\"X\",\"O\",\"O\",\"X\"],[\"X\",\"X\",\"O\",\"X\"],[\"X\",\"O\",\"X\",\"X\"]]", "[[\"X\",\"X\",\"X\",\"X\"],[\"X\",\"X\",\"X\",\"X\"],[\"X\",\"X\",\"X\",\"X\"],[\"X\",\"O\",\"X\",\"X\"]]", () -> {
            char[][] board = new char[][]{{'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'X'}};
            new Solution().solve(board);
            return board;
        });
        tester.check("board = [[\"X\"]]", "[[\"X\"]]", () -> {
            char[][] board = new char[][]{{'X'}};
            new Solution().solve(board);
            return board;
        });

        tester.done();
    }
}
