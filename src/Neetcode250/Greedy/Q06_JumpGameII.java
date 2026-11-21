package Neetcode250.Greedy;

import Neetcode250.common.*;
import java.util.*;

/*
 * 45. Jump Game II   [Medium]
 * LeetCode: https://leetcode.com/problems/jump-game-ii/
 * NeetCode: https://neetcode.io/problems/jump-game-ii
 *
 * You are given a 0-indexed array of integers nums of length n. You are initially positioned at index
 * 0.
 *
 * Each element nums[i] represents the maximum length of a forward jump from index i. In other words,
 * if you are at index i, you can jump to any index (i + j) where:
 *   - 0 <= j <= nums[i] and
 *   - i + j < n
 *
 * Return the minimum number of jumps to reach index n - 1. The test cases are generated such that you
 * can reach index n - 1.
 *
 * Example 1:
 * Input: nums = [2,3,1,1,4]
 * Output: 2
 * Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to
 * 1, then 3 steps to the last index.
 *
 * Example 2:
 * Input: nums = [2,3,0,1,4]
 * Output: 2
 *
 * Constraints:
 *   - 1 <= nums.length <= 10^4
 *   - 0 <= nums[i] <= 1000
 *   - It's guaranteed that you can reach nums[n - 1].
 */
public class Q06_JumpGameII {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int jump(int[] nums) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("45. Jump Game II");

        tester.check("nums = [2,3,1,1,4]", "2", () -> {
            int[] nums = new int[]{2, 3, 1, 1, 4};
            return new Solution().jump(nums);
        });
        tester.check("nums = [2,3,0,1,4]", "2", () -> {
            int[] nums = new int[]{2, 3, 0, 1, 4};
            return new Solution().jump(nums);
        });

        tester.done();
    }
}
