package com.deepu.dsa.arrays;

public class FloorProblem {
    // Ceiling element-> greatest array element <= target
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,10,12,14,16};
        int target = 13;
        int result = Ceiling(arr,target);
        System.out.println(result);
    }
    static int Ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target > arr[arr.length - 1]){
                return -1;
            }
            if(target == arr[mid]){
                return arr[mid];
            }
            if (target > arr[mid]){
                start = mid+1;
            }
            if (target < arr[mid]){
                end = mid-1;
            }
        }

        return arr[end];
    }

}
