package Neetcode250.BitManipulation;

import Neetcode250.common.*;
import java.util.*;

/*
 * 268. Missing Number   [Easy]
 * LeetCode: https://leetcode.com/problems/missing-number/
 * NeetCode: https://neetcode.io/problems/missing-number
 *
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the
 * range that is missing from the array.
 *
 * Example 1:
 * Input: nums = [3,0,1]
 * Output: 2
 * Explanation:
 * n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in
 * the range since it does not appear in nums.
 *
 * Example 2:
 * Input: nums = [0,1]
 * Output: 2
 * Explanation:
 * n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in
 * the range since it does not appear in nums.
 *
 * Example 3:
 * Input: nums = [9,6,4,2,3,5,7,0,1]
 * Output: 8
 * Explanation:
 * n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in
 * the range since it does not appear in nums.
 *
 * Constraints:
 *   - n == nums.length
 *   - 1 <= n <= 10^4
 *   - 0 <= nums[i] <= n
 *   - All the numbers of nums are unique.
 *
 * Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime
 * complexity?
 */
public class Q06_MissingNumber {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int missingNumber(int[] nums) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("268. Missing Number");

        tester.check("nums = [3,0,1]", "2", () -> {
            int[] nums = new int[]{3, 0, 1};
            return new Solution().missingNumber(nums);
        });
        tester.check("nums = [0,1]", "2", () -> {
            int[] nums = new int[]{0, 1};
            return new Solution().missingNumber(nums);
        });
        tester.check("nums = [9,6,4,2,3,5,7,0,1]", "8", () -> {
            int[] nums = new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1};
            return new Solution().missingNumber(nums);
        });

        tester.done();
    }
}
