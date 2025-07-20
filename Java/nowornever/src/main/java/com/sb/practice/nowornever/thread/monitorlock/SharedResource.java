package com.sb.practice.nowornever.thread.monitorlock;

public class SharedResource {

    private boolean isAvailable = false;

    public synchronized void updateAvailable() throws InterruptedException {
        System.out.println("Inside updateAvailable() method before thread sleep");
        Thread.sleep(10000);
        System.out.println("Inside updateAvailable() method after thread sleep");
        isAvailable = true;
        notifyAll();
    }

    public synchronized void resetAvailble() throws InterruptedException {
        System.out.println("Outside loop of resetAvailble()");
        while (!isAvailable) {
            System.out.println("Inside loop of resetAvailble()");
            Thread.sleep(10000);
            wait();
        }
        isAvailable = false;
        System.out.println("Done updating available to false");
    }

}
