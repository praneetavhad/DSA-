package Neetcode250.LinkedList;

import Neetcode250.common.*;
import java.util.*;

/*
 * 143. Reorder List   [Medium]
 * LeetCode: https://leetcode.com/problems/reorder-list/
 * NeetCode: https://neetcode.io/problems/reorder-linked-list
 *
 * You are given the head of a singly linked-list. The list can be represented as:
 * L_0 -> L_1 -> ... -> L_n - 1 -> L_n
 *
 * Reorder the list to be on the following form:
 * L_0 -> L_n -> L_1 -> L_n - 1 -> L_2 -> L_n - 2 -> ...
 *
 * You may not modify the values in the list's nodes. Only nodes themselves may be changed.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2021/03/04/reorder1linked-list.jpg]
 * Input: head = [1,2,3,4]
 * Output: [1,4,2,3]
 *
 * Example 2:
 * [image: https://assets.leetcode.com/uploads/2021/03/09/reorder2-linked-list.jpg]
 * Input: head = [1,2,3,4,5]
 * Output: [1,5,2,4,3]
 *
 * Constraints:
 *   - The number of nodes in the list is in the range [1, 5 * 10^4].
 *   - 1 <= Node.val <= 1000
 */
public class Q04_ReorderList {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public void reorderList(ListNode head) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("143. Reorder List");

        tester.check("head = [1,2,3,4]", "[1,4,2,3]", () -> {
            ListNode head = P.list("[1,2,3,4]");
            new Solution().reorderList(head);
            return head;
        });
        tester.check("head = [1,2,3,4,5]", "[1,5,2,4,3]", () -> {
            ListNode head = P.list("[1,2,3,4,5]");
            new Solution().reorderList(head);
            return head;
        });

        tester.done();
    }
}
