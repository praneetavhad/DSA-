package Neetcode250.ArraysAndHashing;

import Neetcode250.common.*;
import java.util.*;

/*
 * 271. Encode and Decode Strings   [Medium]
 * LeetCode: https://leetcode.com/problems/encode-and-decode-strings/
 * NeetCode: https://neetcode.io/problems/string-encode-and-decode
 *
 * (LeetCode Premium - free version on NeetCode)
 *
 * Design an algorithm to encode a list of strings into a single string. The encoded string is then
 * decoded back to the original list of strings.
 *
 * Implement encode(List<String> strs) and decode(String s) so that decode(encode(strs)) returns
 * exactly the original list. Strings may contain any characters (including '#', digits, spaces),
 * and may be empty.
 *
 * Example 1:
 * Input: ["neet","code","love","you"]
 * Output: ["neet","code","love","you"]
 *
 * Example 2:
 * Input: ["we","say",":","yes"]
 * Output: ["we","say",":","yes"]
 *
 * Constraints:
 *   - 0 <= strs.length < 100
 *   - 0 <= strs[i].length < 200
 *   - strs[i] contains any possible characters out of 256 valid ASCII characters.
 */
public class Q14_EncodeAndDecodeStrings {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {

        public String encode(List<String> strs) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }

        public List<String> decode(String str) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("271. Encode and Decode Strings");

        tester.check("strs = [\"neet\",\"code\",\"love\",\"you\"]", "[\"neet\",\"code\",\"love\",\"you\"]", () -> {
            List<String> strs = P.ls("[\"neet\",\"code\",\"love\",\"you\"]");
            Solution s = new Solution();
            return s.decode(s.encode(strs));
        });
        tester.check("strs = [\"we\",\"say\",\":\",\"yes\"]", "[\"we\",\"say\",\":\",\"yes\"]", () -> {
            List<String> strs = P.ls("[\"we\",\"say\",\":\",\"yes\"]");
            Solution s = new Solution();
            return s.decode(s.encode(strs));
        });
        tester.check("strs = [\"\"]", "[\"\"]", () -> {
            List<String> strs = P.ls("[\"\"]");
            Solution s = new Solution();
            return s.decode(s.encode(strs));
        });
        tester.check("strs = []", "[]", () -> {
            List<String> strs = P.ls("[]");
            Solution s = new Solution();
            return s.decode(s.encode(strs));
        });
        tester.check("strs = [\"5#abc\",\"#\",\"\",\"12#\"]", "[\"5#abc\",\"#\",\"\",\"12#\"]", () -> {
            List<String> strs = P.ls("[\"5#abc\",\"#\",\"\",\"12#\"]");
            Solution s = new Solution();
            return s.decode(s.encode(strs));
        });

        tester.done();
    }
}
