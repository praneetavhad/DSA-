package Neetcode250.Graphs;

import Neetcode250.common.*;
import java.util.*;

/*
 * 997. Find the Town Judge   [Easy]
 * LeetCode: https://leetcode.com/problems/find-the-town-judge/
 * NeetCode: https://neetcode.io/problems/find-the-town-judge
 *
 * In a town, there are n people labeled from 1 to n. There is a rumor that one of these people is
 * secretly the town judge.
 *
 * If the town judge exists, then:
 *   - The town judge trusts nobody.
 *   - Everybody (except for the town judge) trusts the town judge.
 *   - There is exactly one person that satisfies properties 1 and 2.
 *
 * You are given an array trust where trust[i] = [a_i, b_i] representing that the person labeled a_i
 * trusts the person labeled b_i. If a trust relationship does not exist in trust array, then such a
 * trust relationship does not exist.
 *
 * Return the label of the town judge if the town judge exists and can be identified, or return -1
 * otherwise.
 *
 * Example 1:
 * Input: n = 2, trust = [[1,2]]
 * Output: 2
 *
 * Example 2:
 * Input: n = 3, trust = [[1,3],[2,3]]
 * Output: 3
 *
 * Example 3:
 * Input: n = 3, trust = [[1,3],[2,3],[3,1]]
 * Output: -1
 *
 * Constraints:
 *   - 1 <= n <= 1000
 *   - 0 <= trust.length <= 10^4
 *   - trust[i].length == 2
 *   - All the pairs of trust are unique.
 *   - a_i != b_i
 *   - 1 <= a_i, b_i <= n
 */
public class Q03_FindTheTownJudge {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int findJudge(int n, int[][] trust) {
            int[] indegree = new int[n+1];
            int[] outdegree = new int[n+1];

            for(int[] pair : trust){
                int u = pair[0];
                int v = pair[1];
                indegree[v]++;
                outdegree[u]++;
            }

            for(int i=1;i<=n;i++){
                if(indegree[i] == n-1 && outdegree[i] == 0){
                    return i;
                }
            }

            return -1;

        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("997. Find the Town Judge");

        tester.check("n = 2, trust = [[1,2]]", "2", () -> {
            int n = 2;
            int[][] trust = new int[][]{{1, 2}};
            return new Solution().findJudge(n, trust);
        });
        tester.check("n = 3, trust = [[1,3],[2,3]]", "3", () -> {
            int n = 3;
            int[][] trust = new int[][]{{1, 3}, {2, 3}};
            return new Solution().findJudge(n, trust);
        });
        tester.check("n = 3, trust = [[1,3],[2,3],[3,1]]", "-1", () -> {
            int n = 3;
            int[][] trust = new int[][]{{1, 3}, {2, 3}, {3, 1}};
            return new Solution().findJudge(n, trust);
        });

        tester.done();
    }
}
