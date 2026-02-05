package com.deepu.striverSheet;

import java.util.Arrays;

// LC - 73
public class SetMatrixZeroes {
    static void main() {

        int[][] matrix = {
                {1, 2, 2, 3},
                {2, 0, 0, 3},
                {1, 2, 3, 5}
        };
        setZeroes1(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    // Brute force approach
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;   // no of rows
        int n = matrix[0].length;  // no of columns

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    markRow(i, matrix);
                    markCol(j, matrix);
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }


    }

    // Mark all that row elements as -1
    public static void markRow(int i,int[][] matrix){
        for (int j = 0; j < matrix[i].length ; j++) {
            if(matrix[i][j] != 0) {
                matrix[i][j] = -1;
            }
        }
    }

    // Mark all that col elements as -1
    public static void markCol(int j,int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            if(matrix[i][j] != 0){
                matrix[i][j] = -1;
            }
        }
    }


    // better way
    public static void setZeroes1(int[][] matrix){
        int m = matrix.length;   // no of rows
        int n = matrix[0].length;  // no of columns

        int[] row = new int[matrix[0].length];
        int[] col = new int[matrix.length];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] == 0){
                    row[j] = 1;
                    col[i] = 1;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(row[j] == 1 || col[i] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
