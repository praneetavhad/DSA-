package Neetcode250.Intervals;

import Neetcode250.common.*;
import java.util.*;

/*
 * 253. Meeting Rooms II   [Medium]
 * LeetCode: https://leetcode.com/problems/meeting-rooms-ii/
 * NeetCode: https://neetcode.io/problems/meeting-schedule-ii
 *
 * (LeetCode Premium - free version on NeetCode)
 *
 * Given an array of meeting time intervals where intervals[i] = [start_i, end_i], return the
 * minimum number of conference rooms required. (A meeting ending at time t and one starting at t
 * can use the same room.)
 *
 * Example 1:
 * Input: intervals = [[0,30],[5,10],[15,20]]
 * Output: 2
 *
 * Example 2:
 * Input: intervals = [[7,10],[2,4]]
 * Output: 1
 *
 * Constraints:
 *   - 1 <= intervals.length <= 10^4
 *   - 0 <= start_i < end_i <= 10^6
 */
public class Q05_MeetingRoomsII {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int minMeetingRooms(int[][] intervals) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("253. Meeting Rooms II");

        tester.check("intervals = [[0,30],[5,10],[15,20]]", "2", () -> {
            int[][] intervals = new int[][]{{0, 30}, {5, 10}, {15, 20}};
            return new Solution().minMeetingRooms(intervals);
        });
        tester.check("intervals = [[7,10],[2,4]]", "1", () -> {
            int[][] intervals = new int[][]{{7, 10}, {2, 4}};
            return new Solution().minMeetingRooms(intervals);
        });
        tester.check("intervals = [[1,5],[5,10],[2,7],[6,9]]", "3", () -> {
            int[][] intervals = new int[][]{{1, 5}, {5, 10}, {2, 7}, {6, 9}};
            return new Solution().minMeetingRooms(intervals);
        });

        tester.done();
    }
}
