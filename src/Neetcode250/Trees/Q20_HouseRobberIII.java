package Neetcode250.Trees;

import Neetcode250.common.*;
import java.util.*;

/*
 * 337. House Robber III   [Medium]
 * LeetCode: https://leetcode.com/problems/house-robber-iii/
 * NeetCode: https://neetcode.io/problems/house-robber-iii
 *
 * The thief has found himself a new place for his thievery again. There is only one entrance to this
 * area, called root.
 *
 * Besides the root, each house has one and only one parent house. After a tour, the smart thief
 * realized that all houses in this place form a binary tree. It will automatically contact the police
 * if two directly-linked houses were broken into on the same night.
 *
 * Given the root of the binary tree, return the maximum amount of money the thief can rob without
 * alerting the police.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2021/03/10/rob1-tree.jpg]
 * Input: root = [3,2,3,null,3,null,1]
 * Output: 7
 * Explanation: Maximum amount of money the thief can rob = 3 + 3 + 1 = 7.
 *
 * Example 2:
 * [image: https://assets.leetcode.com/uploads/2021/03/10/rob2-tree.jpg]
 * Input: root = [3,4,5,1,3,null,1]
 * Output: 9
 * Explanation: Maximum amount of money the thief can rob = 4 + 5 = 9.
 *
 * Constraints:
 *   - The number of nodes in the tree is in the range [1, 10^4].
 *   - 0 <= Node.val <= 10^4
 */
public class Q20_HouseRobberIII {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int rob(TreeNode root) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("337. House Robber III");

        tester.check("root = [3,2,3,null,3,null,1]", "7", () -> {
            TreeNode root = P.tree("[3,2,3,null,3,null,1]");
            return new Solution().rob(root);
        });
        tester.check("root = [3,4,5,1,3,null,1]", "9", () -> {
            TreeNode root = P.tree("[3,4,5,1,3,null,1]");
            return new Solution().rob(root);
        });

        tester.done();
    }
}
