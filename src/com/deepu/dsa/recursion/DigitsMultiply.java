package com.deepu.dsa.recursion;

public class DigitsMultiply {
    public static void main(String[] args) {
        System.out.println(multiply(13402));
    }
    static int multiply(int n){
        if(n==0){
            return 1;
        }
        return (n%10) * multiply(n/10);

    }
}
