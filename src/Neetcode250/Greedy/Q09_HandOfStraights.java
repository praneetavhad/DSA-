package Neetcode250.Greedy;

import Neetcode250.common.*;
import java.util.*;

/*
 * 846. Hand of Straights   [Medium]
 * LeetCode: https://leetcode.com/problems/hand-of-straights/
 * NeetCode: https://neetcode.io/problems/hand-of-straights
 *
 * Alice has some number of cards and she wants to rearrange the cards into groups so that each group
 * is of size groupSize, and consists of groupSize consecutive cards.
 *
 * Given an integer array hand where hand[i] is the value written on the i^th card and an integer
 * groupSize, return true if she can rearrange the cards, or false otherwise.
 *
 * Example 1:
 * Input: hand = [1,2,3,6,2,3,4,7,8], groupSize = 3
 * Output: true
 * Explanation: Alice's hand can be rearranged as [1,2,3],[2,3,4],[6,7,8]
 *
 * Example 2:
 * Input: hand = [1,2,3,4,5], groupSize = 4
 * Output: false
 * Explanation: Alice's hand can not be rearranged into groups of 4.
 *
 * Constraints:
 *   - 1 <= hand.length <= 10^4
 *   - 0 <= hand[i] <= 10^9
 *   - 1 <= groupSize <= hand.length
 *
 * Note: This question is the same as 1296:
 * https://leetcode.com/problems/divide-array-in-sets-of-k-consecutive-numbers/
 */
public class Q09_HandOfStraights {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public boolean isNStraightHand(int[] hand, int groupSize) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("846. Hand of Straights");

        tester.check("hand = [1,2,3,6,2,3,4,7,8], groupSize = 3", "true", () -> {
            int[] hand = new int[]{1, 2, 3, 6, 2, 3, 4, 7, 8};
            int groupSize = 3;
            return new Solution().isNStraightHand(hand, groupSize);
        });
        tester.check("hand = [1,2,3,4,5], groupSize = 4", "false", () -> {
            int[] hand = new int[]{1, 2, 3, 4, 5};
            int groupSize = 4;
            return new Solution().isNStraightHand(hand, groupSize);
        });

        tester.done();
    }
}
