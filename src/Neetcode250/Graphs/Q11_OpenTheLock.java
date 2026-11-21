package Neetcode250.Graphs;

import Neetcode250.common.*;
import java.util.*;

/*
 * 752. Open the Lock   [Medium]
 * LeetCode: https://leetcode.com/problems/open-the-lock/
 * NeetCode: https://neetcode.io/problems/open-the-lock
 *
 * You have a lock in front of you with 4 circular wheels. Each wheel has 10 slots: '0', '1', '2', '3',
 * '4', '5', '6', '7', '8', '9'. The wheels can rotate freely and wrap around: for example we can turn
 * '9' to be '0', or '0' to be '9'. Each move consists of turning one wheel one slot.
 *
 * The lock initially starts at '0000', a string representing the state of the 4 wheels.
 *
 * You are given a list of deadends dead ends, meaning if the lock displays any of these codes, the
 * wheels of the lock will stop turning and you will be unable to open it.
 *
 * Given a target representing the value of the wheels that will unlock the lock, return the minimum
 * total number of turns required to open the lock, or -1 if it is impossible.
 *
 * Example 1:
 * Input: deadends = ["0201","0101","0102","1212","2002"], target = "0202"
 * Output: 6
 * Explanation:
 * A sequence of valid moves would be "0000" -> "1000" -> "1100" -> "1200" -> "1201" -> "1202" ->
 * "0202".
 * Note that a sequence like "0000" -> "0001" -> "0002" -> "0102" -> "0202" would be invalid,
 * because the wheels of the lock become stuck after the display becomes the dead end "0102".
 *
 * Example 2:
 * Input: deadends = ["8888"], target = "0009"
 * Output: 1
 * Explanation: We can turn the last wheel in reverse to move from "0000" -> "0009".
 *
 * Example 3:
 * Input: deadends = ["8887","8889","8878","8898","8788","8988","7888","9888"], target = "8888"
 * Output: -1
 * Explanation: We cannot reach the target without getting stuck.
 *
 * Constraints:
 *   - 1 <= deadends.length <= 500
 *   - deadends[i].length == 4
 *   - target.length == 4
 *   - target will not be in the list deadends.
 *   - target and deadends[i] consist of digits only.
 */
public class Q11_OpenTheLock {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int openLock(String[] deadends, String target) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("752. Open the Lock");

        tester.check("deadends = [\"0201\",\"0101\",\"0102\",\"1212\",\"2002\"], target = \"0202\"", "6", () -> {
            String[] deadends = new String[]{"0201", "0101", "0102", "1212", "2002"};
            String target = "0202";
            return new Solution().openLock(deadends, target);
        });
        tester.check("deadends = [\"8888\"], target = \"0009\"", "1", () -> {
            String[] deadends = new String[]{"8888"};
            String target = "0009";
            return new Solution().openLock(deadends, target);
        });
        tester.check("deadends = [\"8887\",\"8889\",\"8878\",\"8898\",\"8788\",\"8988\",\"7888\",\"9888\"], target = \"8888\"", "-1", () -> {
            String[] deadends = new String[]{"8887", "8889", "8878", "8898", "8788", "8988", "7888", "9888"};
            String target = "8888";
            return new Solution().openLock(deadends, target);
        });

        tester.done();
    }
}
