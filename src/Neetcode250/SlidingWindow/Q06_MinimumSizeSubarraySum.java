package Neetcode250.SlidingWindow;

import Neetcode250.common.*;
import java.util.*;

/*
 * 209. Minimum Size Subarray Sum   [Medium]
 * LeetCode: https://leetcode.com/problems/minimum-size-subarray-sum/
 * NeetCode: https://neetcode.io/problems/minimum-size-subarray-sum
 *
 * Given an array of positive integers nums and a positive integer target, return the minimal length of
 * a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0
 * instead.
 *
 * Example 1:
 * Input: target = 7, nums = [2,3,1,2,4,3]
 * Output: 2
 * Explanation: The subarray [4,3] has the minimal length under the problem constraint.
 *
 * Example 2:
 * Input: target = 4, nums = [1,4,4]
 * Output: 1
 *
 * Example 3:
 * Input: target = 11, nums = [1,1,1,1,1,1,1,1]
 * Output: 0
 *
 * Constraints:
 *   - 1 <= target <= 10^9
 *   - 1 <= nums.length <= 10^5
 *   - 1 <= nums[i] <= 10^4
 *
 * Follow up: If you have figured out the O(n) solution, try coding another solution of which the time
 * complexity is O(n log(n)).
 */
public class Q06_MinimumSizeSubarraySum {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("209. Minimum Size Subarray Sum");

        tester.check("target = 7, nums = [2,3,1,2,4,3]", "2", () -> {
            int target = 7;
            int[] nums = new int[]{2, 3, 1, 2, 4, 3};
            return new Solution().minSubArrayLen(target, nums);
        });
        tester.check("target = 4, nums = [1,4,4]", "1", () -> {
            int target = 4;
            int[] nums = new int[]{1, 4, 4};
            return new Solution().minSubArrayLen(target, nums);
        });
        tester.check("target = 11, nums = [1,1,1,1,1,1,1,1]", "0", () -> {
            int target = 11;
            int[] nums = new int[]{1, 1, 1, 1, 1, 1, 1, 1};
            return new Solution().minSubArrayLen(target, nums);
        });

        tester.done();
    }
}
