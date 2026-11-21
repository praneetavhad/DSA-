package Neetcode250.Backtracking;

import Neetcode250.common.*;
import java.util.*;

/*
 * 47. Permutations II   [Medium]
 * LeetCode: https://leetcode.com/problems/permutations-ii/
 * NeetCode: https://neetcode.io/problems/permutations-ii
 *
 * Given a collection of numbers, nums, that might contain duplicates, return all possible unique
 * permutations in any order.
 *
 * Example 1:
 * Input: nums = [1,1,2]
 * Output:
 * [[1,1,2],
 *  [1,2,1],
 *  [2,1,1]]
 *
 * Example 2:
 * Input: nums = [1,2,3]
 * Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 *
 * Constraints:
 *   - 1 <= nums.length <= 8
 *   - -10 <= nums[i] <= 10
 */
public class Q08_PermutationsII {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public List<List<Integer>> permuteUnique(int[] nums) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("47. Permutations II");
        // Answers are compared ignoring the order of the outer list (problem allows any order).

        tester.check("nums = [1,1,2]", "[[1,1,2],[1,2,1],[2,1,1]]", Tester.Order.ANY, () -> {
            int[] nums = new int[]{1, 1, 2};
            return new Solution().permuteUnique(nums);
        });
        tester.check("nums = [1,2,3]", "[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]", Tester.Order.ANY, () -> {
            int[] nums = new int[]{1, 2, 3};
            return new Solution().permuteUnique(nums);
        });

        tester.done();
    }
}
