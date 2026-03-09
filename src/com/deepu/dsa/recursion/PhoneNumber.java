package com.deepu.dsa.recursion;

public class PhoneNumber {
    static void main() {
        keypad("","9");
    }
    static void keypad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';
        for (int i = (digit -1) * 3; i < (digit*3); i++) {
            char ch = (char)('a' + i);
            keypad(p + ch, up.substring(1));
        }
    }
}
