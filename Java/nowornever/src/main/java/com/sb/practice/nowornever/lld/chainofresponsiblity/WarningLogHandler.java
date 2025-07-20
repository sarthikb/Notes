package com.sb.practice.nowornever.lld.chainofresponsiblity;

public class WarningLogHandler extends LogHandler  {

    @Override
    public void handleRequest(String log, LogLevel logLevel) {
        if(LogLevel.WARNING.equals(logLevel)) {
            System.out.println("Handling warning log :: " + log);
        } else if(nextHandler != null) {
            nextHandler.handleRequest(log, logLevel);
        } else {
            System.out.println("No Next handler found for warning log level");
        }
    }
}
