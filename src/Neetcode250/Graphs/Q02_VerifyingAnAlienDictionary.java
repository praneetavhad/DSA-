package Neetcode250.Graphs;

import Neetcode250.common.*;
import java.util.*;

/*
 * 953. Verifying an Alien Dictionary   [Easy]
 * LeetCode: https://leetcode.com/problems/verifying-an-alien-dictionary/
 * NeetCode: https://neetcode.io/problems/verifying-an-alien-dictionary
 *
 * In an alien language, surprisingly, they also use English lowercase letters, but possibly in a
 * different order. The order of the alphabet is some permutation of lowercase letters.
 *
 * Given a sequence of words written in the alien language, and the order of the alphabet, return true
 * if and only if the given words are sorted lexicographically in this alien language.
 *
 * Example 1:
 * Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
 * Output: true
 * Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.
 *
 * Example 2:
 * Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
 * Output: false
 * Explanation: As 'd' comes after 'l' in this language, then words[0] > words[1], hence the sequence
 * is unsorted.
 *
 * Example 3:
 * Input: words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
 * Output: false
 * Explanation: The first three characters "app" match, and the second string is shorter (in size.)
 * According to lexicographical rules "apple" > "app", because 'l' > '{}', where '{}' is defined as the
 * blank character which is less than any other character (More info).
 *
 * Constraints:
 *   - 1 <= words.length <= 100
 *   - 1 <= words[i].length <= 20
 *   - order.length == 26
 *   - All characters in words[i] and order are English lowercase letters.
 */
public class Q02_VerifyingAnAlienDictionary {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public boolean isAlienSorted(String[] words, String order) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("953. Verifying an Alien Dictionary");

        tester.check("words = [\"hello\",\"leetcode\"], order = \"hlabcdefgijkmnopqrstuvwxyz\"", "true", () -> {
            String[] words = new String[]{"hello", "leetcode"};
            String order = "hlabcdefgijkmnopqrstuvwxyz";
            return new Solution().isAlienSorted(words, order);
        });
        tester.check("words = [\"word\",\"world\",\"row\"], order = \"worldabcefghijkmnpqstuvxyz\"", "false", () -> {
            String[] words = new String[]{"word", "world", "row"};
            String order = "worldabcefghijkmnpqstuvxyz";
            return new Solution().isAlienSorted(words, order);
        });
        tester.check("words = [\"apple\",\"app\"], order = \"abcdefghijklmnopqrstuvwxyz\"", "false", () -> {
            String[] words = new String[]{"apple", "app"};
            String order = "abcdefghijklmnopqrstuvwxyz";
            return new Solution().isAlienSorted(words, order);
        });

        tester.done();
    }
}
