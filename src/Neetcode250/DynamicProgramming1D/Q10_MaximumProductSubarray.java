package Neetcode250.DynamicProgramming1D;

import Neetcode250.common.*;
import java.util.*;

/*
 * 152. Maximum Product Subarray   [Medium]
 * LeetCode: https://leetcode.com/problems/maximum-product-subarray/
 * NeetCode: https://neetcode.io/problems/maximum-product-subarray
 *
 * Given an integer array nums, find a subarray that has the largest product, and return the product.
 *
 * The test cases are generated so that the answer will fit in a 32-bit integer.
 *
 * Note that the product of an array with a single element is the value of that element.
 *
 * Example 1:
 * Input: nums = [2,3,-2,4]
 * Output: 6
 * Explanation: [2,3] has the largest product 6.
 *
 * Example 2:
 * Input: nums = [-2,0,-1]
 * Output: 0
 * Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 *
 * Constraints:
 *   - 1 <= nums.length <= 2 * 10^4
 *   - -10 <= nums[i] <= 10
 *   - The product of any subarray of nums is guaranteed to fit in a 32-bit integer.
 */
public class Q10_MaximumProductSubarray {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int maxProduct(int[] nums) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("152. Maximum Product Subarray");

        tester.check("nums = [2,3,-2,4]", "6", () -> {
            int[] nums = new int[]{2, 3, -2, 4};
            return new Solution().maxProduct(nums);
        });
        tester.check("nums = [-2,0,-1]", "0", () -> {
            int[] nums = new int[]{-2, 0, -1};
            return new Solution().maxProduct(nums);
        });

        tester.done();
    }
}
