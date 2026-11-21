package Neetcode250.Trees;

import Neetcode250.common.*;
import java.util.*;

/*
 * 1325. Delete Leaves With a Given Value   [Medium]
 * LeetCode: https://leetcode.com/problems/delete-leaves-with-a-given-value/
 * NeetCode: https://neetcode.io/problems/delete-leaves-with-a-given-value
 *
 * Given a binary tree root and an integer target, delete all the leaf nodes with value target.
 *
 * Note that once you delete a leaf node with value target, if its parent node becomes a leaf node and
 * has the value target, it should also be deleted (you need to continue doing that until you cannot).
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2020/01/09/sample_1_1684.png]
 * Input: root = [1,2,3,2,null,2,4], target = 2
 * Output: [1,null,3,null,4]
 * Explanation: Leaf nodes in green with value (target = 2) are removed (Picture in left).
 * After removing, new nodes become leaf nodes with value (target = 2) (Picture in center).
 *
 * Example 2:
 * [image: https://assets.leetcode.com/uploads/2020/01/09/sample_2_1684.png]
 * Input: root = [1,3,3,3,2], target = 3
 * Output: [1,3,null,null,2]
 *
 * Example 3:
 * [image: https://assets.leetcode.com/uploads/2020/01/15/sample_3_1684.png]
 * Input: root = [1,2,null,2,null,2], target = 2
 * Output: [1]
 * Explanation: Leaf nodes in green with value (target = 2) are removed at each step.
 *
 * Constraints:
 *   - The number of nodes in the tree is in the range [1, 3000].
 *   - 1 <= Node.val, target <= 1000
 */
public class Q21_DeleteLeavesWithAGivenValue {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public TreeNode removeLeafNodes(TreeNode root, int target) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("1325. Delete Leaves With a Given Value");

        tester.check("root = [1,2,3,2,null,2,4], target = 2", "[1,null,3,null,4]", () -> {
            TreeNode root = P.tree("[1,2,3,2,null,2,4]");
            int target = 2;
            return new Solution().removeLeafNodes(root, target);
        });
        tester.check("root = [1,3,3,3,2], target = 3", "[1,3,null,null,2]", () -> {
            TreeNode root = P.tree("[1,3,3,3,2]");
            int target = 3;
            return new Solution().removeLeafNodes(root, target);
        });
        tester.check("root = [1,2,null,2,null,2], target = 2", "[1]", () -> {
            TreeNode root = P.tree("[1,2,null,2,null,2]");
            int target = 2;
            return new Solution().removeLeafNodes(root, target);
        });

        tester.done();
    }
}
