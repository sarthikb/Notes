package com.sb.practice.nowornever.thread.reentrant;

import java.util.concurrent.locks.ReentrantLock;

public class CommonResource {

    public void doSomething(ReentrantLock lock) throws InterruptedException {
        System.out.println("Inside CommonResource :: doSomething() started  "+Thread.currentThread().getName() + " acquired lock"  );
        try {
            lock.lock();
            Thread.sleep(10000);
            System.out.println("Inside CommonResource :: doSomething() completed" + Thread.currentThread().getName() + " released lock"  );
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
