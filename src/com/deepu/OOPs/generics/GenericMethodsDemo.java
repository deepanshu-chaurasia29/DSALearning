package com.deepu.OOPs.generics;

import java.util.ArrayList;

public class GenericMethodsDemo {
    static <T> void print(T value){
        System.out.println(value);
    }

    static void main() {
        GenericMethodsDemo.print(12);
        GenericMethodsDemo.print(false);
        GenericMethodsDemo.print(new ArrayList<>());
    }
 }
