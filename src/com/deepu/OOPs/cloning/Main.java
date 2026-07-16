package com.deepu.OOPs.cloning;

import com.deepu.OOPs.generics.CustomArrayList;

public class Main {
    static void main() throws CloneNotSupportedException{
        Human deepu=new Human(22,"Deepanshu");
        // cloning manually takes longer time, that's why Clonable interface is used to clone some object.
//        Human twin=new Human(deepu);


        // for making copy, now we can directly use clone method
        Human twin = (Human)deepu.clone(); // we are doing this because it is faster
        System.out.println(twin.age);
        System.out.println(twin.name);
        System.out.println(twin.clone().toString());
    }
}
