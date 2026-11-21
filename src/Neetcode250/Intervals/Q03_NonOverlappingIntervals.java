package Neetcode250.Intervals;

import Neetcode250.common.*;
import java.util.*;

/*
 * 435. Non-overlapping Intervals   [Medium]
 * LeetCode: https://leetcode.com/problems/non-overlapping-intervals/
 * NeetCode: https://neetcode.io/problems/non-overlapping-intervals
 *
 * Given an array of intervals intervals where intervals[i] = [start_i, end_i], return the minimum
 * number of intervals you need to remove to make the rest of the intervals non-overlapping.
 *
 * Note that intervals which only touch at a point are non-overlapping. For example, [1, 2] and [2, 3]
 * are non-overlapping.
 *
 * Example 1:
 * Input: intervals = [[1,2],[2,3],[3,4],[1,3]]
 * Output: 1
 * Explanation: [1,3] can be removed and the rest of the intervals are non-overlapping.
 *
 * Example 2:
 * Input: intervals = [[1,2],[1,2],[1,2]]
 * Output: 2
 * Explanation: You need to remove two [1,2] to make the rest of the intervals non-overlapping.
 *
 * Example 3:
 * Input: intervals = [[1,2],[2,3]]
 * Output: 0
 * Explanation: You don't need to remove any of the intervals since they're already non-overlapping.
 *
 * Constraints:
 *   - 1 <= intervals.length <= 10^5
 *   - intervals[i].length == 2
 *   - -5 * 10^4 <= start_i < end_i <= 5 * 10^4
 */
public class Q03_NonOverlappingIntervals {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int eraseOverlapIntervals(int[][] intervals) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("435. Non-overlapping Intervals");

        tester.check("intervals = [[1,2],[2,3],[3,4],[1,3]]", "1", () -> {
            int[][] intervals = new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}};
            return new Solution().eraseOverlapIntervals(intervals);
        });
        tester.check("intervals = [[1,2],[1,2],[1,2]]", "2", () -> {
            int[][] intervals = new int[][]{{1, 2}, {1, 2}, {1, 2}};
            return new Solution().eraseOverlapIntervals(intervals);
        });
        tester.check("intervals = [[1,2],[2,3]]", "0", () -> {
            int[][] intervals = new int[][]{{1, 2}, {2, 3}};
            return new Solution().eraseOverlapIntervals(intervals);
        });

        tester.done();
    }
}
