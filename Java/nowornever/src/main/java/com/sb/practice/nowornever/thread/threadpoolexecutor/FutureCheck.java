package com.sb.practice.nowornever.thread.threadpoolexecutor;

import org.springframework.scheduling.config.Task;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class FutureCheck {

    private ExecutorService threadPoolExecutor = Executors.newCachedThreadPool();

    public void submitTask() {

        Callable<String> callableTask = () -> {
            System.out.println("Task submitted :: "+Thread.currentThread().getName());
            Thread.sleep(3000);  // Simulating a time-consuming task
            return "Task completed successfully!  :: "+Thread.currentThread().getName();
        };
        int i = 0;
        while(i < 15) {
            Future<String> future = threadPoolExecutor.submit(callableTask);
            try {
                System.out.println("Task state: " + future.isCancelled());
                if(i == 10) {
                    System.out.println("Task result: " + future.get(20, TimeUnit.SECONDS));
//                    throw new Exception("Terminate Now !!!");
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(threadPoolExecutor.shutdownNow());
            } finally {
                i++;
            }
        }
    }
}
