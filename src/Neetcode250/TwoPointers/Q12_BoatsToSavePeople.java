package Neetcode250.TwoPointers;

import Neetcode250.common.*;
import java.util.*;

/*
 * 881. Boats to Save People   [Medium]
 * LeetCode: https://leetcode.com/problems/boats-to-save-people/
 * NeetCode: https://neetcode.io/problems/boats-to-save-people
 *
 * You are given an array people where people[i] is the weight of the i^th person, and an infinite
 * number of boats where each boat can carry a maximum weight of limit. Each boat carries at most two
 * people at the same time, provided the sum of the weight of those people is at most limit.
 *
 * Return the minimum number of boats to carry every given person.
 *
 * Example 1:
 * Input: people = [1,2], limit = 3
 * Output: 1
 * Explanation: 1 boat (1, 2)
 *
 * Example 2:
 * Input: people = [3,2,2,1], limit = 3
 * Output: 3
 * Explanation: 3 boats (1, 2), (2) and (3)
 *
 * Example 3:
 * Input: people = [3,5,3,4], limit = 5
 * Output: 4
 * Explanation: 4 boats (3), (3), (4), (5)
 *
 * Constraints:
 *   - 1 <= people.length <= 5 * 10^4
 *   - 1 <= people[i] <= limit <= 3 * 10^4
 */
public class Q12_BoatsToSavePeople {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int numRescueBoats(int[] people, int limit) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("881. Boats to Save People");

        tester.check("people = [1,2], limit = 3", "1", () -> {
            int[] people = new int[]{1, 2};
            int limit = 3;
            return new Solution().numRescueBoats(people, limit);
        });
        tester.check("people = [3,2,2,1], limit = 3", "3", () -> {
            int[] people = new int[]{3, 2, 2, 1};
            int limit = 3;
            return new Solution().numRescueBoats(people, limit);
        });
        tester.check("people = [3,5,3,4], limit = 5", "4", () -> {
            int[] people = new int[]{3, 5, 3, 4};
            int limit = 5;
            return new Solution().numRescueBoats(people, limit);
        });

        tester.done();
    }
}
