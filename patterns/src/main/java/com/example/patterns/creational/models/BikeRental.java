package com.example.patterns.creational.models;

public class BikeRental implements Rental {
    @Override
    public void rentalprice() {
        System.out.println("bike rent is rs." + 35);
    }
}
