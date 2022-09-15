package com.example.patterns.creational.abstractfactory;

import com.example.patterns.creational.models.Bike;
import com.example.patterns.creational.models.Rental;
import com.example.patterns.creational.models.Vehicle;

public class VehicleFactory extends AbstractFactory{

    @Override
    public Vehicle createVehicle(String name) {
        if (name == "bike") {
            return new Bike();
        }

        return new Bike();
    }

    @Override
    public Rental createVehicleRent(String vehicleName) {
        return null;
    }
}
