package com.example.patterns.structural.composite;



public class Triangle implements Shape {
    @Override
    public void draw(String color) {
        System.out.println("triangle draw with color" + color);
    }
}
