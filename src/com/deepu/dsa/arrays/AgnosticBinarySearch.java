package com.deepu.dsa.arrays;

public class AgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {12,11,10,9,6,5,3,2,0};
//        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 3;
        int ans = orderAgnosticSearch(arr,target);
        System.out.println(ans);
    }
    static int orderAgnosticSearch(int[] arr, int target){
        int start=0,end=arr.length-1;

        while(start<=end){
            // check whether array is in increasing or in decreasing order
            // isAscOrDec == true -> ascending
            // isAscOrDec == true -> descending

            boolean isAscOrDec = arr[start] < arr[end];
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAscOrDec){
                if (target > arr[mid]){
                    // Search in right
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}
