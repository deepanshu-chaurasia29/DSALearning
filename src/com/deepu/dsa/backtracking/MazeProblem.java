package com.deepu.dsa.backtracking;

public class MazeProblem {
    static void main() {
        int n = 3;
        int[][] mat = new int[n][n];
        int ans = ways(mat, 2, 2);
        System.out.println(ans);
        allPossiblePath(mat,"",2,2);

    }

    public static int ways(int[][] mat, int r, int c) {

        // base case
        if (r == 0 || c == 0) {
            return 1;
        }

        // if he goes down
        int left = ways(mat, r - 1, c);

        // if he goes right
        int right = ways(mat, r, c - 1);

        return left + right;
    }

    static void allPossiblePath(int[][] mat,String ans, int r, int c){
        if(r == 0 && c == 0){
            System.out.println(ans);
            return;
        }

        // if go to left
        if(r > 0) {
            allPossiblePath(mat, ans + "D", r - 1, c);
        }

        // if go right
        if(c > 0) {
            allPossiblePath(mat, ans + "R", r, c - 1);
        }
    }
}
