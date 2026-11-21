package Neetcode250.DynamicProgramming1D;

import Neetcode250.common.*;
import java.util.*;

/*
 * 746. Min Cost Climbing Stairs   [Easy]
 * LeetCode: https://leetcode.com/problems/min-cost-climbing-stairs/
 * NeetCode: https://neetcode.io/problems/min-cost-climbing-stairs
 *
 * You are given an integer array cost where cost[i] is the cost of i^th step on a staircase.
 *
 * Once you pay the cost, you can either climb one or two steps.
 *
 * You can either start from the step with index 0, or the step with index 1.
 *
 * Return the minimum cost to reach the top of the staircase, which is the position just past the last
 * step (index cost.length).
 *
 * Example 1:
 * Input: cost = [10,15,20]
 * Output: 15
 * Explanation: You will start at index 1.
 * - Pay 15 and climb two steps to reach the top.
 * The total cost is 15.
 *
 * Example 2:
 * Input: cost = [1,100,1,1,1,100,1,1,100,1]
 * Output: 6
 * Explanation: You will start at index 0.
 * - Pay 1 and climb two steps to reach index 2.
 * - Pay 1 and climb two steps to reach index 4.
 * - Pay 1 and climb two steps to reach index 6.
 * - Pay 1 and climb one step to reach index 7.
 * - Pay 1 and climb two steps to reach index 9.
 * - Pay 1 and climb one step to reach the top.
 * The total cost is 6.
 *
 * Constraints:
 *   - 2 <= cost.length <= 1000
 *   - 0 <= cost[i] <= 999
 */
public class Q02_MinCostClimbingStairs {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int minCostClimbingStairs(int[] cost) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("746. Min Cost Climbing Stairs");

        tester.check("cost = [10,15,20]", "15", () -> {
            int[] cost = new int[]{10, 15, 20};
            return new Solution().minCostClimbingStairs(cost);
        });
        tester.check("cost = [1,100,1,1,1,100,1,1,100,1]", "6", () -> {
            int[] cost = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
            return new Solution().minCostClimbingStairs(cost);
        });

        tester.done();
    }
}
