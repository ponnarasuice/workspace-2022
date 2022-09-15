package com.example.patterns.behaviour.chainofResponsibility;

public class Demo {
    public static void main(String[] args) {
//        there are some objects , based on the input either one of them serves the task
        AbstractLogger abstractLogger = new ConsoleLogger(AbstractLogger.CONSOLE);
        abstractLogger.logWrite("hello msg");
    }
}
