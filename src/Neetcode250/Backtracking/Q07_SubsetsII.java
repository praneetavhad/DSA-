package Neetcode250.Backtracking;

import Neetcode250.common.*;
import java.util.*;

/*
 * 90. Subsets II   [Medium]
 * LeetCode: https://leetcode.com/problems/subsets-ii/
 * NeetCode: https://neetcode.io/problems/subsets-ii
 *
 * Given an integer array nums that may contain duplicates, return all possible subsets (the power
 * set).
 *
 * The solution set must not contain duplicate subsets. Return the solution in any order.
 *
 * Example 1:
 * Input: nums = [1,2,2]
 * Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]
 *
 * Example 2:
 * Input: nums = [0]
 * Output: [[],[0]]
 *
 * Constraints:
 *   - 1 <= nums.length <= 10
 *   - -10 <= nums[i] <= 10
 */
public class Q07_SubsetsII {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public List<List<Integer>> subsetsWithDup(int[] nums) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("90. Subsets II");
        // Answers are compared ignoring order at every level (problem allows any order).

        tester.check("nums = [1,2,2]", "[[],[1],[1,2],[1,2,2],[2],[2,2]]", Tester.Order.ANY_DEEP, () -> {
            int[] nums = new int[]{1, 2, 2};
            return new Solution().subsetsWithDup(nums);
        });
        tester.check("nums = [0]", "[[],[0]]", Tester.Order.ANY_DEEP, () -> {
            int[] nums = new int[]{0};
            return new Solution().subsetsWithDup(nums);
        });

        tester.done();
    }
}
