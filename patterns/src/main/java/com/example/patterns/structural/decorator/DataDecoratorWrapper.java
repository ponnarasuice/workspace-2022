package com.example.patterns.structural.decorator;

public abstract class DataDecoratorWrapper implements Data{
    private Data wrapperData;

    DataDecoratorWrapper(Data wrapperData) {
        this.wrapperData = wrapperData;
    }

    @Override
    public String read() {
        return wrapperData.read();
    }

    @Override
    public void write(String input) {
        wrapperData.write(input);
    }
}
