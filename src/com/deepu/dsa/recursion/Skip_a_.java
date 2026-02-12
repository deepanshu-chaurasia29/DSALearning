package com.deepu.dsa.recursion;

public class Skip_a_ {
    static void main() {
        String str = "abbcapplecda";
        StringBuilder stringBuilder = new StringBuilder();
        skip3(str,0,stringBuilder);
        System.out.println(stringBuilder);
        System.out.println(skipApple(str));

    }

    // TC => O(n^2), SC => O(n)
    public static String skip(String str) {
        // base condition
        if(str.isEmpty()){
            return "";
        }

        char ch = str.charAt(0);

        if(ch == 'a'){
            return skip(str.substring(1));
        }else{
            return ch + skip(str.substring(1));
        }

    }

    // TC => O(n), SC => O(n)
    public static String skip2(String str,int index) {
        // base condition
        if(index == str.length() ){
            return "";
        }

        char ch = str.charAt(index);

        if(ch == 'a'){
            return skip2(str,index+1);
        }else{
            return ch + skip2(str,index+1);
        }

    }

    // Using StringBuilder
    public static void skip3(String str,int index,StringBuilder ans) {
        // base condition
        if(index == str.length() ){
            return ;
        }

        char ch = str.charAt(index);

        if(ch != 'a'){
            ans.append(ch);
        }

        skip3(str,index+1,ans);

    }

    public static String skipApple(String str) {
        // base condition
        if(str.isEmpty()){
            return "";
        }


        if(str.startsWith("apple")){
            return skipApple(str.substring(5));
        }else{
            return str.charAt(0) + skipApple(str.substring(1));
        }

    }

}
