package com.deepu.striverSheet;

public class PascalTriangle {
    static void main() {
        System.out.println(ncr(5,1));
    }
    public static long ncr(int n, int r){
        // given row and col and then print that element
        long res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n-i);
            res = res/(i+1);
        }
        return res;
    }
}
