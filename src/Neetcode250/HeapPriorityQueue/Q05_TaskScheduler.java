package Neetcode250.HeapPriorityQueue;

import Neetcode250.common.*;
import java.util.*;

/*
 * 621. Task Scheduler   [Medium]
 * LeetCode: https://leetcode.com/problems/task-scheduler/
 * NeetCode: https://neetcode.io/problems/task-scheduling
 *
 * You are given an array of CPU tasks, each labeled with a letter from A to Z, and a number n. Each
 * CPU interval can be idle or allow the completion of one task. Tasks can be completed in any order,
 * but there's a constraint: there has to be a gap of at least n intervals between two tasks with the
 * same label.
 *
 * Return the minimum number of CPU intervals required to complete all tasks.
 *
 * Example 1:
 * Input: tasks = ["A","A","A","B","B","B"], n = 2
 * Output: 8
 * Explanation: A possible sequence is: A -> B -> idle -> A -> B -> idle -> A -> B.
 *
 * After completing task A, you must wait two intervals before doing A again. The same applies to task
 * B. In the 3^rd interval, neither A nor B can be done, so you idle. By the 4^th interval, you can do
 * A again as 2 intervals have passed.
 *
 * Example 2:
 * Input: tasks = ["A","C","A","B","D","B"], n = 1
 * Output: 6
 * Explanation: A possible sequence is: A -> B -> C -> D -> A -> B.
 *
 * With a cooling interval of 1, you can repeat a task after just one other task.
 *
 * Example 3:
 * Input: tasks = ["A","A","A", "B","B","B"], n = 3
 * Output: 10
 * Explanation: A possible sequence is: A -> B -> idle -> idle -> A -> B -> idle -> idle -> A -> B.
 *
 * There are only two types of tasks, A and B, which need to be separated by 3 intervals. This leads to
 * idling twice between repetitions of these tasks.
 *
 * Constraints:
 *   - 1 <= tasks.length <= 10^4
 *   - tasks[i] is an uppercase English letter.
 *   - 0 <= n <= 100
 */
public class Q05_TaskScheduler {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int leastInterval(char[] tasks, int n) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("621. Task Scheduler");
        // Answers are compared ignoring the order of the outer list (problem allows any order).

        tester.check("tasks = [\"A\",\"A\",\"A\",\"B\",\"B\",\"B\"], n = 2", "8", Tester.Order.ANY, () -> {
            char[] tasks = new char[]{'A', 'A', 'A', 'B', 'B', 'B'};
            int n = 2;
            return new Solution().leastInterval(tasks, n);
        });
        tester.check("tasks = [\"A\",\"C\",\"A\",\"B\",\"D\",\"B\"], n = 1", "6", Tester.Order.ANY, () -> {
            char[] tasks = new char[]{'A', 'C', 'A', 'B', 'D', 'B'};
            int n = 1;
            return new Solution().leastInterval(tasks, n);
        });
        tester.check("tasks = [\"A\",\"A\",\"A\", \"B\",\"B\",\"B\"], n = 3", "10", Tester.Order.ANY, () -> {
            char[] tasks = new char[]{'A', 'A', 'A', 'B', 'B', 'B'};
            int n = 3;
            return new Solution().leastInterval(tasks, n);
        });

        tester.done();
    }
}
