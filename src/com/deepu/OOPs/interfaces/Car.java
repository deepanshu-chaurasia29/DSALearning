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

    //since Car class is implementing Engine interface, so it  override default method
    public void acc(){
        System.out.println("default method in car class");
    }

    static void main() {
        Car c=new Car();
        // if default method not override in car class, c.acc() will print interface acc() method
        // if car class override default method, then it will print overridden method
        c.acc();

    }

}
