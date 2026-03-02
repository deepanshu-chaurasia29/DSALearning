package com.deepu.dsa.strings;

public class Solution {
    public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        int ansIndex = str.length -1;
        return str[ansIndex].length();
    }

}
