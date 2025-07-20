package com.sb.practice.nowornever.thread.monitorlock;

public class UpdateAvailableThread  implements Runnable  {

    private SharedResource sharedResource;

    public UpdateAvailableThread(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        try {
            sharedResource.updateAvailable();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
