package com.java.tips;



class Player{
    private  String name;
    private static int count;

    public Player(String name){
        this.name = name;
        count++;
    }

    public static int getCount() {
        return count;
    }
}


public class StaticModifierRunner {
    public static void main(String[] args){
        Player player1 = new Player("maina");
        System.out.println(player1.getCount());
        Player player2 = new Player("Fnadel");
        System.out.println(player1.getCount());
    }
}
