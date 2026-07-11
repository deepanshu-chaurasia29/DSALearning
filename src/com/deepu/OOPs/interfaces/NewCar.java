package com.deepu.OOPs.interfaces;

public class NewCar{
    // Data encapsulation
    private Engine engine;  // this is composition relationship. newCar HAS-A engine
                            // It stores the reference of any object implementing Engine interface
    private Media speaker = new CDPlayer();

    public NewCar(){
        engine = new PowerEngine();
    }

    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void startMusic(){
        speaker.start();
    }
    public void stopMusic(){
        speaker.stop();
    }
    public void changeEngine(Engine engine){
        this.engine=engine;
    }
    public void changeSpeaker(Media newSpeaker){
        this.speaker=newSpeaker;
    }

}
