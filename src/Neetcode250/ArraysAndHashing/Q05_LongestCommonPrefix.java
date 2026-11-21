package Neetcode250.ArraysAndHashing;

import Neetcode250.common.*;
import java.util.*;

/*
 * 14. Longest Common Prefix   [Easy]
 * LeetCode: https://leetcode.com/problems/longest-common-prefix/
 * NeetCode: https://neetcode.io/problems/longest-common-prefix
 *
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 *
 * Example 2:
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 * Constraints:
 *   - 1 <= strs.length <= 200
 *   - 0 <= strs[i].length <= 200
 *   - strs[i] consists of only lowercase English letters if it is non-empty.
 */
public class Q05_LongestCommonPrefix {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public String longestCommonPrefix(String[] strs) {
            Arrays.sort(strs);
            String str1 = strs[0];
            String str2 = strs[strs.length-1];
            int index =0;
            while(index < str1.length()){
                if(str1.charAt(index) == str2.charAt(index)){
                    index++;
                }
                else {
                    break;
                }
            }
            return str1.substring(0, index);
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("14. Longest Common Prefix");

        tester.check("strs = [\"flower\",\"flow\",\"flight\"]", "\"fl\"", () -> {
            String[] strs = new String[]{"flower", "flow", "flight"};
            return new Solution().longestCommonPrefix(strs);
        });
        tester.check("strs = [\"dog\",\"racecar\",\"car\"]", "\"\"", () -> {
            String[] strs = new String[]{"dog", "racecar", "car"};
            return new Solution().longestCommonPrefix(strs);
        });

        tester.done();
    }
}
