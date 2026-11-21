package Neetcode250.DynamicProgramming2D;

import Neetcode250.common.*;
import java.util.*;

/*
 * 518. Coin Change II   [Medium]
 * LeetCode: https://leetcode.com/problems/coin-change-ii/
 * NeetCode: https://neetcode.io/problems/coin-change-ii
 *
 * You are given an integer array coins representing coins of different denominations and an integer
 * amount representing a total amount of money.
 *
 * Return the number of combinations that make up that amount. If that amount of money cannot be made
 * up by any combination of the coins, return 0.
 *
 * You may assume that you have an infinite number of each kind of coin.
 *
 * The final answer is guaranteed to fit into a signed 32-bit integer.
 *
 * Example 1:
 * Input: amount = 5, coins = [1,2,5]
 * Output: 4
 * Explanation: there are four ways to make up the amount:
 * 5=5
 * 5=2+2+1
 * 5=2+1+1+1
 * 5=1+1+1+1+1
 *
 * Example 2:
 * Input: amount = 3, coins = [2]
 * Output: 0
 * Explanation: the amount of 3 cannot be made up just with coins of 2.
 *
 * Example 3:
 * Input: amount = 10, coins = [10]
 * Output: 1
 *
 * Constraints:
 *   - 1 <= coins.length <= 300
 *   - 1 <= coins[i] <= 5000
 *   - All the values of coins are unique.
 *   - 0 <= amount <= 5000
 */
public class Q07_CoinChangeII {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int change(int amount, int[] coins) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("518. Coin Change II");

        tester.check("amount = 5, coins = [1,2,5]", "4", () -> {
            int amount = 5;
            int[] coins = new int[]{1, 2, 5};
            return new Solution().change(amount, coins);
        });
        tester.check("amount = 3, coins = [2]", "0", () -> {
            int amount = 3;
            int[] coins = new int[]{2};
            return new Solution().change(amount, coins);
        });
        tester.check("amount = 10, coins = [10]", "1", () -> {
            int amount = 10;
            int[] coins = new int[]{10};
            return new Solution().change(amount, coins);
        });

        tester.done();
    }
}
