package com.deepu.dsa.arrays;

public class Search_2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {-1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int target = -2;
        boolean ans = search(matrix,target);
        System.out.println(ans);
    }

    static boolean search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        int row = -1;
        for (int i = 0; i < rows; i++) {
            if(target >= matrix[i][0] && target <= matrix[i][cols-1]){
                row = i;
                break;
            }
        }

        // target element not found in array
        if(row == -1){
            return false;
        }

        // binary search in that row
        int start = 0;
        int end = cols - 1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == matrix[row][mid]){
                return true;
            }
            if (target > matrix[row][mid]){
                start = mid+1;
            }
            else end = mid-1;
        }
        return false;
    }
}
