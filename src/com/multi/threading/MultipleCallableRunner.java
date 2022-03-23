package com.multi.threading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(8);

        List<CallableTask> taskList = List.of(new CallableTask("Here"),
                new CallableTask("Now"), new CallableTask("Mercy"));

        List<Future<String>> results = executorService.invokeAll(taskList);

        for(Future<String> result:results){
            System.out.println(result.get());
        }

        executorService.shutdown();
    }

}
