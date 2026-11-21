package Neetcode250.ArraysAndHashing;

import Neetcode250.common.*;
import java.util.*;

/*
 * 229. Majority Element II   [Medium]
 * LeetCode: https://leetcode.com/problems/majority-element-ii/
 * NeetCode: https://neetcode.io/problems/majority-element-ii
 *
 * Given an integer array of size n, find all elements that appear more than floor(n / 3) times.
 *
 * Example 1:
 * Input: nums = [3,2,3]
 * Output: [3]
 *
 * Example 2:
 * Input: nums = [1]
 * Output: [1]
 *
 * Example 3:
 * Input: nums = [1,2]
 * Output: [1,2]
 *
 * Constraints:
 *   - 1 <= nums.length <= 5 * 10^4
 *   - -10^9 <= nums[i] <= 10^9
 *
 * Follow up: Could you solve the problem in linear time and in O(1) space?
 */
public class Q20_MajorityElementII {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public List<Integer> majorityElement(int[] nums) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("229. Majority Element II");
        // Answers are compared ignoring the order of the outer list (problem allows any order).

        tester.check("nums = [3,2,3]", "[3]", Tester.Order.ANY, () -> {
            int[] nums = new int[]{3, 2, 3};
            return new Solution().majorityElement(nums);
        });
        tester.check("nums = [1]", "[1]", Tester.Order.ANY, () -> {
            int[] nums = new int[]{1};
            return new Solution().majorityElement(nums);
        });
        tester.check("nums = [1,2]", "[1,2]", Tester.Order.ANY, () -> {
            int[] nums = new int[]{1, 2};
            return new Solution().majorityElement(nums);
        });

        tester.done();
    }
}
