package Neetcode250.MathAndGeometry;

import Neetcode250.common.*;
import java.util.*;

/*
 * 54. Spiral Matrix   [Medium]
 * LeetCode: https://leetcode.com/problems/spiral-matrix/
 * NeetCode: https://neetcode.io/problems/spiral-matrix
 *
 * Given an m x n matrix, return all elements of the matrix in spiral order.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2020/11/13/spiral1.jpg]
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [1,2,3,6,9,8,7,4,5]
 *
 * Example 2:
 * [image: https://assets.leetcode.com/uploads/2020/11/13/spiral.jpg]
 * Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
 * Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 *
 * Constraints:
 *   - m == matrix.length
 *   - n == matrix[i].length
 *   - 1 <= m, n <= 10
 *   - -100 <= matrix[i][j] <= 100
 */
public class Q06_SpiralMatrix {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("54. Spiral Matrix");

        tester.check("matrix = [[1,2,3],[4,5,6],[7,8,9]]", "[1,2,3,6,9,8,7,4,5]", () -> {
            int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            return new Solution().spiralOrder(matrix);
        });
        tester.check("matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]", "[1,2,3,4,8,12,11,10,9,5,6,7]", () -> {
            int[][] matrix = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
            return new Solution().spiralOrder(matrix);
        });

        tester.done();
    }
}
