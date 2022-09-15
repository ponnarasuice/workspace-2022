package com.example.patterns.creational.builder;

public class Phone {
    String model;
    String price;

    public Phone(PhoneBuilder phoneBuilder) {
        this.model = phoneBuilder.model;
        this.price = phoneBuilder.price;
    }

    public String getModel() {
        return model;
    }

    public String getPrice() {
        return price;
    }

    public static class PhoneBuilder{
        String model;
        String price;

        public void setModel(String model) {
            this.model = model;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public Phone build() {
            return new Phone(this);
        }

    }
}
