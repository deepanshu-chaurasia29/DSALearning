package com.deepu.dsa.arrays;

public class Count_Rotation_RBS {
    public static void main(String[] args) {
        int[] rotArr = {1,2,3,4,0};
        int target = 3;
        int pivot = findPivot(rotArr);
        System.out.println("count = " + (pivot + 1));

    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid -1;
            }
            else if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            else if(arr[start] >= arr[mid] ){
                end = mid -1;
            }
            else{
                start = mid +1;
            }
        }
        return -1;
    }
}

