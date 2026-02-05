package com.deepu.basics.bitwiseOperator;

public class PascalsTriangle {
    static void main() {
        System.out.println(sumOfNthRow(0));
    }
    static int sumOfNthRow(int n){
        return 1 << (n-1);
    }
}
