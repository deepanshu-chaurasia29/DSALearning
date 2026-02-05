package com.deepu.basics.mix;


import java.util.Arrays;
import java.util.Scanner;

public class _2D_Array {
    public static void main(String[] args) {
//        int [][] arr = {
//                {12,34,53},   // row1 , index 0
//                {14,6},       // row2, index 1
//                {2,54,2,1},   // row3 , index2
//        };
        int [][] arr = new int[2][2];
        Scanner sc = new Scanner(System.in);

        // taking inputs
        System.out.println("Enter elements : \n");
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                arr[row][col] = sc.nextInt();
            }
        }

        // print output
//        for(int row=0; row<arr.length; row++){
//            for(int col=0; col<arr[row].length; col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        // print output
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        for (int [] e:arr){
            System.out.println(Arrays.toString(e));
        }
    }
}
