package Neetcode250.BinarySearch;

import Neetcode250.common.*;
import java.util.*;

/*
 * 1095. Find in Mountain Array   [Hard]
 * LeetCode: https://leetcode.com/problems/find-in-mountain-array/
 * NeetCode: https://neetcode.io/problems/find-in-mountain-array
 *
 * (This problem is an interactive problem.)
 *
 * You may recall that an array arr is a mountain array if and only if:
 *   - arr.length >= 3
 *   - There exists some i with 0 < i < arr.length - 1 such that:
 *   - arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 *   - arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 *
 * Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) ==
 * target. If such an index does not exist, return -1.
 *
 * You cannot access the mountain array directly. You may only access the array using a MountainArray
 * interface:
 *   - MountainArray.get(k) returns the element of the array at index k (0-indexed).
 *   - MountainArray.length() returns the length of the array.
 *
 * Submissions making more than 100 calls to MountainArray.get will be judged Wrong Answer. Also, any
 * solutions that attempt to circumvent the judge will result in disqualification.
 *
 * Example 1:
 * Input: mountainArr = [1,2,3,4,5,3,1], target = 3
 * Output: 2
 * Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.
 *
 * Example 2:
 * Input: mountainArr = [0,1,2,4,2,1], target = 3
 * Output: -1
 * Explanation: 3 does not exist in the array, so we return -1.
 *
 * Constraints:
 *   - 3 <= mountainArr.length() <= 10^4
 *   - 0 <= target <= 10^9
 *   - 0 <= mountainArr.get(index) <= 10^9
 */
public class Q14_FindInMountainArray {

    // Write your solution here - same code you would submit on LeetCode.
    /** LeetCode's MountainArray API. */
    interface MountainArray {
        int get(int index);
        int length();
    }

    /** Test implementation: fails if you call get() more than 100 times, like LeetCode. */
    static class MountainArrayImpl implements MountainArray {
        private final int[] arr;
        private int calls;
        MountainArrayImpl(int[] arr) { this.arr = arr; }
        public int get(int index) {
            if (++calls > 100) throw new IllegalStateException("called get() more than 100 times");
            return arr[index];
        }
        public int length() { return arr.length; }
    }

    static class Solution {
        public int findInMountainArray(int target, MountainArray mountainArr) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("1095. Find in Mountain Array");

        tester.check("mountainArr = [1,2,3,4,5,3,1], target = 3", "2", () -> {
            MountainArray mountainArr = new MountainArrayImpl(new int[]{1, 2, 3, 4, 5, 3, 1});
            return new Solution().findInMountainArray(3, mountainArr);
        });
        tester.check("mountainArr = [0,1,2,4,2,1], target = 3", "-1", () -> {
            MountainArray mountainArr = new MountainArrayImpl(new int[]{0, 1, 2, 4, 2, 1});
            return new Solution().findInMountainArray(3, mountainArr);
        });

        tester.done();
    }
}
