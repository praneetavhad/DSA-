package Neetcode250.Trees;

import Neetcode250.common.*;
import java.util.*;

/*
 * 100. Same Tree   [Easy]
 * LeetCode: https://leetcode.com/problems/same-tree/
 * NeetCode: https://neetcode.io/problems/same-binary-tree
 *
 * Given the roots of two binary trees p and q, write a function to check if they are the same or not.
 *
 * Two binary trees are considered the same if they are structurally identical, and the nodes have the
 * same value.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2020/12/20/ex1.jpg]
 * Input: p = [1,2,3], q = [1,2,3]
 * Output: true
 *
 * Example 2:
 * [image: https://assets.leetcode.com/uploads/2020/12/20/ex2.jpg]
 * Input: p = [1,2], q = [1,null,2]
 * Output: false
 *
 * Example 3:
 * [image: https://assets.leetcode.com/uploads/2020/12/20/ex3.jpg]
 * Input: p = [1,2,1], q = [1,1,2]
 * Output: false
 *
 * Constraints:
 *   - The number of nodes in both trees is in the range [0, 100].
 *   - -10^4 <= Node.val <= 10^4
 */
public class Q08_SameTree {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("100. Same Tree");

        tester.check("p = [1,2,3], q = [1,2,3]", "true", () -> {
            TreeNode p = P.tree("[1,2,3]");
            TreeNode q = P.tree("[1,2,3]");
            return new Solution().isSameTree(p, q);
        });
        tester.check("p = [1,2], q = [1,null,2]", "false", () -> {
            TreeNode p = P.tree("[1,2]");
            TreeNode q = P.tree("[1,null,2]");
            return new Solution().isSameTree(p, q);
        });
        tester.check("p = [1,2,1], q = [1,1,2]", "false", () -> {
            TreeNode p = P.tree("[1,2,1]");
            TreeNode q = P.tree("[1,1,2]");
            return new Solution().isSameTree(p, q);
        });

        tester.done();
    }
}
