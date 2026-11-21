package Neetcode250.Intervals;

import Neetcode250.common.*;
import java.util.*;

/*
 * 252. Meeting Rooms   [Easy]
 * LeetCode: https://leetcode.com/problems/meeting-rooms/
 * NeetCode: https://neetcode.io/problems/meeting-schedule
 *
 * (LeetCode Premium - free version on NeetCode)
 *
 * Given an array of meeting time intervals where intervals[i] = [start_i, end_i], determine if a
 * person could attend all meetings. (A meeting ending at time t and one starting at t do not
 * conflict.)
 *
 * Example 1:
 * Input: intervals = [[0,30],[5,10],[15,20]]
 * Output: false
 *
 * Example 2:
 * Input: intervals = [[7,10],[2,4]]
 * Output: true
 *
 * Constraints:
 *   - 0 <= intervals.length <= 10^4
 *   - intervals[i].length == 2
 *   - 0 <= start_i < end_i <= 10^6
 */
public class Q04_MeetingRooms {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public boolean canAttendMeetings(int[][] intervals) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("252. Meeting Rooms");

        tester.check("intervals = [[0,30],[5,10],[15,20]]", "false", () -> {
            int[][] intervals = new int[][]{{0, 30}, {5, 10}, {15, 20}};
            return new Solution().canAttendMeetings(intervals);
        });
        tester.check("intervals = [[7,10],[2,4]]", "true", () -> {
            int[][] intervals = new int[][]{{7, 10}, {2, 4}};
            return new Solution().canAttendMeetings(intervals);
        });
        tester.check("intervals = [[1,5],[5,8]]", "true", () -> {
            int[][] intervals = new int[][]{{1, 5}, {5, 8}};
            return new Solution().canAttendMeetings(intervals);
        });
        tester.check("intervals = []", "true", () -> {
            int[][] intervals = new int[][]{};
            return new Solution().canAttendMeetings(intervals);
        });

        tester.done();
    }
}
