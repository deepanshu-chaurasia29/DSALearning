package com.deepu.dsa.recursion;

public class Palindrome {
    public static void main(String[] args) {
//        System.out.println(palindrome(12332661));
        int n = 123321;
        String str = n + "";
        boolean ans = palindromeRec(0,str.length()-1,str);
        System.out.println(ans);
    }
    static boolean palindrome(int n){
        String str = n + "";
        int s = 0;
        int e = str.length() - 1;
        boolean ans = true;
        while (s <= e){
            if(str.charAt(s) != str.charAt(e)) ans = false;
            s++;
            e--;
        }
        return ans;

    }


    static boolean palindromeRec(int s, int e, String n){
        if(s >= e){
            return true;   // If we cross the middle, means no need to check, return true
        }
        if(n.charAt(s) != n.charAt(e)){
            return false;
        }

        // Here we can't add else which returns true bckz it will create unreachable state for the next line.

        return palindromeRec(s+1,e-1,n);
    }
}
