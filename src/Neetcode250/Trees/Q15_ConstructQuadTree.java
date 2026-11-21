package Neetcode250.Trees;

import Neetcode250.common.*;
import java.util.*;

/*
 * 427. Construct Quad Tree   [Medium]
 * LeetCode: https://leetcode.com/problems/construct-quad-tree/
 * NeetCode: https://neetcode.io/problems/construct-quad-tree
 *
 * Given a n * n matrix grid of 0's and 1's only. We want to represent grid with a Quad-Tree.
 *
 * Return the root of the Quad-Tree representing grid.
 *
 * A Quad-Tree is a tree data structure in which each internal node has exactly four children. Besides,
 * each node has two attributes:
 *   - val: True if the node represents a grid of 1's or False if the node represents a grid of 0's.
 *     Notice that you can assign the val to True or False when isLeaf is False, and both are accepted
 *     in the answer.
 *   - isLeaf: True if the node is a leaf node on the tree or False if the node has four children.
 *
 * class Node {
 *     public boolean val;
 *     public boolean isLeaf;
 *     public Node topLeft;
 *     public Node topRight;
 *     public Node bottomLeft;
 *     public Node bottomRight;
 * }
 *
 * We can construct a Quad-Tree from a two-dimensional area using the following steps:
 *   - If the current grid has the same value (i.e all 1's or all 0's) set isLeaf True and set val to
 *     the value of the grid and set the four children to Null and stop.
 *   - If the current grid has different values, set isLeaf to False and set val to any value and
 *     divide the current grid into four sub-grids as shown in the photo.
 *   - Recurse for each of the children with the proper sub-grid.
 *
 * [image: https://assets.leetcode.com/uploads/2020/02/11/new_top.png]
 *
 * If you want to know more about the Quad-Tree, you can refer to the wiki.
 *
 * Quad-Tree format:
 * You don't need to read this section for solving the problem. This is only if you want to understand
 * the output format here. The output represents the serialized format of a Quad-Tree using level order
 * traversal, where null signifies a path terminator where no node exists below.
 *
 * It is very similar to the serialization of the binary tree. The only difference is that the node is
 * represented as a list [isLeaf, val].
 *
 * If the value of isLeaf or val is True we represent it as 1 in the list [isLeaf, val] and if the
 * value of isLeaf or val is False we represent it as 0.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2020/02/11/grid1.png]
 * Input: grid = [[0,1],[1,0]]
 * Output: [[0,1],[1,0],[1,1],[1,1],[1,0]]
 * Explanation: The explanation of this example is shown below:
 * Notice that 0 represents False and 1 represents True in the photo representing the Quad-Tree.
 * [image: https://assets.leetcode.com/uploads/2020/02/12/e1tree.png]
 *
 * Example 2:
 * [image: https://assets.leetcode.com/uploads/2020/02/12/e2mat.png]
 * Input: grid =
 * [[1,1,1,1,0,0,0,0],[1,1,1,1,0,0,0,0],[1,1,1,1,1,1,1,1],[1,1,1,1,1,1,1,1],[1,1,1,1,0,0,0,0],[1,1,1,1,0,0,0,0],[1,1,1,1,0,0,0,0],[1,1,1,1,0,0,0,0]]
 * Output: [[0,1],[1,1],[0,1],[1,1],[1,0],null,null,null,null,[1,0],[1,0],[1,1],[1,1]]
 * Explanation: All values in the grid are not the same. We divide the grid into four sub-grids.
 * The topLeft, bottomLeft and bottomRight each has the same value.
 * The topRight have different values so we divide it into 4 sub-grids where each has the same value.
 * Explanation is shown in the photo below:
 * [image: https://assets.leetcode.com/uploads/2020/02/12/e2tree.png]
 *
 * Constraints:
 *   - n == grid.length == grid[i].length
 *   - n == 2^x where 0 <= x <= 6
 */
public class Q15_ConstructQuadTree {

    // Write your solution here - same code you would submit on LeetCode.
    // Definition for a QuadTree node (given by LeetCode).
    static class Node {
        public boolean val;
        public boolean isLeaf;
        public Node topLeft;
        public Node topRight;
        public Node bottomLeft;
        public Node bottomRight;

        public Node() {}

        public Node(boolean val, boolean isLeaf) {
            this.val = val;
            this.isLeaf = isLeaf;
        }

        public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = topLeft;
            this.topRight = topRight;
            this.bottomLeft = bottomLeft;
            this.bottomRight = bottomRight;
        }
    }

    static class Solution {
        public Node construct(int[][] grid) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // ---- test helper: LeetCode's level-order format [isLeaf, val] (internal nodes print val = 1) ----
    static List<Object> dump(Node root) {
        List<Object> out = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node n = q.poll();
            if (n == null) { out.add(null); continue; }
            out.add(Arrays.asList(n.isLeaf ? 1 : 0, (!n.isLeaf || n.val) ? 1 : 0));
            if (!n.isLeaf) { q.add(n.topLeft); q.add(n.topRight); q.add(n.bottomLeft); q.add(n.bottomRight); }
            else { q.add(null); q.add(null); q.add(null); q.add(null); }
        }
        while (!out.isEmpty() && out.get(out.size() - 1) == null) out.remove(out.size() - 1);
        return out;
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("427. Construct Quad Tree");

        tester.check("grid = [[0,1],[1,0]]", "[[0,1],[1,0],[1,1],[1,1],[1,0]]", () -> {
            int[][] grid = new int[][]{{0, 1}, {1, 0}};
            return dump(new Solution().construct(grid));
        });
        tester.check("grid = [[1,1,1,1,0,0,0,0],[1,1,1,1,0,0,0,0],[1,1,1,1,1,1,1,1],[1,1,1,1,1,1,1,1],[1,1,1,1,0,0,0,0],[1,1,1,1,0,0,0,0],[1,1,1,1,0,0,0,0],[1,1,1,1,0,0,0,0]]", "[[0,1],[1,1],[0,1],[1,1],[1,0],null,null,null,null,[1,0],[1,0],[1,1],[1,1]]", () -> {
            int[][] grid = new int[][]{{1, 1, 1, 1, 0, 0, 0, 0}, {1, 1, 1, 1, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 0, 0, 0, 0}, {1, 1, 1, 1, 0, 0, 0, 0}, {1, 1, 1, 1, 0, 0, 0, 0}, {1, 1, 1, 1, 0, 0, 0, 0}};
            return dump(new Solution().construct(grid));
        });

        tester.done();
    }
}
