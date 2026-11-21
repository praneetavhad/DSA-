package Neetcode250.BitManipulation;

import Neetcode250.common.*;
import java.util.*;

/*
 * 136. Single Number   [Easy]
 * LeetCode: https://leetcode.com/problems/single-number/
 * NeetCode: https://neetcode.io/problems/single-number
 *
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that
 * single one.
 *
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 *
 * Example 1:
 * Input: nums = [2,2,1]
 * Output: 1
 *
 * Example 2:
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 *
 * Example 3:
 * Input: nums = [1]
 * Output: 1
 *
 * Constraints:
 *   - 1 <= nums.length <= 3 * 10^4
 *   - -3 * 10^4 <= nums[i] <= 3 * 10^4
 *   - Each element in the array appears twice except for one element which appears only once.
 */
public class Q01_SingleNumber {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int singleNumber(int[] nums) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("136. Single Number");

        tester.check("nums = [2,2,1]", "1", () -> {
            int[] nums = new int[]{2, 2, 1};
            return new Solution().singleNumber(nums);
        });
        tester.check("nums = [4,1,2,1,2]", "4", () -> {
            int[] nums = new int[]{4, 1, 2, 1, 2};
            return new Solution().singleNumber(nums);
        });
        tester.check("nums = [1]", "1", () -> {
            int[] nums = new int[]{1};
            return new Solution().singleNumber(nums);
        });

        tester.done();
    }
}
