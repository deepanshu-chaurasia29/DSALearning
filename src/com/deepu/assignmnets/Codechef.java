package com.deepu.assignmnets;

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int max = 0;
        while(t>0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int ans = maxHeight(arr);
            if(ans > max){
                max = ans;
            }
            t--;
        }
        System.out.println(max);

    }
    static int maxHeight(int[] arr){
        int max = arr[0];
        for(int e:arr){
            if(e>max){
                max = e;
            }
        }
        return max;
    }
}
