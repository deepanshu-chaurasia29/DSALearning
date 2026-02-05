package com.deepu.basics.mix;


import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(5);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        System.out.println(arrayList.contains(2));
        System.out.println(arrayList.contains(9));

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        System.out.println(arrayList);
    }
}
