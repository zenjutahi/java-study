package com.execption.handling;

import java.util.Scanner;

public class FinallyRunner {

    public static  void main(String[] args){

        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);

            int[] numbers = {12, 3, 4, 5};

            int number = numbers[5];

            System.out.println("Before scanner close");

        } catch (Exception ex){
            ex.printStackTrace();
        } finally {
            scanner.close();
        }
        System.out.println("Just Before closing out main");
    }
}
