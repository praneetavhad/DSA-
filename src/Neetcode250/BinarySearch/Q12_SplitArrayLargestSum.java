package Neetcode250.BinarySearch;

import Neetcode250.common.*;
import java.util.*;

/*
 * 410. Split Array Largest Sum   [Hard]
 * LeetCode: https://leetcode.com/problems/split-array-largest-sum/
 * NeetCode: https://neetcode.io/problems/split-array-largest-sum
 *
 * Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the
 * largest sum of any subarray is minimized.
 *
 * Return the minimized largest sum of the split.
 *
 * A subarray is a contiguous part of the array.
 *
 * Example 1:
 * Input: nums = [7,2,5,10,8], k = 2
 * Output: 18
 * Explanation: There are four ways to split nums into two subarrays.
 * The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays
 * is only 18.
 *
 * Example 2:
 * Input: nums = [1,2,3,4,5], k = 2
 * Output: 9
 * Explanation: There are four ways to split nums into two subarrays.
 * The best way is to split it into [1,2,3] and [4,5], where the largest sum among the two subarrays is
 * only 9.
 *
 * Constraints:
 *   - 1 <= nums.length <= 1000
 *   - 0 <= nums[i] <= 10^6
 *   - 1 <= k <= min(50, nums.length)
 */
public class Q12_SplitArrayLargestSum {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int splitArray(int[] nums, int k) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("410. Split Array Largest Sum");

        tester.check("nums = [7,2,5,10,8], k = 2", "18", () -> {
            int[] nums = new int[]{7, 2, 5, 10, 8};
            int k = 2;
            return new Solution().splitArray(nums, k);
        });
        tester.check("nums = [1,2,3,4,5], k = 2", "9", () -> {
            int[] nums = new int[]{1, 2, 3, 4, 5};
            int k = 2;
            return new Solution().splitArray(nums, k);
        });

        tester.done();
    }
}
