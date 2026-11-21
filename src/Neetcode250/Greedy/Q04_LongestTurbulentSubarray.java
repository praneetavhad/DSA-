package Neetcode250.Greedy;

import Neetcode250.common.*;
import java.util.*;

/*
 * 978. Longest Turbulent Subarray   [Medium]
 * LeetCode: https://leetcode.com/problems/longest-turbulent-subarray/
 * NeetCode: https://neetcode.io/problems/longest-turbulent-subarray
 *
 * Given an integer array arr, return the length of a maximum size turbulent subarray of arr.
 *
 * A subarray is turbulent if the comparison sign flips between each adjacent pair of elements in the
 * subarray.
 *
 * More formally, a subarray [arr[i], arr[i + 1], ..., arr[j]] of arr is said to be turbulent if and
 * only if:
 *   - For i <= k < j:
 *   - arr[k] > arr[k + 1] when k is odd, and
 *   - arr[k] < arr[k + 1] when k is even.
 *   - Or, for i <= k < j:
 *   - arr[k] > arr[k + 1] when k is even, and
 *   - arr[k] < arr[k + 1] when k is odd.
 *
 * Example 1:
 * Input: arr = [9,4,2,10,7,8,8,1,9]
 * Output: 5
 * Explanation: arr[1] > arr[2] < arr[3] > arr[4] < arr[5]
 *
 * Example 2:
 * Input: arr = [4,8,12,16]
 * Output: 2
 *
 * Example 3:
 * Input: arr = [100]
 * Output: 1
 *
 * Constraints:
 *   - 1 <= arr.length <= 4 * 10^4
 *   - 0 <= arr[i] <= 10^9
 */
public class Q04_LongestTurbulentSubarray {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int maxTurbulenceSize(int[] arr) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("978. Longest Turbulent Subarray");

        tester.check("arr = [9,4,2,10,7,8,8,1,9]", "5", () -> {
            int[] arr = new int[]{9, 4, 2, 10, 7, 8, 8, 1, 9};
            return new Solution().maxTurbulenceSize(arr);
        });
        tester.check("arr = [4,8,12,16]", "2", () -> {
            int[] arr = new int[]{4, 8, 12, 16};
            return new Solution().maxTurbulenceSize(arr);
        });
        tester.check("arr = [100]", "1", () -> {
            int[] arr = new int[]{100};
            return new Solution().maxTurbulenceSize(arr);
        });

        tester.done();
    }
}
