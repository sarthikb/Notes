package com.sb.practice.nowornever.thread;

public class MonitorLockWorking {

    public synchronized void task1() {
        try {
            System.out.println("Task 1 started");
            Thread.sleep(10000);
            System.out.println("Task 1 completed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void task2() {
        System.out.println("Task 2 started");
        synchronized (this) {
            System.out.println("Task 2 sycn block");
        }
    }

    public void task3() {
        System.out.println("Task 3 started");
    }
}
