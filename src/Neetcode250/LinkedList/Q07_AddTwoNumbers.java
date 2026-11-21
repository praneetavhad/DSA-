package Neetcode250.LinkedList;

import Neetcode250.common.*;
import java.util.*;

/*
 * 2. Add Two Numbers   [Medium]
 * LeetCode: https://leetcode.com/problems/add-two-numbers/
 * NeetCode: https://neetcode.io/problems/add-two-numbers
 *
 * You are given two non-empty linked lists representing two non-negative integers. The digits are
 * stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and
 * return the sum as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2020/10/02/addtwonumber1.jpg]
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 *
 * Example 2:
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 *
 * Example 3:
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 *
 * Constraints:
 *   - The number of nodes in each linked list is in the range [1, 100].
 *   - 0 <= Node.val <= 9
 *   - It is guaranteed that the list represents a number that does not have leading zeros.
 */
public class Q07_AddTwoNumbers {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("2. Add Two Numbers");

        tester.check("l1 = [2,4,3], l2 = [5,6,4]", "[7,0,8]", () -> {
            ListNode l1 = P.list("[2,4,3]");
            ListNode l2 = P.list("[5,6,4]");
            return new Solution().addTwoNumbers(l1, l2);
        });
        tester.check("l1 = [0], l2 = [0]", "[0]", () -> {
            ListNode l1 = P.list("[0]");
            ListNode l2 = P.list("[0]");
            return new Solution().addTwoNumbers(l1, l2);
        });
        tester.check("l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]", "[8,9,9,9,0,0,0,1]", () -> {
            ListNode l1 = P.list("[9,9,9,9,9,9,9]");
            ListNode l2 = P.list("[9,9,9,9]");
            return new Solution().addTwoNumbers(l1, l2);
        });

        tester.done();
    }
}
