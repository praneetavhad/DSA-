package Neetcode250.Graphs;

import Neetcode250.common.*;
import java.util.*;

/*
 * 286. Walls And Gates   [Medium]
 * LeetCode: https://leetcode.com/problems/walls-and-gates/
 * NeetCode: https://neetcode.io/problems/islands-and-treasure
 *
 * (LeetCode Premium - free version on NeetCode as " ")
 *
 * You are given an m x n grid rooms initialized with these three possible values:
 *   - -1           : a wall or an obstacle.
 *   - 0            : a gate.
 *   - INF          : an empty room. INF = 2^31 - 1 = 2147483647.
 *
 * Fill each empty room with the distance to its nearest gate (moving up/down/left/right).
 * If it is impossible to reach a gate, it should stay INF. Modify rooms in-place.
 *
 * Example 1:
 * Input: rooms = [[INF,-1,0,INF],[INF,INF,INF,-1],[INF,-1,INF,-1],[0,-1,INF,INF]]
 * Output: [[3,-1,0,1],[2,2,1,-1],[1,-1,2,-1],[0,-1,3,4]]
 *
 * Example 2:
 * Input: rooms = [[-1]]
 * Output: [[-1]]
 *
 * Constraints:
 *   - m == rooms.length, n == rooms[i].length
 *   - 1 <= m, n <= 250
 *   - rooms[i][j] is -1, 0, or 2^31 - 1.
 */
public class Q07_WallsAndGates {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        private static final int[][] DIRECTIONS = {
                {1, 0},  // down
                {-1, 0}, // up
                {0, 1},  // right
                {0, -1}  // left
        };

        public void wallsAndGates(int[][] grid) {
            if (grid.length == 0 || grid[0].length == 0){
                return;
            }

            int m = grid.length;
            int n = grid[0].length;
            Queue<int[]> q = new LinkedList<>();

            for(int i=0;i<m;i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] ==0){
                        q.add(new int[]{i,j});
                    }
                }
            }

            if (q.isEmpty()){
                return;
            }

            while(!q.isEmpty()){
                int[] curr_wall_pos = q.poll();
                int curr_row = curr_wall_pos[0];
                int curr_col = curr_wall_pos[1];

                for(int[] direction: DIRECTIONS){
                    int nextRow = curr_row + direction[0];
                    int nextCol = curr_col + direction[1];

                    if(nextRow >= 0 && nextRow < m && nextCol >=0 && nextCol < n && grid[nextRow][nextCol] == Integer.MAX_VALUE){
                        grid[nextRow][nextCol] = grid[curr_row][curr_col] + 1;
                        q.offer(new int[]{nextRow, nextCol});
                    }
                }
            }
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("286. Walls And Gates");

        tester.check("rooms = [[INF,-1,0,INF],[INF,INF,INF,-1],[INF,-1,INF,-1],[0,-1,INF,INF]]", "[[3,-1,0,1],[2,2,1,-1],[1,-1,2,-1],[0,-1,3,4]]", () -> {
            int INF = Integer.MAX_VALUE;
            int[][] rooms = new int[][]{{INF, -1, 0, INF}, {INF, INF, INF, -1}, {INF, -1, INF, -1}, {0, -1, INF, INF}};
            new Solution().wallsAndGates(rooms);
            return rooms;
        });
        tester.check("rooms = [[-1]]", "[[-1]]", () -> {
            int INF = Integer.MAX_VALUE;
            int[][] rooms = new int[][]{{-1}};
            new Solution().wallsAndGates(rooms);
            return rooms;
        });
        tester.check("rooms = [[INF]]", "[[2147483647]]", () -> {
            int INF = Integer.MAX_VALUE;
            int[][] rooms = new int[][]{{INF}};
            new Solution().wallsAndGates(rooms);
            return rooms;
        });
        tester.check("rooms = [[0,INF],[INF,-1]]", "[[0,1],[1,-1]]", () -> {
            int INF = Integer.MAX_VALUE;
            int[][] rooms = new int[][]{{0, INF}, {INF, -1}};
            new Solution().wallsAndGates(rooms);
            return rooms;
        });

        tester.done();
    }
}
