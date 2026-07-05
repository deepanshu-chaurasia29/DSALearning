package com.deepu.OOPs.Polymorphism;

public class ObjectPrint {
    int num;

    @Override
    public String toString() {
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }

    public ObjectPrint(int num){
        this.num=num;
    }

    static void main() {
        ObjectPrint obj = new ObjectPrint(54);
        System.out.println(obj);
    }
}
