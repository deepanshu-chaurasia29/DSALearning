package com.deepu.dsa.arrays;

import java.util.Arrays;

public class SearchInSortedMatrix {
    static void main() {
        int[][] matrix = {
                {10,20,30,40},
                {50,60,70,80},
                {90,100,110,120},
                {130,140,150,160},
        };
        int[] ans = search(matrix,140);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] binarySearch(int[][] matrix, int row,int cStrat,int cEnd,int target){
        while(cStrat <= cEnd){
            int mid = cStrat + (cEnd-cStrat)/2;
            if(target == matrix[row][mid]){
                return new int[]{row,mid};
            }
            if(target > matrix[row][mid]){
                cStrat = mid +1;
            }else{
                cEnd = mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    public static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(cols == 0){
            return new int[]{-1,-1};
        }
        if(rows == 1){
            return binarySearch(matrix,0,0,cols-1,target);
        }

        int rStart = 0;
        int rEnd = rows -1;
        int cMid = cols/2;

        while(rStart <(rEnd-1)){
            int rMid = rStart + (rEnd-rStart)/2;
            if(target == matrix[rMid][cMid]){
                return new int[]{rMid,cMid};
            }
            if(target > matrix[rMid][cMid]){
                rStart = rMid;
            }else{
                rEnd = rMid;
            }
        }

        // now, we have two rows
        // check whether the target is in column of two rows
        if(target == matrix[rStart][cMid]){
            return new int[]{rStart,cMid};
        }
        if(target == matrix[rStart+1][cMid]){
            return new int[]{rStart+1,cMid};
        }

        // search in 1st half:
        if(target < matrix[rStart][cMid]){
            return binarySearch(matrix,rStart,0,cMid,target);
        }
        // search in 2nd half:
        if(target > matrix[rStart][cMid+1] && target < matrix[rStart][cols-1]){
            return binarySearch(matrix,rStart,cMid+1,cols-1,target);
        }
        // search in 3rd half:
        if(target < matrix[rStart+1][cMid]){
            return binarySearch(matrix,rStart+1,0,cMid,target);
        }
        // search in 4rt half:
        else{
            return binarySearch(matrix,rStart+1,cMid+1,cols-1,target);
        }


    }
}

