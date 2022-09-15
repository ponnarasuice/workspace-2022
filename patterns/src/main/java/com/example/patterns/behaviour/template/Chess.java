package com.example.patterns.behaviour.template;

public class Chess extends Game{
    @Override
    void initialise() {
        System.out.println("chess initiated");
    }

    @Override
    void startplay() {
        System.out.println("chess start");
    }

    @Override
    void endplay() {
        System.out.println("chess end");
    }
}
