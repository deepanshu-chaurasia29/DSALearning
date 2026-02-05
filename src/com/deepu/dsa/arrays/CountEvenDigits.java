package com.deepu.dsa.arrays;

public class CountEvenDigits {
    public static void main(String[] args) {
        int[] nums = {23,2,3,2345,-98};
        int ans = countDigits(nums);
        System.out.println(ans);

        //System.out.println(digits2(-4569797));

    }
    static int countDigits(int[] nums){
        int count = 0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    // check given num has even no. of digits or not
    static boolean even(int num){
        int numofdigits = digits(num);
        if(numofdigits % 2 == 0){
            return true;
        }
        return false;
    }

    // check how many digits in given number
    static int digits(int num){
        if(num<0){
            num = num*(-1);
        }
        if(num==0){
            return 1;
        }
        int count = 0;
        while (num>0){
            num /= 10;
            count++;
        }
        return count;
    }

    // Find number of digits in given number(SHORTCUT)
//    static int digits2(int num){
//        if(num < 0){
//            num *= -1;
//        }
//        return (int)(Math.log10(num)) + 1;  // it will return the number of digits in num
//    }
}
