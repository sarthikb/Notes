package com.sb.practice.nowornever.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class CompareAndSwap {

    AtomicInteger atomicInteger = new AtomicInteger(0);

    public void increment() {
        atomicInteger.incrementAndGet();
    }

    public int get() {
        return atomicInteger.get();
    }
}
