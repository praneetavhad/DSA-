package Neetcode250.TwoPointers;

import Neetcode250.common.*;
import java.util.*;

/*
 * 11. Container With Most Water   [Medium]
 * LeetCode: https://leetcode.com/problems/container-with-most-water/
 * NeetCode: https://neetcode.io/problems/max-water-container
 *
 * You are given an integer array height of length n. There are n vertical lines drawn such that the
 * two endpoints of the i^th line are (i, 0) and (i, height[i]).
 *
 * Find two lines that together with the x-axis form a container, such that the container contains the
 * most water.
 *
 * Return the maximum amount of water a container can store.
 *
 * Notice that you may not slant the container.
 *
 * Example 1:
 * [image: https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/17/question_11.jpg]
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case,
 * the max area of water (blue section) the container can contain is 49.
 *
 * Example 2:
 * Input: height = [1,1]
 * Output: 1
 *
 * Constraints:
 *   - n == height.length
 *   - 2 <= n <= 10^5
 *   - 0 <= height[i] <= 10^4
 */
public class Q11_ContainerWithMostWater {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int maxArea(int[] height) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("11. Container With Most Water");

        tester.check("height = [1,8,6,2,5,4,8,3,7]", "49", () -> {
            int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
            return new Solution().maxArea(height);
        });
        tester.check("height = [1,1]", "1", () -> {
            int[] height = new int[]{1, 1};
            return new Solution().maxArea(height);
        });

        tester.done();
    }
}
