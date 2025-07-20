package com.sb.practice.nowornever.lld.chainofresponsiblity;

public class DebugLogHandler extends LogHandler  {

    @Override
    public void handleRequest(String log, LogLevel logLevel) {
        if(LogLevel.DEBUG.equals(logLevel)) {
            System.out.println("Debug Log: " + log);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(log, logLevel);
        }
    }
}
