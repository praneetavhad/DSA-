package Neetcode250.DynamicProgramming1D;

import Neetcode250.common.*;
import java.util.*;

/*
 * 416. Partition Equal Subset Sum   [Medium]
 * LeetCode: https://leetcode.com/problems/partition-equal-subset-sum/
 * NeetCode: https://neetcode.io/problems/partition-equal-subset-sum
 *
 * Given an integer array nums, return true if you can partition the array into two subsets such that
 * the sum of the elements in both subsets is equal or false otherwise.
 *
 * Example 1:
 * Input: nums = [1,5,11,5]
 * Output: true
 * Explanation: The array can be partitioned as [1, 5, 5] and [11].
 *
 * Example 2:
 * Input: nums = [1,2,3,5]
 * Output: false
 * Explanation: The array cannot be partitioned into equal sum subsets.
 *
 * Constraints:
 *   - 1 <= nums.length <= 200
 *   - 1 <= nums[i] <= 100
 */
public class Q13_PartitionEqualSubsetSum {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public boolean canPartition(int[] nums) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("416. Partition Equal Subset Sum");

        tester.check("nums = [1,5,11,5]", "true", () -> {
            int[] nums = new int[]{1, 5, 11, 5};
            return new Solution().canPartition(nums);
        });
        tester.check("nums = [1,2,3,5]", "false", () -> {
            int[] nums = new int[]{1, 2, 3, 5};
            return new Solution().canPartition(nums);
        });

        tester.done();
    }
}
