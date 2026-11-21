package Neetcode250.ArraysAndHashing;

import Neetcode250.common.*;
import java.util.*;

/*
 * 238. Product of Array Except Self   [Medium]
 * LeetCode: https://leetcode.com/problems/product-of-array-except-self/
 * NeetCode: https://neetcode.io/problems/products-of-array-discluding-self
 *
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of
 * all the elements of nums except nums[i].
 *
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 *
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 *
 * Example 1:
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 *
 * Example 2:
 * Input: nums = [-1,1,0,-3,3]
 * Output: [0,0,9,0,0]
 *
 * Constraints:
 *   - 2 <= nums.length <= 10^5
 *   - -30 <= nums[i] <= 30
 *   - The input is generated such that answer[i] is guaranteed to fit in a 32-bit integer.
 *
 * Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not
 * count as extra space for space complexity analysis.)
 */
public class Q16_ProductOfArrayExceptSelf {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int[] productExceptSelf(int[] nums) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("238. Product of Array Except Self");

        tester.check("nums = [1,2,3,4]", "[24,12,8,6]", () -> {
            int[] nums = new int[]{1, 2, 3, 4};
            return new Solution().productExceptSelf(nums);
        });
        tester.check("nums = [-1,1,0,-3,3]", "[0,0,9,0,0]", () -> {
            int[] nums = new int[]{-1, 1, 0, -3, 3};
            return new Solution().productExceptSelf(nums);
        });

        tester.done();
    }
}
