package com.deepu.OOPs.interfaces;

public class PetrolEngine implements Engine{
    @Override
    public void start() {
        System.out.println("petrol engine starts");
    }

    @Override
    public void stop() {
        System.out.println("petrol engine stop");
    }

    @Override
    public void speed() {
        System.out.println("petrol engine speed");
    }
}
