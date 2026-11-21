package Neetcode250.BinarySearch;

import Neetcode250.common.*;
import java.util.*;

/*
 * 704. Binary Search   [Easy]
 * LeetCode: https://leetcode.com/problems/binary-search/
 * NeetCode: https://neetcode.io/problems/binary-search
 *
 * Given an array of integers nums which is sorted in ascending order, and an integer target, write a
 * function to search target in nums. If target exists, then return its index. Otherwise, return -1.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Example 1:
 * Input: nums = [-1,0,3,5,9,12], target = 9
 * Output: 4
 * Explanation: 9 exists in nums and its index is 4
 *
 * Example 2:
 * Input: nums = [-1,0,3,5,9,12], target = 2
 * Output: -1
 * Explanation: 2 does not exist in nums so return -1
 *
 * Constraints:
 *   - 1 <= nums.length <= 10^4
 *   - -10^4 < nums[i], target < 10^4
 *   - All the integers in nums are unique.
 *   - nums is sorted in ascending order.
 */
public class Q01_BinarySearch {

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
        Tester tester = new Tester("704. Binary Search");

        tester.check("nums = [-1,0,3,5,9,12], target = 9", "4", () -> {
            int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
            int target = 9;
            return new Solution().search(nums, target);
        });
        tester.check("nums = [-1,0,3,5,9,12], target = 2", "-1", () -> {
            int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
            int target = 2;
            return new Solution().search(nums, target);
        });

        tester.done();
    }
}
