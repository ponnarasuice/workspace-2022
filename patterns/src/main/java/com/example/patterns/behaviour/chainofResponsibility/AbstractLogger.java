package com.example.patterns.behaviour.chainofResponsibility;

public abstract class AbstractLogger {

    public static int CONSOLE = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    public int level = 1;

    public AbstractLogger nextLogger;

    private void logMessage(int level, String msg) {
        if (this.level == level) {
            logWrite(msg);
        }

        if (nextLogger != null) {
            nextLogger.logMessage(level, msg);
        }
    }

    protected abstract void logWrite(String msg);
}
