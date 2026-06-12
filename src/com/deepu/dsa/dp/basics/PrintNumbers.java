package com.deepu.dsa.dp.basics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class PrintNumbers {
    static void main() {
        // 1 to n
        int n=6;
        print1ton(n);
        printnto1(n);
        List<Integer> list = printnto1Ret(n,new ArrayList<>());
        System.out.println(list.toString());

    }
    static void print1ton(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        print1ton(n-1);
        System.out.println(n);
    }

    static void printnto1(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printnto1(n-1);

    }
    static ArrayList<Integer> printnto1Ret(int n, ArrayList<Integer> list){
        if(n == 1){
            list.add(n);
            return list;
        }
        list.add(n);
        return printnto1Ret(n-1,list);

    }
}
