package com.deepu.OOPs.encapsulation;

public class Main {
    static void main() {
        EncapsulationDemo demo=new EncapsulationDemo();
        // demo.x;  // we can't access x directly, x is hidden for outside users, so to use that variable use getter and setter
        demo.setAge(1);
        System.out.println(demo.getAge());
    }
}
