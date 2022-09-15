package com.example.patterns.behaviour.state;

public class PackagedState implements State{
    @Override
    public void doAction() {
        System.out.println("packaged state");
    }
}
