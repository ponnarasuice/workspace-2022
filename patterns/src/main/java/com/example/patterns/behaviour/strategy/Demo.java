package com.example.patterns.behaviour.strategy;

public class Demo {
    public static void main(String[] args) {
//        its normal interface/ sub class implementation. runtime changing behaviour
        Strategy addStrategy = new Addition();
        Context1 context1 = new Context1(addStrategy);
        context1.executeExecution(5, 10);
    }
}
