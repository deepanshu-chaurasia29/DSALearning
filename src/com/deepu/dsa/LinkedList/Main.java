package com.deepu.dsa.LinkedList;

public class Main {
    static void main() {
        LL list=new LL();
        list.insertFirst(1);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(7);
        list.insertFirst(8);
        list.display();
        list.insert(5,3);
//        list.insert(90,500);   exception occur
        list.display();


    }
}
