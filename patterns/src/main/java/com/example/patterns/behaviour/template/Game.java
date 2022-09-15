package com.example.patterns.behaviour.template;

public abstract class Game {

    abstract void initialise();
    abstract void startplay();
    abstract void endplay();

    void play() {
        initialise();
        startplay();
        endplay();
    }

}
