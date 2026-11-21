package Neetcode250.Trees;

import Neetcode250.common.*;
import java.util.*;

/*
 * 199. Binary Tree Right Side View   [Medium]
 * LeetCode: https://leetcode.com/problems/binary-tree-right-side-view/
 * NeetCode: https://neetcode.io/problems/binary-tree-right-side-view
 *
 * Given the root of a binary tree, imagine yourself standing on the right side of it, return the
 * values of the nodes you can see ordered from top to bottom.
 *
 * Example 1:
 * Input: root = [1,2,3,null,5,null,4]
 * Output: [1,3,4]
 * Explanation:
 * [image: https://assets.leetcode.com/uploads/2024/11/24/tmpd5jn43fs-1.png]
 *
 * Example 2:
 * Input: root = [1,2,3,4,null,null,null,5]
 * Output: [1,3,4,5]
 * Explanation:
 * [image: https://assets.leetcode.com/uploads/2024/11/24/tmpkpe40xeh-1.png]
 *
 * Example 3:
 * Input: root = [1,null,3]
 * Output: [1,3]
 *
 * Example 4:
 * Input: root = []
 * Output: []
 *
 * Constraints:
 *   - The number of nodes in the tree is in the range [0, 100].
 *   - -100 <= Node.val <= 100
 */
public class Q14_BinaryTreeRightSideView {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public List<Integer> rightSideView(TreeNode root) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("199. Binary Tree Right Side View");

        tester.check("root = [1,2,3,null,5,null,4]", "[1,3,4]", () -> {
            TreeNode root = P.tree("[1,2,3,null,5,null,4]");
            return new Solution().rightSideView(root);
        });
        tester.check("root = [1,2,3,4,null,null,null,5]", "[1,3,4,5]", () -> {
            TreeNode root = P.tree("[1,2,3,4,null,null,null,5]");
            return new Solution().rightSideView(root);
        });
        tester.check("root = [1,null,3]", "[1,3]", () -> {
            TreeNode root = P.tree("[1,null,3]");
            return new Solution().rightSideView(root);
        });
        tester.check("root = []", "[]", () -> {
            TreeNode root = P.tree("[]");
            return new Solution().rightSideView(root);
        });

        tester.done();
    }
}
