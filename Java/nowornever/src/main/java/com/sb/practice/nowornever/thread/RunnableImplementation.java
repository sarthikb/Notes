package com.sb.practice.nowornever.thread;

public class RunnableImplementation implements Runnable{
    @Override
    public void run() {
        System.out.println("In new thread :: "+ Thread.currentThread().getName());
    }
}
