package com.deepu.dsa.arrays;

public class FindMin {
    public static void main(String[] args) {

        int[] arr = {2,23,4,12,4,2,54,12,4,33,-4};
        int min = minInArray(arr);
        System.out.println(min);
    }
    static int minInArray(int[] arr){
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
