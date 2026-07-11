package com.deepu.OOPs.interfaces;

public class MarshallSpeaker implements Media{
    @Override
    public void start() {
        System.out.println("Marshall speaker starts");
    }

    @Override
    public void stop() {
        System.out.println("Marshall speaker stops");
    }
}
