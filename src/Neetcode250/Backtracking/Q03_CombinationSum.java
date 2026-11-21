package Neetcode250.Backtracking;

import Neetcode250.common.*;
import java.util.*;

/*
 * 39. Combination Sum   [Medium]
 * LeetCode: https://leetcode.com/problems/combination-sum/
 * NeetCode: https://neetcode.io/problems/combination-target-sum
 *
 * Given an array of distinct integers candidates and a target integer target, return a list of all
 * unique combinations of candidates where the chosen numbers sum to target. You may return the
 * combinations in any order.
 *
 * The same number may be chosen from candidates an unlimited number of times. Two combinations are
 * unique if the frequency of at least one of the chosen numbers is different.
 *
 * The test cases are generated such that the number of unique combinations that sum up to target is
 * less than 150 combinations for the given input.
 *
 * Example 1:
 * Input: candidates = [2,3,6,7], target = 7
 * Output: [[2,2,3],[7]]
 * Explanation:
 * 2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
 * 7 is a candidate, and 7 = 7.
 * These are the only two combinations.
 *
 * Example 2:
 * Input: candidates = [2,3,5], target = 8
 * Output: [[2,2,2,2],[2,3,3],[3,5]]
 *
 * Example 3:
 * Input: candidates = [2], target = 1
 * Output: []
 *
 * Constraints:
 *   - 1 <= candidates.length <= 30
 *   - 2 <= candidates[i] <= 40
 *   - All elements of candidates are distinct.
 *   - 1 <= target <= 40
 */
public class Q03_CombinationSum {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("39. Combination Sum");
        // Answers are compared ignoring order at every level (problem allows any order).

        tester.check("candidates = [2,3,6,7], target = 7", "[[2,2,3],[7]]", Tester.Order.ANY_DEEP, () -> {
            int[] candidates = new int[]{2, 3, 6, 7};
            int target = 7;
            return new Solution().combinationSum(candidates, target);
        });
        tester.check("candidates = [2,3,5], target = 8", "[[2,2,2,2],[2,3,3],[3,5]]", Tester.Order.ANY_DEEP, () -> {
            int[] candidates = new int[]{2, 3, 5};
            int target = 8;
            return new Solution().combinationSum(candidates, target);
        });
        tester.check("candidates = [2], target = 1", "[]", Tester.Order.ANY_DEEP, () -> {
            int[] candidates = new int[]{2};
            int target = 1;
            return new Solution().combinationSum(candidates, target);
        });

        tester.done();
    }
}
