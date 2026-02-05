package com.deepu.dsa.arrays;

public class MIssingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 0, 6,5,4};
        String name = "abcd";
        int ans = sort(arr);
        System.out.println(ans);
    }
    static int sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctIndex = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correctIndex]){  // it is true when not equal condition got right
                swap(arr,i,correctIndex);
            }else{   // when element get same, then this will run
                i++;
            }
        }

        // search for the first missing element
        for (int index = 0; index < arr.length; index++) {
            if(index != arr[index]){
                return index;
            }
        }

        // all elements are at correct place, means last element was missing
        return arr.length;

    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }


}
