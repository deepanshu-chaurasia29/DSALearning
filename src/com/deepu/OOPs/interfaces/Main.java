package com.deepu.OOPs.interfaces;

public class Main {
    static void main() {
//        Car c=new Car();
//        c.start();
//        c.brake();
//        c.stop();
//
//        Engine e=new Car();
//        // e.price;  can't access this beacuse it is not present in Car class
//        e.start();
//        e.stop();

        Media carMedia= new Car();
        carMedia.start();  // maine start kiya media player but ye start ho gya car
        // that's why we create separate classes for these interfaces to execute methods separately

    }

}
