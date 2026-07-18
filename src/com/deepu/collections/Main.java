package com.deepu.collections;

import java.util.*;

public class Main {
    static void main() {
//        Collections
        List<Integer> list=new LinkedList<>();
        list.add(34);
        list.add(45);

        System.out.println(list);

        List<Integer> vector=new Vector<>();
        vector.add(23);
        System.out.println(vector.size());
    }
}
