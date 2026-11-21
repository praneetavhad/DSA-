package Neetcode250.ArraysAndHashing;

import Neetcode250.common.*;
import java.util.*;

/*
 * 706. Design HashMap   [Easy]
 * LeetCode: https://leetcode.com/problems/design-hashmap/
 * NeetCode: https://neetcode.io/problems/design-hashmap
 *
 * Design a HashMap without using any built-in hash table libraries.
 *
 * Implement the MyHashMap class:
 *   - MyHashMap() initializes the object with an empty map.
 *   - void put(int key, int value) inserts a (key, value) pair into the HashMap. If the key already
 *     exists in the map, update the corresponding value.
 *   - int get(int key) returns the value to which the specified key is mapped, or -1 if this map
 *     contains no mapping for the key.
 *   - void remove(key) removes the key and its corresponding value if the map contains the mapping for
 *     the key.
 *
 * Example 1:
 * Input
 * ["MyHashMap", "put", "put", "get", "get", "put", "get", "remove", "get"]
 * [[], [1, 1], [2, 2], [1], [3], [2, 1], [2], [2], [2]]
 * Output
 * [null, null, null, 1, -1, null, 1, null, -1]
 * Explanation
 * MyHashMap myHashMap = new MyHashMap();
 * myHashMap.put(1, 1); // The map is now [[1,1]]
 * myHashMap.put(2, 2); // The map is now [[1,1], [2,2]]
 * myHashMap.get(1);    // return 1, The map is now [[1,1], [2,2]]
 * myHashMap.get(3);    // return -1 (i.e., not found), The map is now [[1,1], [2,2]]
 * myHashMap.put(2, 1); // The map is now [[1,1], [2,1]] (i.e., update the existing value)
 * myHashMap.get(2);    // return 1, The map is now [[1,1], [2,1]]
 * myHashMap.remove(2); // remove the mapping for 2, The map is now [[1,1]]
 * myHashMap.get(2);    // return -1 (i.e., not found), The map is now [[1,1]]
 *
 * Constraints:
 *   - 0 <= key, value <= 10^6
 *   - At most 10^4 calls will be made to put, get, and remove.
 */
public class Q10_DesignHashMap {

    // Write your solution here - same code you would submit on LeetCode.
    static class MyHashMap {

        public MyHashMap() {
            // TODO: initialize your data structure here
        }

        public void put(int key, int value) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }

        public int get(int key) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }

        public void remove(int key) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("706. Design HashMap");

        tester.check("[\"MyHashMap\",\"put\",\"put\",\"get\",\"get\",\"put\",\"get\",\"remove\",\"get\"] [[],[1,1],[2,2],[1],[3],[2,1],[2],[2],[2]]", "[null, null, null, 1, -1, null, 1, null, -1]", () -> {
            List<Object> out = new ArrayList<>();
            MyHashMap obj = new MyHashMap();
            out.add(null);
            obj.put(1, 1); out.add(null);
            obj.put(2, 2); out.add(null);
            out.add(obj.get(1));
            out.add(obj.get(3));
            obj.put(2, 1); out.add(null);
            out.add(obj.get(2));
            obj.remove(2); out.add(null);
            out.add(obj.get(2));
            return out;
        });

        tester.done();
    }
}
