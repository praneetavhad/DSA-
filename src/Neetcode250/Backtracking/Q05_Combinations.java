package Neetcode250.Backtracking;

import Neetcode250.common.*;
import java.util.*;

/*
 * 77. Combinations   [Medium]
 * LeetCode: https://leetcode.com/problems/combinations/
 * NeetCode: https://neetcode.io/problems/combinations
 *
 * Given two integers n and k, return all possible combinations of k numbers chosen from the range [1,
 * n].
 *
 * You may return the answer in any order.
 *
 * Example 1:
 * Input: n = 4, k = 2
 * Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
 * Explanation: There are 4 choose 2 = 6 total combinations.
 * Note that combinations are unordered, i.e., [1,2] and [2,1] are considered to be the same
 * combination.
 *
 * Example 2:
 * Input: n = 1, k = 1
 * Output: [[1]]
 * Explanation: There is 1 choose 1 = 1 total combination.
 *
 * Constraints:
 *   - 1 <= n <= 20
 *   - 1 <= k <= n
 */
public class Q05_Combinations {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public List<List<Integer>> combine(int n, int k) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("77. Combinations");
        // Answers are compared ignoring order at every level (problem allows any order).

        tester.check("n = 4, k = 2", "[[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]", Tester.Order.ANY_DEEP, () -> {
            int n = 4;
            int k = 2;
            return new Solution().combine(n, k);
        });
        tester.check("n = 1, k = 1", "[[1]]", Tester.Order.ANY_DEEP, () -> {
            int n = 1;
            int k = 1;
            return new Solution().combine(n, k);
        });

        tester.done();
    }
}
