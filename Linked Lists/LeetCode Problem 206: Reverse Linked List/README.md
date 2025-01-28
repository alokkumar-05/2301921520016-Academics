# Reverse Linked List

## Problem Link
[Reverse Linked List - LeetCode](https://leetcode.com/problems/reverse-linked-list/)

---

## Problem Description
Given the `head` of a singly linked list, reverse the list, and return the reversed list.

---

### Constraints:
- The number of nodes in the list is in the range `[0, 5000]`.
- `-5000 <= Node.val <= 5000`

---

### Examples:

#### Example 1:
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

Example 2:
Input: head = [1,2]
Output: [2,1]

Example 3:
Input: head = []
Output: []

---

## Approach

### Observations:
1. A linked list can be reversed iteratively by reassigning the `next` pointer of each node to point to its previous node.
2. Maintain three pointers:
   - `prev` to track the previous node (initially `null`).
   - `curr` to track the current node (initially `head`).
   - `temp` to temporarily store the next node (`curr.next`).

### Algorithm:
1. Initialize `prev` as `null` and `curr` as `head`.
2. Traverse the list:
   - Store the next node in `temp`.
   - Reverse the `next` pointer of the current node to point to `prev`.
   - Update `prev` to `curr` and move `curr` to `temp`.
3. At the end of the traversal, `prev` will point to the new head of the reversed list.

---

## Complexity

- **Time Complexity**: `O(n)` — Each node is visited once.
- **Space Complexity**: `O(1)` — No additional space is used other than pointers.

---

### Note:
This solution uses an iterative approach. A recursive solution could also be implemented, but it may use extra space due to the function call stack.
