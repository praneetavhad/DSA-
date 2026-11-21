package Neetcode250.Graphs;

import Neetcode250.common.*;
import java.util.*;

/*
 * 1462. Course Schedule IV   [Medium]
 * LeetCode: https://leetcode.com/problems/course-schedule-iv/
 * NeetCode: https://neetcode.io/problems/course-schedule-iv
 *
 * There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are
 * given an array prerequisites where prerequisites[i] = [a_i, b_i] indicates that you must take course
 * a_i first if you want to take course b_i.
 *   - For example, the pair [0, 1] indicates that you have to take course 0 before you can take course
 *     1.
 *
 * Prerequisites can also be indirect. If course a is a prerequisite of course b, and course b is a
 * prerequisite of course c, then course a is a prerequisite of course c.
 *
 * You are also given an array queries where queries[j] = [u_j, v_j]. For the j^th query, you should
 * answer whether course u_j is a prerequisite of course v_j or not.
 *
 * Return a boolean array answer, where answer[j] is the answer to the j^th query.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2021/05/01/courses4-1-graph.jpg]
 * Input: numCourses = 2, prerequisites = [[1,0]], queries = [[0,1],[1,0]]
 * Output: [false,true]
 * Explanation: The pair [1, 0] indicates that you have to take course 1 before you can take course 0.
 * Course 0 is not a prerequisite of course 1, but the opposite is true.
 *
 * Example 2:
 * Input: numCourses = 2, prerequisites = [], queries = [[1,0],[0,1]]
 * Output: [false,false]
 * Explanation: There are no prerequisites, and each course is independent.
 *
 * Example 3:
 * [image: https://assets.leetcode.com/uploads/2021/05/01/courses4-3-graph.jpg]
 * Input: numCourses = 3, prerequisites = [[1,2],[1,0],[2,0]], queries = [[1,0],[1,2]]
 * Output: [true,true]
 *
 * Constraints:
 *   - 2 <= numCourses <= 100
 *   - 0 <= prerequisites.length <= (numCourses * (numCourses - 1) / 2)
 *   - prerequisites[i].length == 2
 *   - 0 <= a_i, b_i <= numCourses - 1
 *   - a_i != b_i
 *   - All the pairs [a_i, b_i] are unique.
 *   - The prerequisites graph has no cycles.
 *   - 1 <= queries.length <= 10^4
 *   - 0 <= u_i, v_i <= numCourses - 1
 *   - u_i != v_i
 */
public class Q15_CourseScheduleIV {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("1462. Course Schedule IV");

        tester.check("numCourses = 6, prerequisites = [[4,5],[3,4],[2,3],[1,2],[0,1]], queries = [[0,5]]", "[false,true]", () -> {
            int numCourses = 6;
            int[][] prerequisites = new int[][]{{4, 5}, {3, 4}, {2, 3}, {1, 2}, {0, 1}};
            int[][] queries = new int[][]{{0, 5}};
            return new Solution().checkIfPrerequisite(numCourses, prerequisites, queries);
        });
        tester.check("numCourses = 3, prerequisites = [[0,1],[1,2]], queries = [[0,2]]", "[false,false]", () -> {
            int numCourses = 3;
            int[][] prerequisites = new int[][]{{0, 1}, {1, 2}};
            int[][] queries = new int[][]{{0, 2}};
            return new Solution().checkIfPrerequisite(numCourses, prerequisites, queries);
        });
        tester.check("numCourses = 4, prerequisites = [[0,1],[2,3]], queries = [[0,3]]", "[true,true]", () -> {
            int numCourses = 4;
            int[][] prerequisites = new int[][]{{0, 1}, {2, 3}};
            int[][] queries = new int[][]{{0, 3}};
            return new Solution().checkIfPrerequisite(numCourses, prerequisites, queries);
        });

        tester.done();
    }
}
