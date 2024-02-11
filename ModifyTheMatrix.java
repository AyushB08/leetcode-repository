//PROBLEM LINK: https://leetcode.com/contest/weekly-contest-384/problems/modify-the-matrix/ 
class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        for (int i = 0; i<matrix[0].length; i++) {
            for (int a = 0; a<matrix.length; a++) {
                if (matrix[a][i] == -1) {
                    int x = maxValue(matrix, i);
                    matrix[a][i] = x;
                }
            }
        }
        return matrix;
    }
    
    
    public int maxValue(int[][] matrix, int column) {
        int max = 0;
        for (int i = 0; i<matrix.length; i++) {
            if (matrix[i][column] > max) {
                max = matrix[i][column];
            }
        }
        return max;
    }

}
