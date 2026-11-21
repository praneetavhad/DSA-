package Neetcode250.ArraysAndHashing;

import Neetcode250.common.*;
import java.util.*;

/*
 * 242. Valid Anagram   [Easy]
 * LeetCode: https://leetcode.com/problems/valid-anagram/
 * NeetCode: https://neetcode.io/problems/is-anagram
 *
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 *
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 *
 * Constraints:
 *   - 1 <= s.length, t.length <= 5 * 10^4
 *   - s and t consist of lowercase English letters.
 *
 * Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such
 * a case?
 */
public class Q03_ValidAnagram {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public boolean isAnagram(String s, String t) {
            HashMap<Character,Integer> map = new HashMap<>();

            for(int i=0;i<s.length();i++){
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0) + 1);
            }

            for(int i=0;i<t.length();i++){
                map.put(t.charAt(i), map.getOrDefault(t.charAt(i),0) - 1);
            }

            for (int cnt : map.values()){
                if (cnt !=0){
                    return false;
                }
            }
            return true;
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("242. Valid Anagram");

        tester.check("s = \"anagram\", t = \"nagaram\"", "true", () -> {
            String s = "anagram";
            String t = "nagaram";
            return new Solution().isAnagram(s, t);
        });
        tester.check("s = \"rat\", t = \"car\"", "false", () -> {
            String s = "rat";
            String t = "car";
            return new Solution().isAnagram(s, t);
        });

        tester.done();
    }
}
