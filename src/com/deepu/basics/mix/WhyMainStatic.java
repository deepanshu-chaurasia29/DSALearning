package com.deepu.basics.mix;


import static com.deepu.basics.mix.Armstrong_No.isArmstrong;

public class WhyMainStatic {
    static void main() {
        WhyMainStatic obj = new WhyMainStatic();
        obj.greeting();
        greeting2();

    }
    void greeting(){
        System.out.println("non-static hello world");
    }

    static void greeting2(){
        System.out.println("static hello world");
    }
}
