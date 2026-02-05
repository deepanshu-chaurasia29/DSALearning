package com.deepu.basics.bitwiseOperator;

public class SetBitsCounts {
    public static void main(String[] args) {
        int n = 45;
        System.out.println(Integer.toBinaryString(n));
        System.out.println((countSetBits2(n)));
        System.out.println(Integer.bitCount(n));
    }
    static int countSetBits1(int n){
        int count = 0;
        while(n > 0){
            if((n&1) == 1){
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    static int countSetBits2(int n){
        int count = 0;
        while(n > 0){
            count++;
            n = n & (n-1);
        }
        return count;
    }
}
