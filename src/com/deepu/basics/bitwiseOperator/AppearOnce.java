package com.deepu.basics.bitwiseOperator;

public class AppearOnce {
    static void main() {
        int[] arr = {2,2,3,4,5,4,4,5,5,2};
        System.out.println(count(arr));
    }
    static int count(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 1){
                return arr[i];
            }
        }
        return -1;
    }

    static int countSetBits(int n){
        int count = 0;
        while(n > 0){
            count += n&1;
            n = n>>1;

        }
        return count;
    }

}
