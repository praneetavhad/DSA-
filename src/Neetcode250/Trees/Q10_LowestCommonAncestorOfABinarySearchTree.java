package Neetcode250.Trees;

import Neetcode250.common.*;
import java.util.*;

/*
 * 235. Lowest Common Ancestor of a Binary Search Tree   [Medium]
 * LeetCode: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 * NeetCode: https://neetcode.io/problems/lowest-common-ancestor-in-binary-search-tree
 *
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in
 * the BST.
 *
 * According to the definition of LCA on Wikipedia: "The lowest common ancestor is defined between two
 * nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to
 * be a descendant of itself)."
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2018/12/14/binarysearchtree_improved.png]
 * Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
 * Output: 6
 * Explanation: The LCA of nodes 2 and 8 is 6.
 *
 * Example 2:
 * [image: https://assets.leetcode.com/uploads/2018/12/14/binarysearchtree_improved.png]
 * Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
 * Output: 2
 * Explanation: The LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to
 * the LCA definition.
 *
 * Example 3:
 * Input: root = [2,1], p = 2, q = 1
 * Output: 2
 *
 * Constraints:
 *   - The number of nodes in the tree is in the range [2, 10^5].
 *   - -10^9 <= Node.val <= 10^9
 *   - All Node.val are unique.
 *   - p != q
 *   - p and q will exist in the BST.
 */
public class Q10_LowestCommonAncestorOfABinarySearchTree {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("235. Lowest Common Ancestor of a Binary Search Tree");

        tester.check("root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8", "6", () -> {
            TreeNode root = P.tree("[6,2,8,0,4,7,9,null,null,3,5]");
            TreeNode p = P.find(root, 2);
            TreeNode q = P.find(root, 8);
            return new Solution().lowestCommonAncestor(root, p, q);
        });
        tester.check("root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4", "2", () -> {
            TreeNode root = P.tree("[6,2,8,0,4,7,9,null,null,3,5]");
            TreeNode p = P.find(root, 2);
            TreeNode q = P.find(root, 4);
            return new Solution().lowestCommonAncestor(root, p, q);
        });
        tester.check("root = [2,1], p = 2, q = 1", "2", () -> {
            TreeNode root = P.tree("[2,1]");
            TreeNode p = P.find(root, 2);
            TreeNode q = P.find(root, 1);
            return new Solution().lowestCommonAncestor(root, p, q);
        });

        tester.done();
    }
}
