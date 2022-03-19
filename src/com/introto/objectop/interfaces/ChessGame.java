package com.introto.objectop.interfaces;

public class ChessGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Move piece forward");
    }

    @Override
    public void down() {
        System.out.println("Move piece back");
    }

    @Override
    public void left() {
        System.out.println("Move piece to the left");
    }

    @Override
    public void right() {
        System.out.println("Move piece to the right");
    }
}
