package Neetcode250.LinkedList;

import Neetcode250.common.*;
import java.util.*;

/*
 * 146. LRU Cache   [Medium]
 * LeetCode: https://leetcode.com/problems/lru-cache/
 * NeetCode: https://neetcode.io/problems/lru-cache
 *
 * Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.
 *
 * Implement the LRUCache class:
 *   - LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
 *   - int get(int key) Return the value of the key if the key exists, otherwise return -1.
 *   - void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the
 *     key-value pair to the cache. If the number of keys exceeds the capacity from this operation,
 *     evict the least recently used key.
 *
 * The functions get and put must each run in O(1) average time complexity.
 *
 * Example 1:
 * Input
 * ["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
 * [[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
 * Output
 * [null, null, null, 1, null, -1, null, -1, 3, 4]
 * Explanation
 * LRUCache lRUCache = new LRUCache(2);
 * lRUCache.put(1, 1); // cache is {1=1}
 * lRUCache.put(2, 2); // cache is {1=1, 2=2}
 * lRUCache.get(1);    // return 1
 * lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
 * lRUCache.get(2);    // returns -1 (not found)
 * lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
 * lRUCache.get(1);    // return -1 (not found)
 * lRUCache.get(3);    // return 3
 * lRUCache.get(4);    // return 4
 *
 * Constraints:
 *   - 1 <= capacity <= 3000
 *   - 0 <= key <= 10^4
 *   - 0 <= value <= 10^5
 *   - At most 2 * 10^5 calls will be made to get and put.
 */
public class Q11_LRUCache {

    // Write your solution here - same code you would submit on LeetCode.
    static class LRUCache {

        public LRUCache(int capacity) {
            // TODO: initialize your data structure here
        }

        public int get(int key) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }

        public void put(int key, int value) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("146. LRU Cache");

        tester.check("[\"LRUCache\",\"put\",\"put\",\"get\",\"put\",\"get\",\"put\",\"get\",\"get\",\"get\"] [[2],[1,1],[2,2],[1],[3,3],[2],[4,4],[1],[3],[4]]", "[null, null, null, 1, null, -1, null, -1, 3, 4]", () -> {
            List<Object> out = new ArrayList<>();
            LRUCache obj = new LRUCache(2);
            out.add(null);
            obj.put(1, 1); out.add(null);
            obj.put(2, 2); out.add(null);
            out.add(obj.get(1));
            obj.put(3, 3); out.add(null);
            out.add(obj.get(2));
            obj.put(4, 4); out.add(null);
            out.add(obj.get(1));
            out.add(obj.get(3));
            out.add(obj.get(4));
            return out;
        });

        tester.done();
    }
}
