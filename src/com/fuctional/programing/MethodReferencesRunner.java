package com.fuctional.programing;

import java.util.List;

public class MethodReferencesRunner {

    public static void print(Integer number){
        System.out.println("from reference example - " + number);
    }

    public static void main(String[] args){
        List.of("Monkey", "Ant", "Lice", "Cat", "Dog").stream()
                .map(s -> s.length())
                .forEach(s -> System.out.println(s));

        // method referencing example : same functionality
        List.of("Monkey", "Ant", "Lice", "Cat", "Dog").stream()
                .map(s -> s.length())
                .forEach(MethodReferencesRunner::print);
        // referencing the system print method
        List.of("Monkey", "Ant", "Lice", "Cat", "Dog").stream()
                .map(String::length)
                .forEach(System.out::println);

        int ans = List.of(12,12,67,23,44).stream()
                .filter(n -> n % 2 == 0)
                .max(Integer::compare)
                .get();
        System.out.println(ans);
    }
}
