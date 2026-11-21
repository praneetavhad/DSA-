package Neetcode250.LinkedList;

import Neetcode250.common.*;
import java.util.*;

/*
 * 287. Find the Duplicate Number   [Medium]
 * LeetCode: https://leetcode.com/problems/find-the-duplicate-number/
 * NeetCode: https://neetcode.io/problems/find-duplicate-integer
 *
 * Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n]
 * inclusive.
 *
 * There is only one repeated number in nums, return this repeated number.
 *
 * You must solve the problem without modifying the array nums and using only constant extra space.
 *
 * Example 1:
 * Input: nums = [1,3,4,2,2]
 * Output: 2
 *
 * Example 2:
 * Input: nums = [3,1,3,4,2]
 * Output: 3
 *
 * Example 3:
 * Input: nums = [3,3,3,3,3]
 * Output: 3
 *
 * Constraints:
 *   - 1 <= n <= 10^5
 *   - nums.length == n + 1
 *   - 1 <= nums[i] <= n
 *   - All the integers in nums appear only once except for precisely one integer which appears two or
 *     more times.
 *
 * Follow up:
 *   - How can we prove that at least one duplicate number must exist in nums?
 *   - Can you solve the problem in linear runtime complexity?
 */
public class Q08_FindTheDuplicateNumber {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int findDuplicate(int[] nums) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("287. Find the Duplicate Number");

        tester.check("nums = [1,3,4,2,2]", "2", () -> {
            int[] nums = new int[]{1, 3, 4, 2, 2};
            return new Solution().findDuplicate(nums);
        });
        tester.check("nums = [3,1,3,4,2]", "3", () -> {
            int[] nums = new int[]{3, 1, 3, 4, 2};
            return new Solution().findDuplicate(nums);
        });
        tester.check("nums = [3,3,3,3,3]", "3", () -> {
            int[] nums = new int[]{3, 3, 3, 3, 3};
            return new Solution().findDuplicate(nums);
        });

        tester.done();
    }
}
