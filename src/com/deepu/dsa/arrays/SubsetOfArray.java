package com.deepu.dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetOfArray {
    static void main() {
        int[] arr = {1,2,3};
        int limit =  (int)Math.pow(2,arr.length);

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < limit; i++) {
            String set  = "";
            int temp = i; // aisa nhi kiya to outer loop me i kii value badhte jaayegi because of inner loop

            for (int j = arr.length -1; j >=0 ; j--) {
               int rem = temp % 2;
               temp /= 2;

               if(rem == 1){
                   set = arr[j] + set;
               }

            }
            list.add(set);
        }
        System.out.println(list);
    }

    static void subSet(int[] arr){
        int limit =  (int)Math.pow(2,arr.length);

        for (int i = 0; i < limit; i++) {

        }
    }
}
