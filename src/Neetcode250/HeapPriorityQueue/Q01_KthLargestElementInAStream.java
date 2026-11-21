package Neetcode250.HeapPriorityQueue;

import Neetcode250.common.*;
import java.util.*;

/*
 * 703. Kth Largest Element in a Stream   [Easy]
 * LeetCode: https://leetcode.com/problems/kth-largest-element-in-a-stream/
 * NeetCode: https://neetcode.io/problems/kth-largest-integer-in-a-stream
 *
 * You are part of a university admissions office and need to keep track of the kth highest test score
 * from applicants in real-time. This helps to determine cut-off marks for interviews and admissions
 * dynamically as new applicants submit their scores.
 *
 * You are tasked to implement a class which, for a given integer k, maintains a stream of test scores
 * and continuously returns the kth highest test score after a new score has been submitted. More
 * specifically, we are looking for the kth highest score in the sorted list of all scores.
 *
 * Implement the KthLargest class:
 *   - KthLargest(int k, int[] nums) Initializes the object with the integer k and the stream of test
 *     scores nums.
 *   - int add(int val) Adds a new test score val to the stream and returns the element representing
 *     the k^th largest element in the pool of test scores so far.
 *
 * Example 1:
 * Input:
 * ["KthLargest", "add", "add", "add", "add", "add"]
 *
 * [[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]]
 * Output: [null, 4, 5, 5, 8, 8]
 * Explanation:
 * KthLargest kthLargest = new KthLargest(3, [4, 5, 8, 2]);
 *
 * kthLargest.add(3); // return 4
 *
 * kthLargest.add(5); // return 5
 *
 * kthLargest.add(10); // return 5
 *
 * kthLargest.add(9); // return 8
 *
 * kthLargest.add(4); // return 8
 *
 * Example 2:
 * Input:
 * ["KthLargest", "add", "add", "add", "add"]
 *
 * [[4, [7, 7, 7, 7, 8, 3]], [2], [10], [9], [9]]
 * Output: [null, 7, 7, 7, 8]
 * Explanation:
 * KthLargest kthLargest = new KthLargest(4, [7, 7, 7, 7, 8, 3]);
 *
 * kthLargest.add(2); // return 7
 *
 * kthLargest.add(10); // return 7
 *
 * kthLargest.add(9); // return 7
 *
 * kthLargest.add(9); // return 8
 *
 * Constraints:
 *   - 0 <= nums.length <= 10^4
 *   - 1 <= k <= nums.length + 1
 *   - -10^4 <= nums[i] <= 10^4
 *   - -10^4 <= val <= 10^4
 *   - At most 10^4 calls will be made to add.
 */
public class Q01_KthLargestElementInAStream {

    // Write your solution here - same code you would submit on LeetCode.
    static class KthLargest {

        public KthLargest(int k, int[] nums) {
            // TODO: initialize your data structure here
        }

        public int add(int val) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("703. Kth Largest Element in a Stream");

        tester.check("[\"KthLargest\",\"add\",\"add\",\"add\",\"add\",\"add\"] [[3,[4,5,8,2]],[3],[5],[10],[9],[4]]", "[null, 4, 5, 5, 8, 8]", () -> {
            List<Object> out = new ArrayList<>();
            KthLargest obj = new KthLargest(3, new int[]{4, 5, 8, 2});
            out.add(null);
            out.add(obj.add(3));
            out.add(obj.add(5));
            out.add(obj.add(10));
            out.add(obj.add(9));
            out.add(obj.add(4));
            return out;
        });
        tester.check("[\"KthLargest\",\"add\",\"add\",\"add\",\"add\"] [[4,[7,7,7,7,8,3]],[2],[10],[9],[9]]", "[null, 7, 7, 7, 8]", () -> {
            List<Object> out = new ArrayList<>();
            KthLargest obj = new KthLargest(4, new int[]{7, 7, 7, 7, 8, 3});
            out.add(null);
            out.add(obj.add(2));
            out.add(obj.add(10));
            out.add(obj.add(9));
            out.add(obj.add(9));
            return out;
        });

        tester.done();
    }
}
