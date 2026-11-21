# NeetCode 250 (Java)

All 250 problems from the [NeetCode 250](https://neetcode.io/practice/practice/neetcode250) list,
one folder per topic, in NeetCode's order (easy to hard).
60 Easy, 155 Medium, 35 Hard.

## How to practise

1. Open a problem file, e.g. `ArraysAndHashing/Q04_TwoSum.java`. The problem statement is in the comment at the top.
2. Write your code inside `static class Solution` and delete the `throw new UnsupportedOperationException("TODO")` line.
   The class is exactly what LeetCode gives you, so you can paste it straight into LeetCode to submit.
3. Run the file's `main()`. It runs the LeetCode examples and prints `PASS` / `FAIL` with the expected and actual output.
4. Add your own edge cases at the bottom of `main()`. Copy any existing `tester.check(...)` and change the input and expected output.

```
=== 1. Two Sum ===
Test 1  PASS  (1 ms)
Test 2  FAIL
    input:    nums = [3,2,4], target = 6
    expected: [1,2]
    got:      [0,0]
Test 3  PASS  (0 ms)
-----
1. Two Sum: passed 2/3
```

### Notes

- `common/` has the shared helpers: `ListNode` and `TreeNode` (same as LeetCode's), the `P` parsers
  (`P.tree("[1,null,2]")`, `P.list("[1,2,3]")`, `P.li(...)`, ...) and the `Tester`.
- Each test has a 3-second time limit, so an infinite loop shows up as `TIME LIMIT EXCEEDED` instead of hanging.
- If the problem says the answer can be in any order, the test ignores order.
  A few problems accept several correct answers (e.g. *Longest Palindromic Substring*). If yours is valid but
  different from the example, the test reports FAIL even though LeetCode would accept it.
- 7 problems are LeetCode Premium (Meeting Rooms, Alien Dictionary, ...). Their files have a summary of
  the problem, and NeetCode has a free version of each at the NeetCode link in the file.

## Arrays & Hashing (22)

| Done | # | Problem | Difficulty | File |
|---|---|---|---|---|
| [ ] | 1929 | [Concatenation of Array](https://leetcode.com/problems/concatenation-of-array/) | Easy | [Q01_ConcatenationOfArray](ArraysAndHashing/Q01_ConcatenationOfArray.java) |
| [ ] | 217 | [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/) | Easy | [Q02_ContainsDuplicate](ArraysAndHashing/Q02_ContainsDuplicate.java) |
| [ ] | 242 | [Valid Anagram](https://leetcode.com/problems/valid-anagram/) | Easy | [Q03_ValidAnagram](ArraysAndHashing/Q03_ValidAnagram.java) |
| [ ] | 1 | [Two Sum](https://leetcode.com/problems/two-sum/) | Easy | [Q04_TwoSum](ArraysAndHashing/Q04_TwoSum.java) |
| [ ] | 14 | [Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/) | Easy | [Q05_LongestCommonPrefix](ArraysAndHashing/Q05_LongestCommonPrefix.java) |
| [ ] | 49 | [Group Anagrams](https://leetcode.com/problems/group-anagrams/) | Medium | [Q06_GroupAnagrams](ArraysAndHashing/Q06_GroupAnagrams.java) |
| [ ] | 27 | [Remove Element](https://leetcode.com/problems/remove-element/) | Easy | [Q07_RemoveElement](ArraysAndHashing/Q07_RemoveElement.java) |
| [ ] | 169 | [Majority Element](https://leetcode.com/problems/majority-element/) | Easy | [Q08_MajorityElement](ArraysAndHashing/Q08_MajorityElement.java) |
| [ ] | 705 | [Design HashSet](https://leetcode.com/problems/design-hashset/) | Easy | [Q09_DesignHashSet](ArraysAndHashing/Q09_DesignHashSet.java) |
| [ ] | 706 | [Design HashMap](https://leetcode.com/problems/design-hashmap/) | Easy | [Q10_DesignHashMap](ArraysAndHashing/Q10_DesignHashMap.java) |
| [ ] | 912 | [Sort an Array](https://leetcode.com/problems/sort-an-array/) | Medium | [Q11_SortAnArray](ArraysAndHashing/Q11_SortAnArray.java) |
| [ ] | 75 | [Sort Colors](https://leetcode.com/problems/sort-colors/) | Medium | [Q12_SortColors](ArraysAndHashing/Q12_SortColors.java) |
| [ ] | 347 | [Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/) | Medium | [Q13_TopKFrequentElements](ArraysAndHashing/Q13_TopKFrequentElements.java) |
| [ ] | 271 | [Encode and Decode Strings](https://leetcode.com/problems/encode-and-decode-strings/) | Medium | [Q14_EncodeAndDecodeStrings](ArraysAndHashing/Q14_EncodeAndDecodeStrings.java) |
| [ ] | 304 | [Range Sum Query 2D - Immutable](https://leetcode.com/problems/range-sum-query-2d-immutable/) | Medium | [Q15_RangeSumQuery2DImmutable](ArraysAndHashing/Q15_RangeSumQuery2DImmutable.java) |
| [ ] | 238 | [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/) | Medium | [Q16_ProductOfArrayExceptSelf](ArraysAndHashing/Q16_ProductOfArrayExceptSelf.java) |
| [ ] | 36 | [Valid Sudoku](https://leetcode.com/problems/valid-sudoku/) | Medium | [Q17_ValidSudoku](ArraysAndHashing/Q17_ValidSudoku.java) |
| [ ] | 128 | [Longest Consecutive Sequence](https://leetcode.com/problems/longest-consecutive-sequence/) | Medium | [Q18_LongestConsecutiveSequence](ArraysAndHashing/Q18_LongestConsecutiveSequence.java) |
| [ ] | 122 | [Best Time to Buy and Sell Stock II](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/) | Medium | [Q19_BestTimeToBuyAndSellStockII](ArraysAndHashing/Q19_BestTimeToBuyAndSellStockII.java) |
| [ ] | 229 | [Majority Element II](https://leetcode.com/problems/majority-element-ii/) | Medium | [Q20_MajorityElementII](ArraysAndHashing/Q20_MajorityElementII.java) |
| [ ] | 560 | [Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/) | Medium | [Q21_SubarraySumEqualsK](ArraysAndHashing/Q21_SubarraySumEqualsK.java) |
| [ ] | 41 | [First Missing Positive](https://leetcode.com/problems/first-missing-positive/) | Hard | [Q22_FirstMissingPositive](ArraysAndHashing/Q22_FirstMissingPositive.java) |

## Two Pointers (13)

| Done | # | Problem | Difficulty | File |
|---|---|---|---|---|
| [ ] | 344 | [Reverse String](https://leetcode.com/problems/reverse-string/) | Easy | [Q01_ReverseString](TwoPointers/Q01_ReverseString.java) |
| [ ] | 125 | [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/) | Easy | [Q02_ValidPalindrome](TwoPointers/Q02_ValidPalindrome.java) |
| [ ] | 680 | [Valid Palindrome II](https://leetcode.com/problems/valid-palindrome-ii/) | Easy | [Q03_ValidPalindromeII](TwoPointers/Q03_ValidPalindromeII.java) |
| [ ] | 1768 | [Merge Strings Alternately](https://leetcode.com/problems/merge-strings-alternately/) | Easy | [Q04_MergeStringsAlternately](TwoPointers/Q04_MergeStringsAlternately.java) |
| [ ] | 88 | [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/) | Easy | [Q05_MergeSortedArray](TwoPointers/Q05_MergeSortedArray.java) |
| [ ] | 26 | [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) | Easy | [Q06_RemoveDuplicatesFromSortedArray](TwoPointers/Q06_RemoveDuplicatesFromSortedArray.java) |
| [ ] | 167 | [Two Sum II - Input Array Is Sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/) | Medium | [Q07_TwoSumIIInputArrayIsSorted](TwoPointers/Q07_TwoSumIIInputArrayIsSorted.java) |
| [ ] | 15 | [3Sum](https://leetcode.com/problems/3sum/) | Medium | [Q08_3Sum](TwoPointers/Q08_3Sum.java) |
| [ ] | 18 | [4Sum](https://leetcode.com/problems/4sum/) | Medium | [Q09_4Sum](TwoPointers/Q09_4Sum.java) |
| [ ] | 189 | [Rotate Array](https://leetcode.com/problems/rotate-array/) | Medium | [Q10_RotateArray](TwoPointers/Q10_RotateArray.java) |
| [ ] | 11 | [Container With Most Water](https://leetcode.com/problems/container-with-most-water/) | Medium | [Q11_ContainerWithMostWater](TwoPointers/Q11_ContainerWithMostWater.java) |
| [ ] | 881 | [Boats to Save People](https://leetcode.com/problems/boats-to-save-people/) | Medium | [Q12_BoatsToSavePeople](TwoPointers/Q12_BoatsToSavePeople.java) |
| [ ] | 42 | [Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/) | Hard | [Q13_TrappingRainWater](TwoPointers/Q13_TrappingRainWater.java) |

## Sliding Window (9)

| Done | # | Problem | Difficulty | File |
|---|---|---|---|---|
| [ ] | 219 | [Contains Duplicate II](https://leetcode.com/problems/contains-duplicate-ii/) | Easy | [Q01_ContainsDuplicateII](SlidingWindow/Q01_ContainsDuplicateII.java) |
| [ ] | 121 | [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | Easy | [Q02_BestTimeToBuyAndSellStock](SlidingWindow/Q02_BestTimeToBuyAndSellStock.java) |
| [ ] | 3 | [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | Medium | [Q03_LongestSubstringWithoutRepeatingCharacters](SlidingWindow/Q03_LongestSubstringWithoutRepeatingCharacters.java) |
| [ ] | 424 | [Longest Repeating Character Replacement](https://leetcode.com/problems/longest-repeating-character-replacement/) | Medium | [Q04_LongestRepeatingCharacterReplacement](SlidingWindow/Q04_LongestRepeatingCharacterReplacement.java) |
| [ ] | 567 | [Permutation in String](https://leetcode.com/problems/permutation-in-string/) | Medium | [Q05_PermutationInString](SlidingWindow/Q05_PermutationInString.java) |
| [ ] | 209 | [Minimum Size Subarray Sum](https://leetcode.com/problems/minimum-size-subarray-sum/) | Medium | [Q06_MinimumSizeSubarraySum](SlidingWindow/Q06_MinimumSizeSubarraySum.java) |
| [ ] | 658 | [Find K Closest Elements](https://leetcode.com/problems/find-k-closest-elements/) | Medium | [Q07_FindKClosestElements](SlidingWindow/Q07_FindKClosestElements.java) |
| [ ] | 76 | [Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/) | Hard | [Q08_MinimumWindowSubstring](SlidingWindow/Q08_MinimumWindowSubstring.java) |
| [ ] | 239 | [Sliding Window Maximum](https://leetcode.com/problems/sliding-window-maximum/) | Hard | [Q09_SlidingWindowMaximum](SlidingWindow/Q09_SlidingWindowMaximum.java) |

## Binary Search (14)

| Done | # | Problem | Difficulty | File |
|---|---|---|---|---|
| [ ] | 704 | [Binary Search](https://leetcode.com/problems/binary-search/) | Easy | [Q01_BinarySearch](BinarySearch/Q01_BinarySearch.java) |
| [ ] | 35 | [Search Insert Position](https://leetcode.com/problems/search-insert-position/) | Easy | [Q02_SearchInsertPosition](BinarySearch/Q02_SearchInsertPosition.java) |
| [ ] | 374 | [Guess Number Higher or Lower](https://leetcode.com/problems/guess-number-higher-or-lower/) | Easy | [Q03_GuessNumberHigherOrLower](BinarySearch/Q03_GuessNumberHigherOrLower.java) |
| [ ] | 69 | [Sqrt(x)](https://leetcode.com/problems/sqrtx/) | Easy | [Q04_SqrtX](BinarySearch/Q04_SqrtX.java) |
| [ ] | 74 | [Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix/) | Medium | [Q05_SearchA2DMatrix](BinarySearch/Q05_SearchA2DMatrix.java) |
| [ ] | 875 | [Koko Eating Bananas](https://leetcode.com/problems/koko-eating-bananas/) | Medium | [Q06_KokoEatingBananas](BinarySearch/Q06_KokoEatingBananas.java) |
| [ ] | 1011 | [Capacity To Ship Packages Within D Days](https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/) | Medium | [Q07_CapacityToShipPackagesWithinDDays](BinarySearch/Q07_CapacityToShipPackagesWithinDDays.java) |
| [ ] | 153 | [Find Minimum in Rotated Sorted Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/) | Medium | [Q08_FindMinimumInRotatedSortedArray](BinarySearch/Q08_FindMinimumInRotatedSortedArray.java) |
| [ ] | 33 | [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/) | Medium | [Q09_SearchInRotatedSortedArray](BinarySearch/Q09_SearchInRotatedSortedArray.java) |
| [ ] | 81 | [Search in Rotated Sorted Array II](https://leetcode.com/problems/search-in-rotated-sorted-array-ii/) | Medium | [Q10_SearchInRotatedSortedArrayII](BinarySearch/Q10_SearchInRotatedSortedArrayII.java) |
| [ ] | 981 | [Time Based Key-Value Store](https://leetcode.com/problems/time-based-key-value-store/) | Medium | [Q11_TimeBasedKeyValueStore](BinarySearch/Q11_TimeBasedKeyValueStore.java) |
| [ ] | 410 | [Split Array Largest Sum](https://leetcode.com/problems/split-array-largest-sum/) | Hard | [Q12_SplitArrayLargestSum](BinarySearch/Q12_SplitArrayLargestSum.java) |
| [ ] | 4 | [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/) | Hard | [Q13_MedianOfTwoSortedArrays](BinarySearch/Q13_MedianOfTwoSortedArrays.java) |
| [ ] | 1095 | [Find in Mountain Array](https://leetcode.com/problems/find-in-mountain-array/) | Hard | [Q14_FindInMountainArray](BinarySearch/Q14_FindInMountainArray.java) |

## Linked List (14)

| Done | # | Problem | Difficulty | File |
|---|---|---|---|---|
| [ ] | 206 | [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/) | Easy | [Q01_ReverseLinkedList](LinkedList/Q01_ReverseLinkedList.java) |
| [ ] | 21 | [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/) | Easy | [Q02_MergeTwoSortedLists](LinkedList/Q02_MergeTwoSortedLists.java) |
| [ ] | 141 | [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/) | Easy | [Q03_LinkedListCycle](LinkedList/Q03_LinkedListCycle.java) |
| [ ] | 143 | [Reorder List](https://leetcode.com/problems/reorder-list/) | Medium | [Q04_ReorderList](LinkedList/Q04_ReorderList.java) |
| [ ] | 19 | [Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/) | Medium | [Q05_RemoveNthNodeFromEndOfList](LinkedList/Q05_RemoveNthNodeFromEndOfList.java) |
| [ ] | 138 | [Copy List with Random Pointer](https://leetcode.com/problems/copy-list-with-random-pointer/) | Medium | [Q06_CopyListWithRandomPointer](LinkedList/Q06_CopyListWithRandomPointer.java) |
| [ ] | 2 | [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/) | Medium | [Q07_AddTwoNumbers](LinkedList/Q07_AddTwoNumbers.java) |
| [ ] | 287 | [Find the Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/) | Medium | [Q08_FindTheDuplicateNumber](LinkedList/Q08_FindTheDuplicateNumber.java) |
| [ ] | 92 | [Reverse Linked List II](https://leetcode.com/problems/reverse-linked-list-ii/) | Medium | [Q09_ReverseLinkedListII](LinkedList/Q09_ReverseLinkedListII.java) |
| [ ] | 622 | [Design Circular Queue](https://leetcode.com/problems/design-circular-queue/) | Medium | [Q10_DesignCircularQueue](LinkedList/Q10_DesignCircularQueue.java) |
| [ ] | 146 | [LRU Cache](https://leetcode.com/problems/lru-cache/) | Medium | [Q11_LRUCache](LinkedList/Q11_LRUCache.java) |
| [ ] | 460 | [LFU Cache](https://leetcode.com/problems/lfu-cache/) | Hard | [Q12_LFUCache](LinkedList/Q12_LFUCache.java) |
| [ ] | 23 | [Merge k Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/) | Hard | [Q13_MergeKSortedLists](LinkedList/Q13_MergeKSortedLists.java) |
| [ ] | 25 | [Reverse Nodes in k-Group](https://leetcode.com/problems/reverse-nodes-in-k-group/) | Hard | [Q14_ReverseNodesInKGroup](LinkedList/Q14_ReverseNodesInKGroup.java) |

## Stack (14)

| Done | # | Problem | Difficulty | File |
|---|---|---|---|---|
| [ ] | 682 | [Baseball Game](https://leetcode.com/problems/baseball-game/) | Easy | [Q01_BaseballGame](Stack/Q01_BaseballGame.java) |
| [ ] | 20 | [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | Easy | [Q02_ValidParentheses](Stack/Q02_ValidParentheses.java) |
| [ ] | 225 | [Implement Stack using Queues](https://leetcode.com/problems/implement-stack-using-queues/) | Easy | [Q03_ImplementStackUsingQueues](Stack/Q03_ImplementStackUsingQueues.java) |
| [ ] | 232 | [Implement Queue using Stacks](https://leetcode.com/problems/implement-queue-using-stacks/) | Easy | [Q04_ImplementQueueUsingStacks](Stack/Q04_ImplementQueueUsingStacks.java) |
| [ ] | 155 | [Min Stack](https://leetcode.com/problems/min-stack/) | Medium | [Q05_MinStack](Stack/Q05_MinStack.java) |
| [ ] | 150 | [Evaluate Reverse Polish Notation](https://leetcode.com/problems/evaluate-reverse-polish-notation/) | Medium | [Q06_EvaluateReversePolishNotation](Stack/Q06_EvaluateReversePolishNotation.java) |
| [ ] | 735 | [Asteroid Collision](https://leetcode.com/problems/asteroid-collision/) | Medium | [Q07_AsteroidCollision](Stack/Q07_AsteroidCollision.java) |
| [ ] | 739 | [Daily Temperatures](https://leetcode.com/problems/daily-temperatures/) | Medium | [Q08_DailyTemperatures](Stack/Q08_DailyTemperatures.java) |
| [ ] | 901 | [Online Stock Span](https://leetcode.com/problems/online-stock-span/) | Medium | [Q09_OnlineStockSpan](Stack/Q09_OnlineStockSpan.java) |
| [ ] | 853 | [Car Fleet](https://leetcode.com/problems/car-fleet/) | Medium | [Q10_CarFleet](Stack/Q10_CarFleet.java) |
| [ ] | 71 | [Simplify Path](https://leetcode.com/problems/simplify-path/) | Medium | [Q11_SimplifyPath](Stack/Q11_SimplifyPath.java) |
| [ ] | 394 | [Decode String](https://leetcode.com/problems/decode-string/) | Medium | [Q12_DecodeString](Stack/Q12_DecodeString.java) |
| [ ] | 895 | [Maximum Frequency Stack](https://leetcode.com/problems/maximum-frequency-stack/) | Hard | [Q13_MaximumFrequencyStack](Stack/Q13_MaximumFrequencyStack.java) |
| [ ] | 84 | [Largest Rectangle in Histogram](https://leetcode.com/problems/largest-rectangle-in-histogram/) | Hard | [Q14_LargestRectangleInHistogram](Stack/Q14_LargestRectangleInHistogram.java) |

## Trees (23)

| Done | # | Problem | Difficulty | File |
|---|---|---|---|---|
| [ ] | 94 | [Binary Tree Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/) | Easy | [Q01_BinaryTreeInorderTraversal](Trees/Q01_BinaryTreeInorderTraversal.java) |
| [ ] | 144 | [Binary Tree Preorder Traversal](https://leetcode.com/problems/binary-tree-preorder-traversal/) | Easy | [Q02_BinaryTreePreorderTraversal](Trees/Q02_BinaryTreePreorderTraversal.java) |
| [ ] | 145 | [Binary Tree Postorder Traversal](https://leetcode.com/problems/binary-tree-postorder-traversal/) | Easy | [Q03_BinaryTreePostorderTraversal](Trees/Q03_BinaryTreePostorderTraversal.java) |
| [ ] | 226 | [Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/) | Easy | [Q04_InvertBinaryTree](Trees/Q04_InvertBinaryTree.java) |
| [ ] | 104 | [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/) | Easy | [Q05_MaximumDepthOfBinaryTree](Trees/Q05_MaximumDepthOfBinaryTree.java) |
| [ ] | 543 | [Diameter of Binary Tree](https://leetcode.com/problems/diameter-of-binary-tree/) | Easy | [Q06_DiameterOfBinaryTree](Trees/Q06_DiameterOfBinaryTree.java) |
| [ ] | 110 | [Balanced Binary Tree](https://leetcode.com/problems/balanced-binary-tree/) | Easy | [Q07_BalancedBinaryTree](Trees/Q07_BalancedBinaryTree.java) |
| [ ] | 100 | [Same Tree](https://leetcode.com/problems/same-tree/) | Easy | [Q08_SameTree](Trees/Q08_SameTree.java) |
| [ ] | 572 | [Subtree of Another Tree](https://leetcode.com/problems/subtree-of-another-tree/) | Easy | [Q09_SubtreeOfAnotherTree](Trees/Q09_SubtreeOfAnotherTree.java) |
| [ ] | 235 | [Lowest Common Ancestor of a Binary Search Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/) | Medium | [Q10_LowestCommonAncestorOfABinarySearchTree](Trees/Q10_LowestCommonAncestorOfABinarySearchTree.java) |
| [ ] | 701 | [Insert into a Binary Search Tree](https://leetcode.com/problems/insert-into-a-binary-search-tree/) | Medium | [Q11_InsertIntoABinarySearchTree](Trees/Q11_InsertIntoABinarySearchTree.java) |
| [ ] | 450 | [Delete Node in a BST](https://leetcode.com/problems/delete-node-in-a-bst/) | Medium | [Q12_DeleteNodeInABST](Trees/Q12_DeleteNodeInABST.java) |
| [ ] | 102 | [Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/) | Medium | [Q13_BinaryTreeLevelOrderTraversal](Trees/Q13_BinaryTreeLevelOrderTraversal.java) |
| [ ] | 199 | [Binary Tree Right Side View](https://leetcode.com/problems/binary-tree-right-side-view/) | Medium | [Q14_BinaryTreeRightSideView](Trees/Q14_BinaryTreeRightSideView.java) |
| [ ] | 427 | [Construct Quad Tree](https://leetcode.com/problems/construct-quad-tree/) | Medium | [Q15_ConstructQuadTree](Trees/Q15_ConstructQuadTree.java) |
| [ ] | 1448 | [Count Good Nodes in Binary Tree](https://leetcode.com/problems/count-good-nodes-in-binary-tree/) | Medium | [Q16_CountGoodNodesInBinaryTree](Trees/Q16_CountGoodNodesInBinaryTree.java) |
| [ ] | 98 | [Validate Binary Search Tree](https://leetcode.com/problems/validate-binary-search-tree/) | Medium | [Q17_ValidateBinarySearchTree](Trees/Q17_ValidateBinarySearchTree.java) |
| [ ] | 230 | [Kth Smallest Element in a BST](https://leetcode.com/problems/kth-smallest-element-in-a-bst/) | Medium | [Q18_KthSmallestElementInABst](Trees/Q18_KthSmallestElementInABst.java) |
| [ ] | 105 | [Construct Binary Tree from Preorder and Inorder Traversal](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/) | Medium | [Q19_ConstructBinaryTreeFromPreorderAndInorderTraversal](Trees/Q19_ConstructBinaryTreeFromPreorderAndInorderTraversal.java) |
| [ ] | 337 | [House Robber III](https://leetcode.com/problems/house-robber-iii/) | Medium | [Q20_HouseRobberIII](Trees/Q20_HouseRobberIII.java) |
| [ ] | 1325 | [Delete Leaves With a Given Value](https://leetcode.com/problems/delete-leaves-with-a-given-value/) | Medium | [Q21_DeleteLeavesWithAGivenValue](Trees/Q21_DeleteLeavesWithAGivenValue.java) |
| [ ] | 124 | [Binary Tree Maximum Path Sum](https://leetcode.com/problems/binary-tree-maximum-path-sum/) | Hard | [Q22_BinaryTreeMaximumPathSum](Trees/Q22_BinaryTreeMaximumPathSum.java) |
| [ ] | 297 | [Serialize and Deserialize Binary Tree](https://leetcode.com/problems/serialize-and-deserialize-binary-tree/) | Hard | [Q23_SerializeAndDeserializeBinaryTree](Trees/Q23_SerializeAndDeserializeBinaryTree.java) |

## Tries (4)

| Done | # | Problem | Difficulty | File |
|---|---|---|---|---|
| [ ] | 208 | [Implement Trie (Prefix Tree)](https://leetcode.com/problems/implement-trie-prefix-tree/) | Medium | [Q01_ImplementTriePrefixTree](Tries/Q01_ImplementTriePrefixTree.java) |
| [ ] | 211 | [Design Add and Search Words Data Structure](https://leetcode.com/problems/design-add-and-search-words-data-structure/) | Medium | [Q02_DesignAddAndSearchWordsDataStructure](Tries/Q02_DesignAddAndSearchWordsDataStructure.java) |
| [ ] | 2707 | [Extra Characters in a String](https://leetcode.com/problems/extra-characters-in-a-string/) | Medium | [Q03_ExtraCharactersInAString](Tries/Q03_ExtraCharactersInAString.java) |
| [ ] | 212 | [Word Search II](https://leetcode.com/problems/word-search-ii/) | Hard | [Q04_WordSearchII](Tries/Q04_WordSearchII.java) |

## Backtracking (17)

| Done | # | Problem | Difficulty | File |
|---|---|---|---|---|
| [ ] | 1863 | [Sum of All Subset XOR Totals](https://leetcode.com/problems/sum-of-all-subset-xor-totals/) | Easy | [Q01_SumOfAllSubsetsXORTotal](Backtracking/Q01_SumOfAllSubsetsXORTotal.java) |
| [ ] | 78 | [Subsets](https://leetcode.com/problems/subsets/) | Medium | [Q02_Subsets](Backtracking/Q02_Subsets.java) |
| [ ] | 39 | [Combination Sum](https://leetcode.com/problems/combination-sum/) | Medium | [Q03_CombinationSum](Backtracking/Q03_CombinationSum.java) |
| [ ] | 40 | [Combination Sum II](https://leetcode.com/problems/combination-sum-ii/) | Medium | [Q04_CombinationSumII](Backtracking/Q04_CombinationSumII.java) |
| [ ] | 77 | [Combinations](https://leetcode.com/problems/combinations/) | Medium | [Q05_Combinations](Backtracking/Q05_Combinations.java) |
| [ ] | 46 | [Permutations](https://leetcode.com/problems/permutations/) | Medium | [Q06_Permutations](Backtracking/Q06_Permutations.java) |
| [ ] | 90 | [Subsets II](https://leetcode.com/problems/subsets-ii/) | Medium | [Q07_SubsetsII](Backtracking/Q07_SubsetsII.java) |
| [ ] | 47 | [Permutations II](https://leetcode.com/problems/permutations-ii/) | Medium | [Q08_PermutationsII](Backtracking/Q08_PermutationsII.java) |
| [ ] | 22 | [Generate Parentheses](https://leetcode.com/problems/generate-parentheses/) | Medium | [Q09_GenerateParentheses](Backtracking/Q09_GenerateParentheses.java) |
| [ ] | 79 | [Word Search](https://leetcode.com/problems/word-search/) | Medium | [Q10_WordSearch](Backtracking/Q10_WordSearch.java) |
| [ ] | 131 | [Palindrome Partitioning](https://leetcode.com/problems/palindrome-partitioning/) | Medium | [Q11_PalindromePartitioning](Backtracking/Q11_PalindromePartitioning.java) |
| [ ] | 17 | [Letter Combinations of a Phone Number](https://leetcode.com/problems/letter-combinations-of-a-phone-number/) | Medium | [Q12_LetterCombinationsOfAPhoneNumber](Backtracking/Q12_LetterCombinationsOfAPhoneNumber.java) |
| [ ] | 473 | [Matchsticks to Square](https://leetcode.com/problems/matchsticks-to-square/) | Medium | [Q13_MatchsticksToSquare](Backtracking/Q13_MatchsticksToSquare.java) |
| [ ] | 698 | [Partition to K Equal Sum Subsets](https://leetcode.com/problems/partition-to-k-equal-sum-subsets/) | Medium | [Q14_PartitionToKEqualSumSubsets](Backtracking/Q14_PartitionToKEqualSumSubsets.java) |
| [ ] | 51 | [N-Queens](https://leetcode.com/problems/n-queens/) | Hard | [Q15_NQueens](Backtracking/Q15_NQueens.java) |
| [ ] | 52 | [N-Queens II](https://leetcode.com/problems/n-queens-ii/) | Hard | [Q16_NQueensII](Backtracking/Q16_NQueensII.java) |
| [ ] | 140 | [Word Break II](https://leetcode.com/problems/word-break-ii/) | Hard | [Q17_WordBreakII](Backtracking/Q17_WordBreakII.java) |

## Heap / Priority Queue (12)

| Done | # | Problem | Difficulty | File |
|---|---|---|---|---|
| [ ] | 703 | [Kth Largest Element in a Stream](https://leetcode.com/problems/kth-largest-element-in-a-stream/) | Easy | [Q01_KthLargestElementInAStream](HeapPriorityQueue/Q01_KthLargestElementInAStream.java) |
| [ ] | 1046 | [Last Stone Weight](https://leetcode.com/problems/last-stone-weight/) | Easy | [Q02_LastStoneWeight](HeapPriorityQueue/Q02_LastStoneWeight.java) |
| [ ] | 973 | [K Closest Points to Origin](https://leetcode.com/problems/k-closest-points-to-origin/) | Medium | [Q03_KClosestPointsToOrigin](HeapPriorityQueue/Q03_KClosestPointsToOrigin.java) |
| [ ] | 215 | [Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/) | Medium | [Q04_KthLargestElementInAnArray](HeapPriorityQueue/Q04_KthLargestElementInAnArray.java) |
| [ ] | 621 | [Task Scheduler](https://leetcode.com/problems/task-scheduler/) | Medium | [Q05_TaskScheduler](HeapPriorityQueue/Q05_TaskScheduler.java) |
| [ ] | 355 | [Design Twitter](https://leetcode.com/problems/design-twitter/) | Medium | [Q06_DesignTwitter](HeapPriorityQueue/Q06_DesignTwitter.java) |
| [ ] | 1834 | [Single-Threaded CPU](https://leetcode.com/problems/single-threaded-cpu/) | Medium | [Q07_SingleThreadedCPU](HeapPriorityQueue/Q07_SingleThreadedCPU.java) |
| [ ] | 767 | [Reorganize String](https://leetcode.com/problems/reorganize-string/) | Medium | [Q08_ReorganizeString](HeapPriorityQueue/Q08_ReorganizeString.java) |
| [ ] | 1405 | [Longest Happy String](https://leetcode.com/problems/longest-happy-string/) | Medium | [Q09_LongestHappyString](HeapPriorityQueue/Q09_LongestHappyString.java) |
| [ ] | 1094 | [Car Pooling](https://leetcode.com/problems/car-pooling/) | Medium | [Q10_CarPooling](HeapPriorityQueue/Q10_CarPooling.java) |
| [ ] | 295 | [Find Median from Data Stream](https://leetcode.com/problems/find-median-from-data-stream/) | Hard | [Q11_FindMedianFromDataStream](HeapPriorityQueue/Q11_FindMedianFromDataStream.java) |
| [ ] | 502 | [IPO](https://leetcode.com/problems/ipo/) | Hard | [Q12_IPO](HeapPriorityQueue/Q12_IPO.java) |

## Graphs (21)

| Done | # | Problem | Difficulty | File |
|---|---|---|---|---|
| [ ] | 463 | [Island Perimeter](https://leetcode.com/problems/island-perimeter/) | Easy | [Q01_IslandPerimeter](Graphs/Q01_IslandPerimeter.java) |
| [ ] | 953 | [Verifying an Alien Dictionary](https://leetcode.com/problems/verifying-an-alien-dictionary/) | Easy | [Q02_VerifyingAnAlienDictionary](Graphs/Q02_VerifyingAnAlienDictionary.java) |
| [ ] | 997 | [Find the Town Judge](https://leetcode.com/problems/find-the-town-judge/) | Easy | [Q03_FindTheTownJudge](Graphs/Q03_FindTheTownJudge.java) |
| [ ] | 200 | [Number of Islands](https://leetcode.com/problems/number-of-islands/) | Medium | [Q04_NumberOfIslands](Graphs/Q04_NumberOfIslands.java) |
| [ ] | 695 | [Max Area of Island](https://leetcode.com/problems/max-area-of-island/) | Medium | [Q05_MaxAreaOfIsland](Graphs/Q05_MaxAreaOfIsland.java) |
| [ ] | 133 | [Clone Graph](https://leetcode.com/problems/clone-graph/) | Medium | [Q06_CloneGraph](Graphs/Q06_CloneGraph.java) |
| [ ] | 286 | [Walls And Gates](https://leetcode.com/problems/walls-and-gates/) | Medium | [Q07_WallsAndGates](Graphs/Q07_WallsAndGates.java) |
| [ ] | 994 | [Rotting Oranges](https://leetcode.com/problems/rotting-oranges/) | Medium | [Q08_RottingOranges](Graphs/Q08_RottingOranges.java) |
| [ ] | 417 | [Pacific Atlantic Water Flow](https://leetcode.com/problems/pacific-atlantic-water-flow/) | Medium | [Q09_PacificAtlanticWaterFlow](Graphs/Q09_PacificAtlanticWaterFlow.java) |
| [ ] | 130 | [Surrounded Regions](https://leetcode.com/problems/surrounded-regions/) | Medium | [Q10_SurroundedRegions](Graphs/Q10_SurroundedRegions.java) |
| [ ] | 752 | [Open the Lock](https://leetcode.com/problems/open-the-lock/) | Medium | [Q11_OpenTheLock](Graphs/Q11_OpenTheLock.java) |
| [ ] | 207 | [Course Schedule](https://leetcode.com/problems/course-schedule/) | Medium | [Q12_CourseSchedule](Graphs/Q12_CourseSchedule.java) |
| [ ] | 210 | [Course Schedule II](https://leetcode.com/problems/course-schedule-ii/) | Medium | [Q13_CourseScheduleII](Graphs/Q13_CourseScheduleII.java) |
| [ ] | 261 | [Graph Valid Tree](https://leetcode.com/problems/graph-valid-tree/) | Medium | [Q14_GraphValidTree](Graphs/Q14_GraphValidTree.java) |
| [ ] | 1462 | [Course Schedule IV](https://leetcode.com/problems/course-schedule-iv/) | Medium | [Q15_CourseScheduleIV](Graphs/Q15_CourseScheduleIV.java) |
| [ ] | 323 | [Number of Connected Components In An Undirected Graph](https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/) | Medium | [Q16_NumberOfConnectedComponentsInAnUndirectedGraph](Graphs/Q16_NumberOfConnectedComponentsInAnUndirectedGraph.java) |
| [ ] | 684 | [Redundant Connection](https://leetcode.com/problems/redundant-connection/) | Medium | [Q17_RedundantConnection](Graphs/Q17_RedundantConnection.java) |
| [ ] | 721 | [Accounts Merge](https://leetcode.com/problems/accounts-merge/) | Medium | [Q18_AccountsMerge](Graphs/Q18_AccountsMerge.java) |
| [ ] | 399 | [Evaluate Division](https://leetcode.com/problems/evaluate-division/) | Medium | [Q19_EvaluateDivision](Graphs/Q19_EvaluateDivision.java) |
| [ ] | 310 | [Minimum Height Trees](https://leetcode.com/problems/minimum-height-trees/) | Medium | [Q20_MinimumHeightTrees](Graphs/Q20_MinimumHeightTrees.java) |
| [ ] | 127 | [Word Ladder](https://leetcode.com/problems/word-ladder/) | Hard | [Q21_WordLadder](Graphs/Q21_WordLadder.java) |

## Advanced Graphs (10)

| Done | # | Problem | Difficulty | File |
|---|---|---|---|---|
| [ ] | 1631 | [Path With Minimum Effort](https://leetcode.com/problems/path-with-minimum-effort/) | Medium | [Q01_PathWithMinimumEffort](AdvancedGraphs/Q01_PathWithMinimumEffort.java) |
| [ ] | 743 | [Network Delay Time](https://leetcode.com/problems/network-delay-time/) | Medium | [Q02_NetworkDelayTime](AdvancedGraphs/Q02_NetworkDelayTime.java) |
| [ ] | 332 | [Reconstruct Itinerary](https://leetcode.com/problems/reconstruct-itinerary/) | Hard | [Q03_ReconstructItinerary](AdvancedGraphs/Q03_ReconstructItinerary.java) |
| [ ] | 1584 | [Min Cost to Connect All Points](https://leetcode.com/problems/min-cost-to-connect-all-points/) | Medium | [Q04_MinCostToConnectAllPoints](AdvancedGraphs/Q04_MinCostToConnectAllPoints.java) |
| [ ] | 778 | [Swim in Rising Water](https://leetcode.com/problems/swim-in-rising-water/) | Hard | [Q05_SwimInRisingWater](AdvancedGraphs/Q05_SwimInRisingWater.java) |
| [ ] | 269 | [Alien Dictionary](https://leetcode.com/problems/alien-dictionary/) | Hard | [Q06_AlienDictionary](AdvancedGraphs/Q06_AlienDictionary.java) |
| [ ] | 787 | [Cheapest Flights Within K Stops](https://leetcode.com/problems/cheapest-flights-within-k-stops/) | Medium | [Q07_CheapestFlightsWithinKStops](AdvancedGraphs/Q07_CheapestFlightsWithinKStops.java) |
| [ ] | 1489 | [Find Critical and Pseudo-Critical Edges in Minimum Spanning Tree](https://leetcode.com/problems/find-critical-and-pseudo-critical-edges-in-minimum-spanning-tree/) | Hard | [Q08_FindCriticalAndPseudoCriticalEdgesInMinimumSpanningTree](AdvancedGraphs/Q08_FindCriticalAndPseudoCriticalEdgesInMinimumSpanningTree.java) |
| [ ] | 2392 | [Build a Matrix With Conditions](https://leetcode.com/problems/build-a-matrix-with-conditions/) | Hard | [Q09_BuildAMatrixWithConditions](AdvancedGraphs/Q09_BuildAMatrixWithConditions.java) |
| [ ] | 2709 | [Greatest Common Divisor Traversal](https://leetcode.com/problems/greatest-common-divisor-traversal/) | Hard | [Q10_GreatestCommonDivisorTraversal](AdvancedGraphs/Q10_GreatestCommonDivisorTraversal.java) |

## 1-D Dynamic Programming (17)

| Done | # | Problem | Difficulty | File |
|---|---|---|---|---|
| [ ] | 70 | [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/) | Easy | [Q01_ClimbingStairs](DynamicProgramming1D/Q01_ClimbingStairs.java) |
| [ ] | 746 | [Min Cost Climbing Stairs](https://leetcode.com/problems/min-cost-climbing-stairs/) | Easy | [Q02_MinCostClimbingStairs](DynamicProgramming1D/Q02_MinCostClimbingStairs.java) |
| [ ] | 1137 | [N-th Tribonacci Number](https://leetcode.com/problems/n-th-tribonacci-number/) | Easy | [Q03_NThTribonacciNumber](DynamicProgramming1D/Q03_NThTribonacciNumber.java) |
| [ ] | 198 | [House Robber](https://leetcode.com/problems/house-robber/) | Medium | [Q04_HouseRobber](DynamicProgramming1D/Q04_HouseRobber.java) |
| [ ] | 213 | [House Robber II](https://leetcode.com/problems/house-robber-ii/) | Medium | [Q05_HouseRobberII](DynamicProgramming1D/Q05_HouseRobberII.java) |
| [ ] | 5 | [Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/) | Medium | [Q06_LongestPalindromicSubstring](DynamicProgramming1D/Q06_LongestPalindromicSubstring.java) |
| [ ] | 647 | [Palindromic Substrings](https://leetcode.com/problems/palindromic-substrings/) | Medium | [Q07_PalindromicSubstrings](DynamicProgramming1D/Q07_PalindromicSubstrings.java) |
| [ ] | 91 | [Decode Ways](https://leetcode.com/problems/decode-ways/) | Medium | [Q08_DecodeWays](DynamicProgramming1D/Q08_DecodeWays.java) |
| [ ] | 322 | [Coin Change](https://leetcode.com/problems/coin-change/) | Medium | [Q09_CoinChange](DynamicProgramming1D/Q09_CoinChange.java) |
| [ ] | 152 | [Maximum Product Subarray](https://leetcode.com/problems/maximum-product-subarray/) | Medium | [Q10_MaximumProductSubarray](DynamicProgramming1D/Q10_MaximumProductSubarray.java) |
| [ ] | 139 | [Word Break](https://leetcode.com/problems/word-break/) | Medium | [Q11_WordBreak](DynamicProgramming1D/Q11_WordBreak.java) |
| [ ] | 300 | [Longest Increasing Subsequence](https://leetcode.com/problems/longest-increasing-subsequence/) | Medium | [Q12_LongestIncreasingSubsequence](DynamicProgramming1D/Q12_LongestIncreasingSubsequence.java) |
| [ ] | 416 | [Partition Equal Subset Sum](https://leetcode.com/problems/partition-equal-subset-sum/) | Medium | [Q13_PartitionEqualSubsetSum](DynamicProgramming1D/Q13_PartitionEqualSubsetSum.java) |
| [ ] | 377 | [Combination Sum IV](https://leetcode.com/problems/combination-sum-iv/) | Medium | [Q14_CombinationSumIV](DynamicProgramming1D/Q14_CombinationSumIV.java) |
| [ ] | 279 | [Perfect Squares](https://leetcode.com/problems/perfect-squares/) | Medium | [Q15_PerfectSquares](DynamicProgramming1D/Q15_PerfectSquares.java) |
| [ ] | 343 | [Integer Break](https://leetcode.com/problems/integer-break/) | Medium | [Q16_IntegerBreak](DynamicProgramming1D/Q16_IntegerBreak.java) |
| [ ] | 1406 | [Stone Game III](https://leetcode.com/problems/stone-game-iii/) | Hard | [Q17_StoneGameIII](DynamicProgramming1D/Q17_StoneGameIII.java) |

## 2-D Dynamic Programming (16)

| Done | # | Problem | Difficulty | File |
|---|---|---|---|---|
| [ ] | 62 | [Unique Paths](https://leetcode.com/problems/unique-paths/) | Medium | [Q01_UniquePaths](DynamicProgramming2D/Q01_UniquePaths.java) |
| [ ] | 63 | [Unique Paths II](https://leetcode.com/problems/unique-paths-ii/) | Medium | [Q02_UniquePathsII](DynamicProgramming2D/Q02_UniquePathsII.java) |
| [ ] | 64 | [Minimum Path Sum](https://leetcode.com/problems/minimum-path-sum/) | Medium | [Q03_MinimumPathSum](DynamicProgramming2D/Q03_MinimumPathSum.java) |
| [ ] | 1143 | [Longest Common Subsequence](https://leetcode.com/problems/longest-common-subsequence/) | Medium | [Q04_LongestCommonSubsequence](DynamicProgramming2D/Q04_LongestCommonSubsequence.java) |
| [ ] | 1049 | [Last Stone Weight II](https://leetcode.com/problems/last-stone-weight-ii/) | Medium | [Q05_LastStoneWeightII](DynamicProgramming2D/Q05_LastStoneWeightII.java) |
| [ ] | 309 | [Best Time to Buy and Sell Stock with Cooldown](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/) | Medium | [Q06_BestTimeToBuyAndSellStockWithCooldown](DynamicProgramming2D/Q06_BestTimeToBuyAndSellStockWithCooldown.java) |
| [ ] | 518 | [Coin Change II](https://leetcode.com/problems/coin-change-ii/) | Medium | [Q07_CoinChangeII](DynamicProgramming2D/Q07_CoinChangeII.java) |
| [ ] | 494 | [Target Sum](https://leetcode.com/problems/target-sum/) | Medium | [Q08_TargetSum](DynamicProgramming2D/Q08_TargetSum.java) |
| [ ] | 97 | [Interleaving String](https://leetcode.com/problems/interleaving-string/) | Medium | [Q09_InterleavingString](DynamicProgramming2D/Q09_InterleavingString.java) |
| [ ] | 877 | [Stone Game](https://leetcode.com/problems/stone-game/) | Medium | [Q10_StoneGame](DynamicProgramming2D/Q10_StoneGame.java) |
| [ ] | 1140 | [Stone Game II](https://leetcode.com/problems/stone-game-ii/) | Medium | [Q11_StoneGameII](DynamicProgramming2D/Q11_StoneGameII.java) |
| [ ] | 329 | [Longest Increasing Path in a Matrix](https://leetcode.com/problems/longest-increasing-path-in-a-matrix/) | Hard | [Q12_LongestIncreasingPathInAMatrix](DynamicProgramming2D/Q12_LongestIncreasingPathInAMatrix.java) |
| [ ] | 115 | [Distinct Subsequences](https://leetcode.com/problems/distinct-subsequences/) | Hard | [Q13_DistinctSubsequences](DynamicProgramming2D/Q13_DistinctSubsequences.java) |
| [ ] | 72 | [Edit Distance](https://leetcode.com/problems/edit-distance/) | Medium | [Q14_EditDistance](DynamicProgramming2D/Q14_EditDistance.java) |
| [ ] | 312 | [Burst Balloons](https://leetcode.com/problems/burst-balloons/) | Hard | [Q15_BurstBalloons](DynamicProgramming2D/Q15_BurstBalloons.java) |
| [ ] | 10 | [Regular Expression Matching](https://leetcode.com/problems/regular-expression-matching/) | Hard | [Q16_RegularExpressionMatching](DynamicProgramming2D/Q16_RegularExpressionMatching.java) |

## Greedy (14)

| Done | # | Problem | Difficulty | File |
|---|---|---|---|---|
| [ ] | 860 | [Lemonade Change](https://leetcode.com/problems/lemonade-change/) | Easy | [Q01_LemonadeChange](Greedy/Q01_LemonadeChange.java) |
| [ ] | 53 | [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/) | Medium | [Q02_MaximumSubarray](Greedy/Q02_MaximumSubarray.java) |
| [ ] | 918 | [Maximum Sum Circular Subarray](https://leetcode.com/problems/maximum-sum-circular-subarray/) | Medium | [Q03_MaximumSumCircularSubarray](Greedy/Q03_MaximumSumCircularSubarray.java) |
| [ ] | 978 | [Longest Turbulent Subarray](https://leetcode.com/problems/longest-turbulent-subarray/) | Medium | [Q04_LongestTurbulentSubarray](Greedy/Q04_LongestTurbulentSubarray.java) |
| [ ] | 55 | [Jump Game](https://leetcode.com/problems/jump-game/) | Medium | [Q05_JumpGame](Greedy/Q05_JumpGame.java) |
| [ ] | 45 | [Jump Game II](https://leetcode.com/problems/jump-game-ii/) | Medium | [Q06_JumpGameII](Greedy/Q06_JumpGameII.java) |
| [ ] | 1871 | [Jump Game VII](https://leetcode.com/problems/jump-game-vii/) | Medium | [Q07_JumpGameVII](Greedy/Q07_JumpGameVII.java) |
| [ ] | 134 | [Gas Station](https://leetcode.com/problems/gas-station/) | Medium | [Q08_GasStation](Greedy/Q08_GasStation.java) |
| [ ] | 846 | [Hand of Straights](https://leetcode.com/problems/hand-of-straights/) | Medium | [Q09_HandOfStraights](Greedy/Q09_HandOfStraights.java) |
| [ ] | 649 | [Dota2 Senate](https://leetcode.com/problems/dota2-senate/) | Medium | [Q10_Dota2Senate](Greedy/Q10_Dota2Senate.java) |
| [ ] | 1899 | [Merge Triplets to Form Target Triplet](https://leetcode.com/problems/merge-triplets-to-form-target-triplet/) | Medium | [Q11_MergeTripletsToFormTargetTriplet](Greedy/Q11_MergeTripletsToFormTargetTriplet.java) |
| [ ] | 763 | [Partition Labels](https://leetcode.com/problems/partition-labels/) | Medium | [Q12_PartitionLabels](Greedy/Q12_PartitionLabels.java) |
| [ ] | 678 | [Valid Parenthesis String](https://leetcode.com/problems/valid-parenthesis-string/) | Medium | [Q13_ValidParenthesisString](Greedy/Q13_ValidParenthesisString.java) |
| [ ] | 135 | [Candy](https://leetcode.com/problems/candy/) | Hard | [Q14_Candy](Greedy/Q14_Candy.java) |

## Intervals (7)

| Done | # | Problem | Difficulty | File |
|---|---|---|---|---|
| [ ] | 57 | [Insert Interval](https://leetcode.com/problems/insert-interval/) | Medium | [Q01_InsertInterval](Intervals/Q01_InsertInterval.java) |
| [ ] | 56 | [Merge Intervals](https://leetcode.com/problems/merge-intervals/) | Medium | [Q02_MergeIntervals](Intervals/Q02_MergeIntervals.java) |
| [ ] | 435 | [Non-overlapping Intervals](https://leetcode.com/problems/non-overlapping-intervals/) | Medium | [Q03_NonOverlappingIntervals](Intervals/Q03_NonOverlappingIntervals.java) |
| [ ] | 252 | [Meeting Rooms](https://leetcode.com/problems/meeting-rooms/) | Easy | [Q04_MeetingRooms](Intervals/Q04_MeetingRooms.java) |
| [ ] | 253 | [Meeting Rooms II](https://leetcode.com/problems/meeting-rooms-ii/) | Medium | [Q05_MeetingRoomsII](Intervals/Q05_MeetingRoomsII.java) |
| [ ] | 2402 | [Meeting Rooms III](https://leetcode.com/problems/meeting-rooms-iii/) | Hard | [Q06_MeetingRoomsIII](Intervals/Q06_MeetingRoomsIII.java) |
| [ ] | 1851 | [Minimum Interval to Include Each Query](https://leetcode.com/problems/minimum-interval-to-include-each-query/) | Hard | [Q07_MinimumIntervalToIncludeEachQuery](Intervals/Q07_MinimumIntervalToIncludeEachQuery.java) |

## Bit Manipulation (10)

| Done | # | Problem | Difficulty | File |
|---|---|---|---|---|
| [ ] | 136 | [Single Number](https://leetcode.com/problems/single-number/) | Easy | [Q01_SingleNumber](BitManipulation/Q01_SingleNumber.java) |
| [ ] | 191 | [Number of 1 Bits](https://leetcode.com/problems/number-of-1-bits/) | Easy | [Q02_NumberOf1Bits](BitManipulation/Q02_NumberOf1Bits.java) |
| [ ] | 338 | [Counting Bits](https://leetcode.com/problems/counting-bits/) | Easy | [Q03_CountingBits](BitManipulation/Q03_CountingBits.java) |
| [ ] | 67 | [Add Binary](https://leetcode.com/problems/add-binary/) | Easy | [Q04_AddBinary](BitManipulation/Q04_AddBinary.java) |
| [ ] | 190 | [Reverse Bits](https://leetcode.com/problems/reverse-bits/) | Easy | [Q05_ReverseBits](BitManipulation/Q05_ReverseBits.java) |
| [ ] | 268 | [Missing Number](https://leetcode.com/problems/missing-number/) | Easy | [Q06_MissingNumber](BitManipulation/Q06_MissingNumber.java) |
| [ ] | 371 | [Sum of Two Integers](https://leetcode.com/problems/sum-of-two-integers/) | Medium | [Q07_SumOfTwoIntegers](BitManipulation/Q07_SumOfTwoIntegers.java) |
| [ ] | 7 | [Reverse Integer](https://leetcode.com/problems/reverse-integer/) | Medium | [Q08_ReverseInteger](BitManipulation/Q08_ReverseInteger.java) |
| [ ] | 201 | [Bitwise AND of Numbers Range](https://leetcode.com/problems/bitwise-and-of-numbers-range/) | Medium | [Q09_BitwiseANDOfNumbersRange](BitManipulation/Q09_BitwiseANDOfNumbersRange.java) |
| [ ] | 3133 | [Minimum Array End](https://leetcode.com/problems/minimum-array-end/) | Medium | [Q10_MinimumArrayEnd](BitManipulation/Q10_MinimumArrayEnd.java) |

## Math & Geometry (13)

| Done | # | Problem | Difficulty | File |
|---|---|---|---|---|
| [ ] | 168 | [Excel Sheet Column Title](https://leetcode.com/problems/excel-sheet-column-title/) | Easy | [Q01_ExcelSheetColumnTitle](MathAndGeometry/Q01_ExcelSheetColumnTitle.java) |
| [ ] | 1071 | [Greatest Common Divisor of Strings](https://leetcode.com/problems/greatest-common-divisor-of-strings/) | Easy | [Q02_GreatestCommonDivisorOfStrings](MathAndGeometry/Q02_GreatestCommonDivisorOfStrings.java) |
| [ ] | 2807 | [Insert Greatest Common Divisors in Linked List](https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/) | Medium | [Q03_InsertGreatestCommonDivisorsInLinkedList](MathAndGeometry/Q03_InsertGreatestCommonDivisorsInLinkedList.java) |
| [ ] | 867 | [Transpose Matrix](https://leetcode.com/problems/transpose-matrix/) | Easy | [Q04_TransposeMatrix](MathAndGeometry/Q04_TransposeMatrix.java) |
| [ ] | 48 | [Rotate Image](https://leetcode.com/problems/rotate-image/) | Medium | [Q05_RotateImage](MathAndGeometry/Q05_RotateImage.java) |
| [ ] | 54 | [Spiral Matrix](https://leetcode.com/problems/spiral-matrix/) | Medium | [Q06_SpiralMatrix](MathAndGeometry/Q06_SpiralMatrix.java) |
| [ ] | 73 | [Set Matrix Zeroes](https://leetcode.com/problems/set-matrix-zeroes/) | Medium | [Q07_SetMatrixZeroes](MathAndGeometry/Q07_SetMatrixZeroes.java) |
| [ ] | 202 | [Happy Number](https://leetcode.com/problems/happy-number/) | Easy | [Q08_HappyNumber](MathAndGeometry/Q08_HappyNumber.java) |
| [ ] | 66 | [Plus One](https://leetcode.com/problems/plus-one/) | Easy | [Q09_PlusOne](MathAndGeometry/Q09_PlusOne.java) |
| [ ] | 13 | [Roman to Integer](https://leetcode.com/problems/roman-to-integer/) | Easy | [Q10_RomanToInteger](MathAndGeometry/Q10_RomanToInteger.java) |
| [ ] | 50 | [Pow(x, n)](https://leetcode.com/problems/powx-n/) | Medium | [Q11_PowXN](MathAndGeometry/Q11_PowXN.java) |
| [ ] | 43 | [Multiply Strings](https://leetcode.com/problems/multiply-strings/) | Medium | [Q12_MultiplyStrings](MathAndGeometry/Q12_MultiplyStrings.java) |
| [ ] | 2013 | [Detect Squares](https://leetcode.com/problems/detect-squares/) | Medium | [Q13_DetectSquares](MathAndGeometry/Q13_DetectSquares.java) |
