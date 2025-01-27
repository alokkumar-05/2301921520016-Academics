// LeetCode Problem 498: Diagonal Traverse
// Link: https://leetcode.com/problems/diagonal-traverse/

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[] result = new int[m * n];
        int index = 0;
        
        for (int i = 0; i < m + n - 1; i++) {
            if (i % 2 == 0) {
                int r = Math.min(i, m - 1), c = i - r;
                while (r >= 0 && c < n) result[index++] = mat[r--][c++];
            } else {
                int c = Math.min(i, n - 1), r = i - c;
                while (c >= 0 && r < m) result[index++] = mat[r++][c--];
            }
        }
        return result;
    }
}
