package com.deepu.basics.mix;


public class RecursionTypes {
    public static void main(String[] args) {
        int n = 3;
        tailRec(n);
    }
    static void headRec(int n) {
        if (n == 0) return;      // base case
        headRec(n - 1);          // recursive call first
        System.out.println(n);   // work after recursion
    }
    static void tailRec(int n) {
        if (n == 0) return;     // base case
        System.out.println(n);  // work first
        tailRec(n - 1);         // recursive call last
    }


}
