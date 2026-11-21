package Neetcode250.TwoPointers;

import Neetcode250.common.*;
import java.util.*;

/*
 * 15. 3Sum   [Medium]
 * LeetCode: https://leetcode.com/problems/3sum/
 * NeetCode: https://neetcode.io/problems/three-integer-sum
 *
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i
 * != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 *
 * Notice that the solution set must not contain duplicate triplets.
 *
 * Example 1:
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 * Explanation:
 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
 * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
 * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
 * The distinct triplets are [-1,0,1] and [-1,-1,2].
 * Notice that the order of the output and the order of the triplets does not matter.
 *
 * Example 2:
 * Input: nums = [0,1,1]
 * Output: []
 * Explanation: The only possible triplet does not sum up to 0.
 *
 * Example 3:
 * Input: nums = [0,0,0]
 * Output: [[0,0,0]]
 * Explanation: The only possible triplet sums up to 0.
 *
 * Constraints:
 *   - 3 <= nums.length <= 3000
 *   - -10^5 <= nums[i] <= 10^5
 */
public class Q08_3Sum {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("15. 3Sum");
        // Answers are compared ignoring order at every level (problem allows any order).

        tester.check("nums = [-1,0,1,2,-1,-4]", "[[-1,-1,2],[-1,0,1]]", Tester.Order.ANY_DEEP, () -> {
            int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
            return new Solution().threeSum(nums);
        });
        tester.check("nums = [0,1,1]", "[]", Tester.Order.ANY_DEEP, () -> {
            int[] nums = new int[]{0, 1, 1};
            return new Solution().threeSum(nums);
        });
        tester.check("nums = [0,0,0]", "[[0,0,0]]", Tester.Order.ANY_DEEP, () -> {
            int[] nums = new int[]{0, 0, 0};
            return new Solution().threeSum(nums);
        });

        tester.done();
    }
}
