package Neetcode250.Stack;

import Neetcode250.common.*;
import java.util.*;

/*
 * 739. Daily Temperatures   [Medium]
 * LeetCode: https://leetcode.com/problems/daily-temperatures/
 * NeetCode: https://neetcode.io/problems/daily-temperatures
 *
 * Given an array of integers temperatures represents the daily temperatures, return an array answer
 * such that answer[i] is the number of days you have to wait after the i^th day to get a warmer
 * temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.
 *
 * Example 1:
 * Input: temperatures = [73,74,75,71,69,72,76,73]
 * Output: [1,1,4,2,1,1,0,0]
 *
 * Example 2:
 * Input: temperatures = [30,40,50,60]
 * Output: [1,1,1,0]
 *
 * Example 3:
 * Input: temperatures = [30,60,90]
 * Output: [1,1,0]
 *
 * Constraints:
 *   - 1 <= temperatures.length <= 10^5
 *   - 30 <= temperatures[i] <= 100
 */
public class Q08_DailyTemperatures {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int[] dailyTemperatures(int[] temperatures) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("739. Daily Temperatures");

        tester.check("temperatures = [73,74,75,71,69,72,76,73]", "[1,1,4,2,1,1,0,0]", () -> {
            int[] temperatures = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
            return new Solution().dailyTemperatures(temperatures);
        });
        tester.check("temperatures = [30,40,50,60]", "[1,1,1,0]", () -> {
            int[] temperatures = new int[]{30, 40, 50, 60};
            return new Solution().dailyTemperatures(temperatures);
        });
        tester.check("temperatures = [30,60,90]", "[1,1,0]", () -> {
            int[] temperatures = new int[]{30, 60, 90};
            return new Solution().dailyTemperatures(temperatures);
        });

        tester.done();
    }
}
