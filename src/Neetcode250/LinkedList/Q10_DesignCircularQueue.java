package Neetcode250.LinkedList;

import Neetcode250.common.*;
import java.util.*;

/*
 * 622. Design Circular Queue   [Medium]
 * LeetCode: https://leetcode.com/problems/design-circular-queue/
 * NeetCode: https://neetcode.io/problems/design-circular-queue
 *
 * Design your implementation of the circular queue. The circular queue is a linear data structure in
 * which the operations are performed based on FIFO (First In First Out) principle, and the last
 * position is connected back to the first position to make a circle. It is also called "Ring Buffer".
 *
 * One of the benefits of the circular queue is that we can make use of the spaces in front of the
 * queue. In a normal queue, once the queue becomes full, we cannot insert the next element even if
 * there is a space in front of the queue. But using the circular queue, we can use the space to store
 * new values.
 *
 * Implement the MyCircularQueue class:
 *   - MyCircularQueue(k) Initializes the object with the size of the queue to be k.
 *   - int Front() Gets the front item from the queue. If the queue is empty, return -1.
 *   - int Rear() Gets the last item from the queue. If the queue is empty, return -1.
 *   - boolean enQueue(int value) Inserts an element into the circular queue. Return true if the
 *     operation is successful.
 *   - boolean deQueue() Deletes an element from the circular queue. Return true if the operation is
 *     successful.
 *   - boolean isEmpty() Checks whether the circular queue is empty or not.
 *   - boolean isFull() Checks whether the circular queue is full or not.
 *
 * You must solve the problem without using the built-in queue data structure in your programming
 * language.
 *
 * Example 1:
 * Input
 * ["MyCircularQueue", "enQueue", "enQueue", "enQueue", "enQueue", "Rear", "isFull", "deQueue",
 * "enQueue", "Rear"]
 * [[3], [1], [2], [3], [4], [], [], [], [4], []]
 * Output
 * [null, true, true, true, false, 3, true, true, true, 4]
 * Explanation
 * MyCircularQueue myCircularQueue = new MyCircularQueue(3);
 * myCircularQueue.enQueue(1); // return True
 * myCircularQueue.enQueue(2); // return True
 * myCircularQueue.enQueue(3); // return True
 * myCircularQueue.enQueue(4); // return False
 * myCircularQueue.Rear();     // return 3
 * myCircularQueue.isFull();   // return True
 * myCircularQueue.deQueue();  // return True
 * myCircularQueue.enQueue(4); // return True
 * myCircularQueue.Rear();     // return 4
 *
 * Constraints:
 *   - 1 <= k <= 1000
 *   - 0 <= value <= 1000
 *   - At most 3000 calls will be made to enQueue, deQueue, Front, Rear, isEmpty, and isFull.
 */
public class Q10_DesignCircularQueue {

    // Write your solution here - same code you would submit on LeetCode.
    static class MyCircularQueue {

        public MyCircularQueue(int k) {
            // TODO: initialize your data structure here
        }

        public boolean enQueue(int value) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }

        public boolean deQueue() {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }

        public int Front() {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }

        public int Rear() {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }

        public boolean isEmpty() {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }

        public boolean isFull() {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("622. Design Circular Queue");

        tester.check("[\"MyCircularQueue\",\"enQueue\",\"enQueue\",\"enQueue\",\"enQueue\",\"Rear\",\"isFull\",\"deQueue\",\"enQueue\",\"Rear\"] [[3],[1],[2],[3],[4],[],[],[],[4],[]]", "[null, true, true, true, false, 3, true, true, true, 4]", () -> {
            List<Object> out = new ArrayList<>();
            MyCircularQueue obj = new MyCircularQueue(3);
            out.add(null);
            out.add(obj.enQueue(1));
            out.add(obj.enQueue(2));
            out.add(obj.enQueue(3));
            out.add(obj.enQueue(4));
            out.add(obj.Rear());
            out.add(obj.isFull());
            out.add(obj.deQueue());
            out.add(obj.enQueue(4));
            out.add(obj.Rear());
            return out;
        });

        tester.done();
    }
}
