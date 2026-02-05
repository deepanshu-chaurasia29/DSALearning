package com.deepu.basics.bitwiseOperator;

public class PowerOf2OrNot {
    public static void main(String[] args) {
//        int n = 9;
//        int count = 0;
//        while(n > 0){
//            int lastBit = n&1;
//            if(lastBit == 1){
//                count++;
//            }
//            n = n>>1;
//        }
//        if(count == 1 || count == 0){
//            System.out.println("power of 2");
//        }else{
//            System.out.println("not");
//        }

        int n = 0;
        boolean ans = (n & (n - 1)) == 0;
        if (n == 0) {
            System.out.println(false);
        } else {
            System.out.println(ans);
        }
    }
}
