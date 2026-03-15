package com.deepu.dsa.recursion;

import java.lang.classfile.Attribute;
import java.util.ArrayList;

public class Permutations {
    static void main() {

        permutation("","abc");
//        ArrayList<String> ans = permutationList("","abcd");
//        System.out.println(ans);
//        System.out.println(permutationCount("","abcd"));
    }
    static void permutation(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        // No of calls is dependent on processed string length
        for (int i = 0; i <= p.length(); i++) {
            String s = p.substring(0,i);
            String f = p.substring(i,p.length());
            String ans = s + ch + f;
            permutation(ans,up.substring(1));

        }
    }

    static ArrayList<String> permutationList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        // No of calls is dependent on processed string length
        for (int i = 0; i <= p.length(); i++) {
            String s = p.substring(0,i);
            String f = p.substring(i,p.length());

            ans.addAll(permutationList(s + ch + f,up.substring(1)));

        }
        return ans;
    }

    static int permutationCount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }

        int count = 0;
        char ch = up.charAt(0);
        // No of calls is dependent on processed string length
        for (int i = 0; i <= p.length(); i++) {
            String s = p.substring(0,i);
            String f = p.substring(i,p.length());
            String ans = s + ch + f;
            count += permutationCount(ans,up.substring(1));

        }

        return count;
    }


}
