package com.multi.threading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleAnyCallableRunner {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        List<CallableTask> taskList = List.of(new CallableTask("Here"),
                new CallableTask("Now"), new CallableTask("Mercy"));

        String results = executorService.invokeAny(taskList);

        System.out.println(results);

        executorService.shutdown();
    }

}
