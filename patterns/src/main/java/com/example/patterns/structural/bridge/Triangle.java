package com.example.patterns.structural.bridge;

public class Triangle extends Shape{

    Triangle (Color color) {
        super(color);
    }

    @Override
    void applyColor() {
        System.out.println("triangle fillinf color");
        color.applyColor();
    }
}
