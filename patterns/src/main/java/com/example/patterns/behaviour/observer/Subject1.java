package com.example.patterns.behaviour.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject1 {
//  list of observers
    List<Listeners> listeners = new ArrayList<Listeners>();
    private int state = 1;

    public int getState() {
        return state;
    }

//  state changes and notify observers
    public void setState(int state) {
        this.state = state;
        this.notifyall(this.listeners);
    }

    public void subscribe(Listeners listerner) {
        this.listeners.add(listerner);
    }

    public void unsubscribe(Listeners listerner) {
        this.listeners.remove(listerner);
    }

    private void notifyall(List<Listeners> listeners) {
        for (var listener : listeners) {
            listener.update(state);
        }
    }


//
}
