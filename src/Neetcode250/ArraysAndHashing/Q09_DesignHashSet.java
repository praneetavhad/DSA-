package Neetcode250.ArraysAndHashing;

import Neetcode250.common.*;
import java.util.*;

/*
 * 705. Design HashSet   [Easy]
 * LeetCode: https://leetcode.com/problems/design-hashset/
 * NeetCode: https://neetcode.io/problems/design-hashset
 *
 * Design a HashSet without using any built-in hash table libraries.
 *
 * Implement MyHashSet class:
 *   - void add(key) Inserts the value key into the HashSet.
 *   - bool contains(key) Returns whether the value key exists in the HashSet or not.
 *   - void remove(key) Removes the value key in the HashSet. If key does not exist in the HashSet, do
 *     nothing.
 *
 * Example 1:
 * Input
 * ["MyHashSet", "add", "add", "contains", "contains", "add", "contains", "remove", "contains"]
 * [[], [1], [2], [1], [3], [2], [2], [2], [2]]
 * Output
 * [null, null, null, true, false, null, true, null, false]
 * Explanation
 * MyHashSet myHashSet = new MyHashSet();
 * myHashSet.add(1);      // set = [1]
 * myHashSet.add(2);      // set = [1, 2]
 * myHashSet.contains(1); // return True
 * myHashSet.contains(3); // return False, (not found)
 * myHashSet.add(2);      // set = [1, 2]
 * myHashSet.contains(2); // return True
 * myHashSet.remove(2);   // set = [1]
 * myHashSet.contains(2); // return False, (already removed)
 *
 * Constraints:
 *   - 0 <= key <= 10^6
 *   - At most 10^4 calls will be made to add, remove, and contains.
 */
public class Q09_DesignHashSet {

    // Write your solution here - same code you would submit on LeetCode.
    static class MyHashSet {

        public MyHashSet() {
            // TODO: initialize your data structure here
        }

        public void add(int key) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }

        public void remove(int key) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }

        public boolean contains(int key) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("705. Design HashSet");

        tester.check("[\"MyHashSet\",\"add\",\"add\",\"add\",\"remove\",\"contains\",\"add\",\"add\",\"add\",\"remove\",\"contains\",\"add\",\"add\",\"add\",\"remove\",\"contains\",\"add\",\"add\",\"add\",\"remove\",\"contains\"] [[],[1],[10001],[1],[1],[1],[7],[10007],[7],[7],[7],[123],[10123],[123],[123],[123],[5000],[15000],[5000],[5000],[5000]]", "[null, null, null, true, false, null, true, null, false]", () -> {
            List<Object> out = new ArrayList<>();
            MyHashSet obj = new MyHashSet();
            out.add(null);
            obj.add(1); out.add(null);
            obj.add(10001); out.add(null);
            obj.add(1); out.add(null);
            obj.remove(1); out.add(null);
            out.add(obj.contains(1));
            obj.add(7); out.add(null);
            obj.add(10007); out.add(null);
            obj.add(7); out.add(null);
            obj.remove(7); out.add(null);
            out.add(obj.contains(7));
            obj.add(123); out.add(null);
            obj.add(10123); out.add(null);
            obj.add(123); out.add(null);
            obj.remove(123); out.add(null);
            out.add(obj.contains(123));
            obj.add(5000); out.add(null);
            obj.add(15000); out.add(null);
            obj.add(5000); out.add(null);
            obj.remove(5000); out.add(null);
            out.add(obj.contains(5000));
            return out;
        });

        tester.done();
    }
}
