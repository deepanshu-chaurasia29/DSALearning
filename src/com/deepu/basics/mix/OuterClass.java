package com.deepu.basics.mix;

public class OuterClass {

     static class Test{
        String name;

        Test(String name){
            this.name = name;
        }

    }


    static void main() {

        Test t1 = new Test("Deepu");
        Test t2 = new Test("Kunal");
        System.out.println(t1.name);
        System.out.println(t2.name);

    }
}
