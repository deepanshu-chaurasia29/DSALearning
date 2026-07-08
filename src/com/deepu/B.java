package com.deepu;

public class B extends A{
    B(){
        // super()  // Hidden by the compiler if not mentioned anywhere else in the constructor
        // if super is used bhale wo sabse m=niche hee kyu n used ho parent class ko tabhi call krega jab us super tak pahuchega
        System.out.println("enter into B");
        System.out.println("B");
        System.out.println("exit from B");
        super();

    }
}
