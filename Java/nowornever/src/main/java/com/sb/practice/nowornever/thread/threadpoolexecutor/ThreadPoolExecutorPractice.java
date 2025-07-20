package com.sb.practice.nowornever.thread.threadpoolexecutor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorPractice {
    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2,
            5,
            10,
            TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(5)
    );


    public void threadTest() {


        for (int i = 0; i < 10; i++) {
            System.out.println("Creating :: " + Thread.currentThread().getName());
            threadPoolExecutor.submit(() -> {
                System.out.println("Executing :: " + Thread.currentThread().getName());
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Finished :: " + Thread.currentThread().getName());
            });
        }
        threadPoolExecutor.shutdown();
    }

}
