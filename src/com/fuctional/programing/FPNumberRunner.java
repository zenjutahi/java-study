package com.fuctional.programing;

import java.util.List;
import java.util.stream.IntStream;

public class FPNumberRunner {
    public static void main(String[] args){
        List<Integer> numbers = List.of(4,6,8,13,3,15);
//        numbers.stream().forEach(number -> System.out.println(number));

        normalSum(numbers);

        funcProgrammingSum(numbers);

        // Print squares of the first 10 numbers
        IntStream.range(1,11).forEach(e -> System.out.println(e));

        // Map a stream of strings to lowercase
        List<String> myList = List.of("Man", "Animal", "Heart");
        myList.stream().map(e -> e.toLowerCase()).forEach(e -> System.out.println(e));

        // print the length of each element
        myList.stream().map(e -> e.length()).forEach(e -> System.out.println(e));

    }

    // Sum with filtering FP i.e has no variable mutation
    private static void funcProgrammingSum(List<Integer> numbers) {
        int sum = numbers.stream().filter(number -> number%2!=0)
                .reduce(0, (number1, number2) -> number1 + number2);
        System.out.println(sum);
    }

    private static void normalSum(List<Integer> numbers) {
        Integer sum = 0;
        for(Integer number: numbers){
            sum+=number;
        }
        System.out.println(sum);
    }
}
