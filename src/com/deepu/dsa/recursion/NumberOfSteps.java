package com.deepu.dsa.recursion;

public class NumberOfSteps {
    public static void main(String[] args) {
        int ans =  Count(14, 0);
        System.out.println(ans);
    }

    static int Count(int num,int count){
        if(num==0){
            return count;
        }
        if(num%2 == 0){ // even
            return Count(num/2,count+1);
        }
        return Count(num-1,count+1);
    }
}