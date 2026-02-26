package com.deepu.dsa.arrays;

import java.util.ArrayList;

public class ConvertMatrixToArray {
    static void main() {
        int[][] matrix = {
                {10,20,30,40},
                {50,60,70,80},
                {90,100,110,120},
                {130,140,150,160},
        };
        convert(matrix);
    }
    static void convert(int[][] matrix){
        ArrayList<Integer> list = new ArrayList<>();
        int r = 0;
        while(r < matrix.length){
            for (int i = 0; i < matrix[0].length; i++) {
                list.add(matrix[r][i]);

            }
            r++;
        }
        System.out.println(list);
    }
}
