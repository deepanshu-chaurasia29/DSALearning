package com.deepu.basics.math;

public class NewtonSQRT {
    public static void main(String[] args) {
        int n = 40;
        System.out.println(sqrt(n));
    }
    static double sqrt(double n){
        double x = n;
        double root;

        while(true){
            root = 0.5 * (x+(n/x))/2;
            if(Math.abs(root-x) < 0.5){
                break;
            }
            x = root;
        }
        return root;
    }
}
