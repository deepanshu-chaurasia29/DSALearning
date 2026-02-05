package com.deepu.basics.math;

public class SquareRoot {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;
//        int ans = sqrt(n);
//        System.out.println(ans);
        System.out.printf("%.3f", sqrtNew(n,p));
    }

    // Brute Force way to solve for perfect square
    private static int sqrt(int n) {
        if (n==1){
            return 1;
        }
        for (int i = 2; i <= n/2; i++) {
            if(i*i == n){
                return i;
            }
        }
        return -1;
    }

    // Efficient way upto given precision value
    // Apply first binary search, then find precision value
    public static double sqrtNew(double n,int precision){
        int s = 0;
        int e = (int)n;
        double ans = 0.0;
        while(s <= e){
            int m = s +(e-s)/2;
            if(m*m == n){
                return ans;
            }
            if(m*m > n){
                e = m-1;
            }else{
                s = m+1;
            }
        }

        double increment = 0.1;
        for(int i=0; i<precision; i++){
            while(ans * ans <= n){
                ans += increment;
            }
            ans -= increment;

            increment /= 10;
        }

        return ans;

    }
}
