package com.deepu.dsa.recursion;

public class DigitSum {
    public static void main(String[] args) {
        sum(1342);
        int ans = 0;
        System.out.println(sumRecursive(1342));
    }

    static void sum(int n){
        int ans = 0;
        while(n>0){
            int last = n%10;
            ans += last;
            n /= 10;
        }
        System.out.println(ans);
    }

    static int sumRecursive(int n){
        if(n==0){
            return 0;
        }
//        int lastDigit = n%10;
//        n = n/10;
        return (n%10) + sumRecursive(n/10);

    }
}
