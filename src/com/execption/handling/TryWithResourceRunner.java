package com.execption.handling;

import java.util.Scanner;

public class TryWithResourceRunner {

    public static  void main(String[] args){

        // With resources
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numbers = {12, 3, 4, 5};
            int number = numbers[18];

        }

    }
}
