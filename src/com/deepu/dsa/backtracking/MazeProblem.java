package com.deepu.dsa.backtracking;

import java.util.ArrayList;

public class MazeProblem {
    static void main() {
//        int n = 3;
//        int[][] mat = new int[n][n];
//        int ans = ways(mat, 2, 2);
//        System.out.println(ans);
//        allPossiblePath(mat, "", 2, 2);
//        System.out.println(allPossiblePath2(mat, "", 2, 2));

        boolean[][] mat = {
                {true,true,true},
                {true,false,true},
                {true,true,true},
        };
        pathWithObstacles(mat,"",0,0);
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

    static void allPossiblePath(int[][] mat, String ans, int r, int c) {
        if (r == 0 && c == 0) {
            System.out.println(ans);
            return;
        }

        // if go to left
        if (r > 0) {
            allPossiblePath(mat, ans + "D", r - 1, c);
        }

        // if go right
        if (c > 0) {
            allPossiblePath(mat, ans + "R", r, c - 1);
        }
    }

    static ArrayList<String> allPossiblePath2(int[][] mat, String ans, int r, int c) {
        if (r == 0 && c == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;

        }

        // create list where you wanna store the current result
        ArrayList<String> list = new ArrayList<>();


        // if go to left
        if (r > 0) {
            list.addAll(allPossiblePath2(mat, ans + "V", r - 1, c));
        }

        // if go diagonally
        if (r > 0 && c > 0) {
            list.addAll(allPossiblePath2(mat, ans + "D", r - 1, c - 1));

        }

        // if go right
        if (c > 0) {
            list.addAll(allPossiblePath2(mat, ans + "H", r, c - 1));
        }

        return list;
    }


    static void pathWithObstacles(boolean[][] mat, String ans, int r, int c) {
        if (r == mat.length-1 && c == mat[0].length-1) {
            System.out.println(ans);
            return;
        }

        // if obstacle came
        if(!mat[r][c]){
            return;
        }

        // if go to left
        if (r < mat.length-1) {
            pathWithObstacles(mat, ans + "D", r + 1, c);
        }

        // if go right
        if (c < mat[0].length-1) {
            pathWithObstacles(mat, ans + "R", r, c + 1);
        }
    }


}
