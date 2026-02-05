package com.deepu.dsa.recursion;

public class RotatedBinarySearch {
    static void main() {
        int[] arr = {5,6,7,8,1,2,3,4};
        System.out.println(search(arr,0,0,arr.length-1));
    }
    public static int search(int[] arr,int target,int s,int e){
        // This is base case, like while loop breaks when s > e;
        if(s > e){
            return -1;
        }
        int m = s + (e-s)/2;
        if(target == arr[m]){
            return m;
        }

        //  Left half sorted
        if(arr[s] <= arr[m] ){
            if(target >= arr[s] && target < arr[m]){
                return search(arr,target,s,m-1);
            }else{
                search(arr,target,m+1,e);
            }
        }

        // Right half sorted
        if(arr[s] > arr[m] && target < arr[e]){
            return search(arr,target,m+1,e);
        }
        return search(arr,target,s,m-1);

    }
}
