package com.deepu.striverSheet;

import java.util.Arrays;

// LC - 73
public class SetMatrixZeroes {
    static void main() {

        int[][] matrix = {
                {1, 2, 2, 3},
                {2, 4, 0, 3},
                {1, 2, 3, 5}
        };
        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;   // no of rows
        int n = matrix[0].length;  // no of columns

        int rowNo = 0;  // 1
        int colNo = 0;  // 2
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rowNo = i;
                    colNo = j;
                }
            }
        }
        for (int row = 0; row < m; row++) {

            for (int col = 0; col < n; col++) {
                if(col == colNo){
                    matrix[row][colNo] = 0;
                }
                if(row == rowNo){
                    matrix[rowNo][col] = 0;
                }
            }

        }

    }
}
