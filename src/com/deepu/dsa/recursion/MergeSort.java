package com.deepu.dsa.recursion;

import java.util.Arrays;

public class MergeSort {

    static void main() {
        int[] arr = {3, 2, 42, 6, 25, 7};
        arr = sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] sort(int[] arr) {

        if (arr.length <= 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }


    public static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // Copy the remaining element
        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        // copy the remaining elements
        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
