package au_test;

import automobile.*;

public class Tester {
    static void main() {
        System.out.println("tester main method");
        Vehicle v=new Vehicle();
        Bike b=new Bike();
        Car c =new Car();
        v.printname();
        b.printname();
        c.printname();
    }
}
