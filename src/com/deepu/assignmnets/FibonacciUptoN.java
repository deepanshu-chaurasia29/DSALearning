package com.deepu.assignmnets;

public class FibonacciUptoN {
    public static void main(String[] args) {
        int n = 7;
        for(int i=1; i<n+1; i++){
            System.out.print(fibo(i) + " ");
        }
    }

    static int fibo(int term){
        if(term == 1){
            return 1;
        } else if (term == 2) {
            return 1;
        }
        else return fibo(term - 1) + fibo(term - 2);
    }
}
