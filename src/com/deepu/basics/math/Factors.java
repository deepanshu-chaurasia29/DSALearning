package com.deepu.basics.math;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        int n = 36;
        factors3(n);
    }
    // O(n)
    static void factors1(int n){
        for (int i = 1; i <= n; i++) {
            if(n%i == 0){
                System.out.print(i + " ");
            }
        }
    }

    // O(sqrt(n))
    static void factors2(int n){
        for (int i = 1; i*i <= n ; i++) {
            if(n%i == 0){
                if(n/i == i){
                    System.out.print(i + " ");
                }else{
                    System.out.print(i + " " + n/i + " ");
                }
            }
        }
    }

    // Optimised time and space complexity of O(log(n))
    static void factors3(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i*i <= n ; i++) {
            if(n%i == 0){
                if(n/i == i){
                    System.out.print(i + " ");
                }else {
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }

        //  Inside ArrayList factors get stored in descending order
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
