package Neetcode250.BinarySearch;

import Neetcode250.common.*;
import java.util.*;

/*
 * 74. Search a 2D Matrix   [Medium]
 * LeetCode: https://leetcode.com/problems/search-a-2d-matrix/
 * NeetCode: https://neetcode.io/problems/search-2d-matrix
 *
 * You are given an m x n integer matrix matrix with the following two properties:
 *   - Each row is sorted in non-decreasing order.
 *   - The first integer of each row is greater than the last integer of the previous row.
 *
 * Given an integer target, return true if target is in matrix or false otherwise.
 *
 * You must write a solution in O(log(m * n)) time complexity.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2020/10/05/mat.jpg]
 * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
 * Output: true
 *
 * Example 2:
 * [image: https://assets.leetcode.com/uploads/2020/10/05/mat2.jpg]
 * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
 * Output: false
 *
 * Constraints:
 *   - m == matrix.length
 *   - n == matrix[i].length
 *   - 1 <= m, n <= 100
 *   - -10^4 <= matrix[i][j], target <= 10^4
 */
public class Q05_SearchA2DMatrix {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("74. Search a 2D Matrix");

        tester.check("matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3", "true", () -> {
            int[][] matrix = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
            int target = 3;
            return new Solution().searchMatrix(matrix, target);
        });
        tester.check("matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13", "false", () -> {
            int[][] matrix = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
            int target = 13;
            return new Solution().searchMatrix(matrix, target);
        });

        tester.done();
    }
}
