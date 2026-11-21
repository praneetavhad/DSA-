package Neetcode250.ArraysAndHashing;

import Neetcode250.common.*;
import java.util.*;

/*
 * 347. Top K Frequent Elements   [Medium]
 * LeetCode: https://leetcode.com/problems/top-k-frequent-elements/
 * NeetCode: https://neetcode.io/problems/top-k-elements-in-list
 *
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return
 * the answer in any order.
 *
 * Example 1:
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 *
 * Example 2:
 * Input: nums = [1], k = 1
 * Output: [1]
 *
 * Example 3:
 * Input: nums = [1,2,1,2,1,2,3,1,3,2], k = 2
 * Output: [1,2]
 *
 * Constraints:
 *   - 1 <= nums.length <= 10^5
 *   - -10^4 <= nums[i] <= 10^4
 *   - k is in the range [1, the number of unique elements in the array].
 *   - It is guaranteed that the answer is unique.
 *
 * Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's
 * size.
 */
public class Q13_TopKFrequentElements {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public int[] topKFrequent(int[] arr, int k) {
            HashMap<Integer,Integer> map = new HashMap<>();

            for(int i=0;i<arr.length;i++){
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }

            PriorityQueue<Integer> minHeap = new PriorityQueue<>(Comparator.comparingInt(count -> map.get(count))  );

            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                int num = entry.getKey();
                int val = entry.getValue();

                minHeap.offer(num);
                if(minHeap.size() > k){
                    minHeap.poll();
                }
            }

            System.out.println(map);
            System.out.println(minHeap);

            int [] ans = new int[k];
            int i=0;
            while(!minHeap.isEmpty()){
                ans[i] = minHeap.poll();
                i++;
            }
            return ans;
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("347. Top K Frequent Elements");
        // Answers are compared ignoring the order of the outer list (problem allows any order).

        tester.check("nums = [1,1,1,2,2,3], k = 2", "[1,2]", Tester.Order.ANY, () -> {
            int[] nums = new int[]{1, 1, 1, 2, 2, 3};
            int k = 2;
            return new Solution().topKFrequent(nums, k);
        });
        tester.check("nums = [1], k = 1", "[1]", Tester.Order.ANY, () -> {
            int[] nums = new int[]{1};
            int k = 1;
            return new Solution().topKFrequent(nums, k);
        });
        tester.check("nums = [1,2,1,2,1,2,3,1,3,2], k = 2", "[1,2]", Tester.Order.ANY, () -> {
            int[] nums = new int[]{1, 2, 1, 2, 1, 2, 3, 1, 3, 2};
            int k = 2;
            return new Solution().topKFrequent(nums, k);
        });

        tester.done();
    }
}
