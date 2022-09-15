package com.example.patterns.creational.factory;

import com.example.patterns.creational.models.Bike;
import com.example.patterns.creational.models.Truck;
import com.example.patterns.creational.models.Vehicle;

public class FactoryImpl implements Factory{
  @Override
  public Vehicle createVehicle(String name) {
    Vehicle vehicle;
    switch (name) {
      case "bike": vehicle = new Bike();
      break;
      case "truck": vehicle = new Truck();
      break;
      default: vehicle = new Bike();
    }

    return vehicle;
  }
}
