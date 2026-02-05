package com.deepu.dsa.arrays;

public class Element_In_Infinite_Sorted_Array {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,9,11,13,15,16,17,178,189};
        int target = 15;
        int ans = findBound(arr,target);
        System.out.println(ans);
    }
    static int findBound(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            start = end + 1;
            end = 2*start + 1;
        }
        return BinarySearch(arr,target,start,end);
    }
    static int BinarySearch(int[] arr, int target, int start, int end){
        int low = start;
        int high = end;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(target > arr[mid]){
                low = mid + 1;
            } else if (target < arr[mid]) {
                high = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
