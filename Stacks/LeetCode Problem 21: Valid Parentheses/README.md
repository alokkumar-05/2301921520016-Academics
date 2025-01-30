# Valid Parentheses

## Problem Link
[Valid Parentheses - LeetCode](https://leetcode.com/problems/valid-parentheses/)

---

## Problem Description
Given a string `s` containing just the characters `'(', ')', '{', '}', '[' and ']'`, determine if the input string is valid.

An input string is valid if:
1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.
3. Every close bracket has a corresponding open bracket of the same type.

---

### Constraints:
- `1 <= s.length <= 10⁴`
- `s` consists of only `'(){}[]'`.

---

### Examples:

#### Example 1:
Input:s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false

Example 4:
Input: s = "([])"
Output: true

---

## Approach

### Observations:
1. A valid expression should maintain a Last-In-First-Out (LIFO) structure, making **Stacks** the ideal data structure.
2. If we encounter an opening bracket, we push it onto the stack.
3. If we encounter a closing bracket, we check if it matches the top of the stack.
   - If it does, we pop the top.
   - If it doesn’t match or the stack is empty, the string is invalid.
4. After processing the entire string, the stack should be empty.

---

## Complexity

- **Time Complexity**: `O(n)` — Each character is pushed/popped from the stack once.
- **Space Complexity**: `O(n)` — In the worst case, all characters are stored in the stack.

---

### Note:
The given approach using `replace()` inside a `while` loop is inefficient because `replace()` creates a new string on each iteration, leading to an `O(n²)` complexity. The stack-based solution is more optimal.

