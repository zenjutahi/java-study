package com.introto.objectop.objectop2;

public class FanRunner {
    public static void main(String[] args) {

        Fan fan = new Fan("Manufact1", 1.5, "blue");
        System.out.println(fan);
        fan.setSpeed((byte) 5);
        fan.switchOff();
        System.out.println(fan);
        fan.switchOn();
        fan.setSpeed((byte) 5);
        System.out.println(fan);


    }
}
