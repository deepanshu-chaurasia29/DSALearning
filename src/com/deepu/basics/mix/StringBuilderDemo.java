package com.deepu.basics.mix;


public class StringBuilderDemo {
    public static void main(String[] args) {
        String s = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            s += ch;
        }
        System.out.println(s);

        // Here, reference variable s points to object "abcdefghijklmnopqrstuvwxyz".
        // Means for each new ch s points to another object and previous reference gets changed.
        // So, StringBuilder Class is introduced which points to one object at a time to rezduce the space complexity
        // Unlike String, It is mutable. It have methods that can be applied to Strings.

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            stringBuilder.append(ch);
        }
        System.out.println(stringBuilder);
        // System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder.indexOf("i"));
        System.out.println(stringBuilder.delete(5,9));


    }
}
