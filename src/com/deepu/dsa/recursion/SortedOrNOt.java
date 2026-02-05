package com.deepu.dsa.recursion;

public class SortedOrNOt {
    static void main() {
        int[] arr = {1,4,3,5};
        boolean ans = check(arr,0);
        System.out.println(ans);
    }

    public static boolean check(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }
        return (arr[index] <= arr[index+1]) && check(arr,index+1);
    }
}
