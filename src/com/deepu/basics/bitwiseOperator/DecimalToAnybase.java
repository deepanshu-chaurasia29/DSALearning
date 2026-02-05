package com.deepu.basics.bitwiseOperator;

import java.util.Scanner;

public class DecimalToAnybase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int num = sc.nextInt();
        System.out.println("Enter base : ");
        int base = sc.nextInt();

        // Decimal no to any base
        String ans = "";
        while(num > 0){
            int rem = num % base;
            char ch;
            if(rem >= 10 && rem <= 15){
               ch = (char)('A' + (rem-10));
               ans = ch + ans;
            }else {
               ans = rem + ans;
            }
            num = num/base;
        }
        System.out.println(ans);

        // Binary to decimal number
        int decimal = 0;
        int power = 0;
        for (int i = ans.length() - 1; i >= 0 ; i--) {
            char bit = ans.charAt(i);
            if(bit == '1'){
                decimal += Math.pow(2,power);
            }
            power++;
        }
        System.out.println(decimal);
    }
}
