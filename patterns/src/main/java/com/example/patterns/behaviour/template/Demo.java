package com.example.patterns.behaviour.template;

public class Demo {
    public static void main(String[] args) {
//        similar to strategy. reuse the flow of code. widely used this kind of pattern.
        Game chess = new Chess();
        chess.play();
    }
}
