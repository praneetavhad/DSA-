package Neetcode250.DynamicProgramming2D;

import Neetcode250.common.*;
import java.util.*;

/*
 * 1049. Last Stone Weight II   [Medium]
 * LeetCode: https://leetcode.com/problems/last-stone-weight-ii/
 * NeetCode: https://neetcode.io/problems/last-stone-weight-ii
 *
 * You are given an array of integers stones where stones[i] is the weight of the i^th stone.
 *
 * We are playing a game with the stones. On each turn, we choose any two stones and smash them
 * together. Suppose the stones have weights x and y with x <= y. The result of this smash is:
 *   - If x == y, both stones are destroyed, and
 *   - If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
 *
 * At the end of the game, there is at most one stone left.
 *
 * Return the smallest possible weight of the left stone. If there are no stones left, return 0.
 *
 * Example 1:
 * Input: stones = [2,7,4,1,8,1]
 * Output: 1
 * Explanation:
 * We can combine 2 and 4 to get 2, so the array converts to [2,7,1,8,1] then,
 * we can combine 7 and 8 to get 1, so the array converts to [2,1,1,1] then,
 * we can combine 2 and 1 to get 1, so the array converts to [1,1,1] then,
 * we can combine 1 and 1 to get 0, so the array converts to [1], then that's the optimal value.
 *
 * Example 2:
 * Input: stones = [31,26,33,21,40]
 * Output: 5
 *
 * Constraints:
 *   - 1 <= stones.length <= 30
 *   - 1 <= stones[i] <= 100
 */
public class Q05_LastStoneWeightII {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int lastStoneWeightII(int[] stones) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("1049. Last Stone Weight II");

        tester.check("stones = [2,7,4,1,8,1]", "1", () -> {
            int[] stones = new int[]{2, 7, 4, 1, 8, 1};
            return new Solution().lastStoneWeightII(stones);
        });
        tester.check("stones = [31,26,33,21,40]", "5", () -> {
            int[] stones = new int[]{31, 26, 33, 21, 40};
            return new Solution().lastStoneWeightII(stones);
        });

        tester.done();
    }
}
