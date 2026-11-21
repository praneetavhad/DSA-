package Neetcode250.LinkedList;

import Neetcode250.common.*;
import java.util.*;

/*
 * 92. Reverse Linked List II   [Medium]
 * LeetCode: https://leetcode.com/problems/reverse-linked-list-ii/
 * NeetCode: https://neetcode.io/problems/reverse-linked-list-ii
 *
 * Given the head of a singly linked list and two integers left and right where left <= right, reverse
 * the nodes of the list from position left to position right, and return the reversed list.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2021/02/19/rev2ex2.jpg]
 * Input: head = [1,2,3,4,5], left = 2, right = 4
 * Output: [1,4,3,2,5]
 *
 * Example 2:
 * Input: head = [5], left = 1, right = 1
 * Output: [5]
 *
 * Constraints:
 *   - The number of nodes in the list is n.
 *   - 1 <= n <= 500
 *   - -500 <= Node.val <= 500
 *   - 1 <= left <= right <= n
 *
 * Follow up: Could you do it in one pass?
 */
public class Q09_ReverseLinkedListII {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public ListNode reverseBetween(ListNode head, int left, int right) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("92. Reverse Linked List II");

        tester.check("head = [1,2,3,4,5], left = 2, right = 4", "[1,4,3,2,5]", () -> {
            ListNode head = P.list("[1,2,3,4,5]");
            int left = 2;
            int right = 4;
            return new Solution().reverseBetween(head, left, right);
        });
        tester.check("head = [5], left = 1, right = 1", "[5]", () -> {
            ListNode head = P.list("[5]");
            int left = 1;
            int right = 1;
            return new Solution().reverseBetween(head, left, right);
        });

        tester.done();
    }
}
