package Neetcode250.DynamicProgramming2D;

import Neetcode250.common.*;
import java.util.*;

/*
 * 1140. Stone Game II   [Medium]
 * LeetCode: https://leetcode.com/problems/stone-game-ii/
 * NeetCode: https://neetcode.io/problems/stone-game-ii
 *
 * Alice and Bob continue their games with piles of stones. There are a number of piles arranged in a
 * row, and each pile has a positive integer number of stones piles[i]. The objective of the game is to
 * end with the most stones.
 *
 * Alice and Bob take turns, with Alice starting first.
 *
 * On each player's turn, that player can take all the stones in the first X remaining piles, where 1
 * <= X <= 2M. Then, we set M = max(M, X). Initially, M = 1.
 *
 * The game continues until all the stones have been taken.
 *
 * Assuming Alice and Bob play optimally, return the maximum number of stones Alice can get.
 *
 * Example 1:
 * Input: piles = [2,7,9,4,4]
 * Output: 10
 * Explanation:
 *   - If Alice takes one pile at the beginning, Bob takes two piles, then Alice takes 2 piles again.
 *     Alice can get 2 + 4 + 4 = 10 stones in total.
 *   - If Alice takes two piles at the beginning, then Bob can take all three piles left. In this case,
 *     Alice get 2 + 7 = 9 stones in total.
 *
 * So we return 10 since it's larger.
 *
 * Example 2:
 * Input: piles = [1,2,3,4,5,100]
 * Output: 104
 *
 * Constraints:
 *   - 1 <= piles.length <= 100
 *   - 1 <= piles[i] <= 10^4
 */
public class Q11_StoneGameII {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int stoneGameII(int[] piles) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("1140. Stone Game II");

        tester.check("piles = [2,7,9,4,4]", "10", () -> {
            int[] piles = new int[]{2, 7, 9, 4, 4};
            return new Solution().stoneGameII(piles);
        });
        tester.check("piles = [1,2,3,4,5,100]", "104", () -> {
            int[] piles = new int[]{1, 2, 3, 4, 5, 100};
            return new Solution().stoneGameII(piles);
        });

        tester.done();
    }
}
