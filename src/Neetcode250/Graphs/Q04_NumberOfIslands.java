package Neetcode250.Graphs;

import Neetcode250.common.*;
import java.util.*;

/*
 * 200. Number of Islands   [Medium]
 * LeetCode: https://leetcode.com/problems/number-of-islands/
 * NeetCode: https://neetcode.io/problems/count-number-of-islands
 *
 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return
 * the number of islands.
 *
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or
 * vertically. You may assume all four edges of the grid are all surrounded by water.
 *
 * Example 1:
 * Input: grid = [
 *   ["1","1","1","1","0"],
 *   ["1","1","0","1","0"],
 *   ["1","1","0","0","0"],
 *   ["0","0","0","0","0"]
 * ]
 * Output: 1
 *
 * Example 2:
 * Input: grid = [
 *   ["1","1","0","0","0"],
 *   ["1","1","0","0","0"],
 *   ["0","0","1","0","0"],
 *   ["0","0","0","1","1"]
 * ]
 * Output: 3
 *
 * Constraints:
 *   - m == grid.length
 *   - n == grid[i].length
 *   - 1 <= m, n <= 300
 *   - grid[i][j] is '0' or '1'.
 */
public class Q04_NumberOfIslands {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int numIslands(char[][] grid) {
            int cnt = 0;
            int m = grid.length;
            int n = grid[0].length;

            for(int i=0;i<m;i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == '1') {
                        dfs(grid,i,j);
                        cnt++;
                    }
                }
            }
            return cnt;
        }

        private void dfs(char[][] grid, int i, int j) {
            if(i >=0 && i <grid.length && j>=0 && j< grid[0].length){
                if(grid[i][j] == '0'){
                    return;
                }

                grid[i][j] = '0';
                dfs(grid,i+1,j);
                dfs(grid,i-1,j);
                dfs(grid,i,j+1);
                dfs(grid,i,j-1);
            }
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("200. Number of Islands");

        tester.check("grid = [[\"1\",\"1\",\"1\",\"1\",\"0\"],[\"1\",\"1\",\"0\",\"1\",\"0\"],[\"1\",\"1\",\"0\",\"0\",\"0\"],[\"0\",\"0\",\"0\",\"0\",\"0\"]]", "1", () -> {
            char[][] grid = new char[][]{{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}};
            return new Solution().numIslands(grid);
        });
        tester.check("grid = [[\"1\",\"1\",\"0\",\"0\",\"0\"],[\"1\",\"1\",\"0\",\"0\",\"0\"],[\"0\",\"0\",\"1\",\"0\",\"0\"],[\"0\",\"0\",\"0\",\"1\",\"1\"]]", "3", () -> {
            char[][] grid = new char[][]{{'1', '1', '0', '0', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '1', '0', '0'}, {'0', '0', '0', '1', '1'}};
            return new Solution().numIslands(grid);
        });

        tester.done();
    }
}
