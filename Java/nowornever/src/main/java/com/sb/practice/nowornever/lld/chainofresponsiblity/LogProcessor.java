package com.sb.practice.nowornever.lld.chainofresponsiblity;

public class LogProcessor {

    private LogHandler logHandler;
    public LogProcessor() {
        var infoProcessor = new InfoLogHandler();
        var debugProcessor = new DebugLogHandler();
        var warningProcessor = new WarningLogHandler();

        infoProcessor.setNextHandler(debugProcessor);
        debugProcessor.setNextHandler(warningProcessor);
        this.logHandler = infoProcessor;
    }

    public void processLog(String log, LogLevel level) {
        logHandler.handleRequest(log, level);
    }
}

