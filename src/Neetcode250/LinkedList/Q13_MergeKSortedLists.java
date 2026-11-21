package Neetcode250.LinkedList;

import Neetcode250.common.*;
import java.util.*;

/*
 * 23. Merge k Sorted Lists   [Hard]
 * LeetCode: https://leetcode.com/problems/merge-k-sorted-lists/
 * NeetCode: https://neetcode.io/problems/merge-k-sorted-linked-lists
 *
 * You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
 *
 * Merge all the linked-lists into one sorted linked-list and return it.
 *
 * Example 1:
 * Input: lists = [[1,4,5],[1,3,4],[2,6]]
 * Output: [1,1,2,3,4,4,5,6]
 * Explanation: The linked-lists are:
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * merging them into one sorted linked list:
 * 1->1->2->3->4->4->5->6
 *
 * Example 2:
 * Input: lists = []
 * Output: []
 *
 * Example 3:
 * Input: lists = [[]]
 * Output: []
 *
 * Constraints:
 *   - k == lists.length
 *   - 0 <= k <= 10^4
 *   - 0 <= lists[i].length <= 500
 *   - -10^4 <= lists[i][j] <= 10^4
 *   - lists[i] is sorted in ascending order.
 *   - The sum of lists[i].length will not exceed 10^4.
 */
public class Q13_MergeKSortedLists {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("23. Merge k Sorted Lists");

        tester.check("lists = [[1,4,5],[1,3,4],[2,6]]", "[1,1,2,3,4,4,5,6]", () -> {
            ListNode[] lists = P.lists("[[1,4,5],[1,3,4],[2,6]]");
            return new Solution().mergeKLists(lists);
        });
        tester.check("lists = []", "[]", () -> {
            ListNode[] lists = P.lists("[]");
            return new Solution().mergeKLists(lists);
        });
        tester.check("lists = [[]]", "[]", () -> {
            ListNode[] lists = P.lists("[[]]");
            return new Solution().mergeKLists(lists);
        });

        tester.done();
    }
}
