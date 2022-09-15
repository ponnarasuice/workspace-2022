package com.example.patterns.structural.decorator;

public class EncryptionFile extends DataDecoratorWrapper {
    EncryptionFile(Data wrapperData) {
        super(wrapperData);
    }

    @Override
    public void write(String input) {
        super.write(getEncode(input));
    }

    @Override
    public String read() {
        System.out.println("in encrypt file");
        return getDecode(super.read());
    }

    private String getDecode(String read) {
        return read + "decoded value";
    }

    private String getEncode(String input) {
        return "encoded input";
    }
}
