package com.deepu.dsa.arrays;

import java.util.Arrays;

public class SearchIn2DArrays {
    public static void main(String[] args) {
//        int[][] arr = {
//                {23,45,24},
//                {12,46,78,23},
//                {1,2,5},
//                {44,66,77}
//        };
//        int target = 2;
//        int[] ans = search(arr,target);
//        System.out.println(Arrays.toString(ans));

        int[][] arr = {
                {23,45,24},
                {12,46,78,23},
                {1,2,5},
                {44,66,77}
        };
        int ans = MaxIn2dArray(arr);
        System.out.println(ans);

        int ans2 = minIn2dArray(arr);
        System.out.println(ans2);

    }
    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length ; col++) {
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[] {-1,-1};
    }

    // Max in 2d array
    static int MaxIn2dArray(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > max){
                    max = arr[row][col];
                }

            }
        }
        return max;
    }

    // Min in 2d array
    static int minIn2dArray(int[][] arr){
        int min = Integer.MAX_VALUE;
        for(int row=0; row<arr.length; row++){
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] < min){
                    min = arr[row][col];
                }
            }
        }
        return min;
    }

}
