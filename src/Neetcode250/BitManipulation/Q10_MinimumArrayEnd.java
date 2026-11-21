package Neetcode250.BitManipulation;

import Neetcode250.common.*;
import java.util.*;

/*
 * 3133. Minimum Array End   [Medium]
 * LeetCode: https://leetcode.com/problems/minimum-array-end/
 * NeetCode: https://neetcode.io/problems/minimum-array-end
 *
 * You are given two integers n and x. You have to construct an array of positive integers nums of size
 * n where for every 0 <= i < n - 1, nums[i + 1] is greater than nums[i], and the result of the bitwise
 * AND operation between all elements of nums is x.
 *
 * Return the minimum possible value of nums[n - 1].
 *
 * Example 1:
 * Input: n = 3, x = 4
 * Output: 6
 * Explanation:
 * nums can be [4,5,6] and its last element is 6.
 *
 * Example 2:
 * Input: n = 2, x = 7
 * Output: 15
 * Explanation:
 * nums can be [7,15] and its last element is 15.
 *
 * Constraints:
 *   - 1 <= n, x <= 10^8
 */
public class Q10_MinimumArrayEnd {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public long minEnd(int n, int x) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("3133. Minimum Array End");

        tester.check("n = 3, x = 4", "6", () -> {
            int n = 3;
            int x = 4;
            return new Solution().minEnd(n, x);
        });
        tester.check("n = 2, x = 7", "15", () -> {
            int n = 2;
            int x = 7;
            return new Solution().minEnd(n, x);
        });

        tester.done();
    }
}
