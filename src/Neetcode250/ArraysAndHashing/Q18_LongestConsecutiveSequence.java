package Neetcode250.ArraysAndHashing;

import Neetcode250.common.*;
import java.util.*;

/*
 * 128. Longest Consecutive Sequence   [Medium]
 * LeetCode: https://leetcode.com/problems/longest-consecutive-sequence/
 * NeetCode: https://neetcode.io/problems/longest-consecutive-sequence
 *
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements
 * sequence.
 *
 * You must write an algorithm that runs in O(n) time.
 *
 * Example 1:
 * Input: nums = [100,4,200,1,3,2]
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 *
 * Example 2:
 * Input: nums = [0,3,7,2,5,8,4,6,0,1]
 * Output: 9
 *
 * Example 3:
 * Input: nums = [1,0,1,2]
 * Output: 3
 *
 * Constraints:
 *   - 0 <= nums.length <= 10^5
 *   - -10^9 <= nums[i] <= 10^9
 */
public class Q18_LongestConsecutiveSequence {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int longestConsecutive(int[] nums) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("128. Longest Consecutive Sequence");

        tester.check("nums = [100,4,200,1,3,2]", "4", () -> {
            int[] nums = new int[]{100, 4, 200, 1, 3, 2};
            return new Solution().longestConsecutive(nums);
        });
        tester.check("nums = [0,3,7,2,5,8,4,6,0,1]", "9", () -> {
            int[] nums = new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
            return new Solution().longestConsecutive(nums);
        });
        tester.check("nums = [1,0,1,2]", "3", () -> {
            int[] nums = new int[]{1, 0, 1, 2};
            return new Solution().longestConsecutive(nums);
        });

        tester.done();
    }
}
