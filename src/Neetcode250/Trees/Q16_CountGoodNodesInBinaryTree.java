package Neetcode250.Trees;

import Neetcode250.common.*;
import java.util.*;

/*
 * 1448. Count Good Nodes in Binary Tree   [Medium]
 * LeetCode: https://leetcode.com/problems/count-good-nodes-in-binary-tree/
 * NeetCode: https://neetcode.io/problems/count-good-nodes-in-binary-tree
 *
 * Given a binary tree root, a node X in the tree is named good if in the path from root to X there are
 * no nodes with a value greater than X.
 *
 * Return the number of good nodes in the binary tree.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2020/04/02/test_sample_1.png]
 * Input: root = [3,1,4,3,null,1,5]
 * Output: 4
 * Explanation: Nodes in blue are good.
 * Root Node (3) is always a good node.
 * Node 4 -> (3,4) is the maximum value in the path starting from the root.
 * Node 5 -> (3,4,5) is the maximum value in the path
 * Node 3 -> (3,1,3) is the maximum value in the path.
 *
 * Example 2:
 * [image: https://assets.leetcode.com/uploads/2020/04/02/test_sample_2.png]
 * Input: root = [3,3,null,4,2]
 * Output: 3
 * Explanation: Node 2 -> (3, 3, 2) is not good, because "3" is higher than it.
 *
 * Example 3:
 * Input: root = [1]
 * Output: 1
 * Explanation: Root is considered as good.
 *
 * Constraints:
 *   - The number of nodes in the binary tree is in the range [1, 10^5].
 *   - Each node's value is between [-10^4, 10^4].
 */
public class Q16_CountGoodNodesInBinaryTree {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int goodNodes(TreeNode root) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("1448. Count Good Nodes in Binary Tree");

        tester.check("root = [3,1,4,3,null,1,5]", "4", () -> {
            TreeNode root = P.tree("[3,1,4,3,null,1,5]");
            return new Solution().goodNodes(root);
        });
        tester.check("root = [3,3,null,4,2]", "3", () -> {
            TreeNode root = P.tree("[3,3,null,4,2]");
            return new Solution().goodNodes(root);
        });
        tester.check("root = [1]", "1", () -> {
            TreeNode root = P.tree("[1]");
            return new Solution().goodNodes(root);
        });

        tester.done();
    }
}
