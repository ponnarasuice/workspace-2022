package com.example.patterns.structural.bridge;

public class Red implements Color{
    @Override
    public void applyColor() {
        System.out.println("red color applied");
    }
}
