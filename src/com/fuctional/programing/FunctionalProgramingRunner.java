package com.fuctional.programing;

import com.learn.generics.MyCustomList;

import java.util.List;

public class FunctionalProgramingRunner {
    public static void main(String[] args){
        List<String> list = List.of("cow", "man","pan","can","apple");

        printBasic(list);
        printWithFP(list);

        printBasicWithFilter(list);
        printFilersWithFP(list);
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
                element -> System.out.println("Element - " + element)
        );
    }

    // Normal or basic way to loop and print elements in a list with a filter
    private static void printBasicWithFilter(List<String> list) {
        for(String element: list){
            if(element.endsWith("an")){
                System.out.println(element);
            }
        }
    }

    // Doing the same using functional programing
    private static void printFilersWithFP(List<String> list) {
        list.stream()
                .filter(element -> element.endsWith("an"))
                .forEach(element -> System.out.println("Element - " + element)
        );
    }
}
