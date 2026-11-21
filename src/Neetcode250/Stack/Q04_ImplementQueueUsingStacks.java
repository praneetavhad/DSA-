package Neetcode250.Stack;

import Neetcode250.common.*;
import java.util.*;

/*
 * 232. Implement Queue using Stacks   [Easy]
 * LeetCode: https://leetcode.com/problems/implement-queue-using-stacks/
 * NeetCode: https://neetcode.io/problems/implement-queue-using-stacks
 *
 * Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should
 * support all the functions of a normal queue (push, peek, pop, and empty).
 *
 * Implement the MyQueue class:
 *   - void push(int x) Pushes element x to the back of the queue.
 *   - int pop() Removes the element from the front of the queue and returns it.
 *   - int peek() Returns the element at the front of the queue.
 *   - boolean empty() Returns true if the queue is empty, false otherwise.
 *
 * Notes:
 *   - You must use only standard operations of a stack, which means only push to top, peek/pop from
 *     top, size, and is empty operations are valid.
 *   - Depending on your language, the stack may not be supported natively. You may simulate a stack
 *     using a list or deque (double-ended queue) as long as you use only a stack's standard
 *     operations.
 *
 * Example 1:
 * Input
 * ["MyQueue", "push", "push", "peek", "pop", "empty"]
 * [[], [1], [2], [], [], []]
 * Output
 * [null, null, null, 1, 1, false]
 * Explanation
 * MyQueue myQueue = new MyQueue();
 * myQueue.push(1); // queue is: [1]
 * myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
 * myQueue.peek(); // return 1
 * myQueue.pop(); // return 1, queue is [2]
 * myQueue.empty(); // return false
 *
 * Constraints:
 *   - 1 <= x <= 9
 *   - At most 100 calls will be made to push, pop, peek, and empty.
 *   - All the calls to pop and peek are valid.
 *
 * Follow-up: Can you implement the queue such that each operation is amortized O(1) time complexity?
 * In other words, performing n operations will take overall O(n) time even if one of those operations
 * may take longer.
 */
public class Q04_ImplementQueueUsingStacks {

    // Write your solution here - same code you would submit on LeetCode.
    static class MyQueue {

        public MyQueue() {
            // TODO: initialize your data structure here
        }

        public void push(int x) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }

        public int pop() {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }

        public int peek() {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }

        public boolean empty() {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("232. Implement Queue using Stacks");

        tester.check("[\"MyQueue\",\"push\",\"push\",\"peek\",\"pop\",\"empty\"] [[],[1],[2],[],[],[]]", "[null, null, null, 1, 1, false]", () -> {
            List<Object> out = new ArrayList<>();
            MyQueue obj = new MyQueue();
            out.add(null);
            obj.push(1); out.add(null);
            obj.push(2); out.add(null);
            out.add(obj.peek());
            out.add(obj.pop());
            out.add(obj.empty());
            return out;
        });

        tester.done();
    }
}
