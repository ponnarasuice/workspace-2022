package com.example.patterns.behaviour.strategy;

public class Addition implements Strategy {
    @Override
    public void calculation(int a, int b) {
        System.out.println(a+b);
    }
}
