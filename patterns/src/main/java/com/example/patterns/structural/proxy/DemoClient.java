package com.example.patterns.structural.proxy;

public class DemoClient {
    public static void main(String[] args) {
        Image image = new ProxyImage();
        var result = image.displayImage();
        System.out.println(result);
    }
}
