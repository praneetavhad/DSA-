package Neetcode250.Intervals;

import Neetcode250.common.*;
import java.util.*;

/*
 * 57. Insert Interval   [Medium]
 * LeetCode: https://leetcode.com/problems/insert-interval/
 * NeetCode: https://neetcode.io/problems/insert-new-interval
 *
 * You are given an array of non-overlapping intervals intervals where intervals[i] = [start_i, end_i]
 * represent the start and the end of the i^th interval and intervals is sorted in ascending order by
 * start_i. You are also given an interval newInterval = [start, end] that represents the start and end
 * of another interval.
 *
 * Two intervals are considered overlapping if they share at least one point.
 *
 * Insert newInterval into intervals such that intervals is still sorted in ascending order by start_i
 * and intervals still does not have any overlapping intervals (merge overlapping intervals if
 * necessary).
 *
 * Return intervals after the insertion.
 *
 * Note that you don't need to modify intervals in-place. You can make a new array and return it.
 *
 * Example 1:
 * Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
 * Output: [[1,5],[6,9]]
 *
 * Example 2:
 * Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
 * Output: [[1,2],[3,10],[12,16]]
 * Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].
 *
 * Constraints:
 *   - 0 <= intervals.length <= 10^4
 *   - intervals[i].length == 2
 *   - 0 <= start_i <= end_i <= 10^5
 *   - intervals is sorted by start_i in ascending order.
 *   - newInterval.length == 2
 *   - 0 <= start <= end <= 10^5
 */
public class Q01_InsertInterval {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int[][] insert(int[][] intervals, int[] newInterval) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("57. Insert Interval");

        tester.check("intervals = [[1,3],[6,9]], newInterval = [2,5]", "[[1,5],[6,9]]", () -> {
            int[][] intervals = new int[][]{{1, 3}, {6, 9}};
            int[] newInterval = new int[]{2, 5};
            return new Solution().insert(intervals, newInterval);
        });
        tester.check("intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]", "[[1,2],[3,10],[12,16]]", () -> {
            int[][] intervals = new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
            int[] newInterval = new int[]{4, 8};
            return new Solution().insert(intervals, newInterval);
        });

        tester.done();
    }
}
