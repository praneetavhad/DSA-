package Neetcode250.DynamicProgramming1D;

import Neetcode250.common.*;
import java.util.*;

/*
 * 213. House Robber II   [Medium]
 * LeetCode: https://leetcode.com/problems/house-robber-ii/
 * NeetCode: https://neetcode.io/problems/house-robber-ii
 *
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount
 * of money stashed. All houses at this place are arranged in a circle. That means the first house is
 * the neighbor of the last one. Meanwhile, adjacent houses have a security system connected, and it
 * will automatically contact the police if two adjacent houses were broken into on the same night.
 *
 * Given an integer array nums representing the amount of money of each house, return the maximum
 * amount of money you can rob tonight without alerting the police.
 *
 * Example 1:
 * Input: nums = [2,3,2]
 * Output: 3
 * Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money = 2), because they are
 * adjacent houses.
 *
 * Example 2:
 * Input: nums = [1,2,3,1]
 * Output: 4
 * Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
 * Total amount you can rob = 1 + 3 = 4.
 *
 * Example 3:
 * Input: nums = [1,2,3]
 * Output: 3
 *
 * Constraints:
 *   - 1 <= nums.length <= 100
 *   - 0 <= nums[i] <= 1000
 */
public class Q05_HouseRobberII {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int rob(int[] nums) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("213. House Robber II");

        tester.check("nums = [2,3,2]", "3", () -> {
            int[] nums = new int[]{2, 3, 2};
            return new Solution().rob(nums);
        });
        tester.check("nums = [1,2,3,1]", "4", () -> {
            int[] nums = new int[]{1, 2, 3, 1};
            return new Solution().rob(nums);
        });
        tester.check("nums = [1,2,3]", "3", () -> {
            int[] nums = new int[]{1, 2, 3};
            return new Solution().rob(nums);
        });

        tester.done();
    }
}
