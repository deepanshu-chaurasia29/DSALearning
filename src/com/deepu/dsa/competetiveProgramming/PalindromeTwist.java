package com.deepu.dsa.competetiveProgramming;

import java.util.Scanner;

public class PalindromeTwist {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            boolean ans = true;

            for (int i = 0; i < n / 2; i++) {
                int diff = Math.abs(s.charAt(i) - s.charAt(n - i - 1));
                if (diff != 0 && diff != 2) {
                    ans = false;
                    break;
                }
            }
            if (ans) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }
    }

}
