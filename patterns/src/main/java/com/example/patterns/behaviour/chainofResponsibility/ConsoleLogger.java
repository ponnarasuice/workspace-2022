package com.example.patterns.behaviour.chainofResponsibility;

public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void logWrite(String msg) {
        System.out.println("console logs: " + msg);
    }
}
