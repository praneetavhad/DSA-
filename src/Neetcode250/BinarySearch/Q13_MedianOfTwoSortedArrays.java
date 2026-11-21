package Neetcode250.BinarySearch;

import Neetcode250.common.*;
import java.util.*;

/*
 * 4. Median of Two Sorted Arrays   [Hard]
 * LeetCode: https://leetcode.com/problems/median-of-two-sorted-arrays/
 * NeetCode: https://neetcode.io/problems/median-of-two-sorted-arrays
 *
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two
 * sorted arrays.
 *
 * The overall run time complexity should be O(log (m+n)).
 *
 * Example 1:
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 *
 * Example 2:
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 *
 * Constraints:
 *   - nums1.length == m
 *   - nums2.length == n
 *   - 0 <= m <= 1000
 *   - 0 <= n <= 1000
 *   - 1 <= m + n <= 2000
 *   - -10^6 <= nums1[i], nums2[i] <= 10^6
 */
public class Q13_MedianOfTwoSortedArrays {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("4. Median of Two Sorted Arrays");

        tester.check("nums1 = [1,3], nums2 = [2]", "2.00000", () -> {
            int[] nums1 = new int[]{1, 3};
            int[] nums2 = new int[]{2};
            return new Solution().findMedianSortedArrays(nums1, nums2);
        });
        tester.check("nums1 = [1,2], nums2 = [3,4]", "2.50000", () -> {
            int[] nums1 = new int[]{1, 2};
            int[] nums2 = new int[]{3, 4};
            return new Solution().findMedianSortedArrays(nums1, nums2);
        });

        tester.done();
    }
}
