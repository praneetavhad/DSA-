package Neetcode250.Trees;

import Neetcode250.common.*;
import java.util.*;

/*
 * 105. Construct Binary Tree from Preorder and Inorder Traversal   [Medium]
 * LeetCode: https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 * NeetCode: https://neetcode.io/problems/binary-tree-from-preorder-and-inorder-traversal
 *
 * Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary
 * tree and inorder is the inorder traversal of the same tree, construct and return the binary tree.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2021/02/19/tree.jpg]
 * Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
 * Output: [3,9,20,null,null,15,7]
 *
 * Example 2:
 * Input: preorder = [-1], inorder = [-1]
 * Output: [-1]
 *
 * Constraints:
 *   - 1 <= preorder.length <= 3000
 *   - inorder.length == preorder.length
 *   - -3000 <= preorder[i], inorder[i] <= 3000
 *   - preorder and inorder consist of unique values.
 *   - Each value of inorder also appears in preorder.
 *   - preorder is guaranteed to be the preorder traversal of the tree.
 *   - inorder is guaranteed to be the inorder traversal of the tree.
 */
public class Q19_ConstructBinaryTreeFromPreorderAndInorderTraversal {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("105. Construct Binary Tree from Preorder and Inorder Traversal");

        tester.check("preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]", "[3,9,20,null,null,15,7]", () -> {
            int[] preorder = new int[]{3, 9, 20, 15, 7};
            int[] inorder = new int[]{9, 3, 15, 20, 7};
            return new Solution().buildTree(preorder, inorder);
        });
        tester.check("preorder = [-1], inorder = [-1]", "[-1]", () -> {
            int[] preorder = new int[]{-1};
            int[] inorder = new int[]{-1};
            return new Solution().buildTree(preorder, inorder);
        });

        tester.done();
    }
}
