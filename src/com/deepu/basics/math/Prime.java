package com.deepu.basics.math;

public class Prime {
    public static void main(String[] args) {
        int n = 20;
        for (int i = 1; i <= n; i++) {
            boolean result = isPrime(i);
            if(result == true){
                System.out.println(i);
            }
        }
    }
    static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        int c = 2;
        while(c * c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
