package com.deepu.dsa.recursion;

public class NumberReversed {

    public static void main(String[] args) {
        method1(1824);
        method2(1824);
        System.out.println(ans);
        System.out.println(methods3(1824));
    }

    // Iterative: build reverse by taking last digit and shifting answer
    // Time: O(d), Space: O(1)
    static void method1(int n) {
        int ans = 0;
        while (n > 0) {
            int last = n % 10;
            ans = (ans * 10) + last;
            n = n / 10;
        }
        System.out.println(ans);
    }

    // Recursive using global variable (updates answer during recursion)
    // Time: O(d), Space: O(d)
    static int ans = 0;
    static void method2(int n) {
        if (n == 0) return;
        int lastDigit = n % 10;
        ans = (ans * 10) + lastDigit;
        method2(n / 10);
    }

    // Recursive without global variable using digit position
    // Time: O(d), Space: O(d)
    static int methods3(int n) {
        int digits = (int) (Math.log10(n)) + 1;
        return helper(digits, n);
    }

    // Places last digit at correct power of 10 and recurses
    private static int helper(int digits, int n) {
        if (n % 10 == n) return n;
        int lastDigit = n % 10;
        return (int) (lastDigit * Math.pow(10, digits - 1)
                + helper(digits - 1, n / 10));
    }
}
