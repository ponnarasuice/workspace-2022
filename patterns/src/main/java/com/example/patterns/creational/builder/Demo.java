package com.example.patterns.creational.builder;

public class Demo {
    public static void main(String[] args) {
        Phone.PhoneBuilder builder = new Phone.PhoneBuilder();
        builder.setModel("samsung");
        builder.setPrice("120000");
        Phone ph;
        ph = builder.build();
        System.out.println(ph.getModel() + "___" + ph.price);
    }
}
