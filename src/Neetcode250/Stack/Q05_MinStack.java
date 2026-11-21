package Neetcode250.Stack;

import Neetcode250.common.*;
import java.util.*;

/*
 * 155. Min Stack   [Medium]
 * LeetCode: https://leetcode.com/problems/min-stack/
 * NeetCode: https://neetcode.io/problems/minimum-stack
 *
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * Implement the MinStack class:
 *   - MinStack() initializes the stack object.
 *   - void push(int value) pushes the element value onto the stack.
 *   - void pop() removes the element on the top of the stack.
 *   - int top() gets the top element of the stack.
 *   - int getMin() retrieves the minimum element in the stack.
 *
 * You must implement a solution with O(1) time complexity for each function.
 *
 * Example 1:
 * Input
 * ["MinStack","push","push","push","getMin","pop","top","getMin"]
 * [[],[-2],[0],[-3],[],[],[],[]]
 * Output
 * [null,null,null,null,-3,null,0,-2]
 * Explanation
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin(); // return -3
 * minStack.pop();
 * minStack.top();    // return 0
 * minStack.getMin(); // return -2
 *
 * Constraints:
 *   - -2^31 <= val <= 2^31 - 1
 *   - Methods pop, top and getMin operations will always be called on non-empty stacks.
 *   - At most 3 * 10^4 calls will be made to push, pop, top, and getMin.
 */
public class Q05_MinStack {

    // Write your solution here - same code you would submit on LeetCode.
    static class MinStack {

        public MinStack() {
            // TODO: initialize your data structure here
        }

        public void push(int value) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }

        public void pop() {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }

        public int top() {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }

        public int getMin() {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("155. Min Stack");

        tester.check("[\"MinStack\",\"push\",\"push\",\"push\",\"getMin\",\"pop\",\"top\",\"getMin\"] [[],[-2],[0],[-3],[],[],[],[]]", "[null,null,null,null,-3,null,0,-2]", () -> {
            List<Object> out = new ArrayList<>();
            MinStack obj = new MinStack();
            out.add(null);
            obj.push(-2); out.add(null);
            obj.push(0); out.add(null);
            obj.push(-3); out.add(null);
            out.add(obj.getMin());
            obj.pop(); out.add(null);
            out.add(obj.top());
            out.add(obj.getMin());
            return out;
        });

        tester.done();
    }
}
