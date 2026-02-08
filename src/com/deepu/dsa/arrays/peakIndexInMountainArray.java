package com.deepu.dsa.arrays;

public class peakIndexInMountainArray {
    public static void main(String[] args) {
        int[]  arr = {1,2,3,5,8,3,2,1,0};
        int ans = mountain(arr);
        System.out.println(ans);



    }
    public static int mountain(int[] arr){
        int s = 0;
        int e = arr.length - 1;

        while(s<e) {
            int m = s+(e-s)/2;
            if (arr[m] > arr[m + 1]) {  // decreasing array
                e = m;
            } else if (arr[m] < arr[m + 1]) {
                s = m + 1;
            }
        }
        return e;
    }
}
