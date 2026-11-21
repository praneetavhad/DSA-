package Neetcode250.Greedy;

import Neetcode250.common.*;
import java.util.*;

/*
 * 53. Maximum Subarray   [Medium]
 * LeetCode: https://leetcode.com/problems/maximum-subarray/
 * NeetCode: https://neetcode.io/problems/maximum-subarray
 *
 * Given an integer array nums, find the subarray with the largest sum, and return its sum.
 *
 * Example 1:
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: The subarray [4,-1,2,1] has the largest sum 6.
 *
 * Example 2:
 * Input: nums = [1]
 * Output: 1
 * Explanation: The subarray [1] has the largest sum 1.
 *
 * Example 3:
 * Input: nums = [5,4,-1,7,8]
 * Output: 23
 * Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 *
 * Constraints:
 *   - 1 <= nums.length <= 10^5
 *   - -10^4 <= nums[i] <= 10^4
 *
 * Follow up: If you have figured out the O(n) solution, try coding another solution using the divide
 * and conquer approach, which is more subtle.
 */
public class Q02_MaximumSubarray {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int maxSubArray(int[] nums) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("53. Maximum Subarray");

        tester.check("nums = [-2,1,-3,4,-1,2,1,-5,4]", "6", () -> {
            int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
            return new Solution().maxSubArray(nums);
        });
        tester.check("nums = [1]", "1", () -> {
            int[] nums = new int[]{1};
            return new Solution().maxSubArray(nums);
        });
        tester.check("nums = [5,4,-1,7,8]", "23", () -> {
            int[] nums = new int[]{5, 4, -1, 7, 8};
            return new Solution().maxSubArray(nums);
        });

        tester.done();
    }
}
