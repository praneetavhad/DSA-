package Neetcode250.ArraysAndHashing;

import Neetcode250.common.*;
import java.util.*;

/*
 * 912. Sort an Array   [Medium]
 * LeetCode: https://leetcode.com/problems/sort-an-array/
 * NeetCode: https://neetcode.io/problems/sort-an-array
 *
 * Given an array of integers nums, sort the array in ascending order and return it.
 *
 * You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and
 * with the smallest space complexity possible.
 *
 * Example 1:
 * Input: nums = [5,2,3,1]
 * Output: [1,2,3,5]
 * Explanation: After sorting the array, the positions of some numbers are not changed (for example, 2
 * and 3), while the positions of other numbers are changed (for example, 1 and 5).
 *
 * Example 2:
 * Input: nums = [5,1,1,2,0,0]
 * Output: [0,0,1,1,2,5]
 * Explanation: Note that the values of nums are not necessarily unique.
 *
 * Constraints:
 *   - 1 <= nums.length <= 5 * 10^4
 *   - -5 * 10^4 <= nums[i] <= 5 * 10^4
 */
public class Q11_SortAnArray {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int[] sortArray(int[] arr) {
            int n = arr.length;

            for (int i=n/2-1; i>0; i--){
                heapify(arr,n,i);
            }

            for(int i = n-1; i>0;i--){
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;

                heapify(arr,i,0);
            }

            return arr;
        }

        private void heapify(int[] arr, int n, int parent) {
            int largest = parent;
            int left = 2 * parent +1;
            int right = 2 * parent +2;

            if(left < n && arr[left] > arr[largest]){
                largest = left;
            }

            if(right < n && arr[right] > arr[largest]){
                largest = right;
            }

            if(largest != parent){
                int temp = arr[largest];
                arr[largest] = arr[parent];
                arr[parent] = temp;

                heapify(arr,n,largest);
            }

        }


    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("912. Sort an Array");

        tester.check("nums = [5,2,3,1]", "[1,2,3,5]", () -> {
            int[] nums = new int[]{5, 2, 3, 1};
            return new Solution().sortArray(nums);
        });
        tester.check("nums = [5,1,1,2,0,0]", "[0,0,1,1,2,5]", () -> {
            int[] nums = new int[]{5, 1, 1, 2, 0, 0};
            return new Solution().sortArray(nums);
        });

        tester.done();
    }
}
