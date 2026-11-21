package Neetcode250.SlidingWindow;

import Neetcode250.common.*;
import java.util.*;

/*
 * 219. Contains Duplicate II   [Easy]
 * LeetCode: https://leetcode.com/problems/contains-duplicate-ii/
 * NeetCode: https://neetcode.io/problems/contains-duplicate-ii
 *
 * Given an integer array nums and an integer k, return true if there are two distinct indices i and j
 * in the array such that nums[i] == nums[j] and abs(i - j) <= k.
 *
 * Example 1:
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 *
 * Example 2:
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 *
 * Example 3:
 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false
 *
 * Constraints:
 *   - 1 <= nums.length <= 10^5
 *   - -10^9 <= nums[i] <= 10^9
 *   - 0 <= k <= 10^5
 */
public class Q01_ContainsDuplicateII {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("219. Contains Duplicate II");

        tester.check("nums = [1,2,3,1], k = 3", "true", () -> {
            int[] nums = new int[]{1, 2, 3, 1};
            int k = 3;
            return new Solution().containsNearbyDuplicate(nums, k);
        });
        tester.check("nums = [1,0,1,1], k = 1", "true", () -> {
            int[] nums = new int[]{1, 0, 1, 1};
            int k = 1;
            return new Solution().containsNearbyDuplicate(nums, k);
        });
        tester.check("nums = [1,2,3,1,2,3], k = 2", "false", () -> {
            int[] nums = new int[]{1, 2, 3, 1, 2, 3};
            int k = 2;
            return new Solution().containsNearbyDuplicate(nums, k);
        });

        tester.done();
    }
}
