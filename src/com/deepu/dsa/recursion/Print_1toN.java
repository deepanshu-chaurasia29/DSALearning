package com.deepu.dsa.recursion;

// Head recursion -> first call, then work
public class Print_1toN {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        if (n==0){
            return;
        }
        print(n-1);
        System.out.println(n);
    }
}
