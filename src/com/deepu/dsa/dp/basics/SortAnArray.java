package com.deepu.dsa.dp.basics;
import java.util.Arrays;

public class SortAnArray {
    static void main() {
        int[] arr={2,4,1,3,6,0,0};
        // insertionSort(arr);
        // System.out.println(Arrays.toString(arr));

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void insertionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j>0; j--){
                if(arr[j] < arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }

    static void selectionSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int lastIdx=arr.length-i-1;
            int greatestElementIndex=greatest(arr,0,lastIdx);
            swap(arr,lastIdx,greatestElementIndex);
        }
    }

    static int greatest(int[] arr,int s,int e) {
        int max=s;
        for(int i=s; i<=e; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;

    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void bubbleSort(int[] arr){

    }
}
