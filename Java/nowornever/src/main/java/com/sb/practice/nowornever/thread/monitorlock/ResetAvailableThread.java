package com.sb.practice.nowornever.thread.monitorlock;

public class ResetAvailableThread implements Runnable  {

    private SharedResource sharedResource;

    public ResetAvailableThread(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        try {
            sharedResource.resetAvailble();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
