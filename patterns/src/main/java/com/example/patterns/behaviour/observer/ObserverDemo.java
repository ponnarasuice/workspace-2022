package com.example.patterns.behaviour.observer;


public class ObserverDemo {
    public static void main(String[] args) {
//        subject which changes its state
        Subject1 subject = new Subject1();
//        observer listens state change
        Listener1 listener1 = new Listener1();

        subject.subscribe(listener1);
//        action: state changes
        subject.setState(5);

    }
}
