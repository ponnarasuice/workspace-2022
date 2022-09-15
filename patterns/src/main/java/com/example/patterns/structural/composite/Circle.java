package com.example.patterns.structural.composite;



public class Circle implements Shape {
    @Override
    public void draw(String color) {
        System.out.println("circle draw with color" + color);
    }
}
