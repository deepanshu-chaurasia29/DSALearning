package com.deepu.OOPs.interfaces;

public class Main2 {
    static void main() {
        NewCar car=new NewCar();
        // System.out.println("start and stop method of car executed");
        car.start();
        car.stop();

        // System.out.println("start and stop method of media executed");
        car.startMusic();
        car.stopMusic();

        // System.out.println("car engine get changed");
        car.changeEngine(new ElectricEngine());

        // Now, my engine is changed from normal to electric
        car.start();
        car.stop();

        // Car speaker changed from old to new one
        car.changeSpeaker(new MarshallSpeaker());
        car.startMusic();

        // System.out.println("car engine get changed");
        car.changeEngine(new PetrolEngine());

        // Now, my engine is changed from Electric to Petrol
        car.start();
        car.stop();
    }
}
