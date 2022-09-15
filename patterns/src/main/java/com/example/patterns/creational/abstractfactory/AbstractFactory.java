package com.example.patterns.creational.abstractfactory;

import com.example.patterns.creational.models.Rental;
import com.example.patterns.creational.models.Vehicle;

public abstract class AbstractFactory {
  public abstract Vehicle createVehicle(String name);

  public abstract Rental createVehicleRent(String vehicleName);
}
