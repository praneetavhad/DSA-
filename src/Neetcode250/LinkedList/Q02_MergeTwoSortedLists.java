package Neetcode250.LinkedList;

import Neetcode250.common.*;
import java.util.*;

/*
 * 21. Merge Two Sorted Lists   [Easy]
 * LeetCode: https://leetcode.com/problems/merge-two-sorted-lists/
 * NeetCode: https://neetcode.io/problems/merge-two-sorted-linked-lists
 *
 * You are given the heads of two sorted linked lists list1 and list2.
 *
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of
 * the first two lists.
 *
 * Return the head of the merged linked list.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2020/10/03/merge_ex1.jpg]
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 *
 * Example 2:
 * Input: list1 = [], list2 = []
 * Output: []
 *
 * Example 3:
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 *
 * Constraints:
 *   - The number of nodes in both lists is in the range [0, 50].
 *   - -100 <= Node.val <= 100
 *   - Both list1 and list2 are sorted in non-decreasing order.
 */
public class Q02_MergeTwoSortedLists {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("21. Merge Two Sorted Lists");

        tester.check("list1 = [1,2,4], list2 = [1,3,4]", "[1,1,2,3,4,4]", () -> {
            ListNode list1 = P.list("[1,2,4]");
            ListNode list2 = P.list("[1,3,4]");
            return new Solution().mergeTwoLists(list1, list2);
        });
        tester.check("list1 = [], list2 = []", "[]", () -> {
            ListNode list1 = P.list("[]");
            ListNode list2 = P.list("[]");
            return new Solution().mergeTwoLists(list1, list2);
        });
        tester.check("list1 = [], list2 = [0]", "[0]", () -> {
            ListNode list1 = P.list("[]");
            ListNode list2 = P.list("[0]");
            return new Solution().mergeTwoLists(list1, list2);
        });

        tester.done();
    }
}
