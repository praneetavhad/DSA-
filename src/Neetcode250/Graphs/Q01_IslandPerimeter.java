package Neetcode250.Graphs;

import Neetcode250.common.*;
import java.util.*;

/*
 * 463. Island Perimeter   [Easy]
 * LeetCode: https://leetcode.com/problems/island-perimeter/
 * NeetCode: https://neetcode.io/problems/island-perimeter
 *
 * You are given row x col grid representing a map where grid[i][j] = 1 represents land and grid[i][j]
 * = 0 represents water.
 *
 * Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded
 * by water, and there is exactly one island (i.e., one or more connected land cells).
 *
 * The island doesn't have "lakes", meaning the water inside isn't connected to the water around the
 * island. One cell is a square with side length 1. The grid is rectangular, width and height don't
 * exceed 100. Determine the perimeter of the island.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2018/10/12/island.png]
 * Input: grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]
 * Output: 16
 * Explanation: The perimeter is the 16 yellow stripes in the image above.
 *
 * Example 2:
 * Input: grid = [[1]]
 * Output: 4
 *
 * Example 3:
 * Input: grid = [[1,0]]
 * Output: 4
 *
 * Constraints:
 *   - row == grid.length
 *   - col == grid[i].length
 *   - 1 <= row, col <= 100
 *   - grid[i][j] is 0 or 1.
 *   - There is exactly one island in grid.
 */
public class Q01_IslandPerimeter {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int islandPerimeter(int[][] grid) {
            int perimiter = 0;
            int m = grid.length;
            int n = grid[0].length;

            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(grid[i][j] == 1){
                        perimiter = perimiter + dfs(grid,i,j);

                    }
                }
            }
            return perimiter;
        }

        private int dfs(int[][] grid, int i, int j) {
            if(i<0 || i >= grid.length || j < 0 || j>=grid[0].length || grid[i][j] == 0){
                return 1;
            }

            if (grid[i][j] == -1){
                return 0;
            }

            grid[i][j] = -1;


            return (
                    dfs(grid,i+1,j) +
                    dfs(grid,i-1,j) +
                    dfs(grid,i,j+1) +
                    dfs(grid,i,j-1)
            );
        }

    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("463. Island Perimeter");

        tester.check("grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]", "16", () -> {
            int[][] grid = new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
            return new Solution().islandPerimeter(grid);
        });
        tester.check("grid = [[1]]", "4", () -> {
            int[][] grid = new int[][]{{1}};
            return new Solution().islandPerimeter(grid);
        });
        tester.check("grid = [[1,0]]", "4", () -> {
            int[][] grid = new int[][]{{1, 0}};
            return new Solution().islandPerimeter(grid);
        });

        tester.done();
    }
}
