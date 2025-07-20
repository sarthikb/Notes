package com.sb.practice.nowornever.lld.chainofresponsiblity;

public abstract class LogHandler {

    protected LogHandler nextHandler;

    public void setNextHandler(LogHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    public abstract void handleRequest(String log, LogLevel logLevel);
}
