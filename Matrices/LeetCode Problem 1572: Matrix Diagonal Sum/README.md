# Matrix Diagonal Sum

## Problem Link
[Matrix Diagonal Sum - LeetCode](https://leetcode.com/problems/matrix-diagonal-sum/)

---

## Problem Description
Given a square matrix `mat`, return the sum of the matrix's diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

---

### Constraints:
- `n == mat.length == mat[i].length`
- `1 <= n <= 100`
- `1 <= mat[i][j] <= 100`

---

### Examples:

#### Example 1:
Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.

Example 2:
Input: mat = [[1,1,1,1],
              [1,1,1,1],
              [1,1,1,1],
              [1,1,1,1]]
Output: 8

Example 3:
Input: mat = [[5]]
Output: 5

---

## Approach

1. **Primary Diagonal**:
   - The elements on the primary diagonal have indices `(i, i)`.

2. **Secondary Diagonal**:
   - The elements on the secondary diagonal have indices `(i, n - 1 - i)`.

3. **Optimization**:
   - Avoid double-counting the middle element when the matrix has an odd dimension.

---

## Complexity

- **Time Complexity**: `O(n^2)` — Traverse each element in the matrix once.
- **Space Complexity**: `O(1)` — No extra space used other than a variable to store the sum.

---

### Note:
This solution efficiently calculates the diagonal sum for both primary and secondary diagonals while ensuring no double-counting for odd-sized matrices.
