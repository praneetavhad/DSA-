package Neetcode250.Trees;

import Neetcode250.common.*;
import java.util.*;

/*
 * 124. Binary Tree Maximum Path Sum   [Hard]
 * LeetCode: https://leetcode.com/problems/binary-tree-maximum-path-sum/
 * NeetCode: https://neetcode.io/problems/binary-tree-maximum-path-sum
 *
 * A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has
 * an edge connecting them. A node can only appear in the sequence at most once. Note that the path
 * does not need to pass through the root.
 *
 * The path sum of a path is the sum of the node's values in the path.
 *
 * Given the root of a binary tree, return the maximum path sum of any non-empty path.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2020/10/13/exx1.jpg]
 * Input: root = [1,2,3]
 * Output: 6
 * Explanation: The optimal path is 2 -> 1 -> 3 with a path sum of 2 + 1 + 3 = 6.
 *
 * Example 2:
 * [image: https://assets.leetcode.com/uploads/2020/10/13/exx2.jpg]
 * Input: root = [-10,9,20,null,null,15,7]
 * Output: 42
 * Explanation: The optimal path is 15 -> 20 -> 7 with a path sum of 15 + 20 + 7 = 42.
 *
 * Constraints:
 *   - The number of nodes in the tree is in the range [1, 3 * 10^4].
 *   - -1000 <= Node.val <= 1000
 */
public class Q22_BinaryTreeMaximumPathSum {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int maxPathSum(TreeNode root) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("124. Binary Tree Maximum Path Sum");

        tester.check("root = [1,2,3]", "6", () -> {
            TreeNode root = P.tree("[1,2,3]");
            return new Solution().maxPathSum(root);
        });
        tester.check("root = [-10,9,20,null,null,15,7]", "42", () -> {
            TreeNode root = P.tree("[-10,9,20,null,null,15,7]");
            return new Solution().maxPathSum(root);
        });

        tester.done();
    }
}
