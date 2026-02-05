package com.deepu.dsa.arrays;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,6,7,4,};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void cyclicSort(int[] arr){
        for (int i = 0; i < arr.length; ) {
            int correctIndex = arr[i] -1;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else{
                i++;
            }
        }
    }

    static void cyclicSortNew(int[] arr){

        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
