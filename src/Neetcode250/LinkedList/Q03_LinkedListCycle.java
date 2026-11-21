package Neetcode250.LinkedList;

import Neetcode250.common.*;
import java.util.*;

/*
 * 141. Linked List Cycle   [Easy]
 * LeetCode: https://leetcode.com/problems/linked-list-cycle/
 * NeetCode: https://neetcode.io/problems/linked-list-cycle-detection
 *
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 *
 * There is a cycle in a linked list if there is some node in the list that can be reached again by
 * continuously following the next pointer. Internally, pos is used to denote the index of the node
 * that tail's next pointer is connected to. Note that pos is not passed as a parameter.
 *
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist.png]
 * Input: head = [3,2,0,-4], pos = 1
 * Output: true
 * Explanation: There is a cycle in the linked list, where the tail connects to the 1st node
 * (0-indexed).
 *
 * Example 2:
 * [image: https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist_test2.png]
 * Input: head = [1,2], pos = 0
 * Output: true
 * Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
 *
 * Example 3:
 * [image: https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist_test3.png]
 * Input: head = [1], pos = -1
 * Output: false
 * Explanation: There is no cycle in the linked list.
 *
 * Constraints:
 *   - The number of the nodes in the list is in the range [0, 10^4].
 *   - -10^5 <= Node.val <= 10^5
 *   - pos is -1 or a valid index in the linked-list.
 *
 * Follow up: Can you solve it using O(1) (i.e. constant) memory?
 */
public class Q03_LinkedListCycle {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public boolean hasCycle(ListNode head) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("141. Linked List Cycle");

        tester.check("head = [3,2,0,-4], pos = 1", "true", () -> {
            ListNode head = P.cycle("[3,2,0,-4]", 1); // tail -> node at pos
            return new Solution().hasCycle(head);
        });
        tester.check("head = [1,2], pos = 0", "true", () -> {
            ListNode head = P.cycle("[1,2]", 0); // tail -> node at pos
            return new Solution().hasCycle(head);
        });
        tester.check("head = [1], pos = -1", "false", () -> {
            ListNode head = P.cycle("[1]", -1); // tail -> node at pos
            return new Solution().hasCycle(head);
        });

        tester.done();
    }
}
