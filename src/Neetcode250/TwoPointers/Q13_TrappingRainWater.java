package Neetcode250.TwoPointers;

import Neetcode250.common.*;
import java.util.*;

/*
 * 42. Trapping Rain Water   [Hard]
 * LeetCode: https://leetcode.com/problems/trapping-rain-water/
 * NeetCode: https://neetcode.io/problems/trapping-rain-water
 *
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it can trap after raining.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2018/10/22/rainwatertrap.png]
 * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 * Explanation: The above elevation map (black section) is represented by array
 * [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
 *
 * Example 2:
 * Input: height = [4,2,0,3,2,5]
 * Output: 9
 *
 * Constraints:
 *   - n == height.length
 *   - 1 <= n <= 2 * 10^4
 *   - 0 <= height[i] <= 10^5
 */
public class Q13_TrappingRainWater {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int trap(int[] height) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("42. Trapping Rain Water");

        tester.check("height = [0,1,0,2,1,0,1,3,2,1,2,1]", "6", () -> {
            int[] height = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
            return new Solution().trap(height);
        });
        tester.check("height = [4,2,0,3,2,5]", "9", () -> {
            int[] height = new int[]{4, 2, 0, 3, 2, 5};
            return new Solution().trap(height);
        });

        tester.done();
    }
}
