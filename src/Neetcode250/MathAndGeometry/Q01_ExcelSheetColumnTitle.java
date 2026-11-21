package Neetcode250.MathAndGeometry;

import Neetcode250.common.*;
import java.util.*;

/*
 * 168. Excel Sheet Column Title   [Easy]
 * LeetCode: https://leetcode.com/problems/excel-sheet-column-title/
 * NeetCode: https://neetcode.io/problems/excel-sheet-column-title
 *
 * Given an integer columnNumber, return its corresponding column title as it appears in an Excel
 * sheet.
 *
 * For example:
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * ...
 *
 * Example 1:
 * Input: columnNumber = 1
 * Output: "A"
 *
 * Example 2:
 * Input: columnNumber = 28
 * Output: "AB"
 *
 * Example 3:
 * Input: columnNumber = 701
 * Output: "ZY"
 *
 * Constraints:
 *   - 1 <= columnNumber <= 2^31 - 1
 */
public class Q01_ExcelSheetColumnTitle {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public String convertToTitle(int columnNumber) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("168. Excel Sheet Column Title");

        tester.check("columnNumber = 1", "\"A\"", () -> {
            int columnNumber = 1;
            return new Solution().convertToTitle(columnNumber);
        });
        tester.check("columnNumber = 28", "\"AB\"", () -> {
            int columnNumber = 28;
            return new Solution().convertToTitle(columnNumber);
        });
        tester.check("columnNumber = 701", "\"ZY\"", () -> {
            int columnNumber = 701;
            return new Solution().convertToTitle(columnNumber);
        });

        tester.done();
    }
}
