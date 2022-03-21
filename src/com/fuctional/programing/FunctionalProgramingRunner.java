package com.fuctional.programing;

import com.learn.generics.MyCustomList;

import java.util.List;

public class FunctionalProgramingRunner {
    public static void main(String[] args){
        List<String> list = List.of("cow", "man", "apple");

        printBasic(list);
        printWithFP(list);
    }

    // Normal or basic way to loop and print elements in a list
    private static void printBasic(List<String> list) {
        for(String element: list){
            System.out.println(element);
        }
    }

    // Doing the same using functional programing
    private static void printWithFP(List<String> list) {
        list.stream().forEach(
                element -> System.out.println(element)
        );
    }
}
