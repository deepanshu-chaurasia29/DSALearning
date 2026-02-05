package com.deepu.basics.mix;


import java.util.Arrays;

public class Swap_in_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Before : " + Arrays.toString(arr));
        swap(arr, 1,3);
        System.out.println("After : " + Arrays.toString(arr));

    }
    static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

