# Matrix Reshape

## Problem Link
[Matrix Reshape - LeetCode](https://leetcode.com/problems/reshape-the-matrix/)

---

## Problem Description
You are given a 2D matrix `mat` and two integers `r` and `c` representing the number of rows and columns of the reshaped matrix. Your task is to reshape the matrix to the desired dimensions while preserving the row traversal order. If reshaping is not possible, return the original matrix.

---

### Constraints:
- The total number of elements in `mat` must equal `r * c`.
- If reshaping is not possible, return the original matrix.

---

### Examples:

#### Example 1:
Input: 
mat = [[1, 2], [3, 4]], r = 1, c = 4
Output: [[1, 2, 3, 4]]

---

#### Example 2:
Input: mat = [[1, 2], [3, 4]], r = 2, c = 4
Output: [[1, 2], [3, 4]]


---

## Approach

### 1. **Validation**:
   - Ensure that reshaping is possible by comparing the product of dimensions (`m * n` and `r * c`).
   - If `m * n != r * c`, return the original matrix.

### 2. **Iterative Transformation**:
   - Traverse through the original matrix in a row-major order.
   - Fill the reshaped matrix by copying elements sequentially.

---

## Complexity

- **Time Complexity**: `O(n * m)` — Each element of the original matrix is visited once.
- **Space Complexity**: `O(r * c)` — Space for the new reshaped matrix.

---

### Note:
This solution ensures that the reshaped matrix maintains the row-major order of the original matrix. It handles edge cases, such as when reshaping is not possible or unnecessary, effectively and efficiently.
