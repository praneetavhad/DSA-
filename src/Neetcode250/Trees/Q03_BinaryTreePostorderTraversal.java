package Neetcode250.Trees;

import Neetcode250.common.*;
import java.util.*;

/*
 * 145. Binary Tree Postorder Traversal   [Easy]
 * LeetCode: https://leetcode.com/problems/binary-tree-postorder-traversal/
 * NeetCode: https://neetcode.io/problems/binary-tree-postorder-traversal
 *
 * Given the root of a binary tree, return the postorder traversal of its nodes' values.
 *
 * Example 1:
 * Input: root = [1,null,2,3]
 * Output: [3,2,1]
 * Explanation:
 * [image: https://assets.leetcode.com/uploads/2024/08/29/screenshot-2024-08-29-202743.png]
 *
 * Example 2:
 * Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
 * Output: [4,6,7,5,2,9,8,3,1]
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
 *   - The number of the nodes in the tree is in the range [0, 100].
 *   - -100 <= Node.val <= 100
 *
 * Follow up: Recursive solution is trivial, could you do it iteratively?
 */
public class Q03_BinaryTreePostorderTraversal {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public List<Integer> postorderTraversal(TreeNode root) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("145. Binary Tree Postorder Traversal");

        tester.check("root = [1,null,2,3]", "[3,2,1]", () -> {
            TreeNode root = P.tree("[1,null,2,3]");
            return new Solution().postorderTraversal(root);
        });
        tester.check("root = [1,2,3,4,5,null,8,null,null,6,7,9]", "[4,6,7,5,2,9,8,3,1]", () -> {
            TreeNode root = P.tree("[1,2,3,4,5,null,8,null,null,6,7,9]");
            return new Solution().postorderTraversal(root);
        });
        tester.check("root = []", "[]", () -> {
            TreeNode root = P.tree("[]");
            return new Solution().postorderTraversal(root);
        });
        tester.check("root = [1]", "[1]", () -> {
            TreeNode root = P.tree("[1]");
            return new Solution().postorderTraversal(root);
        });

        tester.done();
    }
}
