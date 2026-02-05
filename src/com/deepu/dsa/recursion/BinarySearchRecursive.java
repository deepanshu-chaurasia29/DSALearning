package com.deepu.dsa.recursion;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,89,99};
        int target = 4;
        System.out.println(BS(arr,target));
        int ansIndex = binarySearchRecursive(arr,target,0,arr.length-1);
        System.out.println(ansIndex);
    }
    static int BS(int[] arr, int target){
        int s = 0;
        int e = arr.length - 1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(target == arr[mid]){
                return mid;
            } else if (target > arr[mid]) {
                s = mid + 1;
            }else{
                e = mid - 1;
            }
        }
        return -1;
    }

    static int binarySearchRecursive(int[] arr, int target,int start,int end){
        if(start > end){  // base condition 1
            return -1;
        }

        int mid = start + (end-start)/2;
        if(target == arr[mid]){  // base condition 2
            return mid;
        }
        else if(target > arr[mid]){
            return binarySearchRecursive(arr,target,mid+1,end);
        }else{
            return binarySearchRecursive(arr,target,start,mid-1);
        }
    }
}
