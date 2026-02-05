package com.deepu.basics.mix;


import java.util.Scanner;

public class Nth_Fibonacci_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a = 0;
//        int b = 1;
//        int count = 2;
//
//        while(count<=n){
//            int temp = b;
//            b = a+b;
//            a = temp;
//            count++;
//        }
//        System.out.println(b);
//
//        // By recursion
//        System.out.println(fibo(n));
//        int i = 10;
//        while(i>0){
//            System.out.print(i*n + " ");
//            i--;
//        }
        for (int i = 0; i < 11; i++) {
            System.out.println(fiboFormula(i));
        }
        System.out.println(fiboFormula(50));
    }
    static long fibo(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        else{
            return fibo(n-1) + fibo(n-2);
        }
    }

    static int fiboFormula(int n){
        return (int)( (Math.pow(((1+Math.sqrt(5))/2),n) - Math.pow(((1-Math.sqrt(5))/2),n) ) / Math.sqrt(5));
    }

}
