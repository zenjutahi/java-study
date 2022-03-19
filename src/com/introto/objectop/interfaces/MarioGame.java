package com.introto.objectop.interfaces;

public class MarioGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Move ahead fast");
    }

    @Override
    public void down() {
        System.out.println("Get into a hole");
    }

    @Override
    public void left() {
        System.out.println("Change direction and run left");
    }

    @Override
    public void right() {
        System.out.println("Stop and dance");
    }
}
