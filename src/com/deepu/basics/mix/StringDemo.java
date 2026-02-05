package com.deepu.basics.mix;


import java.util.ArrayList;
import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        java.lang.String a = "deepu";
        java.lang.String b = "deepu";
        java.lang.String c = a;
        // object deepu will get stored inside the pool of heap memory
        // references a and b will point to the same object i.e, deepu
        System.out.println(a == c);

        String name1 = new String("deepu");
        String name2 = new String("deepu");
        // here we are creating objects explicitly which is present outside the pool inside heap
        // So, name1 and name2 are two different references.
        // Both are pointing to different objects
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));

        System.out.println(Arrays.toString(new int[]{1, 34, 2, 4}));

        System.out.println('a' + 'b');  // char value changes to int value and then added
        System.out.println("a" + "b");  // concatenation
        System.out.println('a' + 3);    // char + int = int
        System.out.println("a" + 3);    // string + int => concatenation
        System.out.println("a" + 'b');  // concatenation

        java.lang.String ans = new ArrayList<>() + "   " + "b";
        System.out.println(ans);

        java.lang.String name = "deeepu";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.equals(name.toLowerCase()));

    }
}
