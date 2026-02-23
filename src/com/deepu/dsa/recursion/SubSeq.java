package com.deepu.dsa.recursion;

import java.util.AbstractList;
import java.util.ArrayList;

public class SubSeq {
    static void main() {
//        subseq("","abc");
        System.out.println(subseqRet("","abc"));
    }

    // P -> processed, up -> unprocessed
    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }

    static ArrayList<String> subseqRet(String p, String up){
        if(up.isEmpty()){  //  unprocessed string became null, just return processed string processed string
            ArrayList<String> list = new ArrayList<>();
            list.add(p);   // us substring ko add kar do list me
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subseqRet(p+ch,up.substring(1));
        ArrayList<String> right = subseqRet(p,up.substring(1));

        left.addAll(right);

        return left;
    }

}
