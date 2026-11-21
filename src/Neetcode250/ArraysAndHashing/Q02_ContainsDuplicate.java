package Neetcode250.ArraysAndHashing;

import Neetcode250.common.*;
import java.util.*;

/*
 * 217. Contains Duplicate   [Easy]
 * LeetCode: https://leetcode.com/problems/contains-duplicate/
 * NeetCode: https://neetcode.io/problems/duplicate-integer
 *
 * Given an integer array nums, return true if any value appears at least twice in the array, and
 * return false if every element is distinct.
 *
 * Example 1:
 * Input: nums = [1,2,3,1]
 * Output: true
 * Explanation:
 * The element 1 occurs at the indices 0 and 3.
 *
 * Example 2:
 * Input: nums = [1,2,3,4]
 * Output: false
 * Explanation:
 * All elements are distinct.
 *
 * Example 3:
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 *
 * Constraints:
 *   - 1 <= nums.length <= 10^5
 *   - -10^9 <= nums[i] <= 10^9
 */
public class Q02_ContainsDuplicate {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public boolean containsDuplicate(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                if(set.contains(nums[i])){
                    return true;
                }
                set.add(nums[i]);
            }

            return false;
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("217. Contains Duplicate");

        tester.check("nums = [1,2,3,1]", "true", () -> {
            int[] nums = new int[]{1, 2, 3, 1};
            return new Solution().containsDuplicate(nums);
        });
        tester.check("nums = [1,2,3,4]", "false", () -> {
            int[] nums = new int[]{1, 2, 3, 4};
            return new Solution().containsDuplicate(nums);
        });
        tester.check("nums = [1,1,1,3,3,4,3,2,4,2]", "true", () -> {
            int[] nums = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
            return new Solution().containsDuplicate(nums);
        });

        tester.done();
    }
}
