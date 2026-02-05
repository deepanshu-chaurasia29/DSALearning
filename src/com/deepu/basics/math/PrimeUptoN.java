package com.deepu.basics.math;

public class PrimeUptoN {
    public static void main(String[] args) {
        // There is a efficient way to find the prime numbers upto N by (Sieve of Erathosthenes) algorithm
        int n = 40;
        boolean[] primes = new boolean[n+1];
        sieve(n,primes);
        prime(n);
    }

    // if array[i] returns false means prime number
    static void sieve(int n, boolean[] primes) {
        for (int i = 2; i*i < n; i++) {
            if(primes[i] == false){    // i is prime
                // make its multiple as true
                for (int j = i*2; j <=n; j+=i) {
                    primes[j] = true;
                }
            }

        }

        // Indexes with false values represent prime numbers, so return accordingly
        for (int i = 2; i < n; i++) {
            if(primes[i] == false){
                System.out.print(i + " ");
            }
        }
    }


    // This is Brute Force Approach  O(n^2)
    static void prime(int n){
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i-1; j++) {
                if(i % j == 0){
                    isPrime = false;
                }
            }
            if(isPrime){
                System.out.print(i + " ");
            }
        }
    }
}
