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
}
