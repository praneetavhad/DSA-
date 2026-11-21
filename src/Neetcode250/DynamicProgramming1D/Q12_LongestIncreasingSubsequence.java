package Neetcode250.DynamicProgramming1D;

import Neetcode250.common.*;
import java.util.*;

/*
 * 300. Longest Increasing Subsequence   [Medium]
 * LeetCode: https://leetcode.com/problems/longest-increasing-subsequence/
 * NeetCode: https://neetcode.io/problems/longest-increasing-subsequence
 *
 * Given an integer array nums, return the length of the longest strictly increasing subsequence.
 *
 * Example 1:
 * Input: nums = [10,9,2,5,3,7,101,18]
 * Output: 4
 * Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
 *
 * Example 2:
 * Input: nums = [0,1,0,3,2,3]
 * Output: 4
 *
 * Example 3:
 * Input: nums = [7,7,7,7,7,7,7]
 * Output: 1
 *
 * Constraints:
 *   - 1 <= nums.length <= 2500
 *   - -10^4 <= nums[i] <= 10^4
 *
 * Follow up: Can you come up with an algorithm that runs in O(n log(n)) time complexity?
 */
public class Q12_LongestIncreasingSubsequence {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int lengthOfLIS(int[] nums) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("300. Longest Increasing Subsequence");

        tester.check("nums = [10,9,2,5,3,7,101,18]", "4", () -> {
            int[] nums = new int[]{10, 9, 2, 5, 3, 7, 101, 18};
            return new Solution().lengthOfLIS(nums);
        });
        tester.check("nums = [0,1,0,3,2,3]", "4", () -> {
            int[] nums = new int[]{0, 1, 0, 3, 2, 3};
            return new Solution().lengthOfLIS(nums);
        });
        tester.check("nums = [7,7,7,7,7,7,7]", "1", () -> {
            int[] nums = new int[]{7, 7, 7, 7, 7, 7, 7};
            return new Solution().lengthOfLIS(nums);
        });

        tester.done();
    }
}
