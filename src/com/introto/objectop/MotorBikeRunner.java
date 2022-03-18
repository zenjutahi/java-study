package com.introto.objectop;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike(100);
        MotorBike honda = new MotorBike(10);

        // Setting the speed through encapsulation
        honda.setSpeed(70);
        System.out.println(honda.getSpeed());

        ducati.start();
        honda.start();

        ducati.setSpeed(80);
        ducati.increaseSpeed(100);
        ducati.decreaseSpeed(20);
        System.out.println(ducati.getSpeed());

        honda.decreaseSpeed(10);
        System.out.println(honda.getSpeed());
    }

}

