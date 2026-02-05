package com.deepu.basics;

public class Counting_Occurance {
    public static void main(String[] args) {
        long n = 9143918251329978L;
        int check = 9;
        int count = 0;
        for(int i=0; n>=9; i++){
            double rem = n%10;
            if(rem==check){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
