package com.deepu.dsa.strings;

public class Pallindrome {
    public static void main(String[] args) {
        String name = "abcba";
        boolean ans = isPallindrome(name);
        System.out.println(ans);


    }
    static boolean isPallindrome(String name){
        name = name.trim().toLowerCase().replaceAll("\\s","");
        int start = 0;
        int end = name.length() - 1;
        boolean bool = true;
        while(start < end) {
            if (name.charAt(start) == name.charAt(end)) {
                start += 1;
                end -= 1;
            }else{
                bool = false;
                break;
            }
        }
        return bool;
    }
}
