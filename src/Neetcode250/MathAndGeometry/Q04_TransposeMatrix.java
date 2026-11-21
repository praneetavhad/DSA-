package Neetcode250.MathAndGeometry;

import Neetcode250.common.*;
import java.util.*;

/*
 * 867. Transpose Matrix   [Easy]
 * LeetCode: https://leetcode.com/problems/transpose-matrix/
 * NeetCode: https://neetcode.io/problems/transpose-matrix
 *
 * Given a 2D integer array matrix, return the transpose of matrix.
 *
 * The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row
 * and column indices.
 *
 * [image: https://assets.leetcode.com/uploads/2021/02/10/hint_transpose.png]
 *
 * Example 1:
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [[1,4,7],[2,5,8],[3,6,9]]
 *
 * Example 2:
 * Input: matrix = [[1,2,3],[4,5,6]]
 * Output: [[1,4],[2,5],[3,6]]
 *
 * Constraints:
 *   - m == matrix.length
 *   - n == matrix[i].length
 *   - 1 <= m, n <= 1000
 *   - 1 <= m * n <= 10^5
 *   - -10^9 <= matrix[i][j] <= 10^9
 */
public class Q04_TransposeMatrix {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int[][] transpose(int[][] matrix) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("867. Transpose Matrix");

        tester.check("matrix = [[1,2,3],[4,5,6],[7,8,9]]", "[[1,4,7],[2,5,8],[3,6,9]]", () -> {
            int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            return new Solution().transpose(matrix);
        });
        tester.check("matrix = [[1,2,3],[4,5,6]]", "[[1,4],[2,5],[3,6]]", () -> {
            int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}};
            return new Solution().transpose(matrix);
        });

        tester.done();
    }
}
