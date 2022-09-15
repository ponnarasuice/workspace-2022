package com.example.patterns.behaviour.state;

public class DeliveredState implements State{
    @Override
    public void doAction() {
        System.out.println("delivered state");
    }
}
