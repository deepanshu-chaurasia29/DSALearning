//package com.deepu.dsa.arrays;
//
//import java.util.Scanner;
//
//public class D07_MaximizeSum {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t  = sc.nextInt();
//        while(t-- > 0) {
//            int n = sc.nextInt();
//            int[] arr = new int[n];
//            for (int i = 0; i < n; i++) {
//                arr[i] = sc.nextInt();
//            }
//            int ans = maxSumOfArray(arr);
//            System.out.println(ans);
//        }
//    }
//    static int maxSumOfArray(int[] arr){
//        int CountNegNum = 0;  // count negative numbers in array
//        int totalSum = 0;
//        for(int e:arr){
//            if(e<0){
//                CountNegNum += 1;
//                totalSum += (e * (-1));
//            }else {
//                totalSum += e;
//            }
//        }
//        if(CountNegNum % 2 == 0){
//            return totalSum;
//        }
//        else{
//            return totalSum - 2*(minAbsoluteValue(arr));
//        }
//    }
//
//    static int minAbsoluteValue(int[] arr){
//        int min = Integer.MAX_VALUE;
//        for(int e:arr){
//            if(e<0){
//                if((-e) < min){
//                    min = -e;
//                }
//            }
//            else{
//                if(e<min){
//                    min = e;
//                }
//            }
//        }
//        return min;
//    }
//}

package com.deepu.dsa.arrays;

import java.util.Scanner;

public class MaximizeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int ans = maxSumOfArray(arr);
            System.out.println(ans);
        }
    }
    static int maxSumOfArray(int[] arr){
        int CountNegNum = 0;  // count negative numbers in array
        int totalSum = 0;
        for(int e:arr){
            if(e<0){
                CountNegNum += 1;
            }else {
                totalSum += Math.abs(e);
            }
        }
        if(CountNegNum % 2 == 0){
            return totalSum;
        }
        else{
            return totalSum - 2*(minAbsoluteValue(arr));
        }
    }

    static int minAbsoluteValue(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int e:arr){
            if(Math.abs(e) < min){
                min = Math.abs(e);
            }
        }
        return min;
    }
}



