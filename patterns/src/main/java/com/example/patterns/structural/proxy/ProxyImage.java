package com.example.patterns.structural.proxy;

public class ProxyImage implements Image{
    @Override
    public String displayImage() {
        var image = new RealImage();
        return image.displayImage() + "via proxy";
    }
}
