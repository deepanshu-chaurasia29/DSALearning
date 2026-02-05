package com.deepu.dsa.recursion;

public class Count_0 {
    public static void main(String[] args) {
        int ans = countZero(1010);
        System.out.println(ans);
    }
    static int countZero(int n){
        if(n==0) return 1;
        return count(n,0);
    }

    // Special recursion type -> how to pass the value;
    static int count(int n,int count){
        if(n==0){
            return count;
        }
        int rem = n%10;
        if(rem == 0){
            return count(n/10,count+1);
        }
        return count(n/10,count);

    }
}
