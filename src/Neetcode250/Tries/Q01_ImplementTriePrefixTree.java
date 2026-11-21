package Neetcode250.Tries;

import Neetcode250.common.*;
import java.util.*;

/*
 * 208. Implement Trie (Prefix Tree)   [Medium]
 * LeetCode: https://leetcode.com/problems/implement-trie-prefix-tree/
 * NeetCode: https://neetcode.io/problems/implement-prefix-tree
 *
 * A trie (pronounced as "try") or prefix tree is a tree data structure used to efficiently store and
 * retrieve keys in a dataset of strings. There are various applications of this data structure, such
 * as autocomplete and spellchecker.
 *
 * Implement the Trie class:
 *   - Trie() Initializes the trie object.
 *   - void insert(String word) Inserts the string word into the trie.
 *   - boolean search(String word) Returns true if the string word is in the trie (i.e., was inserted
 *     before), and false otherwise.
 *   - boolean startsWith(String prefix) Returns true if there is a previously inserted string word
 *     that has the prefix prefix, and false otherwise.
 *
 * Example 1:
 * Input
 * ["Trie", "insert", "search", "search", "startsWith", "insert", "search"]
 * [[], ["apple"], ["apple"], ["app"], ["app"], ["app"], ["app"]]
 * Output
 * [null, null, true, false, true, null, true]
 * Explanation
 * Trie trie = new Trie();
 * trie.insert("apple");
 * trie.search("apple");   // return True
 * trie.search("app");     // return False
 * trie.startsWith("app"); // return True
 * trie.insert("app");
 * trie.search("app");     // return True
 *
 * Constraints:
 *   - 1 <= word.length, prefix.length <= 2000
 *   - word and prefix consist only of lowercase English letters.
 *   - At most 3 * 10^4 calls in total will be made to insert, search, and startsWith.
 */
public class Q01_ImplementTriePrefixTree {

    // Write your solution here - same code you would submit on LeetCode.
    static class Trie {

        public Trie() {
            // TODO: initialize your data structure here
        }

        public void insert(String word) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }

        public boolean search(String word) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }

        public boolean startsWith(String prefix) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("208. Implement Trie (Prefix Tree)");

        tester.check("[\"Trie\",\"insert\",\"search\",\"search\",\"startsWith\",\"insert\",\"search\"] [[],[\"apple\"],[\"apple\"],[\"app\"],[\"app\"],[\"app\"],[\"app\"]]", "[null, null, true, false, true, null, true]", () -> {
            List<Object> out = new ArrayList<>();
            Trie obj = new Trie();
            out.add(null);
            obj.insert("apple"); out.add(null);
            out.add(obj.search("apple"));
            out.add(obj.search("app"));
            out.add(obj.startsWith("app"));
            obj.insert("app"); out.add(null);
            out.add(obj.search("app"));
            return out;
        });

        tester.done();
    }
}
