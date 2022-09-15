package com.example.patterns.behaviour.strategy;

public class Context1 {
    Strategy strategy;

    public Context1(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeExecution(int a, int b) {
        this.strategy.calculation(a, b);
    }
}
