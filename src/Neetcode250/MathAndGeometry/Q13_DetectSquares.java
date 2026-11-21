package Neetcode250.MathAndGeometry;

import Neetcode250.common.*;
import java.util.*;

/*
 * 2013. Detect Squares   [Medium]
 * LeetCode: https://leetcode.com/problems/detect-squares/
 * NeetCode: https://neetcode.io/problems/count-squares
 *
 * You are given a stream of points on the X-Y plane. Design an algorithm that:
 *   - Adds new points from the stream into a data structure. Duplicate points are allowed and should
 *     be treated as different points.
 *   - Given a query point, counts the number of ways to choose three points from the data structure
 *     such that the three points and the query point form an axis-aligned square with positive area.
 *
 * An axis-aligned square is a square whose edges are all the same length and are either parallel or
 * perpendicular to the x-axis and y-axis.
 *
 * Implement the DetectSquares class:
 *   - DetectSquares() Initializes the object with an empty data structure.
 *   - void add(int[] point) Adds a new point point = [x, y] to the data structure.
 *   - int count(int[] point) Counts the number of ways to form axis-aligned squares with point point =
 *     [x, y] as described above.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2021/09/01/image.png]
 * Input
 * ["DetectSquares", "add", "add", "add", "count", "count", "add", "count"]
 * [[], [[3, 10]], [[11, 2]], [[3, 2]], [[11, 10]], [[14, 8]], [[11, 2]], [[11, 10]]]
 * Output
 * [null, null, null, null, 1, 0, null, 2]
 * Explanation
 * DetectSquares detectSquares = new DetectSquares();
 * detectSquares.add([3, 10]);
 * detectSquares.add([11, 2]);
 * detectSquares.add([3, 2]);
 * detectSquares.count([11, 10]); // return 1. You can choose:
 *                                //   - The first, second, and third points
 * detectSquares.count([14, 8]);  // return 0. The query point cannot form a square with any points in
 * the data structure.
 * detectSquares.add([11, 2]);    // Adding duplicate points is allowed.
 * detectSquares.count([11, 10]); // return 2. You can choose:
 *                                //   - The first, second, and third points
 *                                //   - The first, third, and fourth points
 *
 * Constraints:
 *   - point.length == 2
 *   - 0 <= x, y <= 1000
 *   - At most 3000 calls in total will be made to add and count.
 */
public class Q13_DetectSquares {

    // Write your solution here - same code you would submit on LeetCode.
    static class DetectSquares {

        public DetectSquares() {
            // TODO: initialize your data structure here
        }

        public void add(int[] point) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }

        public int count(int[] point) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("2013. Detect Squares");

        tester.check("[\"DetectSquares\",\"add\",\"add\",\"add\",\"count\",\"count\",\"add\",\"count\"] [[],[[3,10]],[[11,2]],[[3,2]],[[11,10]],[[14,8]],[[11,2]],[[11,10]]]", "[null, null, null, null, 1, 0, null, 2]", () -> {
            List<Object> out = new ArrayList<>();
            DetectSquares obj = new DetectSquares();
            out.add(null);
            obj.add(new int[]{3, 10}); out.add(null);
            obj.add(new int[]{11, 2}); out.add(null);
            obj.add(new int[]{3, 2}); out.add(null);
            out.add(obj.count(new int[]{11, 10}));
            out.add(obj.count(new int[]{14, 8}));
            obj.add(new int[]{11, 2}); out.add(null);
            out.add(obj.count(new int[]{11, 10}));
            return out;
        });

        tester.done();
    }
}
