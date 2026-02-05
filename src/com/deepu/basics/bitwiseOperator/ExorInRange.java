package com.deepu.basics.bitwiseOperator;

public class ExorInRange {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        int ans = exor(b) ^ exor(a-1);
        System.out.println(ans);
    }
    static int exor(int a){
        if(a % 4 == 0) return a;
        if(a % 4 == 1) return 1;
        if(a % 4 == 2) return a+1;
        if(a % 4 == 3) return 0;
        return -1;
    }
}
