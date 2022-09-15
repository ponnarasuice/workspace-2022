package com.example.patterns.behaviour.observer;

public class Listener1 extends Listeners{

    public void update(int state) {
        System.out.println("listener 1 with state " + state);
    }
}
