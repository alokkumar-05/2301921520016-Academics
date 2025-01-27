# Transpose Matrix

## Problem Link
[Transpose Matrix - LeetCode](https://leetcode.com/problems/transpose-matrix/)

---

## Problem Description
Given a 2D matrix `matrix`, return the transpose of that matrix. The transpose of a matrix is the matrix flipped over its diagonal, swapping the row and column indices.

### Constraints:
- The matrix has dimensions `m x n`, where `1 <= m, n <= 1000`.
- The elements of the matrix are integers.

---

Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]

Example 2:
Input: matrix = [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]


---

## Approach

1. **Initialization**:
   - The number of rows (`R`) and columns (`C`) of the input matrix are obtained.
   - A new matrix `ans` with dimensions `C x R` is initialized.

2. **Filling the Transposed Matrix**:
   - Iterate over every element of the input matrix. For each element at position `[r][c]`, place it at position `[c][r]` in the new matrix.

---

## Complexity

- **Time Complexity**: `O(m * n)` — Every element in the matrix is visited once.
- **Space Complexity**: `O(m * n)` — The result matrix is of the same size as the input matrix.

---



---

### Note:
This solution efficiently transposes the matrix by swapping the row and column indices. The time complexity is linear relative to the size of the matrix, ensuring that it handles even the largest matrices within the problem's constraints.




