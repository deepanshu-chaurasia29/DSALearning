package com.deepu.striverSheet;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;

public class PascalTriangle {
    static void main() {
        System.out.println(ncr(4,3));
        System.out.println(allElements(5));
    }
    public static int ncr(int n, int r){
        // given row and col and then print that element
        // Formula hota h ye.
        n = n-1;
        r = r-1;
        int res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n-i);
            res = res/(i+1);
        }
        return res;
    }

    // To print all the elements of nth row
    public static ArrayList<Integer> allElements(int row){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= row; i++) {
            arrayList.add(ncr(row-1,i-1));
        }
        return arrayList;
    }
}
