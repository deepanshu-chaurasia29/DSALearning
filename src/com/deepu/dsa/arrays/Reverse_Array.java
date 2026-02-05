package com.deepu.dsa.arrays;

import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println("Before : " + Arrays.toString(arr));

        System.out.println("After : " + Arrays.toString(revArray(arr)));
    }

    static int[] revArray(int[] arr) {
        int beg = 0;
        int end = arr.length - 1;

        while (beg < end) {
            int temp = arr[beg];
            arr[beg] = arr[end];
            arr[end] = temp;
            beg++;
            end--;
        }
        return arr;
    }
}
