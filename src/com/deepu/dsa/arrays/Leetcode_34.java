package com.deepu.dsa.arrays;


import java.util.Arrays;

public class Leetcode_34 {
    static void main() {
        int[] arr = {5,7,7,7,7,8,8,9};
        int target = 7;

        int[] ans = firstAndLast(arr,target);
        System.out.println(Arrays.toString(ans));
        int ans1 = recursiveSearch1(arr,target);
        int ans2 = recursiveSearch2(arr,target);
        System.out.println(Arrays.toString(new int[]{ans1,ans2}));

    }
    public static int[] firstAndLast(int[] arr,int target){
        int s = -1;
        int e = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                s = i;
                break;
            }
        }
        for (int i = arr.length-1; i >= 0; i--) {
            if(arr[i] == target){
                e = i;
                break;
            }
        }
        return new int[]{s,e};
    }

    public static int recursiveSearch1(int[] arr,int target){
        int ans = -1;
        int s = 0;
        int e = arr.length - 1;
        while(s<=e){
            int m = s + (e-s)/2;
            if(target > arr[m] ){
                s = m +1;
            }
            else if(target <= arr[m] ){
                ans = m;
                e = m-1;
            }
        }
        return ans;
    }
    public static int recursiveSearch2(int[] arr,int target){
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;
        while(s<=e){
            int m = s + (e-s)/2;
            if(target >= arr[m] ){
                ans = m;
                s = m +1;
            }
            if(target < arr[m] ){
                e = m-1;
            }
        }
        return ans;
    }
}
