package com.deepu.assignmnets;

import java.util.Scanner;

public class sumOfInputs {
    public static void main(String[] args) {
        // Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        while(true){

            System.out.print("Enter element (or press 'x' to exit) ");
            String input= sc.next();
            if(input.equalsIgnoreCase("x")){
                break;
            }
            try{
                int num = Integer.parseInt(input);  // it converts string to integer value;
                sum += num;
            }catch (NumberFormatException e){
                System.out.println(e);
            }

        }
        System.out.println("Sum of all elements you entered = " + sum);
    }
}
