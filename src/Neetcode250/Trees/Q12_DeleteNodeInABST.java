package Neetcode250.Trees;

import Neetcode250.common.*;
import java.util.*;

/*
 * 450. Delete Node in a BST   [Medium]
 * LeetCode: https://leetcode.com/problems/delete-node-in-a-bst/
 * NeetCode: https://neetcode.io/problems/delete-node-in-a-bst
 *
 * Given a root node reference of a BST and a key, delete the node with the given key in the BST.
 * Return the root node reference (possibly updated) of the BST.
 *
 * Basically, the deletion can be divided into two stages:
 *   - Search for a node to remove.
 *   - If the node is found, delete the node.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2020/09/04/del_node_1.jpg]
 * Input: root = [5,3,6,2,4,null,7], key = 3
 * Output: [5,4,6,2,null,null,7]
 * Explanation: Given key to delete is 3. So we find the node with value 3 and delete it.
 * One valid answer is [5,4,6,2,null,null,7], shown in the above BST.
 * Please notice that another valid answer is [5,2,6,null,4,null,7] and it's also accepted.
 * [image: https://assets.leetcode.com/uploads/2020/09/04/del_node_supp.jpg]
 *
 * Example 2:
 * Input: root = [5,3,6,2,4,null,7], key = 0
 * Output: [5,3,6,2,4,null,7]
 * Explanation: The tree does not contain a node with value = 0.
 *
 * Example 3:
 * Input: root = [], key = 0
 * Output: []
 *
 * Constraints:
 *   - The number of nodes in the tree is in the range [0, 10^4].
 *   - -10^5 <= Node.val <= 10^5
 *   - Each node has a unique value.
 *   - root is a valid binary search tree.
 *   - -10^5 <= key <= 10^5
 *
 * Follow up: Could you solve it with time complexity O(height of tree)?
 */
public class Q12_DeleteNodeInABST {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public TreeNode deleteNode(TreeNode root, int key) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("450. Delete Node in a BST");

        tester.check("root = [5,3,6,2,4,null,7], key = 3", "[5,4,6,2,null,null,7]", () -> {
            TreeNode root = P.tree("[5,3,6,2,4,null,7]");
            int key = 3;
            return new Solution().deleteNode(root, key);
        });
        tester.check("root = [5,3,6,2,4,null,7], key = 0", "[5,3,6,2,4,null,7]", () -> {
            TreeNode root = P.tree("[5,3,6,2,4,null,7]");
            int key = 0;
            return new Solution().deleteNode(root, key);
        });
        tester.check("root = [], key = 0", "[]", () -> {
            TreeNode root = P.tree("[]");
            int key = 0;
            return new Solution().deleteNode(root, key);
        });

        tester.done();
    }
}
