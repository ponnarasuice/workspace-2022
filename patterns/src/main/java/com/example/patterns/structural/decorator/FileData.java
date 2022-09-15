package com.example.patterns.structural.decorator;

public class FileData implements Data{

    @Override
    public String read() {
        System.out.println("from file data");
        return "this is sample content";
    }

    @Override
    public void write(String input) {
        System.out.println("write sample input:" + input);
    }
}
