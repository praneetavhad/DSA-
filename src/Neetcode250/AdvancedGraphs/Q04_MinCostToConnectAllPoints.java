package Neetcode250.AdvancedGraphs;

import Neetcode250.common.*;
import java.util.*;

/*
 * 1584. Min Cost to Connect All Points   [Medium]
 * LeetCode: https://leetcode.com/problems/min-cost-to-connect-all-points/
 * NeetCode: https://neetcode.io/problems/min-cost-to-connect-points
 *
 * You are given an array points representing integer coordinates of some points on a 2D-plane, where
 * points[i] = [x_i, y_i].
 *
 * The cost of connecting two points [x_i, y_i] and [x_j, y_j] is the manhattan distance between them:
 * |x_i - x_j| + |y_i - y_j|, where |val| denotes the absolute value of val.
 *
 * Return the minimum cost to make all points connected. All points are connected if there is exactly
 * one simple path between any two points.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2020/08/26/d.png]
 * Input: points = [[0,0],[2,2],[3,10],[5,2],[7,0]]
 * Output: 20
 * Explanation:
 * [image: https://assets.leetcode.com/uploads/2020/08/26/c.png]
 * We can connect the points as shown above to get the minimum cost of 20.
 * Notice that there is a unique path between every pair of points.
 *
 * Example 2:
 * Input: points = [[3,12],[-2,5],[-4,1]]
 * Output: 18
 *
 * Constraints:
 *   - 1 <= points.length <= 1000
 *   - -10^6 <= x_i, y_i <= 10^6
 *   - All pairs (x_i, y_i) are distinct.
 */
public class Q04_MinCostToConnectAllPoints {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int minCostConnectPoints(int[][] points) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("1584. Min Cost to Connect All Points");

        tester.check("points = [[0,0],[2,2],[3,10],[5,2],[7,0]]", "20", () -> {
            int[][] points = new int[][]{{0, 0}, {2, 2}, {3, 10}, {5, 2}, {7, 0}};
            return new Solution().minCostConnectPoints(points);
        });
        tester.check("points = [[3,12],[-2,5],[-4,1]]", "18", () -> {
            int[][] points = new int[][]{{3, 12}, {-2, 5}, {-4, 1}};
            return new Solution().minCostConnectPoints(points);
        });

        tester.done();
    }
}
