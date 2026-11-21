package Neetcode250.Graphs;

import Neetcode250.common.*;
import java.util.*;

/*
 * 994. Rotting Oranges   [Medium]
 * LeetCode: https://leetcode.com/problems/rotting-oranges/
 * NeetCode: https://neetcode.io/problems/rotting-fruit
 *
 * You are given an m x n grid where each cell can have one of three values:
 *   - 0 representing an empty cell,
 *   - 1 representing a fresh orange, or
 *   - 2 representing a rotten orange.
 *
 * Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.
 *
 * Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is
 * impossible, return -1.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2019/02/16/oranges.png]
 * Input: grid = [[2,1,1],[1,1,0],[0,1,1]]
 * Output: 4
 *
 * Example 2:
 * Input: grid = [[2,1,1],[0,1,1],[1,0,1]]
 * Output: -1
 * Explanation: The orange in the bottom left corner (row 2, column 0) is never rotten, because rotting
 * only happens 4-directionally.
 *
 * Example 3:
 * Input: grid = [[0,2]]
 * Output: 0
 * Explanation: Since there are already no fresh oranges at minute 0, the answer is just 0.
 *
 * Constraints:
 *   - m == grid.length
 *   - n == grid[i].length
 *   - 1 <= m, n <= 10
 *   - grid[i][j] is 0, 1, or 2.
 */
public class Q08_RottingOranges {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        private static final int[][] DIRECTIONS = {
                {1, 0},  // down
                {-1, 0}, // up
                {0, 1},  // right
                {0, -1}  // left
        };

        public int orangesRotting(int[][] grid) {
            int minutes = 0;
            int fresh = 0;
            int m = grid.length;
            int n = grid[0].length;
            Queue<int[]> q = new LinkedList<>();

            for(int i=0;i<m;i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] ==2){
                        q.add(new int[]{i,j});
                    }else if(grid[i][j] ==1){
                        fresh++;
                    }
                }
            }

            if (fresh == 0){
                return 0;
            }

            while (!q.isEmpty() && fresh>0){
                int q_size = q.size();
                while(q_size>0){
                    int[] curr_orange = q.poll();
                    int curr_row = curr_orange[0];
                    int curr_col = curr_orange[1];

                    for(int[] direction: DIRECTIONS){
                        int nextRow = curr_row + direction[0];
                        int nextCol = curr_col + direction[1];

                        if(nextRow >= 0 && nextRow < m && nextCol >=0 && nextCol < n && grid[nextRow][nextCol] == 1){
                            grid[nextRow][nextCol] = 2;
                            q.offer(new int[]{nextRow, nextCol});
                            fresh--;
                        }
                    }

                    q_size--;
                }
                minutes++;
            }

            if(fresh == 0){
                return minutes;
            }
            return -1;
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("994. Rotting Oranges");

        tester.check("grid = [[2,1,1],[1,1,0],[0,1,1]]", "4", () -> {
            int[][] grid = new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
            return new Solution().orangesRotting(grid);
        });
        tester.check("grid = [[2,1,1],[0,1,1],[1,0,1]]", "-1", () -> {
            int[][] grid = new int[][]{{2, 1, 1}, {0, 1, 1}, {1, 0, 1}};
            return new Solution().orangesRotting(grid);
        });
        tester.check("grid = [[0,2]]", "0", () -> {
            int[][] grid = new int[][]{{0, 2}};
            return new Solution().orangesRotting(grid);
        });

        tester.done();
    }
}
