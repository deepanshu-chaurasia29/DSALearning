package com.deepu.OOPs.cloning;

public class Human implements Cloneable {
    int age;
    String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return age+" "+name;
    }

    public Human(Human other){
        this.age=other.age;
        this.name=other.name;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
