package Neetcode250.Tries;

import Neetcode250.common.*;
import java.util.*;

/*
 * 2707. Extra Characters in a String   [Medium]
 * LeetCode: https://leetcode.com/problems/extra-characters-in-a-string/
 * NeetCode: https://neetcode.io/problems/extra-characters-in-a-string
 *
 * You are given a 0-indexed string s and a dictionary of words dictionary. You have to break s into
 * one or more non-overlapping substrings such that each substring is present in dictionary. There may
 * be some extra characters in s which are not present in any of the substrings.
 *
 * Return the minimum number of extra characters left over if you break up s optimally.
 *
 * Example 1:
 * Input: s = "leetscode", dictionary = ["leet","code","leetcode"]
 * Output: 1
 * Explanation: We can break s in two substrings: "leet" from index 0 to 3 and "code" from index 5 to
 * 8. There is only 1 unused character (at index 4), so we return 1.
 *
 * Example 2:
 * Input: s = "sayhelloworld", dictionary = ["hello","world"]
 * Output: 3
 * Explanation: We can break s in two substrings: "hello" from index 3 to 7 and "world" from index 8 to
 * 12. The characters at indices 0, 1, 2 are not used in any substring and thus are considered as extra
 * characters. Hence, we return 3.
 *
 * Constraints:
 *   - 1 <= s.length <= 50
 *   - 1 <= dictionary.length <= 50
 *   - 1 <= dictionary[i].length <= 50
 *   - dictionary[i] and s consists of only lowercase English letters
 *   - dictionary contains distinct words
 */
public class Q03_ExtraCharactersInAString {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int minExtraChar(String s, String[] dictionary) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("2707. Extra Characters in a String");

        tester.check("s = \"leetscode\", dictionary = [\"leet\",\"code\",\"leetcode\"]", "1", () -> {
            String s = "leetscode";
            String[] dictionary = new String[]{"leet", "code", "leetcode"};
            return new Solution().minExtraChar(s, dictionary);
        });
        tester.check("s = \"sayhelloworld\", dictionary = [\"hello\",\"world\"]", "3", () -> {
            String s = "sayhelloworld";
            String[] dictionary = new String[]{"hello", "world"};
            return new Solution().minExtraChar(s, dictionary);
        });

        tester.done();
    }
}
