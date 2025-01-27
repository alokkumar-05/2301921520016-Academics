# Diagonal Traverse

## Problem Link
[Diagonal Traverse - LeetCode](https://leetcode.com/problems/diagonal-traverse/)

---

## Problem Description
Given an `m x n` matrix, return all elements of the matrix in diagonal order, starting from the top-left corner.

---

### Constraints:
- `1 <= m, n <= 10^4`
- `-10^5 <= mat[i][j] <= 10^5`

---

### Examples:

#### Example 1:
Input: mat = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,4,7,5,3,6,8,9]

Example 2:
Input: mat = [[1,2],[3,4]]
Output: [1,2,3,4]

---

## Approach

### Observations:
- Each diagonal corresponds to a fixed sum of row and column indices, i.e., `r + c = i`.
- For even `i`, traverse the diagonal from top to bottom.
- For odd `i`, traverse the diagonal from bottom to top.

---

### Algorithm:
1. Loop through all diagonals (`i` from `0` to `m + n - 2`):
   - For even diagonals, move downward-right.
   - For odd diagonals, move upward-left.
2. Use bounds to determine valid rows and columns for each diagonal.
3. Append elements to the result array.

---

## Complexity

- **Time Complexity**: `O(m * n)` — Every element of the matrix is visited exactly once.
- **Space Complexity**: `O(m * n)` — The result array stores all elements of the matrix.

---

## Solution Code
See [Solution.java](./Solution.java) for the implementation.

---

### Note:
This solution efficiently calculates the diagonal order traversal without using additional space for intermediate storage. The algorithm handles edge cases such as single-row or single-column matrices gracefully.

