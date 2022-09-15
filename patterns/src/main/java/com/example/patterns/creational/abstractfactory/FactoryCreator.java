package com.example.patterns.creational.abstractfactory;

public class FactoryCreator {
    public static AbstractFactory getFactory(String name) {
        if (name.equals("vehicle")) {
            return new VehicleFactory();
        } else {
            return new RentalFactory();
        }

    }
}
