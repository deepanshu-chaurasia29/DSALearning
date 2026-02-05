package com.deepu.basics.bitwiseOperator;

import java.util.Arrays;

public class Solution {
    static void main() {
        int[][] matrix = {
                {1,1,0},
                {1,0,1},
                {0,0,1}
        };
        for (int row = 0; row < matrix.length; row++) {
            int start = 0;
            int end = matrix.length-1;

            // Flip
            while(start <= end){
                swap(matrix,row,start,end);
                start++;
                end--;
            }

        }
        System.out.println(Arrays.deepToString(matrix));
    }
    static void swap(int[][] matrix,int row, int s, int e){
        int temp = matrix[row][s] ^ 1;
        matrix[row][s] = matrix[row][e] ^ 1;
        matrix[row][e] = temp;
    }
}
