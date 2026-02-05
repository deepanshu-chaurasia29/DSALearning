package com.deepu.basics.bitwiseOperator;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {2,4,3,3,4};
        System.out.println(ans(arr));
        System.out.println(ansNew(arr));
    }

    // Brut force approach. O(n^2)
    static int ans(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            // count will be count++, when same element is present
            // if count == 1, return that element
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return arr[i];
            }
        }
        return -1;
    }

    // Using bitwise operator. O(n)
    static int ansNew(int[] arr){
        int ans = 0;
        for(int n:arr){
            ans = ans^n;
        }
        return ans;
    }
}
