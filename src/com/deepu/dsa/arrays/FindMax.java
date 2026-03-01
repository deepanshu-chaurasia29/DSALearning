package com.deepu.dsa.arrays;

public class FindMax {
    static void main() {
        int[] arr = {1,3,2,5,3,8,0};
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for (int e:arr){
            if(e > max){
                secMax = max;
                max = e;
            }else if(e > secMax && e < max){
                secMax = e;
            }

        }

        System.out.println(secMax);
    }
}
