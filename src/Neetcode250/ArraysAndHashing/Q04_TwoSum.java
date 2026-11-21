package Neetcode250.ArraysAndHashing;

import Neetcode250.common.*;
import java.util.*;

/*
 * 1. Two Sum   [Easy]
 * LeetCode: https://leetcode.com/problems/two-sum/
 * NeetCode: https://neetcode.io/problems/two-integer-sum
 *
 * You are given an array of integers nums and an integer target, return indices of the two numbers
 * such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element
 * twice.
 *
 * You can return the answer in any order.
 *
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation:
 * The sum of nums[0] and nums[1] is 2 + 7 = 9, which equals the target. Therefore, the indices [0, 1]
 * are returned.
 *
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Explanation:
 * The sum of nums[1] and nums[2] is 2 + 4 = 6, which equals the target. Therefore, the indices [1, 2]
 * are returned.
 *
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 * Explanation:
 * The sum of nums[0] and nums[1] is 3 + 3 = 6, which equals the target. Therefore, the indices [0, 1]
 * are returned.
 *
 * Constraints:
 *   - 2 <= nums.length <= 10^4
 *   - -10^9 <= nums[i] <= 10^9
 *   - -10^9 <= target <= 10^9
 *   - Only one valid answer exists.
 *
 * Follow-up: Can you come up with an algorithm that is less than O(n^2) time complexity?
 */
public class Q04_TwoSum {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer,Integer> map = new HashMap<>();

            for(int i=0;i< nums.length;i++){
                int remain = target - nums[i];

                if(map.containsKey(remain)){
                    return new int[] {i,map.get(remain)};
                }
                map.put(nums[i],i);
            }
            return new int[] {};
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("1. Two Sum");
        // Answers are compared ignoring the order of the outer list (problem allows any order).

        tester.check("nums = [2,7,11,15], target = 9", "[0,1]", Tester.Order.ANY, () -> {
            int[] nums = new int[]{2, 7, 11, 15};
            int target = 9;
            return new Solution().twoSum(nums, target);
        });
        tester.check("nums = [3,2,4], target = 6", "[1,2]", Tester.Order.ANY, () -> {
            int[] nums = new int[]{3, 2, 4};
            int target = 6;
            return new Solution().twoSum(nums, target);
        });
        tester.check("nums = [3,3], target = 6", "[0,1]", Tester.Order.ANY, () -> {
            int[] nums = new int[]{3, 3};
            int target = 6;
            return new Solution().twoSum(nums, target);
        });

        tester.done();
    }
}
