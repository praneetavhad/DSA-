package Neetcode250.Graphs;

import Neetcode250.common.*;
import java.util.*;

/*
 * 695. Max Area of Island   [Medium]
 * LeetCode: https://leetcode.com/problems/max-area-of-island/
 * NeetCode: https://neetcode.io/problems/max-area-of-island
 *
 * You are given an m x n binary matrix grid. An island is a group of 1's (representing land) connected
 * 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded
 * by water.
 *
 * The area of an island is the number of cells with a value 1 in the island.
 *
 * Return the maximum area of an island in grid. If there is no island, return 0.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2021/05/01/maxarea1-grid.jpg]
 * Input: grid =
 * [[0,0,1,0,0,0,0,1,0,0,0,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,1,1,0,1,0,0,0,0,0,0,0,0],[0,1,0,0,1,1,0,0,1,0,1,0,0],[0,1,0,0,1,1,0,0,1,1,1,0,0],[0,0,0,0,0,0,0,0,0,0,1,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,0,0,0,0,0,0,1,1,0,0,0,0]]
 * Output: 6
 * Explanation: The answer is not 11, because the island must be connected 4-directionally.
 *
 * Example 2:
 * Input: grid = [[0,0,0,0,0,0,0,0]]
 * Output: 0
 *
 * Constraints:
 *   - m == grid.length
 *   - n == grid[i].length
 *   - 1 <= m, n <= 50
 *   - grid[i][j] is either 0 or 1.
 */
public class Q05_MaxAreaOfIsland {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int maxAreaOfIsland(int[][] grid) {
            int cnt = 0;
            int max_cnt = 0;
            int m = grid.length;
            int n = grid[0].length;

            for(int i=0;i<m;i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 1) {
                        cnt = dfs(grid,i,j);
                        max_cnt = Math.max(cnt,max_cnt);
                    }
                }
            }
            return max_cnt;
        }

        private int dfs(int[][] grid, int i, int j) {
            if(i >=0 && i <grid.length && j>=0 && j< grid[0].length){
                if(grid[i][j] == 0){
                    return 0;
                }

                grid[i][j] = 0;
                int cnt = 1;
                cnt = cnt + dfs(grid,i+1,j);
                cnt = cnt + dfs(grid,i-1,j);
                cnt = cnt +dfs(grid,i,j+1);
                cnt = cnt +dfs(grid,i,j-1);
                return cnt;
            }
            return 0;
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("695. Max Area of Island");

        tester.check("grid = [[0,0,1,0,0,0,0,1,0,0,0,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,1,1,0,1,0,0,0,0,0,0,0,0],[0,1,0,0,1,1,0,0,1,0,1,0,0],[0,1,0,0,1,1,0,0,1,1,1,0,0],[0,0,0,0,0,0,0,0,0,0,1,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,0,0,0,0,0,0,1,1,0,0,0,0]]", "6", () -> {
            int[][] grid = new int[][]{{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0}, {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};
            return new Solution().maxAreaOfIsland(grid);
        });
        tester.check("grid = [[0,0,0,0,0,0,0,0]]", "0", () -> {
            int[][] grid = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0}};
            return new Solution().maxAreaOfIsland(grid);
        });

        tester.done();
    }
}
