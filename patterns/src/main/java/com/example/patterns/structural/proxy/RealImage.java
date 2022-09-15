package com.example.patterns.structural.proxy;

public class RealImage implements Image{
    @Override
    public String displayImage() {
        return "original image";
    }
}
