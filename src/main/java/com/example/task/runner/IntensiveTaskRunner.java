package com.example.task.runner;

import com.example.task.fib.Fibonacci;

import java.math.BigInteger;
import java.util.concurrent.*;

public class IntensiveTaskRunner {
    public String runTask(){
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int j = 0; j < 10; j++) {
            executorService.submit(new Runnable() {
                public void run() {
                    for (int i = 0; i < Integer.MAX_VALUE; i++) {
                        if(!Thread.currentThread().isInterrupted()) {
                            System.out.println("Calculating..");
                            Fibonacci.fib(new BigInteger(String.valueOf(i)));
                        }else{
                            break;
                        }
                    }
                }
            });
        }
        try {
            if (!executorService.awaitTermination(60, TimeUnit.SECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        };
        return "Success";
    }

}
