package com.introto.objectop.objectop2;

public class Fan {

    // state
    private String make;
    private double radius;
    private String color;

    private boolean isOn;
    private byte speed;

    // creation

    public Fan(String make, double radius, String color) {
        this.make = make;
        this.radius = radius;
        this.color = color;
    }
    // Method on behaviour
    // isOn
    public void switchOn() {
        this.isOn = true;
    }

    public void switchOff() {
        this.isOn = false;
        setSpeed((byte) 0);
    }

    public void setSpeed(byte speed){
        this.speed = speed;
    }

    // print the state
    @Override
    public String toString() {
        return "Fan {" +
                "make='" + make + '\'' +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                ", isOn=" + isOn +
                ", speed=" + speed +
                '}';
    }
}
