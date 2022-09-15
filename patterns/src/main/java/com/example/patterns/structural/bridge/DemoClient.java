package com.example.patterns.structural.bridge;

public class DemoClient {
    public static void main(String[] args) {
        Shape triangle = new Triangle(new Red());
    }
}
