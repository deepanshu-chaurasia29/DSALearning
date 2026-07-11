package com.deepu.OOPs.interfaces;

public interface Engine {
    static final int PRICE=100000;

    void start();
    void stop();
    void speed();
    default void acc(){
        System.out.println("default method of engine");
    }

}
