package Neetcode250.ArraysAndHashing;

import Neetcode250.common.*;
import java.util.*;

/*
 * 75. Sort Colors   [Medium]
 * LeetCode: https://leetcode.com/problems/sort-colors/
 * NeetCode: https://neetcode.io/problems/sort-colors
 *
 * You are given an array nums with n objects colored red, white, or blue, sort them in-place so that
 * objects of the same color are adjacent, with the colors in the order red, white, and blue.
 *
 * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
 *
 * You must solve this problem without using the library's sort function.
 *
 * Example 1:
 * Input: nums = [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 * Explanation:
 * The array has two 0s, two 1s, and two 2s. Sorting them in-place places all 0s first, then all 1s,
 * then all 2s.
 *
 * Example 2:
 * Input: nums = [2,0,1]
 * Output: [0,1,2]
 * Explanation:
 * The array has one each of 0, 1, and 2, arranged in-place in the order 0, 1, 2.
 *
 * Constraints:
 *   - n == nums.length
 *   - 1 <= n <= 300
 *   - nums[i] is either 0, 1, or 2.
 *
 * Follow up: Could you come up with a one-pass algorithm using only constant extra space?
 */
public class Q12_SortColors {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public void sortColors(int[] nums) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("75. Sort Colors");

        tester.check("nums = [2,0,2,1,1,0]", "[0,0,1,1,2,2]", () -> {
            int[] nums = new int[]{2, 0, 2, 1, 1, 0};
            new Solution().sortColors(nums);
            return nums;
        });
        tester.check("nums = [2,0,1]", "[0,1,2]", () -> {
            int[] nums = new int[]{2, 0, 1};
            new Solution().sortColors(nums);
            return nums;
        });

        tester.done();
    }
}
