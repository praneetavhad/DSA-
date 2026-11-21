package Neetcode250.Backtracking;

import Neetcode250.common.*;
import java.util.*;

/*
 * 40. Combination Sum II   [Medium]
 * LeetCode: https://leetcode.com/problems/combination-sum-ii/
 * NeetCode: https://neetcode.io/problems/combination-target-sum-ii
 *
 * Given a collection of candidate numbers (candidates) and a target number (target), find all unique
 * combinations in candidates where the candidate numbers sum to target.
 *
 * Each number in candidates may only be used once in the combination.
 *
 * Note: The solution set must not contain duplicate combinations.
 *
 * Example 1:
 * Input: candidates = [10,1,2,7,6,1,5], target = 8
 * Output:
 * [
 * [1,1,6],
 * [1,2,5],
 * [1,7],
 * [2,6]
 * ]
 *
 * Example 2:
 * Input: candidates = [2,5,2,1,2], target = 5
 * Output:
 * [
 * [1,2,2],
 * [5]
 * ]
 *
 * Constraints:
 *   - 1 <= candidates.length <= 100
 *   - 1 <= candidates[i] <= 50
 *   - 1 <= target <= 30
 */
public class Q04_CombinationSumII {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("40. Combination Sum II");
        // Answers are compared ignoring order at every level (problem allows any order).

        tester.check("candidates = [10,1,2,7,6,1,5], target = 8", "[[1,1,6],[1,2,5],[1,7],[2,6]]", Tester.Order.ANY_DEEP, () -> {
            int[] candidates = new int[]{10, 1, 2, 7, 6, 1, 5};
            int target = 8;
            return new Solution().combinationSum2(candidates, target);
        });
        tester.check("candidates = [2,5,2,1,2], target = 5", "[[1,2,2],[5]]", Tester.Order.ANY_DEEP, () -> {
            int[] candidates = new int[]{2, 5, 2, 1, 2};
            int target = 5;
            return new Solution().combinationSum2(candidates, target);
        });

        tester.done();
    }
}
