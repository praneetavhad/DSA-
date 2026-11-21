package Neetcode250.LinkedList;

import Neetcode250.common.*;
import java.util.*;

/*
 * 25. Reverse Nodes in k-Group   [Hard]
 * LeetCode: https://leetcode.com/problems/reverse-nodes-in-k-group/
 * NeetCode: https://neetcode.io/problems/reverse-nodes-in-k-group
 *
 * Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified
 * list.
 *
 * k is a positive integer and is less than or equal to the length of the linked list. If the number of
 * nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.
 *
 * You may not alter the values in the list's nodes, only nodes themselves may be changed.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2020/10/03/reverse_ex1.jpg]
 * Input: head = [1,2,3,4,5], k = 2
 * Output: [2,1,4,3,5]
 *
 * Example 2:
 * [image: https://assets.leetcode.com/uploads/2020/10/03/reverse_ex2.jpg]
 * Input: head = [1,2,3,4,5], k = 3
 * Output: [3,2,1,4,5]
 *
 * Constraints:
 *   - The number of nodes in the list is n.
 *   - 1 <= k <= n <= 5000
 *   - 0 <= Node.val <= 1000
 *
 * Follow-up: Can you solve the problem in O(1) extra memory space?
 */
public class Q14_ReverseNodesInKGroup {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public ListNode reverseKGroup(ListNode head, int k) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("25. Reverse Nodes in k-Group");

        tester.check("head = [1,2,3,4,5], k = 2", "[2,1,4,3,5]", () -> {
            ListNode head = P.list("[1,2,3,4,5]");
            int k = 2;
            return new Solution().reverseKGroup(head, k);
        });
        tester.check("head = [1,2,3,4,5], k = 3", "[3,2,1,4,5]", () -> {
            ListNode head = P.list("[1,2,3,4,5]");
            int k = 3;
            return new Solution().reverseKGroup(head, k);
        });

        tester.done();
    }
}
