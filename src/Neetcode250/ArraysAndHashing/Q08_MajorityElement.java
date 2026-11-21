package Neetcode250.ArraysAndHashing;

import Neetcode250.common.*;
import java.util.*;

/*
 * 169. Majority Element   [Easy]
 * LeetCode: https://leetcode.com/problems/majority-element/
 * NeetCode: https://neetcode.io/problems/majority-element
 *
 * Given an array nums of size n, return the majority element.
 *
 * The majority element is the element that appears more than floor(n / 2) times. You may assume that
 * the majority element always exists in the array.
 *
 * Example 1:
 * Input: nums = [3,2,3]
 * Output: 3
 *
 * Example 2:
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 *
 * Constraints:
 *   - n == nums.length
 *   - 1 <= n <= 5 * 10^4
 *   - -10^9 <= nums[i] <= 10^9
 *   - The input is generated such that a majority element will exist in the array.
 *
 * Follow-up: Could you solve the problem in linear time and in O(1) space?
 */
public class Q08_MajorityElement {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int majorityElement(int[] nums) {
            HashMap<Integer,Integer> map = new HashMap<>();
            for (int num : nums){
                int count = map.getOrDefault(num, 0) + 1;
                map.put(num, count);
                if(count > nums.length / 2){
                    return num;
                }
            }
            return 0;
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("169. Majority Element");

        tester.check("nums = [3,2,3]", "3", () -> {
            int[] nums = new int[]{3, 2, 3};
            return new Solution().majorityElement(nums);
        });
        tester.check("nums = [2,2,1,1,1,2,2]", "2", () -> {
            int[] nums = new int[]{2, 2, 1, 1, 1, 2, 2};
            return new Solution().majorityElement(nums);
        });

        tester.done();
    }
}
