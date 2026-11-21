package Neetcode250.SlidingWindow;

import Neetcode250.common.*;
import java.util.*;

/*
 * 239. Sliding Window Maximum   [Hard]
 * LeetCode: https://leetcode.com/problems/sliding-window-maximum/
 * NeetCode: https://neetcode.io/problems/sliding-window-maximum
 *
 * You are given an array of integers nums, there is a sliding window of size k which is moving from
 * the very left of the array to the very right. You can only see the k numbers in the window. Each
 * time the sliding window moves right by one position.
 *
 * Return the max sliding window.
 *
 * Example 1:
 * Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
 * Output: [3,3,5,5,6,7]
 * Explanation:
 * Window position                Max
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 *  1 [3  -1  -3] 5  3  6  7       3
 *  1  3 [-1  -3  5] 3  6  7       5
 *  1  3  -1 [-3  5  3] 6  7       5
 *  1  3  -1  -3 [5  3  6] 7       6
 *  1  3  -1  -3  5 [3  6  7]      7
 *
 * Example 2:
 * Input: nums = [1], k = 1
 * Output: [1]
 *
 * Constraints:
 *   - 1 <= nums.length <= 10^5
 *   - -10^4 <= nums[i] <= 10^4
 *   - 1 <= k <= nums.length
 */
public class Q09_SlidingWindowMaximum {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("239. Sliding Window Maximum");

        tester.check("nums = [1,3,-1,-3,5,3,6,7], k = 3", "[3,3,5,5,6,7]", () -> {
            int[] nums = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
            int k = 3;
            return new Solution().maxSlidingWindow(nums, k);
        });
        tester.check("nums = [1], k = 1", "[1]", () -> {
            int[] nums = new int[]{1};
            int k = 1;
            return new Solution().maxSlidingWindow(nums, k);
        });

        tester.done();
    }
}
