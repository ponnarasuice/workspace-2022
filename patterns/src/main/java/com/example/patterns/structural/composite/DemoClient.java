package com.example.patterns.structural.composite;

public class DemoClient {
    public static void main(String[] args) {

        Shape triangle = new Triangle();
        Shape circle = new Circle();

        Drawing drawing = new Drawing();
        drawing.add(triangle);
        drawing.draw(" red");
    }


}
