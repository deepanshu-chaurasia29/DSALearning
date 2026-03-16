package com.deepu.dsa.backtracking;

import java.util.Arrays;

public class MazeAllPaths {
    static void main() {
        boolean[][] mat = {
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };
        int[][] path = new int[mat.length][mat[0].length];
//        allPaths(mat,"",0,0);
        printStep(mat,"",0,0,path,1);
    }
    static void allPaths(boolean[][] mat, String ans, int r, int c) {
        if (r == mat.length-1 && c == mat[0].length-1) {
            System.out.println(ans);
            System.out.println();
            return;
        }

        //  if obstacle came or you can say that it is visited already by some recursive call. so just return from here
        // without making any further call
        if(!mat[r][c]){
            return;
        }


        // also mark the current cell as false
        mat[r][c] = false;

        // if go to down
        if (r < mat.length-1) {
            allPaths(mat, ans + "D", r + 1, c);

        }

        // if go right
        if (c < mat[0].length-1) {
            allPaths(mat, ans + "R", r, c + 1);
        }

        // if go up
        if (r > 0) {
            allPaths(mat, ans + "U", r-1, c );
        }

        // if go left
        if (c > 0) {
            allPaths(mat, ans + "L", r, c-1);
        }

        // this is the line where this function call get ended
        // so before the function get removed,also remove the changes that were made by that function call
        // again mark that cell as true, which clears the way for next possible paths
        mat[r][c] = true;

    }

    static void printStep(boolean[][] mat, String ans, int r, int c,int[][] path,int step) {
        if (r == mat.length-1 && c == mat[0].length-1) {
            path[r][c] = step;
            for(int[] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(ans);
            return;
        }

        //  if obstacle came or you can say that it is visited already by some recursive call. so just return from here
        // without making any further call
        if(!mat[r][c]){
            return;
        }


        // also mark the current cell as false
        mat[r][c] = false;
        path[r][c] = step;

        // if go to down
        if (r < mat.length-1) {
            printStep(mat, ans + "D", r + 1, c,path,step+1);

        }

        // if go right
        if (c < mat[0].length-1) {
            printStep(mat, ans + "R", r, c + 1, path, step+1);
        }

        // if go up
        if (r > 0) {
            printStep(mat, ans + "U", r-1, c, path,step+1 );
        }

        // if go left
        if (c > 0) {
            printStep(mat, ans + "L", r, c-1, path,step+1);
        }

        // this is the line where this function call get ended
        // so before the function get removed,also remove the changes that were made by that function call
        // again mark that cell as true, which clears the way for next possible paths
        mat[r][c] = true;
        path[r][c] = 0;



    }
}
