package Neetcode250.Trees;

import Neetcode250.common.*;
import java.util.*;

/*
 * 110. Balanced Binary Tree   [Easy]
 * LeetCode: https://leetcode.com/problems/balanced-binary-tree/
 * NeetCode: https://neetcode.io/problems/balanced-binary-tree
 *
 * Given a binary tree, determine if it is height-balanced.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2020/10/06/balance_1.jpg]
 * Input: root = [3,9,20,null,null,15,7]
 * Output: true
 *
 * Example 2:
 * [image: https://assets.leetcode.com/uploads/2020/10/06/balance_2.jpg]
 * Input: root = [1,2,2,3,3,null,null,4,4]
 * Output: false
 *
 * Example 3:
 * Input: root = []
 * Output: true
 *
 * Constraints:
 *   - The number of nodes in the tree is in the range [0, 5000].
 *   - -10^4 <= Node.val <= 10^4
 */
public class Q07_BalancedBinaryTree {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public boolean isBalanced(TreeNode root) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("110. Balanced Binary Tree");

        tester.check("root = [3,9,20,null,null,15,7]", "true", () -> {
            TreeNode root = P.tree("[3,9,20,null,null,15,7]");
            return new Solution().isBalanced(root);
        });
        tester.check("root = [1,2,2,3,3,null,null,4,4]", "false", () -> {
            TreeNode root = P.tree("[1,2,2,3,3,null,null,4,4]");
            return new Solution().isBalanced(root);
        });
        tester.check("root = []", "true", () -> {
            TreeNode root = P.tree("[]");
            return new Solution().isBalanced(root);
        });

        tester.done();
    }
}
