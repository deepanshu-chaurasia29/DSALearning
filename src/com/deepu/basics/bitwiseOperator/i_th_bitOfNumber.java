package com.deepu.basics.bitwiseOperator;

import java.util.Arrays;

public class i_th_bitOfNumber {
    public static void main(String[] args) {
        // Here we are using the concept of AND operators and Bitwise operators
        // AND operation of 1 with given number (1 & num) => same number (num)
        // Now we have to shift this 1 to i_th place, for this we have to mask it by adding i-1 zeroes
        // i.e. by shifting 1 to left i-1 times
//        int num = 10;
//        int i = 3;
//        int bit = (num & (1<<(i-1))) != 0 ? 1 : 0;
//        System.out.println(bit);

        // Other version. Set ith bit. it means if ith bit is 0 then make it 1 and if it is 1 remain 1
//        int num = 10;
//        int i1 = 2;
//        int newNum = (num | (1<<(i1-1)));
//        System.out.println(newNum);
//        int newBit = (newNum & (1<<(i1-1))) != 0 ? 1 : 0;
//        System.out.println(newBit);

        // Reset ith bit i,e, if 0 -> 0 and if 1 -> 0
//        int num = 10;
//        int i1 = 3;
//        int newNum = (num & (~(1<<(i1-1))));
//        System.out.println(newNum);
//        int newBit = (newNum & (1<<(i1-1))) != 0 ? 1 : 0;
//        System.out.println(newBit);

        int num = 10;
        String bits = Integer.toBinaryString(num);
        System.out.println(bits);


    }


}
