package com.deepu.dsa.recursion;

import java.util.Arrays;

public class QuickSort {
    static void main() {
        int[] arr = {2,4,1,7,0,8,5};
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr, int s, int e){
        // Base condition
        if(s >= e){
            return;
        }

        // Find partition element index
        int p = partition(arr,s,e);  // p => correct index of pivot element

        // Left part sort karo
        quickSort(arr,s,p-1);

        // Right part sort karenge
        quickSort(arr,p+1,e);
    }
    public static int partition(int[] arr, int s, int e){
        int pivot = arr[s];

        // Count all element < pivot
        int count = 0;
        for (int i=s+1; i<arr.length; i++){
            if(arr[i] < pivot){
                count++;
            }
        }

        int pivotCorrectIndex = s + count;
        swap(arr,pivotCorrectIndex,s);  // Put pivot element at its right place.


        // Jab pivot apne sahi place par aa gya to ab hum is se jo element chota h usko left side rakhenge and jo greater hai usko right side.
        // i and j are indices
        int i=s;
        int j=e;

        while(i < pivotCorrectIndex && j > pivotCorrectIndex){
            while(arr[i] <= pivot){
                i++;
            }
            while(arr[j] > pivot){
                j--;
            }
            if(i < pivotCorrectIndex && j > pivotCorrectIndex){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotCorrectIndex;
    }
    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

}
