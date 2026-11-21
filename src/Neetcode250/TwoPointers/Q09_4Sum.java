package Neetcode250.TwoPointers;

import Neetcode250.common.*;
import java.util.*;

/*
 * 18. 4Sum   [Medium]
 * LeetCode: https://leetcode.com/problems/4sum/
 * NeetCode: https://neetcode.io/problems/4sum
 *
 * Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b],
 * nums[c], nums[d]] such that:
 *   - 0 <= a, b, c, d < n
 *   - a, b, c, and d are distinct.
 *   - nums[a] + nums[b] + nums[c] + nums[d] == target
 *
 * You may return the answer in any order.
 *
 * Example 1:
 * Input: nums = [1,0,-1,0,-2,2], target = 0
 * Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
 *
 * Example 2:
 * Input: nums = [2,2,2,2,2], target = 8
 * Output: [[2,2,2,2]]
 *
 * Constraints:
 *   - 1 <= nums.length <= 200
 *   - -10^9 <= nums[i] <= 10^9
 *   - -10^9 <= target <= 10^9
 */
public class Q09_4Sum {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("18. 4Sum");
        // Answers are compared ignoring order at every level (problem allows any order).

        tester.check("nums = [1,0,-1,0,-2,2], target = 0", "[[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]", Tester.Order.ANY_DEEP, () -> {
            int[] nums = new int[]{1, 0, -1, 0, -2, 2};
            int target = 0;
            return new Solution().fourSum(nums, target);
        });
        tester.check("nums = [2,2,2,2,2], target = 8", "[[2,2,2,2]]", Tester.Order.ANY_DEEP, () -> {
            int[] nums = new int[]{2, 2, 2, 2, 2};
            int target = 8;
            return new Solution().fourSum(nums, target);
        });

        tester.done();
    }
}
