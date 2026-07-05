package com.deepu.OOPs.Inheritance;

class A {

    A() {
        System.out.println("A");
    }
}

class B extends A {

    B() {
        super();
        System.out.println("B");
    }
}

class C extends B {

    C() {
        super();
        System.out.println("C");
    }
}