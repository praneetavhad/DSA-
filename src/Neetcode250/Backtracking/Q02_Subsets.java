package Neetcode250.Backtracking;

import Neetcode250.common.*;
import java.util.*;

/*
 * 78. Subsets   [Medium]
 * LeetCode: https://leetcode.com/problems/subsets/
 * NeetCode: https://neetcode.io/problems/subsets
 *
 * Given an integer array nums of unique elements, return all possible subsets (the power set).
 *
 * The solution set must not contain duplicate subsets. Return the solution in any order.
 *
 * Example 1:
 * Input: nums = [1,2,3]
 * Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 *
 * Example 2:
 * Input: nums = [0]
 * Output: [[],[0]]
 *
 * Constraints:
 *   - 1 <= nums.length <= 10
 *   - -10 <= nums[i] <= 10
 *   - All the numbers of nums are unique.
 */
public class Q02_Subsets {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("78. Subsets");
        // Answers are compared ignoring order at every level (problem allows any order).

        tester.check("nums = [1,2,3]", "[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]", Tester.Order.ANY_DEEP, () -> {
            int[] nums = new int[]{1, 2, 3};
            return new Solution().subsets(nums);
        });
        tester.check("nums = [0]", "[[],[0]]", Tester.Order.ANY_DEEP, () -> {
            int[] nums = new int[]{0};
            return new Solution().subsets(nums);
        });

        tester.done();
    }
}
