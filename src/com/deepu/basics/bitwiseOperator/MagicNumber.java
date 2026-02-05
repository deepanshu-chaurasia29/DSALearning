package com.deepu.basics.bitwiseOperator;

public class MagicNumber {
    public static void main(String[] args) {
        int n = 5;
        int ans = 0;
        int power = 1;
        while(n > 0){
            int lastBit = n & 1;
            ans = (int)(ans + (lastBit * Math.pow(5,power)));
            n = n >> 1;
            power++;
        }
        System.out.println("Magic number : " + ans);
    }
}
