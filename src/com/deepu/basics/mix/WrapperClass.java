package com.deepu.basics.mix;

public class WrapperClass {
    static void main() {
        int a = 10;
        int b = 5;
        swap(a,b);
        System.out.println(a + " " + b);

        Integer num1 = 10;  // still not swapping the value because it is final class means you cannot modify the existing value, you can change itbut you can't modify it

        Integer num2 = 11;
        swap(num1,num2);
        System.out.println(num1 + " "+ num2);
    }
    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}
