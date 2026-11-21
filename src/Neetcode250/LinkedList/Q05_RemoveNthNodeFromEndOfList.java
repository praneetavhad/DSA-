package Neetcode250.LinkedList;

import Neetcode250.common.*;
import java.util.*;

/*
 * 19. Remove Nth Node From End of List   [Medium]
 * LeetCode: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 * NeetCode: https://neetcode.io/problems/remove-node-from-end-of-linked-list
 *
 * Given the head of a linked list, remove the n^th node from the end of the list and return its head.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2020/10/03/remove_ex1.jpg]
 * Input: head = [1,2,3,4,5], n = 2
 * Output: [1,2,3,5]
 *
 * Example 2:
 * Input: head = [1], n = 1
 * Output: []
 *
 * Example 3:
 * Input: head = [1,2], n = 1
 * Output: [1]
 *
 * Constraints:
 *   - The number of nodes in the list is sz.
 *   - 1 <= sz <= 30
 *   - 0 <= Node.val <= 100
 *   - 1 <= n <= sz
 *
 * Follow up: Could you do this in one pass?
 */
public class Q05_RemoveNthNodeFromEndOfList {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("19. Remove Nth Node From End of List");

        tester.check("head = [1,2,3,4,5], n = 2", "[1,2,3,5]", () -> {
            ListNode head = P.list("[1,2,3,4,5]");
            int n = 2;
            return new Solution().removeNthFromEnd(head, n);
        });
        tester.check("head = [1], n = 1", "[]", () -> {
            ListNode head = P.list("[1]");
            int n = 1;
            return new Solution().removeNthFromEnd(head, n);
        });
        tester.check("head = [1,2], n = 1", "[1]", () -> {
            ListNode head = P.list("[1,2]");
            int n = 1;
            return new Solution().removeNthFromEnd(head, n);
        });

        tester.done();
    }
}
