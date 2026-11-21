package Neetcode250.Trees;

import Neetcode250.common.*;
import java.util.*;

/*
 * 572. Subtree of Another Tree   [Easy]
 * LeetCode: https://leetcode.com/problems/subtree-of-another-tree/
 * NeetCode: https://neetcode.io/problems/subtree-of-a-binary-tree
 *
 * Given the roots of two binary trees root and subRoot, return true if there is a subtree of root with
 * the same structure and node values of subRoot and false otherwise.
 *
 * A subtree of a binary tree tree is a tree that consists of a node in tree and all of this node's
 * descendants. The tree tree could also be considered as a subtree of itself.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2021/04/28/subtree1-tree.jpg]
 * Input: root = [3,4,5,1,2], subRoot = [4,1,2]
 * Output: true
 *
 * Example 2:
 * [image: https://assets.leetcode.com/uploads/2021/04/28/subtree2-tree.jpg]
 * Input: root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2]
 * Output: false
 *
 * Constraints:
 *   - The number of nodes in the root tree is in the range [1, 2000].
 *   - The number of nodes in the subRoot tree is in the range [1, 1000].
 *   - -10^4 <= root.val <= 10^4
 *   - -10^4 <= subRoot.val <= 10^4
 */
public class Q09_SubtreeOfAnotherTree {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public boolean isSubtree(TreeNode root, TreeNode subRoot) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("572. Subtree of Another Tree");

        tester.check("root = [3,4,5,1,2], subRoot = [4,1,2]", "true", () -> {
            TreeNode root = P.tree("[3,4,5,1,2]");
            TreeNode subRoot = P.tree("[4,1,2]");
            return new Solution().isSubtree(root, subRoot);
        });
        tester.check("root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2]", "false", () -> {
            TreeNode root = P.tree("[3,4,5,1,2,null,null,null,null,0]");
            TreeNode subRoot = P.tree("[4,1,2]");
            return new Solution().isSubtree(root, subRoot);
        });

        tester.done();
    }
}
