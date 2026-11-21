package Neetcode250.Trees;

import Neetcode250.common.*;
import java.util.*;

/*
 * 226. Invert Binary Tree   [Easy]
 * LeetCode: https://leetcode.com/problems/invert-binary-tree/
 * NeetCode: https://neetcode.io/problems/invert-a-binary-tree
 *
 * Given the root of a binary tree, invert the tree, and return its root.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2021/03/14/invert1-tree.jpg]
 * Input: root = [4,2,7,1,3,6,9]
 * Output: [4,7,2,9,6,3,1]
 *
 * Example 2:
 * [image: https://assets.leetcode.com/uploads/2021/03/14/invert2-tree.jpg]
 * Input: root = [2,1,3]
 * Output: [2,3,1]
 *
 * Example 3:
 * Input: root = []
 * Output: []
 *
 * Constraints:
 *   - The number of nodes in the tree is in the range [0, 100].
 *   - -100 <= Node.val <= 100
 */
public class Q04_InvertBinaryTree {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public TreeNode invertTree(TreeNode root) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("226. Invert Binary Tree");

        tester.check("root = [4,2,7,1,3,6,9]", "[4,7,2,9,6,3,1]", () -> {
            TreeNode root = P.tree("[4,2,7,1,3,6,9]");
            return new Solution().invertTree(root);
        });
        tester.check("root = [2,1,3]", "[2,3,1]", () -> {
            TreeNode root = P.tree("[2,1,3]");
            return new Solution().invertTree(root);
        });
        tester.check("root = []", "[]", () -> {
            TreeNode root = P.tree("[]");
            return new Solution().invertTree(root);
        });

        tester.done();
    }
}
