package Neetcode250.Intervals;

import Neetcode250.common.*;
import java.util.*;

/*
 * 1851. Minimum Interval to Include Each Query   [Hard]
 * LeetCode: https://leetcode.com/problems/minimum-interval-to-include-each-query/
 * NeetCode: https://neetcode.io/problems/minimum-interval-including-query
 *
 * You are given a 2D integer array intervals, where intervals[i] = [left_i, right_i] describes the
 * i^th interval starting at left_i and ending at right_i (inclusive). The size of an interval is
 * defined as the number of integers it contains, or more formally right_i - left_i + 1.
 *
 * You are also given an integer array queries. The answer to the j^th query is the size of the
 * smallest interval i such that left_i <= queries[j] <= right_i. If no such interval exists, the
 * answer is -1.
 *
 * Return an array containing the answers to the queries.
 *
 * Example 1:
 * Input: intervals = [[1,4],[2,4],[3,6],[4,4]], queries = [2,3,4,5]
 * Output: [3,3,1,4]
 * Explanation: The queries are processed as follows:
 * - Query = 2: The interval [2,4] is the smallest interval containing 2. The answer is 4 - 2 + 1 = 3.
 * - Query = 3: The interval [2,4] is the smallest interval containing 3. The answer is 4 - 2 + 1 = 3.
 * - Query = 4: The interval [4,4] is the smallest interval containing 4. The answer is 4 - 4 + 1 = 1.
 * - Query = 5: The interval [3,6] is the smallest interval containing 5. The answer is 6 - 3 + 1 = 4.
 *
 * Example 2:
 * Input: intervals = [[2,3],[2,5],[1,8],[20,25]], queries = [2,19,5,22]
 * Output: [2,-1,4,6]
 * Explanation: The queries are processed as follows:
 * - Query = 2: The interval [2,3] is the smallest interval containing 2. The answer is 3 - 2 + 1 = 2.
 * - Query = 19: None of the intervals contain 19. The answer is -1.
 * - Query = 5: The interval [2,5] is the smallest interval containing 5. The answer is 5 - 2 + 1 = 4.
 * - Query = 22: The interval [20,25] is the smallest interval containing 22. The answer is 25 - 20 + 1
 *   = 6.
 *
 * Constraints:
 *   - 1 <= intervals.length <= 10^5
 *   - 1 <= queries.length <= 10^5
 *   - intervals[i].length == 2
 *   - 1 <= left_i <= right_i <= 10^7
 *   - 1 <= queries[j] <= 10^7
 */
public class Q07_MinimumIntervalToIncludeEachQuery {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int[] minInterval(int[][] intervals, int[] queries) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("1851. Minimum Interval to Include Each Query");

        tester.check("intervals = [[1,4],[2,4],[3,6],[4,4]], queries = [2,3,4,5]", "[3,3,1,4]", () -> {
            int[][] intervals = new int[][]{{1, 4}, {2, 4}, {3, 6}, {4, 4}};
            int[] queries = new int[]{2, 3, 4, 5};
            return new Solution().minInterval(intervals, queries);
        });
        tester.check("intervals = [[2,3],[2,5],[1,8],[20,25]], queries = [2,19,5,22]", "[2,-1,4,6]", () -> {
            int[][] intervals = new int[][]{{2, 3}, {2, 5}, {1, 8}, {20, 25}};
            int[] queries = new int[]{2, 19, 5, 22};
            return new Solution().minInterval(intervals, queries);
        });

        tester.done();
    }
}
