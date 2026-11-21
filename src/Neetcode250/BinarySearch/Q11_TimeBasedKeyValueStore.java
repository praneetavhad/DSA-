package Neetcode250.BinarySearch;

import Neetcode250.common.*;
import java.util.*;

/*
 * 981. Time Based Key-Value Store   [Medium]
 * LeetCode: https://leetcode.com/problems/time-based-key-value-store/
 * NeetCode: https://neetcode.io/problems/time-based-key-value-store
 *
 * Design a time-based key-value data structure that can store multiple values for the same key at
 * different time stamps and retrieve the key's value at a certain timestamp.
 *
 * Implement the TimeMap class:
 *   - TimeMap() Initializes the object of the data structure.
 *   - void set(String key, String value, int timestamp) Stores the key key with the value value at the
 *     given time timestamp.
 *   - String get(String key, int timestamp) Returns a value such that set was called previously, with
 *     timestamp_prev <= timestamp. If there are multiple such values, it returns the value associated
 *     with the largest timestamp_prev. If there are no values, it returns "".
 *
 * Example 1:
 * Input
 * ["TimeMap", "set", "get", "get", "set", "get", "get"]
 * [[], ["foo", "bar", 1], ["foo", 1], ["foo", 3], ["foo", "bar2", 4], ["foo", 4], ["foo", 5]]
 * Output
 * [null, null, "bar", "bar", null, "bar2", "bar2"]
 * Explanation
 * TimeMap timeMap = new TimeMap();
 * timeMap.set("foo", "bar", 1);  // store the key "foo" and value "bar" along with timestamp = 1.
 * timeMap.get("foo", 1);         // return "bar"
 * timeMap.get("foo", 3);         // return "bar", since there is no value corresponding to foo at
 * timestamp 3 and timestamp 2, then the only value is at timestamp 1 is "bar".
 * timeMap.set("foo", "bar2", 4); // store the key "foo" and value "bar2" along with timestamp = 4.
 * timeMap.get("foo", 4);         // return "bar2"
 * timeMap.get("foo", 5);         // return "bar2"
 *
 * Constraints:
 *   - 1 <= key.length, value.length <= 100
 *   - key and value consist of lowercase English letters and digits.
 *   - 1 <= timestamp <= 10^7
 *   - All the timestamps timestamp of set are strictly increasing.
 *   - At most 2 * 10^5 calls will be made to set and get.
 */
public class Q11_TimeBasedKeyValueStore {

    // Write your solution here - same code you would submit on LeetCode.
    static class TimeMap {

        public TimeMap() {
            // TODO: initialize your data structure here
        }

        public void set(String key, String value, int timestamp) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }

        public String get(String key, int timestamp) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("981. Time Based Key-Value Store");

        tester.check("[\"TimeMap\",\"set\",\"get\",\"get\",\"set\",\"get\",\"get\"] [[],[\"foo\",\"bar\",1],[\"foo\",1],[\"foo\",3],[\"foo\",\"bar2\",4],[\"foo\",4],[\"foo\",5]]", "[null, null, \"bar\", \"bar\", null, \"bar2\", \"bar2\"]", () -> {
            List<Object> out = new ArrayList<>();
            TimeMap obj = new TimeMap();
            out.add(null);
            obj.set("foo", "bar", 1); out.add(null);
            out.add(obj.get("foo", 1));
            out.add(obj.get("foo", 3));
            obj.set("foo", "bar2", 4); out.add(null);
            out.add(obj.get("foo", 4));
            out.add(obj.get("foo", 5));
            return out;
        });

        tester.done();
    }
}
