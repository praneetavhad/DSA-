package Neetcode250.Greedy;

import Neetcode250.common.*;
import java.util.*;

/*
 * 55. Jump Game   [Medium]
 * LeetCode: https://leetcode.com/problems/jump-game/
 * NeetCode: https://neetcode.io/problems/jump-game
 *
 * You are given an integer array nums. You are initially positioned at the array's first index, and
 * each element in the array represents your maximum jump length at that position.
 *
 * Return true if you can reach the last index, or false otherwise.
 *
 * Example 1:
 * Input: nums = [2,3,1,1,4]
 * Output: true
 * Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 *
 * Example 2:
 * Input: nums = [3,2,1,0,4]
 * Output: false
 * Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which
 * makes it impossible to reach the last index.
 *
 * Constraints:
 *   - 1 <= nums.length <= 10^4
 *   - 0 <= nums[i] <= 10^5
 */
public class Q05_JumpGame {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public boolean canJump(int[] nums) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("55. Jump Game");

        tester.check("nums = [2,3,1,1,4]", "true", () -> {
            int[] nums = new int[]{2, 3, 1, 1, 4};
            return new Solution().canJump(nums);
        });
        tester.check("nums = [3,2,1,0,4]", "false", () -> {
            int[] nums = new int[]{3, 2, 1, 0, 4};
            return new Solution().canJump(nums);
        });

        tester.done();
    }
}
