package Neetcode250.Backtracking;

import Neetcode250.common.*;
import java.util.*;

/*
 * 473. Matchsticks to Square   [Medium]
 * LeetCode: https://leetcode.com/problems/matchsticks-to-square/
 * NeetCode: https://neetcode.io/problems/matchsticks-to-square
 *
 * You are given an integer array matchsticks where matchsticks[i] is the length of the i^th
 * matchstick. You want to use all the matchsticks to make one square. You should not break any stick,
 * but you can link them up, and each matchstick must be used exactly one time.
 *
 * Return true if you can make this square and false otherwise.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2021/04/09/matchsticks1-grid.jpg]
 * Input: matchsticks = [1,1,2,2,2]
 * Output: true
 * Explanation: You can form a square with length 2, one side of the square came two sticks with length
 * 1.
 *
 * Example 2:
 * Input: matchsticks = [3,3,3,3,4]
 * Output: false
 * Explanation: You cannot find a way to form a square with all the matchsticks.
 *
 * Constraints:
 *   - 1 <= matchsticks.length <= 15
 *   - 1 <= matchsticks[i] <= 10^8
 */
public class Q13_MatchsticksToSquare {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public boolean makesquare(int[] matchsticks) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("473. Matchsticks to Square");

        tester.check("matchsticks = [1,1,2,2,2]", "true", () -> {
            int[] matchsticks = new int[]{1, 1, 2, 2, 2};
            return new Solution().makesquare(matchsticks);
        });
        tester.check("matchsticks = [3,3,3,3,4]", "false", () -> {
            int[] matchsticks = new int[]{3, 3, 3, 3, 4};
            return new Solution().makesquare(matchsticks);
        });

        tester.done();
    }
}
