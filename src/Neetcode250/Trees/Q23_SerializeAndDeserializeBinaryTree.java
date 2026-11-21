package Neetcode250.Trees;

import Neetcode250.common.*;
import java.util.*;

/*
 * 297. Serialize and Deserialize Binary Tree   [Hard]
 * LeetCode: https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
 * NeetCode: https://neetcode.io/problems/serialize-and-deserialize-binary-tree
 *
 * Serialization is the process of converting a data structure or object into a sequence of bits so
 * that it can be stored in a file or memory buffer, or transmitted across a network connection link to
 * be reconstructed later in the same or another computer environment.
 *
 * Design an algorithm to serialize and deserialize a binary tree. There is no restriction on how your
 * serialization/deserialization algorithm should work. You just need to ensure that a binary tree can
 * be serialized to a string and this string can be deserialized to the original tree structure.
 *
 * Clarification: The input/output format is the same as how LeetCode serializes a binary tree. You do
 * not necessarily need to follow this format, so please be creative and come up with different
 * approaches yourself.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2020/09/15/serdeser.jpg]
 * Input: root = [1,2,3,null,null,4,5]
 * Output: [1,2,3,null,null,4,5]
 *
 * Example 2:
 * Input: root = []
 * Output: []
 *
 * Constraints:
 *   - The number of nodes in the tree is in the range [0, 10^4].
 *   - -1000 <= Node.val <= 1000
 */
public class Q23_SerializeAndDeserializeBinaryTree {

    // Write your solution here - same code you would submit on LeetCode.
    static class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("297. Serialize and Deserialize Binary Tree");

        tester.check("root = [1,2,3,null,null,4,5]", "[1,2,3,null,null,4,5]", () -> {
            TreeNode root = P.tree("[1,2,3,null,null,4,5]");
            Codec ser = new Codec(), deser = new Codec();
            return deser.deserialize(ser.serialize(root));
        });
        tester.check("root = []", "[]", () -> {
            TreeNode root = P.tree("[]");
            Codec ser = new Codec(), deser = new Codec();
            return deser.deserialize(ser.serialize(root));
        });

        tester.done();
    }
}
