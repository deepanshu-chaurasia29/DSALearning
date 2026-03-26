package com.deepu.dsa.recursion;

import java.util.ArrayList;

public class PhoneNumber {
    static void main() {
        keypad("", "12");
        System.out.println(keypadReturn("","12"));
    }

    static void keypad(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }

        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < (digit * 3); i++) {
            if (i <= 25) {
                char ch = (char) ('a' + i);
                keypad(p + ch, up.substring(1));
            }else{
                break;
            }
        }
    }

    static ArrayList<String> keypadReturn(String p,String up){
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);   // us group of character ko add kar do list me
            return list;
        }

        int digit = up.charAt(0) - '0';

        ArrayList<String> list = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < (digit * 3); i++) {
            if (i <= 25) {
                char ch = (char) ('a' + i);
                list.addAll(keypadReturn(p + ch, up.substring(1)));
            }else{
                break;
            }
        }
        return list;
    }
}
