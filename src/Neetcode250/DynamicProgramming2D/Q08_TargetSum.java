package Neetcode250.DynamicProgramming2D;

import Neetcode250.common.*;
import java.util.*;

/*
 * 494. Target Sum   [Medium]
 * LeetCode: https://leetcode.com/problems/target-sum/
 * NeetCode: https://neetcode.io/problems/target-sum
 *
 * You are given an integer array nums and an integer target.
 *
 * You want to build an expression out of nums by adding one of the symbols '+' and '-' before each
 * integer in nums and then concatenate all the integers.
 *   - For example, if nums = [2, 1], you can add a '+' before 2 and a '-' before 1 and concatenate
 *     them to build the expression "+2-1".
 *
 * Return the number of different expressions that you can build, which evaluates to target.
 *
 * Example 1:
 * Input: nums = [1,1,1,1,1], target = 3
 * Output: 5
 * Explanation: There are 5 ways to assign symbols to make the sum of nums be target 3.
 * -1 + 1 + 1 + 1 + 1 = 3
 * +1 - 1 + 1 + 1 + 1 = 3
 * +1 + 1 - 1 + 1 + 1 = 3
 * +1 + 1 + 1 - 1 + 1 = 3
 * +1 + 1 + 1 + 1 - 1 = 3
 *
 * Example 2:
 * Input: nums = [1], target = 1
 * Output: 1
 *
 * Constraints:
 *   - 1 <= nums.length <= 20
 *   - 0 <= nums[i] <= 1000
 *   - 0 <= sum(nums[i]) <= 1000
 *   - -1000 <= target <= 1000
 */
public class Q08_TargetSum {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int findTargetSumWays(int[] nums, int target) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("494. Target Sum");

        tester.check("nums = [1,1,1,1,1], target = 3", "5", () -> {
            int[] nums = new int[]{1, 1, 1, 1, 1};
            int target = 3;
            return new Solution().findTargetSumWays(nums, target);
        });
        tester.check("nums = [1], target = 1", "1", () -> {
            int[] nums = new int[]{1};
            int target = 1;
            return new Solution().findTargetSumWays(nums, target);
        });

        tester.done();
    }
}
