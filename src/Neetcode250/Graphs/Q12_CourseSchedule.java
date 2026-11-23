package Neetcode250.Graphs;

import Neetcode250.common.*;
import java.util.*;

/*
 * 207. Course Schedule   [Medium]
 * LeetCode: https://leetcode.com/problems/course-schedule/
 * NeetCode: https://neetcode.io/problems/course-schedule
 *
 * There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are
 * given an array prerequisites where prerequisites[i] = [a_i, b_i] indicates that you must take course
 * b_i first if you want to take course a_i.
 *   - For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
 *
 * Return true if you can finish all courses. Otherwise, return false.
 *
 * Example 1:
 * Input: numCourses = 2, prerequisites = [[1,0]]
 * Output: true
 * Explanation: There are a total of 2 courses to take.
 * To take course 1 you should have finished course 0. So it is possible.
 *
 * Example 2:
 * Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
 * Output: false
 * Explanation: There are a total of 2 courses to take.
 * To take course 1 you should have finished course 0, and to take course 0 you should also have
 * finished course 1. So it is impossible.
 *
 * Constraints:
 *   - 1 <= numCourses <= 2000
 *   - 0 <= prerequisites.length <= 5000
 *   - prerequisites[i].length == 2
 *   - 0 <= a_i, b_i < numCourses
 *   - All the pairs prerequisites[i] are unique.
 */
public class Q12_CourseSchedule {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public boolean canFinish(int nodeCount, int[][] edges) {

            List<List<Integer>> graph = new ArrayList<>();

            for (int i = 0; i < nodeCount; i++) {
                graph.add(new ArrayList<>());
            }

            for (int i = 0; i < edges.length; i++) {
                int start = edges[i][0];
                int end = edges[i][1];
                addEdge(graph,start,end);
            }


            boolean[] visited = new boolean[graph.size()];
            boolean[] recursivePath = new boolean[graph.size()];
            for (int src = 0; src < graph.size(); src++) {
                if (!visited[src] && directedCycleAlgo(src, recursivePath, visited, graph)) {
                    return false;
                }
            }
            return true;
        }

        private static void addEdge(List<List<Integer>> graph, int start, int end) {
            graph.get(start).add(end);
        }

        private static boolean directedCycleAlgo(int u, boolean[] recursivePath, boolean[] visited, List<List<Integer>> graph) {
            visited[u] = true;
            recursivePath[u] = true;
            for(int v : graph.get(u)){
                if(visited[v] == false){
                    visited[v] = true;
                    if(directedCycleAlgo(v,recursivePath,visited,graph)){
                        return true;
                    }
                } else if (recursivePath[v] == true) {
                    return true;
                }
            }

            recursivePath[u] = false;
            return false;
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("207. Course Schedule");

        tester.check("numCourses = 2, prerequisites = [[1,0]]", "true", () -> {
            int numCourses = 2;
            int[][] prerequisites = new int[][]{{1, 0}};
            return new Solution().canFinish(numCourses, prerequisites);
        });
        tester.check("numCourses = 2, prerequisites = [[1,0],[0,1]]", "false", () -> {
            int numCourses = 2;
            int[][] prerequisites = new int[][]{{1, 0}, {0, 1}};
            return new Solution().canFinish(numCourses, prerequisites);
        });

        tester.done();
    }
}
