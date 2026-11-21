package Neetcode250.Trees;

import Neetcode250.common.*;
import java.util.*;

/*
 * 701. Insert into a Binary Search Tree   [Medium]
 * LeetCode: https://leetcode.com/problems/insert-into-a-binary-search-tree/
 * NeetCode: https://neetcode.io/problems/insert-into-a-binary-search-tree
 *
 * You are given the root node of a binary search tree (BST) and a value to insert into the tree.
 * Return the root node of the BST after the insertion. It is guaranteed that the new value does not
 * exist in the original BST.
 *
 * Notice that there may exist multiple valid ways for the insertion, as long as the tree remains a BST
 * after insertion. You can return any of them.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2020/10/05/insertbst.jpg]
 * Input: root = [4,2,7,1,3], val = 5
 * Output: [4,2,7,1,3,5]
 * Explanation: Another accepted tree is:
 * [image: https://assets.leetcode.com/uploads/2020/10/05/bst.jpg]
 *
 * Example 2:
 * Input: root = [40,20,60,10,30,50,70], val = 25
 * Output: [40,20,60,10,30,50,70,null,null,25]
 *
 * Example 3:
 * Input: root = [4,2,7,1,3,null,null,null,null,null,null], val = 5
 * Output: [4,2,7,1,3,5]
 *
 * Constraints:
 *   - The number of nodes in the tree will be in the range [0, 10^4].
 *   - -10^8 <= Node.val <= 10^8
 *   - All the values Node.val are unique.
 *   - -10^8 <= val <= 10^8
 *   - It's guaranteed that val does not exist in the original BST.
 */
public class Q11_InsertIntoABinarySearchTree {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public TreeNode insertIntoBST(TreeNode root, int val) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("701. Insert into a Binary Search Tree");

        tester.check("root = [4,2,7,1,3], val = 5", "[4,2,7,1,3,5]", () -> {
            TreeNode root = P.tree("[4,2,7,1,3]");
            int val = 5;
            return new Solution().insertIntoBST(root, val);
        });
        tester.check("root = [40,20,60,10,30,50,70], val = 25", "[40,20,60,10,30,50,70,null,null,25]", () -> {
            TreeNode root = P.tree("[40,20,60,10,30,50,70]");
            int val = 25;
            return new Solution().insertIntoBST(root, val);
        });
        tester.check("root = [4,2,7,1,3,null,null,null,null,null,null], val = 5", "[4,2,7,1,3,5]", () -> {
            TreeNode root = P.tree("[4,2,7,1,3,null,null,null,null,null,null]");
            int val = 5;
            return new Solution().insertIntoBST(root, val);
        });

        tester.done();
    }
}
