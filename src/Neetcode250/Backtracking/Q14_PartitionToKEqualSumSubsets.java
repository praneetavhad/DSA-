package Neetcode250.Backtracking;

import Neetcode250.common.*;
import java.util.*;

/*
 * 698. Partition to K Equal Sum Subsets   [Medium]
 * LeetCode: https://leetcode.com/problems/partition-to-k-equal-sum-subsets/
 * NeetCode: https://neetcode.io/problems/partition-to-k-equal-sum-subsets
 *
 * Given an integer array nums and an integer k, return true if it is possible to divide this array
 * into k non-empty subsets whose sums are all equal.
 *
 * Example 1:
 * Input: nums = [4,3,2,3,5,2,1], k = 4
 * Output: true
 * Explanation: It is possible to divide it into 4 subsets (5), (1, 4), (2,3), (2,3) with equal sums.
 *
 * Example 2:
 * Input: nums = [1,2,3,4], k = 3
 * Output: false
 *
 * Constraints:
 *   - 1 <= k <= nums.length <= 16
 *   - 1 <= nums[i] <= 10^4
 *   - The frequency of each element is in the range [1, 4].
 */
public class Q14_PartitionToKEqualSumSubsets {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public boolean canPartitionKSubsets(int[] nums, int k) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("698. Partition to K Equal Sum Subsets");

        tester.check("nums = [4,3,2,3,5,2,1], k = 4", "true", () -> {
            int[] nums = new int[]{4, 3, 2, 3, 5, 2, 1};
            int k = 4;
            return new Solution().canPartitionKSubsets(nums, k);
        });
        tester.check("nums = [1,2,3,4], k = 3", "false", () -> {
            int[] nums = new int[]{1, 2, 3, 4};
            int k = 3;
            return new Solution().canPartitionKSubsets(nums, k);
        });

        tester.done();
    }
}
