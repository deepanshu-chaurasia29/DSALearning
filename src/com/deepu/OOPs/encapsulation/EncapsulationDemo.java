package com.deepu.OOPs.encapsulation;

public class EncapsulationDemo {
    private int age;

    public void setAge(int age) {
        if(age > 18) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

}
