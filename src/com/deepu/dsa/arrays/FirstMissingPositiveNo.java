package com.deepu.dsa.arrays;

public class FirstMissingPositiveNo {
    public static void main(String[] args) {

    }
    static int sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex] ){  // it is true when not equal condition got right
                //  here, condition order matters
                swap(arr,i,correctIndex);
            }else{   // when element get same, then this will run
                i++;
            }
        }

        // search for the first missing positive element
        for (int index = 0; index < arr.length; index++) {
            if(index != arr[index] - 1){
                return index + 1;
            }
        }

        // all elements are at correct place, means last element was missing
        return arr.length + 1;

    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
