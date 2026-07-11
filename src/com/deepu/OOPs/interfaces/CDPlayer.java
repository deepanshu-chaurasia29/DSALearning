package com.deepu.OOPs.interfaces;

public class CDPlayer implements Media{

    @Override
    public void start() {
        System.out.println("song started");
    }

    @Override
    public void stop() {
        System.out.println("song stops");
    }
}
