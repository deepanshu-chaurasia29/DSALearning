package com.deepu.basics.math;

public class ASCII {
    static void main() {
        String str = "ab";
        int sum = 0;
        int i = 0;
        while(i < str.length()){
            char c = str.charAt(i);
            sum += c;
            i++;
        }
        System.out.println(sum);
    }
}
