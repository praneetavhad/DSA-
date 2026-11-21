package Neetcode250.HeapPriorityQueue;

import Neetcode250.common.*;
import java.util.*;

/*
 * 1094. Car Pooling   [Medium]
 * LeetCode: https://leetcode.com/problems/car-pooling/
 * NeetCode: https://neetcode.io/problems/car-pooling
 *
 * There is a car with capacity empty seats. The vehicle only drives east (i.e., it cannot turn around
 * and drive west).
 *
 * You are given the integer capacity and an array trips where trips[i] = [numPassengers_i, from_i,
 * to_i] indicates that the i^th trip has numPassengers_i passengers and the locations to pick them up
 * and drop them off are from_i and to_i respectively. The locations are given as the number of
 * kilometers due east from the car's initial location.
 *
 * Passengers are dropped off before new passengers are picked up at the same location. At every point
 * along the route, the total number of passengers in the car must not exceed capacity.
 *
 * Return true if it is possible to pick up and drop off all passengers for all the given trips, or
 * false otherwise.
 *
 * Example 1:
 * Input: trips = [[2,1,5],[3,3,7]], capacity = 4
 * Output: false
 * Explanation:
 * At kilometer 1, 2 passengers are picked up, so the car holds 2.
 * At kilometer 3, 3 more are picked up, so the car holds 5.
 * Since 5 > capacity = 4, the trips cannot all be completed.
 *
 * Example 2:
 * Input: trips = [[2,1,5],[3,3,7]], capacity = 5
 * Output: true
 * Explanation:
 * At kilometer 1, the car holds 2 passengers.
 * At kilometer 3, the car holds 5 passengers.
 * At kilometer 5, the first 2 are dropped off, so the car holds 3.
 * At kilometer 7, the last 3 are dropped off, so the car holds 0.
 * The maximum occupancy is 5, which never exceeds capacity = 5.
 *
 * Constraints:
 *   - 1 <= trips.length <= 1000
 *   - trips[i].length == 3
 *   - 1 <= numPassengers_i <= 100
 *   - 0 <= from_i < to_i <= 1000
 *   - 1 <= capacity <= 10^5
 */
public class Q10_CarPooling {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public boolean carPooling(int[][] trips, int capacity) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("1094. Car Pooling");

        tester.check("trips = [[2,1,5],[3,3,7]], capacity = 4", "false", () -> {
            int[][] trips = new int[][]{{2, 1, 5}, {3, 3, 7}};
            int capacity = 4;
            return new Solution().carPooling(trips, capacity);
        });
        tester.check("trips = [[2,1,5],[3,3,7]], capacity = 5", "true", () -> {
            int[][] trips = new int[][]{{2, 1, 5}, {3, 3, 7}};
            int capacity = 5;
            return new Solution().carPooling(trips, capacity);
        });

        tester.done();
    }
}
