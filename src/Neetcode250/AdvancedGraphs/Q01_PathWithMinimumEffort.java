package Neetcode250.AdvancedGraphs;

import Neetcode250.common.*;
import java.util.*;

/*
 * 1631. Path With Minimum Effort   [Medium]
 * LeetCode: https://leetcode.com/problems/path-with-minimum-effort/
 * NeetCode: https://neetcode.io/problems/path-with-minimum-effort
 *
 * You are a hiker preparing for an upcoming hike. You are given heights, a 2D array of size rows x
 * columns, where heights[row][col] represents the height of cell (row, col). You are situated in the
 * top-left cell, (0, 0), and you hope to travel to the bottom-right cell, (rows-1, columns-1) (i.e.,
 * 0-indexed). You can move up, down, left, or right, and you wish to find a route that requires the
 * minimum effort.
 *
 * A route's effort is the maximum absolute difference in heights between two consecutive cells of the
 * route.
 *
 * Return the minimum effort required to travel from the top-left cell to the bottom-right cell.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2020/10/04/ex1.png]
 * Input: heights = [[1,2,2],[3,8,2],[5,3,5]]
 * Output: 2
 * Explanation: The route of [1,3,5,3,5] has a maximum absolute difference of 2 in consecutive cells.
 * This is better than the route of [1,2,2,2,5], where the maximum absolute difference is 3.
 *
 * Example 2:
 * [image: https://assets.leetcode.com/uploads/2020/10/04/ex2.png]
 * Input: heights = [[1,2,3],[3,8,4],[5,3,5]]
 * Output: 1
 * Explanation: The route of [1,2,3,4,5] has a maximum absolute difference of 1 in consecutive cells,
 * which is better than route [1,3,5,3,5].
 *
 * Example 3:
 * [image: https://assets.leetcode.com/uploads/2020/10/04/ex3.png]
 * Input: heights = [[1,2,1,1,1],[1,2,1,2,1],[1,2,1,2,1],[1,2,1,2,1],[1,1,1,2,1]]
 * Output: 0
 * Explanation: This route does not require any effort.
 *
 * Constraints:
 *   - rows == heights.length
 *   - columns == heights[i].length
 *   - 1 <= rows, columns <= 100
 *   - 1 <= heights[i][j] <= 10^6
 */
public class Q01_PathWithMinimumEffort {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int minimumEffortPath(int[][] heights) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("1631. Path With Minimum Effort");

        tester.check("heights = [[1,2,2],[3,8,2],[5,3,5]]", "2", () -> {
            int[][] heights = new int[][]{{1, 2, 2}, {3, 8, 2}, {5, 3, 5}};
            return new Solution().minimumEffortPath(heights);
        });
        tester.check("heights = [[1,2,3],[3,8,4],[5,3,5]]", "1", () -> {
            int[][] heights = new int[][]{{1, 2, 3}, {3, 8, 4}, {5, 3, 5}};
            return new Solution().minimumEffortPath(heights);
        });
        tester.check("heights = [[1,2,1,1,1],[1,2,1,2,1],[1,2,1,2,1],[1,2,1,2,1],[1,1,1,2,1]]", "0", () -> {
            int[][] heights = new int[][]{{1, 2, 1, 1, 1}, {1, 2, 1, 2, 1}, {1, 2, 1, 2, 1}, {1, 2, 1, 2, 1}, {1, 1, 1, 2, 1}};
            return new Solution().minimumEffortPath(heights);
        });

        tester.done();
    }
}
