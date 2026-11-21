package Neetcode250.Trees;

import Neetcode250.common.*;
import java.util.*;

/*
 * 543. Diameter of Binary Tree   [Easy]
 * LeetCode: https://leetcode.com/problems/diameter-of-binary-tree/
 * NeetCode: https://neetcode.io/problems/binary-tree-diameter
 *
 * Given the root of a binary tree, return the length of the diameter of the tree.
 *
 * The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
 * This path may or may not pass through the root.
 *
 * The length of a path between two nodes is represented by the number of edges between them.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2021/03/06/diamtree.jpg]
 * Input: root = [1,2,3,4,5]
 * Output: 3
 * Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].
 *
 * Example 2:
 * Input: root = [1,2]
 * Output: 1
 *
 * Constraints:
 *   - The number of nodes in the tree is in the range [1, 10^4].
 *   - -100 <= Node.val <= 100
 */
public class Q06_DiameterOfBinaryTree {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int diameterOfBinaryTree(TreeNode root) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("543. Diameter of Binary Tree");

        tester.check("root = [1,2,3,4,5]", "3", () -> {
            TreeNode root = P.tree("[1,2,3,4,5]");
            return new Solution().diameterOfBinaryTree(root);
        });
        tester.check("root = [1,2]", "1", () -> {
            TreeNode root = P.tree("[1,2]");
            return new Solution().diameterOfBinaryTree(root);
        });

        tester.done();
    }
}
