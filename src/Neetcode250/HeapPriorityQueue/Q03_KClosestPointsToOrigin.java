package Neetcode250.HeapPriorityQueue;

import Neetcode250.common.*;
import java.util.*;

/*
 * 973. K Closest Points to Origin   [Medium]
 * LeetCode: https://leetcode.com/problems/k-closest-points-to-origin/
 * NeetCode: https://neetcode.io/problems/k-closest-points-to-origin
 *
 * Given an array of points where points[i] = [x_i, y_i] represents a point on the X-Y plane and an
 * integer k, return the k closest points to the origin (0, 0).
 *
 * The distance between two points on the X-Y plane is the Euclidean distance (i.e., sqrt(x_1 - x_2)^2
 * + (y_1 - y_2)^2).
 *
 * You may return the answer in any order. The answer is guaranteed to be unique (except for the order
 * that it is in).
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2021/03/03/closestplane1.jpg]
 * Input: points = [[1,3],[-2,2]], k = 1
 * Output: [[-2,2]]
 * Explanation:
 * The distance between (1, 3) and the origin is sqrt(10).
 * The distance between (-2, 2) and the origin is sqrt(8).
 * Since sqrt(8) < sqrt(10), (-2, 2) is closer to the origin.
 * We only want the closest k = 1 points from the origin, so the answer is just [[-2,2]].
 *
 * Example 2:
 * Input: points = [[3,3],[5,-1],[-2,4]], k = 2
 * Output: [[3,3],[-2,4]]
 * Explanation: The answer [[-2,4],[3,3]] would also be accepted.
 *
 * Constraints:
 *   - 1 <= k <= points.length <= 10^4
 *   - -10^4 <= x_i, y_i <= 10^4
 */
public class Q03_KClosestPointsToOrigin {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int[][] kClosest(int[][] points, int k) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("973. K Closest Points to Origin");
        // Answers are compared ignoring the order of the outer list (problem allows any order).

        tester.check("points = [[1,3],[-2,2]], k = 1", "[[-2,2]]", Tester.Order.ANY, () -> {
            int[][] points = new int[][]{{1, 3}, {-2, 2}};
            int k = 1;
            return new Solution().kClosest(points, k);
        });
        tester.check("points = [[3,3],[5,-1],[-2,4]], k = 2", "[[3,3],[-2,4]]", Tester.Order.ANY, () -> {
            int[][] points = new int[][]{{3, 3}, {5, -1}, {-2, 4}};
            int k = 2;
            return new Solution().kClosest(points, k);
        });

        tester.done();
    }
}
