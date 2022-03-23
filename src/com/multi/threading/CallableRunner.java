package com.multi.threading;


import java.util.concurrent.*;

class CallableTask implements Callable<String>{
    private String name;

    public CallableTask(String name){
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Hello" + name;
    }
}


public class CallableRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> shit_together = executorService.submit(
                new CallableTask("Get Your Shit Together"));
        System.out.print("\n new CallableTask started");

        String futureMessage = shit_together.get();

        System.out.print(futureMessage);

        System.out.print("\n Main completed");
    }

}
