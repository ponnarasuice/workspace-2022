package com.example.patterns.structural.facade;

public class Iphone implements Phone{
    @Override
    public String modelname() {
        return "iphone";
    }

    @Override
    public int price() {
        return 150000;
    }
}
