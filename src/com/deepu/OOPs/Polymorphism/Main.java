package com.deepu.OOPs.Polymorphism;

public class Main {
    static void main() {
        Shapes shapes = new Shapes();
        Square sq = new Square();
        Circle c = new Circle();

        // sqr is parent reference variable hai
        // new Square() - object of child class
        // called as UpCasting
        Shapes sqr = new Square();
        sqr.area();
        // which method is to be called is determined by parent class reference
        // which one will get executed is determined by object
        // sqr.area2();  // it gave error because no area2() method exits in parent class
                        // i am refering parent reference variable to access the child object


    }


}
