package com.example.patterns.structural.bridge;

public abstract class Shape {
    Color color;

    Shape(Color color) {
        color = this.color;
    }

    abstract void applyColor();
}
