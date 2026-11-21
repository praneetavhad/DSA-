package Neetcode250.BinarySearch;

import Neetcode250.common.*;
import java.util.*;

/*
 * 81. Search in Rotated Sorted Array II   [Medium]
 * LeetCode: https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
 * NeetCode: https://neetcode.io/problems/search-in-rotated-sorted-array-ii
 *
 * There is an integer array nums sorted in non-decreasing order (not necessarily with distinct
 * values).
 *
 * Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k <
 * nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1],
 * ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5
 * and become [4,5,6,6,7,0,1,2,4,4].
 *
 * Given the array nums after the rotation and an integer target, return true if target is in nums, or
 * false if it is not in nums.
 *
 * You must decrease the overall operation steps as much as possible.
 *
 * Example 1:
 * Input: nums = [2,5,6,0,0,1,2], target = 0
 * Output: true
 *
 * Example 2:
 * Input: nums = [2,5,6,0,0,1,2], target = 3
 * Output: false
 *
 * Constraints:
 *   - 1 <= nums.length <= 5000
 *   - -10^4 <= nums[i] <= 10^4
 *   - nums is guaranteed to be rotated at some pivot.
 *   - -10^4 <= target <= 10^4
 *
 * Follow up: This problem is similar to Search in Rotated Sorted Array, but nums may contain
 * duplicates. Would this affect the runtime complexity? How and why?
 */
public class Q10_SearchInRotatedSortedArrayII {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public boolean search(int[] nums, int target) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("81. Search in Rotated Sorted Array II");

        tester.check("nums = [2,5,6,0,0,1,2], target = 0", "true", () -> {
            int[] nums = new int[]{2, 5, 6, 0, 0, 1, 2};
            int target = 0;
            return new Solution().search(nums, target);
        });
        tester.check("nums = [2,5,6,0,0,1,2], target = 3", "false", () -> {
            int[] nums = new int[]{2, 5, 6, 0, 0, 1, 2};
            int target = 3;
            return new Solution().search(nums, target);
        });

        tester.done();
    }
}
