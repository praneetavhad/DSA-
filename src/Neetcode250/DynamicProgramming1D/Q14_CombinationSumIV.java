package Neetcode250.DynamicProgramming1D;

import Neetcode250.common.*;
import java.util.*;

/*
 * 377. Combination Sum IV   [Medium]
 * LeetCode: https://leetcode.com/problems/combination-sum-iv/
 * NeetCode: https://neetcode.io/problems/combination-sum-iv
 *
 * Given an array of distinct integers nums and a target integer target, return the number of possible
 * combinations that add up to target.
 *
 * The test cases are generated so that the answer can fit in a 32-bit integer.
 *
 * Example 1:
 * Input: nums = [1,2,3], target = 4
 * Output: 7
 * Explanation:
 * The possible combination ways are:
 * (1, 1, 1, 1)
 * (1, 1, 2)
 * (1, 2, 1)
 * (1, 3)
 * (2, 1, 1)
 * (2, 2)
 * (3, 1)
 * Note that different sequences are counted as different combinations.
 *
 * Example 2:
 * Input: nums = [9], target = 3
 * Output: 0
 *
 * Constraints:
 *   - 1 <= nums.length <= 200
 *   - 1 <= nums[i] <= 1000
 *   - All the elements of nums are unique.
 *   - 1 <= target <= 1000
 *
 * Follow up: What if negative numbers are allowed in the given array? How does it change the problem?
 * What limitation we need to add to the question to allow negative numbers?
 */
public class Q14_CombinationSumIV {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int combinationSum4(int[] nums, int target) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("377. Combination Sum IV");

        tester.check("nums = [1,2,3], target = 4", "7", () -> {
            int[] nums = new int[]{1, 2, 3};
            int target = 4;
            return new Solution().combinationSum4(nums, target);
        });
        tester.check("nums = [9], target = 3", "0", () -> {
            int[] nums = new int[]{9};
            int target = 3;
            return new Solution().combinationSum4(nums, target);
        });

        tester.done();
    }
}
