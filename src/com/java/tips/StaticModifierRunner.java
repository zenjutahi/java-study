package com.java.tips;



class Player{
    private  String name;

    // Use Static variable When you want to have a constant value between Object instances
    private static int count;

    public Player(String name){
        this.name = name;
        count++;
    }

    // Static method used when its meant foe a static variable
    public static int getCount() {
        return count;
    }
}


public class StaticModifierRunner {
    public static void main(String[] args){
        Player player1 = new Player("maina");
        System.out.println(Player.getCount());
        Player player2 = new Player("Fnadel");
        System.out.println(Player.getCount());
    }
}
