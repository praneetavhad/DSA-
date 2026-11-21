package Neetcode250.Greedy;

import Neetcode250.common.*;
import java.util.*;

/*
 * 135. Candy   [Hard]
 * LeetCode: https://leetcode.com/problems/candy/
 * NeetCode: https://neetcode.io/problems/candy
 *
 * There are n children standing in a line.
 *
 * Each child is assigned a rating value given in the integer array ratings.
 *
 * You are giving candies to these children subjected to the following requirements:
 *   - Each child must have at least one candy.
 *   - Children with a higher rating get more candies than their neighbors.
 *
 * Return the minimum number of candies you need to have to distribute the candies to the children.
 *
 * Example 1:
 * Input: ratings = [1,0,2]
 * Output: 5
 * Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies
 * respectively.
 *
 * Example 2:
 * Input: ratings = [1,2,2]
 * Output: 4
 * Explanation: You can allocate to the first, second and third child with 1, 2, 1 candies
 * respectively.
 * The third child gets 1 candy because it satisfies the above two conditions.
 *
 * Constraints:
 *   - 1 <= n == ratings.length <= 5 * 10^4
 *   - 0 <= ratings[i] <= 5 * 10^4
 */
public class Q14_Candy {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int candy(int[] ratings) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("135. Candy");

        tester.check("ratings = [1,0,2]", "5", () -> {
            int[] ratings = new int[]{1, 0, 2};
            return new Solution().candy(ratings);
        });
        tester.check("ratings = [1,2,2]", "4", () -> {
            int[] ratings = new int[]{1, 2, 2};
            return new Solution().candy(ratings);
        });

        tester.done();
    }
}
