package com.multi.threading;


class Task1 extends Thread {
    public void run() {
        // Task 1
        System.out.print("\nTask1 Started");

        for(int i=101; i<=199; i++)
            System.out.print(i + " ");

        System.out.print("\nTask1 Done");
    }

}

class Task2 implements Runnable {

    @Override
    public void run() {
        System.out.print("\nTask2 Started");
        for(int i=201; i<=299; i++)
            System.out.print(i + " ");

        System.out.print("\nTask2 Done");
    }
}

public class ThreadBasicRunner {
    public static  void main(String[] args){

        System.out.print("\nTask1 kicked Off");
        Task1 task1 = new Task1();
        task1.start();

        // Task 2
        System.out.print("\nTask2 Kicked Off");
        Task2 task2 = new Task2();
        Thread task2Thread = new Thread(task2);
        task2Thread.start();


        // Task 3
        System.out.print("\nTask3 Started");
        for(int i=301; i<=399; i++)
            System.out.print(i + " ");

        System.out.print("\nTask3 Done");
    }
}
