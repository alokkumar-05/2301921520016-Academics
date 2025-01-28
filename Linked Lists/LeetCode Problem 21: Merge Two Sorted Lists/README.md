# Merge Two Sorted Lists

## Problem Link
[Merge Two Sorted Lists - LeetCode](https://leetcode.com/problems/merge-two-sorted-lists/)

---

## Problem Description
You are given the heads of two sorted linked lists `l1` and `l2`.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

---

### Constraints:
- The number of nodes in both lists is in the range `[0, 50]`.
- `-100 <= Node.val <= 100`
- Both `l1` and `l2` are sorted in non-decreasing order.

---

### Examples:

#### Example 1:
Input:list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

Example 2:
Input: list1 = [], list2 = []
Output: []

Example 3:
Input: list1 = [], list2 = [0]
Output: [0]

---

## Approach

### Recursive Approach:
1. If either `l1` or `l2` is `null`, return the non-null list as the merged list.
2. Compare the values of the current nodes of `l1` and `l2`.
3. Assign the smaller node to the result and recursively call the function for the remaining nodes of the chosen list and the other list.
4. Return the result node as the head of the merged list.

---

## Complexity

- **Time Complexity**: `O(n + m)` — Where `n` and `m` are the lengths of `l1` and `l2`, respectively. Each node is visited once.
- **Space Complexity**: `O(n + m)` — Due to the recursive function calls.

---

### Note:
This solution uses recursion to merge the lists. An iterative solution can also be implemented to optimize space usage.

