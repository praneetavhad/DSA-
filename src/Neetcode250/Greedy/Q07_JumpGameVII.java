package Neetcode250.Greedy;

import Neetcode250.common.*;
import java.util.*;

/*
 * 1871. Jump Game VII   [Medium]
 * LeetCode: https://leetcode.com/problems/jump-game-vii/
 * NeetCode: https://neetcode.io/problems/jump-game-vii
 *
 * You are given a 0-indexed binary string s and two integers minJump and maxJump. In the beginning,
 * you are standing at index 0, which is equal to '0'. You can move from index i to index j if the
 * following conditions are fulfilled:
 *   - i + minJump <= j <= min(i + maxJump, s.length - 1), and
 *   - s[j] == '0'.
 *
 * Return true if you can reach index s.length - 1 in s, or false otherwise.
 *
 * Example 1:
 * Input: s = "011010", minJump = 2, maxJump = 3
 * Output: true
 * Explanation:
 * In the first step, move from index 0 to index 3.
 * In the second step, move from index 3 to index 5.
 *
 * Example 2:
 * Input: s = "01101110", minJump = 2, maxJump = 3
 * Output: false
 *
 * Constraints:
 *   - 2 <= s.length <= 10^5
 *   - s[i] is either '0' or '1'.
 *   - s[0] == '0'
 *   - 1 <= minJump <= maxJump < s.length
 */
public class Q07_JumpGameVII {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public boolean canReach(String s, int minJump, int maxJump) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("1871. Jump Game VII");

        tester.check("s = \"011010\", minJump = 2, maxJump = 3", "true", () -> {
            String s = "011010";
            int minJump = 2;
            int maxJump = 3;
            return new Solution().canReach(s, minJump, maxJump);
        });
        tester.check("s = \"01101110\", minJump = 2, maxJump = 3", "false", () -> {
            String s = "01101110";
            int minJump = 2;
            int maxJump = 3;
            return new Solution().canReach(s, minJump, maxJump);
        });

        tester.done();
    }
}
