package com.deepu.OOPs.interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Engine started");
    }

    @Override
    public void stop() {
        System.out.println("Engine stops");
    }

    @Override
    public void speed() {
        System.out.println("speed has been changed");
    }
}
