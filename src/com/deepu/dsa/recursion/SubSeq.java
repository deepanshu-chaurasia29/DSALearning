package com.deepu.dsa.recursion;

public class SubSeq {
    static void main() {
        subseq("","abc");
    }

    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }

}
