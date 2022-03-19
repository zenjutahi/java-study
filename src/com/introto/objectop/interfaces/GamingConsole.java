package com.introto.objectop.interfaces;

public interface GamingConsole {

    // Like the buttons in a gaming console, each individual game provides its own implementation.
    // An interface establishes a contract between two classes communicating.
    public void up();
    public void down();
    public  void left();
    public void right();
}
