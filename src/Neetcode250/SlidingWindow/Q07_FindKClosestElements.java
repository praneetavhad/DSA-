package Neetcode250.SlidingWindow;

import Neetcode250.common.*;
import java.util.*;

/*
 * 658. Find K Closest Elements   [Medium]
 * LeetCode: https://leetcode.com/problems/find-k-closest-elements/
 * NeetCode: https://neetcode.io/problems/find-k-closest-elements
 *
 * Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the
 * array. The result should also be sorted in ascending order.
 *
 * An integer a is closer to x than an integer b if:
 *   - |a - x| < |b - x|, or
 *   - |a - x| == |b - x| and a < b
 *
 * Example 1:
 * Input: arr = [1,2,3,4,5], k = 4, x = 3
 * Output: [1,2,3,4]
 *
 * Example 2:
 * Input: arr = [1,1,2,3,4,5], k = 4, x = -1
 * Output: [1,1,2,3]
 *
 * Constraints:
 *   - 1 <= k <= arr.length
 *   - 1 <= arr.length <= 10^4
 *   - arr is sorted in ascending order.
 *   - -10^4 <= arr[i], x <= 10^4
 */
public class Q07_FindKClosestElements {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public List<Integer> findClosestElements(int[] arr, int k, int x) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("658. Find K Closest Elements");
        // Answers are compared ignoring the order of the outer list (problem allows any order).

        tester.check("arr = [1,2,3,4,5], k = 4, x = 3", "[1,2,3,4]", Tester.Order.ANY, () -> {
            int[] arr = new int[]{1, 2, 3, 4, 5};
            int k = 4;
            int x = 3;
            return new Solution().findClosestElements(arr, k, x);
        });
        tester.check("arr = [1,1,2,3,4,5], k = 4, x = -1", "[1,1,2,3]", Tester.Order.ANY, () -> {
            int[] arr = new int[]{1, 1, 2, 3, 4, 5};
            int k = 4;
            int x = -1;
            return new Solution().findClosestElements(arr, k, x);
        });

        tester.done();
    }
}
