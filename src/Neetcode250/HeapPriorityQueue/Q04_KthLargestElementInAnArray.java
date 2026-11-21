package Neetcode250.HeapPriorityQueue;

import Neetcode250.common.*;
import java.util.*;

/*
 * 215. Kth Largest Element in an Array   [Medium]
 * LeetCode: https://leetcode.com/problems/kth-largest-element-in-an-array/
 * NeetCode: https://neetcode.io/problems/kth-largest-element-in-an-array
 *
 * Given an integer array nums and an integer k, return the k^th largest element in the array.
 *
 * Note that it is the k^th largest element in the sorted order, not the k^th distinct element.
 *
 * Can you solve it without sorting?
 *
 * Example 1:
 * Input: nums = [3,2,1,5,6,4], k = 2
 * Output: 5
 *
 * Example 2:
 * Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
 * Output: 4
 *
 * Constraints:
 *   - 1 <= k <= nums.length <= 10^5
 *   - -10^4 <= nums[i] <= 10^4
 */
public class Q04_KthLargestElementInAnArray {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int findKthLargest(int[] nums, int k) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("215. Kth Largest Element in an Array");

        tester.check("nums = [3,2,1,5,6,4], k = 2", "5", () -> {
            int[] nums = new int[]{3, 2, 1, 5, 6, 4};
            int k = 2;
            return new Solution().findKthLargest(nums, k);
        });
        tester.check("nums = [3,2,3,1,2,4,5,5,6], k = 4", "4", () -> {
            int[] nums = new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6};
            int k = 4;
            return new Solution().findKthLargest(nums, k);
        });

        tester.done();
    }
}
