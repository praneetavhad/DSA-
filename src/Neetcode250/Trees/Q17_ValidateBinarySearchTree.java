package Neetcode250.Trees;

import Neetcode250.common.*;
import java.util.*;

/*
 * 98. Validate Binary Search Tree   [Medium]
 * LeetCode: https://leetcode.com/problems/validate-binary-search-tree/
 * NeetCode: https://neetcode.io/problems/valid-binary-search-tree
 *
 * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
 *
 * A valid BST is defined as follows:
 *   - The left subtree of a node contains only nodes with keys strictly less than the node's key.
 *   - The right subtree of a node contains only nodes with keys strictly greater than the node's key.
 *   - Both the left and right subtrees must also be binary search trees.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2020/12/01/tree1.jpg]
 * Input: root = [2,1,3]
 * Output: true
 *
 * Example 2:
 * [image: https://assets.leetcode.com/uploads/2020/12/01/tree2.jpg]
 * Input: root = [5,1,4,null,null,3,6]
 * Output: false
 * Explanation: The root node's value is 5 but its right child's value is 4.
 *
 * Constraints:
 *   - The number of nodes in the tree is in the range [1, 10^4].
 *   - -2^31 <= Node.val <= 2^31 - 1
 */
public class Q17_ValidateBinarySearchTree {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public boolean isValidBST(TreeNode root) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("98. Validate Binary Search Tree");

        tester.check("root = [2,1,3]", "true", () -> {
            TreeNode root = P.tree("[2,1,3]");
            return new Solution().isValidBST(root);
        });
        tester.check("root = [5,1,4,null,null,3,6]", "false", () -> {
            TreeNode root = P.tree("[5,1,4,null,null,3,6]");
            return new Solution().isValidBST(root);
        });

        tester.done();
    }
}
