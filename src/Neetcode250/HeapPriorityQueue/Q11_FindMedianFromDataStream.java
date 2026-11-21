package Neetcode250.HeapPriorityQueue;

import Neetcode250.common.*;
import java.util.*;

/*
 * 295. Find Median from Data Stream   [Hard]
 * LeetCode: https://leetcode.com/problems/find-median-from-data-stream/
 * NeetCode: https://neetcode.io/problems/find-median-in-a-data-stream
 *
 * The median is the middle value in an ordered integer list. If the size of the list is even, there is
 * no middle value, and the median is the mean of the two middle values.
 *   - For example, for arr = [2,3,4], the median is 3.
 *   - For example, for arr = [2,3], the median is (2 + 3) / 2 = 2.5.
 *
 * Implement the MedianFinder class:
 *   - MedianFinder() initializes the MedianFinder object.
 *   - void addNum(int num) adds the integer num from the data stream to the data structure.
 *   - double findMedian() returns the median of all elements so far. Answers within 10^-5 of the
 *     actual answer will be accepted.
 *
 * Example 1:
 * Input
 * ["MedianFinder", "addNum", "addNum", "findMedian", "addNum", "findMedian"]
 * [[], [1], [2], [], [3], []]
 * Output
 * [null, null, null, 1.5, null, 2.0]
 * Explanation
 * MedianFinder medianFinder = new MedianFinder();
 * medianFinder.addNum(1);    // arr = [1]
 * medianFinder.addNum(2);    // arr = [1, 2]
 * medianFinder.findMedian(); // return 1.5 (i.e., (1 + 2) / 2)
 * medianFinder.addNum(3);    // arr[1, 2, 3]
 * medianFinder.findMedian(); // return 2.0
 *
 * Constraints:
 *   - -10^5 <= num <= 10^5
 *   - There will be at least one element in the data structure before calling findMedian.
 *   - At most 5 * 10^4 calls will be made to addNum and findMedian.
 *
 * Follow up:
 *   - If all integer numbers from the stream are in the range [0, 100], how would you optimize your
 *     solution?
 *   - If 99% of all integer numbers from the stream are in the range [0, 100], how would you optimize
 *     your solution?
 */
public class Q11_FindMedianFromDataStream {

    // Write your solution here - same code you would submit on LeetCode.
    static class MedianFinder {

        public MedianFinder() {
            // TODO: initialize your data structure here
        }

        public void addNum(int num) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }

        public double findMedian() {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("295. Find Median from Data Stream");

        tester.check("[\"MedianFinder\",\"addNum\",\"addNum\",\"findMedian\",\"addNum\",\"findMedian\"] [[],[1],[2],[],[3],[]]", "[null, null, null, 1.5, null, 2.0]", () -> {
            List<Object> out = new ArrayList<>();
            MedianFinder obj = new MedianFinder();
            out.add(null);
            obj.addNum(1); out.add(null);
            obj.addNum(2); out.add(null);
            out.add(obj.findMedian());
            obj.addNum(3); out.add(null);
            out.add(obj.findMedian());
            return out;
        });

        tester.done();
    }
}
