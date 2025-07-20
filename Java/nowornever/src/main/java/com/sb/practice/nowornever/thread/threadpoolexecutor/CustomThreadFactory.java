package com.sb.practice.nowornever.thread.threadpoolexecutor;

import java.util.concurrent.ThreadFactory;

public class CustomThreadFactory implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        System.out.println("Creating new thread :: " + r.toString());
        Thread th = new Thread();
        th.setName("CustomThreadFactory-Thread");
        th.setDaemon(true);
        th.setPriority(Thread.NORM_PRIORITY);
        return th;
    }
}
