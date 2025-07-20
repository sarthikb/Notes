package com.sb.practice.nowornever.lld.chainofresponsiblity;

public class InfoLogHandler extends LogHandler  {

    @Override
    public void handleRequest(String log, LogLevel logLevel) {
        if(LogLevel.INFO.equals(logLevel)) {
            System.out.println("Handling INFO log: " + log);
        } else if(nextHandler != null) {
            nextHandler.handleRequest(log, logLevel);
        }
    }
}
