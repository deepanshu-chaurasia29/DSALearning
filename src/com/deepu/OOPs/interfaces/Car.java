package com.deepu.OOPs.interfaces;

public class Car implements Engine,Brake,Media{
    @Override
    public void brake() {
        System.out.println("Applying brake");
    }

    @Override
    public void start() {
        System.out.println("start the car");

    }

    @Override
    public void stop() {
        System.out.println("stop the car");
    }

    @Override
    public void speed() {
        System.out.println("speed changes");
    }
}
