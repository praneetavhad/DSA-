package Neetcode250.Trees;

import Neetcode250.common.*;
import java.util.*;

/*
 * 104. Maximum Depth of Binary Tree   [Easy]
 * LeetCode: https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * NeetCode: https://neetcode.io/problems/depth-of-binary-tree
 *
 * Given the root of a binary tree, return its maximum depth.
 *
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down
 * to the farthest leaf node.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2020/11/26/tmp-tree.jpg]
 * Input: root = [3,9,20,null,null,15,7]
 * Output: 3
 *
 * Example 2:
 * Input: root = [1,null,2]
 * Output: 2
 *
 * Constraints:
 *   - The number of nodes in the tree is in the range [0, 10^4].
 *   - -100 <= Node.val <= 100
 */
public class Q05_MaximumDepthOfBinaryTree {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int maxDepth(TreeNode root) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("104. Maximum Depth of Binary Tree");

        tester.check("root = [3,9,20,null,null,15,7]", "3", () -> {
            TreeNode root = P.tree("[3,9,20,null,null,15,7]");
            return new Solution().maxDepth(root);
        });
        tester.check("root = [1,null,2]", "2", () -> {
            TreeNode root = P.tree("[1,null,2]");
            return new Solution().maxDepth(root);
        });

        tester.done();
    }
}
