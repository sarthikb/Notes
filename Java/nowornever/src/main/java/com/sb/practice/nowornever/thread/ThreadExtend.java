package com.sb.practice.nowornever.thread;

public class ThreadExtend extends Thread  {

    @Override
    public void run() {
        System.out.println("Inside ThreadExtend :: "+ Thread.currentThread().getName() + " started");
    }
}

