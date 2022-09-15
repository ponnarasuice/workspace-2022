package com.example.patterns.creational.abstractfactory;

import com.example.patterns.creational.models.Bike;
import com.example.patterns.creational.models.Rental;
import com.example.patterns.creational.models.Truck;
import com.example.patterns.creational.models.Vehicle;

public class RentalFactory extends AbstractFactory {

    @Override
    public Vehicle createVehicle(String name) {
        return null;
    }

    @Override
    public Rental createVehicleRent(String vehicleName) {
        if (vehicleName == "bike") {
            new Bike();
        }
        return null;
    }
}
