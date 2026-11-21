package Neetcode250.LinkedList;

import Neetcode250.common.*;
import java.util.*;

/*
 * 206. Reverse Linked List   [Easy]
 * LeetCode: https://leetcode.com/problems/reverse-linked-list/
 * NeetCode: https://neetcode.io/problems/reverse-a-linked-list
 *
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2021/02/19/rev1ex1.jpg]
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 *
 * Example 2:
 * [image: https://assets.leetcode.com/uploads/2021/02/19/rev1ex2.jpg]
 * Input: head = [1,2]
 * Output: [2,1]
 *
 * Example 3:
 * Input: head = []
 * Output: []
 *
 * Constraints:
 *   - The number of nodes in the list is the range [0, 5000].
 *   - -5000 <= Node.val <= 5000
 *
 * Follow up: A linked list can be reversed either iteratively or recursively. Could you implement
 * both?
 */
public class Q01_ReverseLinkedList {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public ListNode reverseList(ListNode head) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("206. Reverse Linked List");

        tester.check("head = [1,2,3,4,5]", "[5,4,3,2,1]", () -> {
            ListNode head = P.list("[1,2,3,4,5]");
            return new Solution().reverseList(head);
        });
        tester.check("head = [1,2]", "[2,1]", () -> {
            ListNode head = P.list("[1,2]");
            return new Solution().reverseList(head);
        });
        tester.check("head = []", "[]", () -> {
            ListNode head = P.list("[]");
            return new Solution().reverseList(head);
        });

        tester.done();
    }
}
