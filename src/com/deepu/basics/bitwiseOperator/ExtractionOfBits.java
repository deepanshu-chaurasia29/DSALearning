package com.deepu.basics.bitwiseOperator;

public class ExtractionOfBits {
    public static void main(String[] args) {
        int n = 10;
        while(n>0){
            int last = (n&1);
            System.out.println(last);
            n = n >> 1;
//            n = n/2;
        }
    }
}
