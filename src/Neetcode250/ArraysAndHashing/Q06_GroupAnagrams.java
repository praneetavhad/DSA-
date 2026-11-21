package Neetcode250.ArraysAndHashing;

import Neetcode250.common.*;
import java.util.*;

/*
 * 49. Group Anagrams   [Medium]
 * LeetCode: https://leetcode.com/problems/group-anagrams/
 * NeetCode: https://neetcode.io/problems/anagram-groups
 *
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 *
 * Example 1:
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * Explanation:
 *   - There is no string in strs that can be rearranged to form "bat".
 *   - The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
 *   - The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
 *
 * Example 2:
 * Input: strs = [""]
 * Output: [[""]]
 *
 * Example 3:
 * Input: strs = ["a"]
 * Output: [["a"]]
 *
 * Constraints:
 *   - 1 <= strs.length <= 10^4
 *   - 0 <= strs[i].length <= 100
 *   - strs[i] consists of lowercase English letters.
 */
public class Q06_GroupAnagrams {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            List<List<String>> ans = new ArrayList<>();
            HashMap<String,List<String>> map = new HashMap<>();
            for (String s : strs){
                char[] c  = s.toCharArray();
                Arrays.sort(c);
                String sorted_str = new String(c);

                if(!map.containsKey(sorted_str)){
                    map.put(sorted_str, new ArrayList<>());
                }
                map.get(sorted_str).add(s);
            }
            ans.addAll(map.values());
            return ans;
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("49. Group Anagrams");
        // Answers are compared ignoring order at every level (problem allows any order).

        tester.check("strs = [\"eat\",\"tea\",\"tan\",\"ate\",\"nat\",\"bat\"]", "[[\"bat\"],[\"nat\",\"tan\"],[\"ate\",\"eat\",\"tea\"]]", Tester.Order.ANY_DEEP, () -> {
            String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
            return new Solution().groupAnagrams(strs);
        });
        tester.check("strs = [\"\"]", "[[\"\"]]", Tester.Order.ANY_DEEP, () -> {
            String[] strs = new String[]{""};
            return new Solution().groupAnagrams(strs);
        });
        tester.check("strs = [\"a\"]", "[[\"a\"]]", Tester.Order.ANY_DEEP, () -> {
            String[] strs = new String[]{"a"};
            return new Solution().groupAnagrams(strs);
        });

        tester.done();
    }
}
