package Neetcode250.HeapPriorityQueue;

import Neetcode250.common.*;
import java.util.*;

/*
 * 502. IPO   [Hard]
 * LeetCode: https://leetcode.com/problems/ipo/
 * NeetCode: https://neetcode.io/problems/ipo
 *
 * Suppose LeetCode will start its IPO soon. In order to sell a good price of its shares to Venture
 * Capital, LeetCode would like to work on some projects to increase its capital before the IPO. Since
 * it has limited resources, it can only finish at most k distinct projects before the IPO. Help
 * LeetCode design the best way to maximize its total capital after finishing at most k distinct
 * projects.
 *
 * You are given n projects where the i^th project has a pure profit profits[i] and a minimum capital
 * of capital[i] is needed to start it.
 *
 * Initially, you have w capital. When you finish a project, you will obtain its pure profit and the
 * profit will be added to your total capital.
 *
 * Pick a list of at most k distinct projects from given projects to maximize your final capital, and
 * return the final maximized capital.
 *
 * The answer is guaranteed to fit in a 32-bit signed integer.
 *
 * Example 1:
 * Input: k = 2, w = 0, profits = [1,2,3], capital = [0,1,1]
 * Output: 4
 * Explanation: Since your initial capital is 0, you can only start the project indexed 0.
 * After finishing it you will obtain profit 1 and your capital becomes 1.
 * With capital 1, you can either start the project indexed 1 or the project indexed 2.
 * Since you can choose at most 2 projects, you need to finish the project indexed 2 to get the maximum
 * capital.
 * Therefore, output the final maximized capital, which is 0 + 1 + 3 = 4.
 *
 * Example 2:
 * Input: k = 3, w = 0, profits = [1,2,3], capital = [0,1,2]
 * Output: 6
 *
 * Constraints:
 *   - 1 <= k <= 10^5
 *   - 0 <= w <= 10^9
 *   - n == profits.length
 *   - n == capital.length
 *   - 1 <= n <= 10^5
 *   - 0 <= profits[i] <= 10^4
 *   - 0 <= capital[i] <= 10^9
 */
public class Q12_IPO {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("502. IPO");

        tester.check("k = 2, w = 0, profits = [1,2,3], capital = [0,1,1]", "4", () -> {
            int k = 2;
            int w = 0;
            int[] profits = new int[]{1, 2, 3};
            int[] capital = new int[]{0, 1, 1};
            return new Solution().findMaximizedCapital(k, w, profits, capital);
        });
        tester.check("k = 3, w = 0, profits = [1,2,3], capital = [0,1,2]", "6", () -> {
            int k = 3;
            int w = 0;
            int[] profits = new int[]{1, 2, 3};
            int[] capital = new int[]{0, 1, 2};
            return new Solution().findMaximizedCapital(k, w, profits, capital);
        });

        tester.done();
    }
}
