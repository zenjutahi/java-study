package com.fuctional.programing;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;


// Understanding functional interface
class EvenNumberPredicate implements Predicate<Integer>{

    @Override
    public boolean test(Integer number) {
        return number%2==0;

    }
}

class EvenNumberConsumer implements Consumer<Integer> {

    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }
}

public class LambdaBehindTheScreensRunner {
    public static void main(String[] args){
        List.of(12,13,56,24,33,17).stream()
                .filter(n -> n%2==0)
                .forEach(e -> System.out.println(e));

        List.of(12,13,56,24,33,17).stream()
                .filter(new EvenNumberPredicate())
                .forEach(new EvenNumberConsumer());


    }
}
