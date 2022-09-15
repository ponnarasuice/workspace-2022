package com.example.patterns.structural.decorator;

public class Demo {
    public static void main(String[] args) {
        DataDecoratorWrapper wrapper = new EncryptionFile(new FileData());
        wrapper.write("input from demo...");
        wrapper.read();

    }
}
