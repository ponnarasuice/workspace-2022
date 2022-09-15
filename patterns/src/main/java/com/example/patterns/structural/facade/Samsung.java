package com.example.patterns.structural.facade;

public class Samsung implements Phone{
    @Override
    public String modelname() {
        return "samsung";
    }

    @Override
    public int price() {
        return 45000;
    }
}
