package Neetcode250.Stack;

import Neetcode250.common.*;
import java.util.*;

/*
 * 225. Implement Stack using Queues   [Easy]
 * LeetCode: https://leetcode.com/problems/implement-stack-using-queues/
 * NeetCode: https://neetcode.io/problems/implement-stack-using-queues
 *
 * Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should
 * support all the functions of a normal stack (push, top, pop, and empty).
 *
 * Implement the MyStack class:
 *   - void push(int x) Pushes element x to the top of the stack.
 *   - int pop() Removes the element on the top of the stack and returns it.
 *   - int top() Returns the element on the top of the stack.
 *   - boolean empty() Returns true if the stack is empty, false otherwise.
 *
 * Notes:
 *   - You must use only standard operations of a queue, which means that only push to back, peek/pop
 *     from front, size and is empty operations are valid.
 *   - Depending on your language, the queue may not be supported natively. You may simulate a queue
 *     using a list or deque (double-ended queue) as long as you use only a queue's standard
 *     operations.
 *
 * Example 1:
 * Input
 * ["MyStack", "push", "push", "top", "pop", "empty"]
 * [[], [1], [2], [], [], []]
 * Output
 * [null, null, null, 2, 2, false]
 * Explanation
 * MyStack myStack = new MyStack();
 * myStack.push(1);
 * myStack.push(2);
 * myStack.top(); // return 2
 * myStack.pop(); // return 2
 * myStack.empty(); // return False
 *
 * Constraints:
 *   - 1 <= x <= 9
 *   - At most 100 calls will be made to push, pop, top, and empty.
 *   - All the calls to pop and top are valid.
 *
 * Follow-up: Can you implement the stack using only one queue?
 */
public class Q03_ImplementStackUsingQueues {

    // Write your solution here - same code you would submit on LeetCode.
    static class MyStack {

        public MyStack() {
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

        public int top() {
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
        Tester tester = new Tester("225. Implement Stack using Queues");

        tester.check("[\"MyStack\",\"push\",\"push\",\"top\",\"pop\",\"empty\"] [[],[1],[2],[],[],[]]", "[null, null, null, 2, 2, false]", () -> {
            List<Object> out = new ArrayList<>();
            MyStack obj = new MyStack();
            out.add(null);
            obj.push(1); out.add(null);
            obj.push(2); out.add(null);
            out.add(obj.top());
            out.add(obj.pop());
            out.add(obj.empty());
            return out;
        });

        tester.done();
    }
}
