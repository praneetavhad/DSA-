package Neetcode250.BinarySearch;

import Neetcode250.common.*;
import java.util.*;

/*
 * 35. Search Insert Position   [Easy]
 * LeetCode: https://leetcode.com/problems/search-insert-position/
 * NeetCode: https://neetcode.io/problems/search-insert-position
 *
 * Given a sorted array of distinct integers and a target value, return the index if the target is
 * found. If not, return the index where it would be if it were inserted in order.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Example 1:
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 *
 * Example 2:
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 *
 * Example 3:
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 *
 * Constraints:
 *   - 1 <= nums.length <= 10^4
 *   - -10^4 <= nums[i] <= 10^4
 *   - nums contains distinct values sorted in ascending order.
 *   - -10^4 <= target <= 10^4
 */
public class Q02_SearchInsertPosition {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int searchInsert(int[] nums, int target) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("35. Search Insert Position");

        tester.check("nums = [1,3,5,6], target = 5", "2", () -> {
            int[] nums = new int[]{1, 3, 5, 6};
            int target = 5;
            return new Solution().searchInsert(nums, target);
        });
        tester.check("nums = [1,3,5,6], target = 2", "1", () -> {
            int[] nums = new int[]{1, 3, 5, 6};
            int target = 2;
            return new Solution().searchInsert(nums, target);
        });
        tester.check("nums = [1,3,5,6], target = 7", "4", () -> {
            int[] nums = new int[]{1, 3, 5, 6};
            int target = 7;
            return new Solution().searchInsert(nums, target);
        });

        tester.done();
    }
}
