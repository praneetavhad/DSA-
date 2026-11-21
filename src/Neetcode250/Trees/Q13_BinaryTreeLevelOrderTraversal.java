package Neetcode250.Trees;

import Neetcode250.common.*;
import java.util.*;

/*
 * 102. Binary Tree Level Order Traversal   [Medium]
 * LeetCode: https://leetcode.com/problems/binary-tree-level-order-traversal/
 * NeetCode: https://neetcode.io/problems/level-order-traversal-of-binary-tree
 *
 * Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from
 * left to right, level by level).
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2021/02/19/tree1.jpg]
 * Input: root = [3,9,20,null,null,15,7]
 * Output: [[3],[9,20],[15,7]]
 *
 * Example 2:
 * Input: root = [1]
 * Output: [[1]]
 *
 * Example 3:
 * Input: root = []
 * Output: []
 *
 * Constraints:
 *   - The number of nodes in the tree is in the range [0, 2000].
 *   - -1000 <= Node.val <= 1000
 */
public class Q13_BinaryTreeLevelOrderTraversal {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("102. Binary Tree Level Order Traversal");

        tester.check("root = [3,9,20,null,null,15,7]", "[[3],[9,20],[15,7]]", () -> {
            TreeNode root = P.tree("[3,9,20,null,null,15,7]");
            return new Solution().levelOrder(root);
        });
        tester.check("root = [1]", "[[1]]", () -> {
            TreeNode root = P.tree("[1]");
            return new Solution().levelOrder(root);
        });
        tester.check("root = []", "[]", () -> {
            TreeNode root = P.tree("[]");
            return new Solution().levelOrder(root);
        });

        tester.done();
    }
}
