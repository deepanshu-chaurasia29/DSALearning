package com.deepu.OOPs.Inheritance;

public class Main {
    static void main() {
//        BoxWeight box1 = new BoxWeight(1, 2, 3, 5);
//        System.out.println(box1.l + " " + box1.w + " " + box1.h + " " + box1.weight);
//
//        BoxPrice box2 = new BoxPrice(3, 2, 5, 60, 100);
//        System.out.println(box2.l + box2.w + box2.h + box2.weight + box2.price);

//        C c=new C();


//        Box.greeting();
        // this will still works but no need to do this as for static method no need to create object to access that
        // Box box=new Box();
        // box.greeting();

        // polymorphism
        Box box=new BoxWeight();
        box.greeting();  // we can't override the static method as this will print the greeting method of Box class not the BoxWeight class.

        BoxPrice box2=new BoxPrice();
        box2.greeting(); // this will inherit greeting method from BoxPrice class but can't override that method.
    }
}
