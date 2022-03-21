package com.fuctional.programing;

import java.util.List;

public class FPNumberRunner {
    public static void main(String[] args){
        List<Integer> numbers = List.of(4,6,8,13,3,15);
//        numbers.stream().forEach(number -> System.out.println(number));

        normalSum(numbers);

        funcProgrammingSum(numbers);
    }

    private static void funcProgrammingSum(List<Integer> numbers) {
        int sum = numbers.stream().filter(number -> number%2!=0).reduce(0, (number1, number2) -> number1 + number2);
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
