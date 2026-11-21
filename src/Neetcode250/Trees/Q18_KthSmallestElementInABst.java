package Neetcode250.Trees;

import Neetcode250.common.*;
import java.util.*;

/*
 * 230. Kth Smallest Element in a BST   [Medium]
 * LeetCode: https://leetcode.com/problems/kth-smallest-element-in-a-bst/
 * NeetCode: https://neetcode.io/problems/kth-smallest-integer-in-bst
 *
 * Given the root of a binary search tree, and an integer k, return the k^th smallest value (1-indexed)
 * of all the values of the nodes in the tree.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2021/01/28/kthtree1.jpg]
 * Input: root = [3,1,4,null,2], k = 1
 * Output: 1
 *
 * Example 2:
 * [image: https://assets.leetcode.com/uploads/2021/01/28/kthtree2.jpg]
 * Input: root = [5,3,6,2,4,null,null,1], k = 3
 * Output: 3
 *
 * Constraints:
 *   - The number of nodes in the tree is n.
 *   - 1 <= k <= n <= 10^4
 *   - 0 <= Node.val <= 10^4
 *
 * Follow up: If the BST is modified often (i.e., we can do insert and delete operations) and you need
 * to find the kth smallest frequently, how would you optimize?
 */
public class Q18_KthSmallestElementInABst {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int kthSmallest(TreeNode root, int k) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("230. Kth Smallest Element in a BST");

        tester.check("root = [3,1,4,null,2], k = 1", "1", () -> {
            TreeNode root = P.tree("[3,1,4,null,2]");
            int k = 1;
            return new Solution().kthSmallest(root, k);
        });
        tester.check("root = [5,3,6,2,4,null,null,1], k = 3", "3", () -> {
            TreeNode root = P.tree("[5,3,6,2,4,null,null,1]");
            int k = 3;
            return new Solution().kthSmallest(root, k);
        });

        tester.done();
    }
}
