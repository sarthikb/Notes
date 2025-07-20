package com.sb.practice.nowornever.thread.threadpoolexecutor;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureCheck {

    private ExecutorService executor = Executors.newFixedThreadPool(10);

    public void checkCompletableFuture() throws ExecutionException, InterruptedException {

        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("CompletableFuture task started. Thread: " + Thread.currentThread().getName());
            return "Hello, CompletableFuture!";
        }).thenApply((String val)  -> {
            System.out.println(Thread.currentThread().getName());
            return val + " first chain";
        }).thenApply((String val)  -> {
            System.out.println(Thread.currentThread().getName());
            return val + " second chain";
        }).thenApply((val) -> {
            System.out.println(Thread.currentThread().getName());
            return val + " last chain";
        });

        System.out.println(future.get());
    }
}
