package Neetcode250.Backtracking;

import Neetcode250.common.*;
import java.util.*;

/*
 * 46. Permutations   [Medium]
 * LeetCode: https://leetcode.com/problems/permutations/
 * NeetCode: https://neetcode.io/problems/permutations
 *
 * Given an array nums of distinct integers, return all the possible permutations. You can return the
 * answer in any order.
 *
 * Example 1:
 * Input: nums = [1,2,3]
 * Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 *
 * Example 2:
 * Input: nums = [0,1]
 * Output: [[0,1],[1,0]]
 *
 * Example 3:
 * Input: nums = [1]
 * Output: [[1]]
 *
 * Constraints:
 *   - 1 <= nums.length <= 6
 *   - -10 <= nums[i] <= 10
 *   - All the integers of nums are unique.
 */
public class Q06_Permutations {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public List<List<Integer>> permute(int[] nums) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("46. Permutations");
        // Answers are compared ignoring the order of the outer list (problem allows any order).

        tester.check("nums = [1,2,3]", "[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]", Tester.Order.ANY, () -> {
            int[] nums = new int[]{1, 2, 3};
            return new Solution().permute(nums);
        });
        tester.check("nums = [0,1]", "[[0,1],[1,0]]", Tester.Order.ANY, () -> {
            int[] nums = new int[]{0, 1};
            return new Solution().permute(nums);
        });
        tester.check("nums = [1]", "[[1]]", Tester.Order.ANY, () -> {
            int[] nums = new int[]{1};
            return new Solution().permute(nums);
        });

        tester.done();
    }
}
