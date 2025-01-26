// Problem 566: Matrix Reshape
// Link: https://leetcode.com/problems/reshape-the-matrix/

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length;
        int m = mat[0].length;
        if (m * n != r * c) return mat;
        if (n == r && m == c) return mat;
        
        int[][] ans = new int[r][c];
        int ans_row = 0;
        int ans_col = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[ans_row][ans_col] = mat[i][j];
                ans_col++;
                if (ans_col == c) {
                    ans_col = 0;
                    ans_row++;
                }
            }
        }

        return ans;
    }
}
