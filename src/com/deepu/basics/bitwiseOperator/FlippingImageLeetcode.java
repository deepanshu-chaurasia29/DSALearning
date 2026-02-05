package com.deepu.basics.bitwiseOperator;

import java.util.Arrays;

public class FlippingImageLeetcode {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,0,0},
                {0,1,0},
                {1,1,0}
        };
        System.out.println(Arrays.deepToString(matrix));
        flip(matrix);
        System.out.println(Arrays.deepToString(matrix));


    }
    static void flip(int[][] matrix){
        int l = matrix.length;
        for (int row = 0; row < l; row++) {
            int start = 0;
            int end = l-1;

            //  Flipping
            while(start <= end){
                int temp = matrix[row][start] ^ 1;
                matrix[row][start] = matrix[row][end] ^ 1;
                matrix[row][end] = temp;
                start++;
                end--;
            }

            // Inverting
//            for (int col = 0; col < l; col++) {
//                matrix[row][col] ^= 1;
//            }
        }
    }
}
