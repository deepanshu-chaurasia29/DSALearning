package com.deepu.dsa.recursion;

public class ArraySortedOrNot {
    static void main() {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(sorted(arr,0));
    }
    public static boolean sorted(int[] arr, int ci){
        if(ci == arr.length - 1){
            return true;
        }
        boolean ans = arr[ci] < arr[ci+1];
        if(ans){
            return  sorted(arr,ci+1);
        }else{
            return ans;
        }

    }
}
