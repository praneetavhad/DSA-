package Neetcode250.DynamicProgramming2D;

import Neetcode250.common.*;
import java.util.*;

/*
 * 309. Best Time to Buy and Sell Stock with Cooldown   [Medium]
 * LeetCode: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
 * NeetCode: https://neetcode.io/problems/buy-and-sell-crypto-with-cooldown
 *
 * You are given an array prices where prices[i] is the price of a given stock on the i^th day.
 *
 * Find the maximum profit you can achieve. You may complete as many transactions as you like (i.e.,
 * buy one and sell one share of the stock multiple times) with the following restrictions:
 *   - After you sell your stock, you cannot buy stock on the next day (i.e., cooldown one day).
 *
 * Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock
 * before you buy again).
 *
 * Example 1:
 * Input: prices = [1,2,3,0,2]
 * Output: 3
 * Explanation: transactions = [buy, sell, cooldown, buy, sell]
 *
 * Example 2:
 * Input: prices = [1]
 * Output: 0
 *
 * Constraints:
 *   - 1 <= prices.length <= 5000
 *   - 0 <= prices[i] <= 1000
 */
public class Q06_BestTimeToBuyAndSellStockWithCooldown {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int maxProfit(int[] prices) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("309. Best Time to Buy and Sell Stock with Cooldown");

        tester.check("prices = [1,2,3,0,2]", "3", () -> {
            int[] prices = new int[]{1, 2, 3, 0, 2};
            return new Solution().maxProfit(prices);
        });
        tester.check("prices = [1]", "0", () -> {
            int[] prices = new int[]{1};
            return new Solution().maxProfit(prices);
        });

        tester.done();
    }
}
