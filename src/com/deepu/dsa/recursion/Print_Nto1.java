package com.deepu.dsa.recursion;

// Tail recursion -> first work, then call
public class Print_Nto1 {
    public static void main(String[] args) {
//        System.out.println(printNo(5));
        printNo(5);
    }
    static void printNo(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNo (n-1);

    }
}
