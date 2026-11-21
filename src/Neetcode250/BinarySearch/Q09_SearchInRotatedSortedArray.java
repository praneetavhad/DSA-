package Neetcode250.BinarySearch;

import Neetcode250.common.*;
import java.util.*;

/*
 * 33. Search in Rotated Sorted Array   [Medium]
 * LeetCode: https://leetcode.com/problems/search-in-rotated-sorted-array/
 * NeetCode: https://neetcode.io/problems/find-target-in-rotated-sorted-array
 *
 * There is an integer array nums sorted in ascending order (with distinct values).
 *
 * Prior to being passed to your function, nums is possibly left rotated at an unknown index k (1 <= k
 * < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0],
 * nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be left rotated by 3
 * indices and become [4,5,6,7,0,1,2].
 *
 * Given the array nums after the possible rotation and an integer target, return the index of target
 * if it is in nums, or -1 if it is not in nums.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Example 1:
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 *
 * Example 2:
 * Input: nums = [4,5,6,7,0,1,2], target = 3
 * Output: -1
 *
 * Example 3:
 * Input: nums = [1], target = 0
 * Output: -1
 *
 * Constraints:
 *   - 1 <= nums.length <= 5000
 *   - -10^4 <= nums[i] <= 10^4
 *   - All values of nums are unique.
 *   - nums is an ascending array that is possibly rotated.
 *   - -10^4 <= target <= 10^4
 */
public class Q09_SearchInRotatedSortedArray {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int search(int[] nums, int target) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("33. Search in Rotated Sorted Array");

        tester.check("nums = [4,5,6,7,0,1,2], target = 0", "4", () -> {
            int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
            int target = 0;
            return new Solution().search(nums, target);
        });
        tester.check("nums = [4,5,6,7,0,1,2], target = 3", "-1", () -> {
            int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
            int target = 3;
            return new Solution().search(nums, target);
        });
        tester.check("nums = [1], target = 0", "-1", () -> {
            int[] nums = new int[]{1};
            int target = 0;
            return new Solution().search(nums, target);
        });

        tester.done();
    }
}
