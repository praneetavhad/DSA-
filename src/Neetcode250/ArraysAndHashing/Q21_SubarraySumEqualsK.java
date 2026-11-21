package Neetcode250.ArraysAndHashing;

import Neetcode250.common.*;
import java.util.*;

/*
 * 560. Subarray Sum Equals K   [Medium]
 * LeetCode: https://leetcode.com/problems/subarray-sum-equals-k/
 * NeetCode: https://neetcode.io/problems/subarray-sum-equals-k
 *
 * Given an array of integers nums and an integer k, return the total number of subarrays whose sum
 * equals to k.
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 * Example 1:
 * Input: nums = [1,1,1], k = 2
 * Output: 2
 *
 * Example 2:
 * Input: nums = [1,2,3], k = 3
 * Output: 2
 *
 * Constraints:
 *   - 1 <= nums.length <= 2 * 10^4
 *   - -1000 <= nums[i] <= 1000
 *   - -10^7 <= k <= 10^7
 */
public class Q21_SubarraySumEqualsK {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int subarraySum(int[] nums, int k) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("560. Subarray Sum Equals K");

        tester.check("nums = [1,1,1], k = 2", "2", () -> {
            int[] nums = new int[]{1, 1, 1};
            int k = 2;
            return new Solution().subarraySum(nums, k);
        });
        tester.check("nums = [1,2,3], k = 3", "2", () -> {
            int[] nums = new int[]{1, 2, 3};
            int k = 3;
            return new Solution().subarraySum(nums, k);
        });

        tester.done();
    }
}
