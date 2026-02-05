package com.deepu.basics.bitwiseOperator;

public class Odd_Even_BIt {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(isOdd2(n));

    }

    static boolean isOdd(int n) {
        return ((n & 1) == 1);
    }

    static boolean isOdd2(int n) {
        if ((n & 1) == 1) return true;
        else return false;
    }
}
