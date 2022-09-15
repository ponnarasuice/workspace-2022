package com.example.patterns.behaviour.state;

public class Context {


    State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

}
