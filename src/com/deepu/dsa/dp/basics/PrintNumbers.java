package com.deepu.dsa.dp.basics;

public class PrintNumbers {
    static void main() {
        // 1 to n
        int n=6;

    }
    static void print1ton(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        print1ton(n-1);
        System.out.println(n);
    }
}
