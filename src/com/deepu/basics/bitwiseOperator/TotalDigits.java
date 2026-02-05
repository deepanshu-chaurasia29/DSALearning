package com.deepu.basics.bitwiseOperator;

public class TotalDigits {
    public static void main(String[] args) {
        int n = 6578;
        int count = 0;
        if(n==0){
            count = 1;
        }
        while(n>0){
            n = n >> 1;
            count++;
        }

        System.out.println("Total digits : " + count);

        int num = 657;
        int base = 2;
        int ans = (int)(Math.log(num) / Math.log(base)) + 1;
        System.out.println("Total digits : " + ans);
    }
}
