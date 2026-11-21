package Neetcode250.TwoPointers;

import Neetcode250.common.*;
import java.util.*;

/*
 * 167. Two Sum II - Input Array Is Sorted   [Medium]
 * LeetCode: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 * NeetCode: https://neetcode.io/problems/two-integer-sum-ii
 *
 * You are given a 1-indexed array of integers numbers that is already sorted in non-decreasing order.
 *
 * Find two numbers such that they add up to a specific target number. Let these two numbers be
 * numbers[index_1] and numbers[index_2] where 1 <= index_1 < index_2 <= numbers.length.
 *
 * Return the indices of the two numbers index_1 and index_2 as an integer array [index_1, index_2] of
 * length 2.
 *
 * The tests are generated such that there is exactly one solution. You may not use the same element
 * twice.
 *
 * Your solution must use only constant extra space.
 *
 * Example 1:
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore, index_1 = 1, index_2 = 2. We return [1, 2].
 *
 * Example 2:
 * Input: numbers = [2,3,4], target = 6
 * Output: [1,3]
 * Explanation: The sum of 2 and 4 is 6. Therefore index_1 = 1, index_2 = 3. We return [1, 3].
 *
 * Example 3:
 * Input: numbers = [-1,0], target = -1
 * Output: [1,2]
 * Explanation: The sum of -1 and 0 is -1. Therefore index_1 = 1, index_2 = 2. We return [1, 2].
 *
 * Constraints:
 *   - 2 <= numbers.length <= 3 * 10^4
 *   - -1000 <= numbers[i] <= 1000
 *   - numbers is sorted in non-decreasing order.
 *   - -1000 <= target <= 1000
 *   - The tests are generated such that there is exactly one solution.
 */
public class Q07_TwoSumIIInputArrayIsSorted {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int[] twoSum(int[] numbers, int target) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("167. Two Sum II - Input Array Is Sorted");

        tester.check("numbers = [2,7,11,15], target = 9", "[1,2]", () -> {
            int[] numbers = new int[]{2, 7, 11, 15};
            int target = 9;
            return new Solution().twoSum(numbers, target);
        });
        tester.check("numbers = [2,3,4], target = 6", "[1,3]", () -> {
            int[] numbers = new int[]{2, 3, 4};
            int target = 6;
            return new Solution().twoSum(numbers, target);
        });
        tester.check("numbers = [-1,0], target = -1", "[1,2]", () -> {
            int[] numbers = new int[]{-1, 0};
            int target = -1;
            return new Solution().twoSum(numbers, target);
        });

        tester.done();
    }
}
