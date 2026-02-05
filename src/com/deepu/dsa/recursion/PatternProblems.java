package com.deepu.dsa.recursion;

public class PatternProblems {
    static void main() {
        triangle(4,0);
    }


    public static void triangle(int row, int col){
        if(row == 0){
            return;
        }
        if(col < row){
            System.out.print("* ");
            col++;
            triangle(row,col);
        }else {
            System.out.println();
            triangle(row-1,0);
        }
    }
}
