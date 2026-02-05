package com.deepu.dsa.arrays;

import java.util.Arrays;

public class RowColMatrixSorted {
    static void main() {

        int[][] matrix = {
                {10,20,30,40},
                {50,60,70,80},
                {90,100,110,120},
                {130,140,150,160},
        };
        System.out.println(Arrays.toString(findTarget(matrix,68)));
    }
    public static int[] findTarget(int[][] matrix, int target){
        int row = 0;
        int col = matrix.length -1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target){
                return new int[]{row,col};
            }
            if(target > matrix[row][col]){
                row++;
            }else{
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
