package com.deepu.basics.mix;



import java.util.Arrays;
import java.util.Scanner;

public class _1D_Array {
    public static void main(String[] args) {
        int [] arr = new int[4];
        Scanner sc = new Scanner(System.in);

//        int[] arr2 = {};
//        System.out.println(arr2[0]);  // indexOutOfBound Exception

        System.out.println("Enter elements ");
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int e:arr){
            System.out.println(e);
        }

        System.out.println(Arrays.toString(arr));  // Best way to returns the array
    }
}
