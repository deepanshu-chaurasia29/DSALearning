package com.deepu.dsa.arrays;

public class Digit_Game {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,14};
        boolean ans = game(nums);
        System.out.println(ans);
    }

    static boolean game(int[] nums){
        int singleSum = 0,doubleSum = 0;

        for(int num:nums){
            int digits = countDigits(num);
            if(digits == 1){
                singleSum += num;
            }
            else if (digits == 2){
                doubleSum += num;
            }

        }

        // True when alice win and false when bob wins
        // alice win when singleSum > doubleSum or doubleSum > singleSum
        /*
        if(singleSum > doubleSum || doubleSum > singleSum){
            return true;
        }
        else return false;
         */
        return singleSum != doubleSum;
    }

    // check number is single digit or double-digit
    static int countDigits(int num){
        if(num==0){
            return 1;
        }
        return (int)(Math.log10(num)) + 1;
    }
}
