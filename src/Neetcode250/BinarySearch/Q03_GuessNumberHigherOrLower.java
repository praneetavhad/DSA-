package Neetcode250.BinarySearch;

import Neetcode250.common.*;
import java.util.*;

/*
 * 374. Guess Number Higher or Lower   [Easy]
 * LeetCode: https://leetcode.com/problems/guess-number-higher-or-lower/
 * NeetCode: https://neetcode.io/problems/guess-number-higher-or-lower
 *
 * We are playing the Guess Game. The game is as follows:
 * I pick a number from 1 to n. You have to guess which number I picked (the number I picked stays the
 * same throughout the game).
 *
 * Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your
 * guess.
 *
 * You call a pre-defined API int guess(int num), which returns three possible results:
 *   - -1: Your guess is higher than the number I picked (i.e. num > pick).
 *   - 1: Your guess is lower than the number I picked (i.e. num < pick).
 *   - 0: your guess is equal to the number I picked (i.e. num == pick).
 *
 * Return the number that I picked.
 *
 * Example 1:
 * Input: n = 10, pick = 6
 * Output: 6
 *
 * Example 2:
 * Input: n = 1, pick = 1
 * Output: 1
 *
 * Example 3:
 * Input: n = 2, pick = 1
 * Output: 1
 *
 * Constraints:
 *   - 1 <= n <= 2^31 - 1
 *   - 1 <= pick <= n
 */
public class Q03_GuessNumberHigherOrLower {

    // Write your solution here - same code you would submit on LeetCode.
    /** Simulates LeetCode's guess API: -1 if num is higher than the pick, 1 if lower, 0 if equal. */
    static class GuessGame {
        int pick;
        int guess(int num) { return num > pick ? -1 : (num < pick ? 1 : 0); }
    }

    static class Solution extends GuessGame {
        public int guessNumber(int n) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("374. Guess Number Higher or Lower");

        tester.check("n = 10, pick = 6", "6", () -> {
            Solution s = new Solution();
            s.pick = 6;
            return s.guessNumber(10);
        });
        tester.check("n = 1, pick = 1", "1", () -> {
            Solution s = new Solution();
            s.pick = 1;
            return s.guessNumber(1);
        });
        tester.check("n = 2, pick = 1", "1", () -> {
            Solution s = new Solution();
            s.pick = 1;
            return s.guessNumber(2);
        });

        tester.done();
    }
}
