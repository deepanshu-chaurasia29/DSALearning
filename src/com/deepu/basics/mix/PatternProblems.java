package com.deepu.basics.mix;

public class PatternProblems {
    public static void main(String[] args) {
        int n = 4;

        // pattern 09
//        for(int i=0; i<n; i++){
//            for(int j=0; j<n-i-1; j++){
//                System.out.print(" ");
//            }
//            for(int k=0; k<2*i+1; k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=0; i<n; i++){
//            for(int j=0; j<i; j++){
//                System.out.print(" ");
//            }
//            for(int k=0; k<2*n-(2*i+1); k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // pattern 10
//        for(int i=0; i<n; i++){
//            for(int k=0; k<i+1; k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=0; i<n-1; i++){
//            for (int j = 0; j < n-i-1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // pattern 11

//        for (int i = 0; i < n; i++) {
//            for (int k = 0; k < i+1; k++) {
//                if ((i + k) % 2 == 0) {
//                    System.out.print(1);
//                } else {
//                    System.out.print(0);
//                }
//            }
//            System.out.println();
//        }

        //  pattern 12

//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < i+1; j++) {
//                System.out.print(j+1); // j+1
//            }
//            for (int j = i+1; j < (2*n) - i - 1; j++) {
//                System.out.print(" ");
//            }
//            for (int j = i+1; j > 0 ; j--) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        // pattern 13
//        int num = 1;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < i+1; j++) {
//                System.out.print(num);
//                num = num + 1;
//                System.out.print(" ");
//            }
//            System.out.println();
//        }

        // pattern 14

//        for (int i = 0; i < n; i++) {
//            char ch = 'A';
//            for (int j = 0; j < i+1; j++) {
//                System.out.print(ch);
//                ch++;
//            }
//            System.out.println();
//        }

        // PATTERN 15
//        for (int i = 0; i < n; i++) {
//            char ch = 'A';
//            for (int j = 0; j < n-i; j++) {
//                System.out.print(ch);
//                ch++;
//            }
//            System.out.println();
//        }

        // pattern 16
//        char ch = 'a';
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < i+1; j++) {
//                System.out.print(ch);
//            }
//            ch++;
//            System.out.println();
//        }
        
        // pattern 17
//        int space = 2*(n-1);  // always even
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < space/2; j++) {
//                System.out.print(" ");
//            }
//            char ch = 'A';
//            int breakpoint = (2*i + 1)/2;
//            for (int j = 0; j < (2*i)+1; j++) {
//                System.out.print(ch);
//
//                if(j < breakpoint) ch++;
//                else ch--;
//            }
//            space -= 2;
//            System.out.println();
//        }

        // pattern 18
//        for (int i = 0; i < n; i++) {
//            int num = 65 + n-i-1;
//            char ch = (char)num;
//            for (int j = 0; j < i+1; j++) {
//                System.out.print(ch);
//                ch++;
//            }
//            System.out.println();
//        }
        
        // pattern 19
//        int initialSpace = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n-i; j++) {
//                System.out.print("*");
//            }
//            for (int j = 0; j < initialSpace; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < n-i; j++) {
//                System.out.print("*");
//            }
//            initialSpace +=2;
//            System.out.println();
//        }
//
//        initialSpace = 2*n - 2;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < i+1; j++) {
//                System.out.print("*");
//            }
//            for (int j = 0; j < initialSpace; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i+1; j++) {
//                System.out.print("*");
//            }
//            initialSpace -=2;
//            System.out.println();
//        }

        // pattern 20
//        int initialSpace = 2*n - 2;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < i+1; j++) {
//                System.out.print("*");
//            }
//            for (int j = 0; j < initialSpace; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i+1; j++) {
//                System.out.print("*");
//            }
//            initialSpace -=2;
//            System.out.println();
//        }
//
//        initialSpace = 2;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n-i-1; j++) {
//                System.out.print("*");
//            }
//            for (int j = 0; j < initialSpace; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < n-i-1; j++) {
//                System.out.print("*");
//            }
//            initialSpace +=2;
//            System.out.println();
//        }

        // pattern 21
//        for (int i = 0; i < n; i++) {
//            if(i==0 || i==n-1) {
//                for (int j = 0; j < n; j++) {
//                    System.out.print("*");
//                }
//            }else {
//                System.out.print("*");
//                for (int j = 0; j < n - 2; j++) {
//                    System.out.print(" ");
//                }
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if(i==0 || j==0 || i==n-1 || j==n-1) {
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        // Pattern 22.0
//        for (int row = 0; row <= 2*n; row++) {
//            for (int col = 0; col <= 2*n; col++) {
//                int atEachIndex = Math.min(Math.min(col,2*n-col), Math.min(row,2*n-row));
//                System.out.print(atEachIndex + " ");
//            }
//            System.out.println();
//        }

        // Pattern 22
        for (int row = 0; row < 2*n-1; row++) {
            for (int col = 0; col < 2*n-1; col++) {
                int atEachIndex = n - Math.min(Math.min(col,2*n-2-col), Math.min(row,2*n-2-row));
                System.out.print(atEachIndex + " ");
            }
            System.out.println();
        }

    }
}
