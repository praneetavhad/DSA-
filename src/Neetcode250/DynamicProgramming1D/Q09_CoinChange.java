package Neetcode250.DynamicProgramming1D;

import Neetcode250.common.*;
import java.util.*;

/*
 * 322. Coin Change   [Medium]
 * LeetCode: https://leetcode.com/problems/coin-change/
 * NeetCode: https://neetcode.io/problems/coin-change
 *
 * You are given an integer array coins representing coins of different denominations and an integer
 * amount representing a total amount of money.
 *
 * Return the fewest number of coins that you need to make up that amount. If that amount of money
 * cannot be made up by any combination of the coins, return -1.
 *
 * You may assume that you have an infinite number of each kind of coin.
 *
 * Example 1:
 * Input: coins = [1,2,5], amount = 11
 * Output: 3
 * Explanation: 11 = 5 + 5 + 1
 *
 * Example 2:
 * Input: coins = [2], amount = 3
 * Output: -1
 *
 * Example 3:
 * Input: coins = [1], amount = 0
 * Output: 0
 *
 * Constraints:
 *   - 1 <= coins.length <= 12
 *   - 1 <= coins[i] <= 2^31 - 1
 *   - 0 <= amount <= 10^4
 */
public class Q09_CoinChange {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int coinChange(int[] coins, int amount) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("322. Coin Change");

        tester.check("coins = [1,2,5], amount = 11", "3", () -> {
            int[] coins = new int[]{1, 2, 5};
            int amount = 11;
            return new Solution().coinChange(coins, amount);
        });
        tester.check("coins = [2], amount = 3", "-1", () -> {
            int[] coins = new int[]{2};
            int amount = 3;
            return new Solution().coinChange(coins, amount);
        });
        tester.check("coins = [1], amount = 0", "0", () -> {
            int[] coins = new int[]{1};
            int amount = 0;
            return new Solution().coinChange(coins, amount);
        });

        tester.done();
    }
}
