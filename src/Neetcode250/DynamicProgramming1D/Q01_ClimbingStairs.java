package Neetcode250.DynamicProgramming1D;

import Neetcode250.common.*;
import java.util.*;

/*
 * 70. Climbing Stairs   [Easy]
 * LeetCode: https://leetcode.com/problems/climbing-stairs/
 * NeetCode: https://neetcode.io/problems/climbing-stairs
 *
 * You are climbing a staircase. It takes n steps to reach the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * Example 1:
 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 *
 * Example 2:
 * Input: n = 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 *
 * Constraints:
 *   - 1 <= n <= 45
 */
public class Q01_ClimbingStairs {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int climbStairs(int n) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("70. Climbing Stairs");

        tester.check("n = 2", "2", () -> {
            int n = 2;
            return new Solution().climbStairs(n);
        });
        tester.check("n = 3", "3", () -> {
            int n = 3;
            return new Solution().climbStairs(n);
        });

        tester.done();
    }
}
