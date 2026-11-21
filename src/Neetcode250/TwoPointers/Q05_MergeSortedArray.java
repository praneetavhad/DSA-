package Neetcode250.TwoPointers;

import Neetcode250.common.*;
import java.util.*;

/*
 * 88. Merge Sorted Array   [Easy]
 * LeetCode: https://leetcode.com/problems/merge-sorted-array/
 * NeetCode: https://neetcode.io/problems/merge-sorted-array
 *
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m
 * and n, representing the number of elements in nums1 and nums2 respectively.
 *
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 *
 * The final sorted array should not be returned by the function, but instead be stored inside the
 * array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the
 * elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2
 * has a length of n.
 *
 * Example 1:
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 *
 * Example 2:
 * Input: nums1 = [1], m = 1, nums2 = [], n = 0
 * Output: [1]
 * Explanation: The arrays we are merging are [1] and [].
 * The result of the merge is [1].
 *
 * Example 3:
 * Input: nums1 = [0], m = 0, nums2 = [1], n = 1
 * Output: [1]
 * Explanation: The arrays we are merging are [] and [1].
 * The result of the merge is [1].
 * Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge
 * result can fit in nums1.
 *
 * Constraints:
 *   - nums1.length == m + n
 *   - nums2.length == n
 *   - 0 <= m, n <= 200
 *   - 1 <= m + n <= 200
 *   - -10^9 <= nums1[i], nums2[j] <= 10^9
 *
 * Follow up: Can you come up with an algorithm that runs in O(m + n) time?
 */
public class Q05_MergeSortedArray {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("88. Merge Sorted Array");

        tester.check("nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3", "[1,2,2,3,5,6]", () -> {
            int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
            int m = 3;
            int[] nums2 = new int[]{2, 5, 6};
            int n = 3;
            new Solution().merge(nums1, m, nums2, n);
            return nums1;
        });
        tester.check("nums1 = [1], m = 1, nums2 = [], n = 0", "[1]", () -> {
            int[] nums1 = new int[]{1};
            int m = 1;
            int[] nums2 = new int[]{};
            int n = 0;
            new Solution().merge(nums1, m, nums2, n);
            return nums1;
        });
        tester.check("nums1 = [0], m = 0, nums2 = [1], n = 1", "[1]", () -> {
            int[] nums1 = new int[]{0};
            int m = 0;
            int[] nums2 = new int[]{1};
            int n = 1;
            new Solution().merge(nums1, m, nums2, n);
            return nums1;
        });

        tester.done();
    }
}
