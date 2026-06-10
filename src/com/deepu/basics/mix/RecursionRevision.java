package com.deepu.basics.mix;

public class RecursionRevision {
    public static void main() {
//        print5to1(5);
        System.out.println(reverseNumber(1234,0));

    }
    public static void print5to1(int n){
        System.out.println(n + "before");
        if(n == 1){
            return;
        }
        print5to1(n-1);
        System.out.println(n + "after");
    }
    static int reverseNumber(int n,int ans){
        // 1234 = 4321
        int rem=n%10;

        if(n < 10){
            ans = (ans*10) + rem;
            return ans;
        }

        ans = (ans*10) + rem;
        n /= 10;
        return reverseNumber(n,ans);
    }
}


