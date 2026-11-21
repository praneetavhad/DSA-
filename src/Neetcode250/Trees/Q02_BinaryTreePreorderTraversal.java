package Neetcode250.Trees;

import Neetcode250.common.*;
import java.util.*;

/*
 * 144. Binary Tree Preorder Traversal   [Easy]
 * LeetCode: https://leetcode.com/problems/binary-tree-preorder-traversal/
 * NeetCode: https://neetcode.io/problems/binary-tree-preorder-traversal
 *
 * Given the root of a binary tree, return the preorder traversal of its nodes' values.
 *
 * Example 1:
 * Input: root = [1,null,2,3]
 * Output: [1,2,3]
 * Explanation:
 * [image: https://assets.leetcode.com/uploads/2024/08/29/screenshot-2024-08-29-202743.png]
 *
 * Example 2:
 * Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
 * Output: [1,2,4,5,6,7,3,8,9]
 * Explanation:
 * [image: https://assets.leetcode.com/uploads/2024/08/29/tree_2.png]
 *
 * Example 3:
 * Input: root = []
 * Output: []
 *
 * Example 4:
 * Input: root = [1]
 * Output: [1]
 *
 * Constraints:
 *   - The number of nodes in the tree is in the range [0, 100].
 *   - -100 <= Node.val <= 100
 *
 * Follow up: Recursive solution is trivial, could you do it iteratively?
 */
public class Q02_BinaryTreePreorderTraversal {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public List<Integer> preorderTraversal(TreeNode root) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("144. Binary Tree Preorder Traversal");

        tester.check("root = [1,null,2,3]", "[1,2,3]", () -> {
            TreeNode root = P.tree("[1,null,2,3]");
            return new Solution().preorderTraversal(root);
        });
        tester.check("root = [1,2,3,4,5,null,8,null,null,6,7,9]", "[1,2,4,5,6,7,3,8,9]", () -> {
            TreeNode root = P.tree("[1,2,3,4,5,null,8,null,null,6,7,9]");
            return new Solution().preorderTraversal(root);
        });
        tester.check("root = []", "[]", () -> {
            TreeNode root = P.tree("[]");
            return new Solution().preorderTraversal(root);
        });
        tester.check("root = [1]", "[1]", () -> {
            TreeNode root = P.tree("[1]");
            return new Solution().preorderTraversal(root);
        });

        tester.done();
    }
}
