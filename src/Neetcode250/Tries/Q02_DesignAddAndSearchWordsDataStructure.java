package Neetcode250.Tries;

import Neetcode250.common.*;
import java.util.*;

/*
 * 211. Design Add and Search Words Data Structure   [Medium]
 * LeetCode: https://leetcode.com/problems/design-add-and-search-words-data-structure/
 * NeetCode: https://neetcode.io/problems/design-word-search-data-structure
 *
 * Design a data structure that supports adding new words and finding if a string matches any
 * previously added string.
 *
 * Implement the WordDictionary class:
 *   - WordDictionary() Initializes the object.
 *   - void addWord(word) Adds word to the data structure, it can be matched later.
 *   - bool search(word) Returns true if there is any string in the data structure that matches word or
 *     false otherwise. word may contain dots '.' where dots can be matched with any letter.
 *
 * Example:
 * Input
 * ["WordDictionary","addWord","addWord","addWord","search","search","search","search"]
 * [[],["bad"],["dad"],["mad"],["pad"],["bad"],[".ad"],["b.."]]
 * Output
 * [null,null,null,null,false,true,true,true]
 * Explanation
 * WordDictionary wordDictionary = new WordDictionary();
 * wordDictionary.addWord("bad");
 * wordDictionary.addWord("dad");
 * wordDictionary.addWord("mad");
 * wordDictionary.search("pad"); // return False
 * wordDictionary.search("bad"); // return True
 * wordDictionary.search(".ad"); // return True
 * wordDictionary.search("b.."); // return True
 *
 * Constraints:
 *   - 1 <= word.length <= 25
 *   - word in addWord consists of lowercase English letters.
 *   - word in search consist of '.' or lowercase English letters.
 *   - There will be at most 2 dots in word for search queries.
 *   - At most 10^4 calls will be made to addWord and search.
 */
public class Q02_DesignAddAndSearchWordsDataStructure {

    // Write your solution here - same code you would submit on LeetCode.
    static class WordDictionary {

        public WordDictionary() {
            // TODO: initialize your data structure here
        }

        public void addWord(String word) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }

        public boolean search(String word) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("211. Design Add and Search Words Data Structure");

        tester.check("[\"WordDictionary\",\"addWord\",\"addWord\",\"addWord\",\"search\",\"search\",\"search\",\"search\"] [[],[\"bad\"],[\"dad\"],[\"mad\"],[\"pad\"],[\"bad\"],[\".ad\"],[\"b..\"]]", "[null,null,null,null,false,true,true,true]", () -> {
            List<Object> out = new ArrayList<>();
            WordDictionary obj = new WordDictionary();
            out.add(null);
            obj.addWord("bad"); out.add(null);
            obj.addWord("dad"); out.add(null);
            obj.addWord("mad"); out.add(null);
            out.add(obj.search("pad"));
            out.add(obj.search("bad"));
            out.add(obj.search(".ad"));
            out.add(obj.search("b.."));
            return out;
        });

        tester.done();
    }
}
