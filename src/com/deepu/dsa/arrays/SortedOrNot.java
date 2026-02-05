package com.deepu.dsa.arrays;

// problem statement :- given array in ascending order, we have to check  it is sorted or not
public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,0,7,8,78,89};
        boolean ans = sort(arr,0);
        System.out.println(ans);
    }
    public static boolean sort(int[] arr, int index){
        if(index == arr.length - 1){
            return true;
        }
        return (arr[index] < arr[index + 1] && sort(arr, index + 1));

    }
}
