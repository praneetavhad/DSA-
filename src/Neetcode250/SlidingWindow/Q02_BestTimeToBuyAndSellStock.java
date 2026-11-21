package Neetcode250.SlidingWindow;

import Neetcode250.common.*;
import java.util.*;

/*
 * 121. Best Time to Buy and Sell Stock   [Easy]
 * LeetCode: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * NeetCode: https://neetcode.io/problems/buy-and-sell-crypto
 *
 * You are given an array prices where prices[i] is the price of a given stock on the i^th day.
 *
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different
 * day in the future to sell that stock.
 *
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit,
 * return 0.
 *
 * Example 1:
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 *
 * Example 2:
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 *
 * Constraints:
 *   - 1 <= prices.length <= 10^5
 *   - 0 <= prices[i] <= 10^4
 */
public class Q02_BestTimeToBuyAndSellStock {

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
        Tester tester = new Tester("121. Best Time to Buy and Sell Stock");

        tester.check("prices = [7,1,5,3,6,4]", "5", () -> {
            int[] prices = new int[]{7, 1, 5, 3, 6, 4};
            return new Solution().maxProfit(prices);
        });
        tester.check("prices = [7,6,4,3,1]", "0", () -> {
            int[] prices = new int[]{7, 6, 4, 3, 1};
            return new Solution().maxProfit(prices);
        });

        tester.done();
    }
}
