package com.fuctional.programing;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FPNumberRunner {
    public static void main(String[] args){
        List<Integer> numbers = List.of(4,6,8,13,3,15);
//        numbers.stream().forEach(number -> System.out.println(number));

        normalSum(numbers);

        funcProgrammingSum(numbers);

        // Print squares of the first 10 numbers
        IntStream.range(1,11).map(e -> e * e).forEach(e -> System.out.println(e));

        // Map a stream of strings to lowercase
        List<String> myList = List.of("Man", "Animal", "Heart");
        myList.stream().map(e -> e.toLowerCase()).forEach(e -> System.out.println(e));

        // print the length of each element
        myList.stream().map(e -> e.length()).forEach(e -> System.out.println(e));

        // terminal operation max
        int ans = List.of(12,12,67,23,44).stream().max((n1, n2) -> Integer.compare(n1,n2)).get();
        System.out.println(ans);
        // Collecting to List -terminal operation
        List result = List.of(12,12,67,23,44).stream().filter(e -> e%2==0).collect(Collectors.toList());
        System.out.println(result);
        // Print a list of squares of the first 10 numbers
        List values = IntStream.range(1,11).map(e -> e * e).boxed().collect(Collectors.toList());
        System.out.println(values);
    }

    // Sum with filtering FP i.e. has no variable mutation
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
