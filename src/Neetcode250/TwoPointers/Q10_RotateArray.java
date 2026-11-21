package Neetcode250.TwoPointers;

import Neetcode250.common.*;
import java.util.*;

/*
 * 189. Rotate Array   [Medium]
 * LeetCode: https://leetcode.com/problems/rotate-array/
 * NeetCode: https://neetcode.io/problems/rotate-array
 *
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 *
 * Example 1:
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 *
 * Example 2:
 * Input: nums = [-1,-100,3,99], k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 *
 * Constraints:
 *   - 1 <= nums.length <= 10^5
 *   - -2^31 <= nums[i] <= 2^31 - 1
 *   - 0 <= k <= 10^5
 *
 * Follow up:
 *   - Try to come up with as many solutions as you can. There are at least three different ways to
 *     solve this problem.
 *   - Could you do it in-place with O(1) extra space?
 */
public class Q10_RotateArray {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public void rotate(int[] nums, int k) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("189. Rotate Array");

        tester.check("nums = [1,2,3,4,5,6,7], k = 3", "[5,6,7,1,2,3,4]", () -> {
            int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
            int k = 3;
            new Solution().rotate(nums, k);
            return nums;
        });
        tester.check("nums = [-1,-100,3,99], k = 2", "[3,99,-1,-100]", () -> {
            int[] nums = new int[]{-1, -100, 3, 99};
            int k = 2;
            new Solution().rotate(nums, k);
            return nums;
        });

        tester.done();
    }
}
