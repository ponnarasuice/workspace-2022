package com.example.patterns.behaviour.state;

public class Demo {
    public static void main(String[] args) {
        var input = "packaged";
        Context ctx = new Context();
        State state= null;
        if (input.equalsIgnoreCase("packaged")) {
            state = new PackagedState();
        }
        ctx.setState(state);
        state.doAction();

    }
}
