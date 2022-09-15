package com.example.patterns.structural.composite;

import com.example.patterns.behaviour.observer.Listener1;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape{
    private List<Shape> shapes = new ArrayList();

    @Override
    public void draw(String color) {
        for (Shape shape: shapes) {
            shape.draw(color);
        }
    }

    public void add(Shape shape){
        shapes.add(shape);
    }

    public void remove(Shape shape) {
        shapes.remove(shape);
    }
}
