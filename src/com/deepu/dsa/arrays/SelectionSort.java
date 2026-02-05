package com.deepu.dsa.arrays;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,0,7,8,4,4,8};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // it is max last index per iteration where we swap the greatest value if it comes in array
            int last = arr.length - i -1;
            int maxValueIndex = getMaxValueIndex(arr,0,last);
            swap(arr,maxValueIndex,last);
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxValueIndex(int[] arr, int start, int end) {
        int max = start;
        for (int j = start; j <= end; j++) {  // <= used because last value is included
            if(arr[max] < arr[j]){
                max = j;
            }
        }
        return max;
    }
}
