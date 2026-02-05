package com.deepu.dsa.arrays;

public class Rotated_Binary_Search {
    public static void main(String[] args) {
        int[] rotArr = {4,5,6,7,8,0,1,2,3,4};
        int target = 3;
        int ans = search(rotArr,target);
        System.out.println(ans);
    }

    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        int firstTry = binarySearch(nums,target,0,pivot);
        if(firstTry != -1){
            return firstTry;
        }else{
            return binarySearch(nums,target,pivot+1,nums.length-1);
        }
    }
    public static int findPivot(int[] arr){
        int s = 0;
        int e = arr.length-1;
        while(s <= e){
            int m = s + (e-s)/2;
            //  4cases to find pivot
            if(m < e && arr[m] >arr[m+1] ){
                return m;
            }else if (m > s && arr[m] < arr[m-1]){
                return m-1;
            }else if(arr[s] >= arr[m]){
                e = m-1;
            }else{
                s = m+1;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] arr, int target,int start, int end ){
        while(start<=end){
            int mid = start + (end-start)/2;
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


