package com.deepu.dsa.arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,7,12,34,56,78};
        int target = 34;
        int result = search(arr,target);
        if(result == -1){
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at index : " + result);
        }
    }
    static int search(int[] arr,int target){
        int mid=0,start=0,end=arr.length-1;
        while(start<=end){
            mid = (start+end)/2;  // mid = start + (end-start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if (target > arr[mid]){
                //Search in right
                start = mid+1;
            }
            else end = mid-1;
        }
        return -1;
    }
}
