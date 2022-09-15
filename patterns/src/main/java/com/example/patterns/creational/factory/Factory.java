package com.example.patterns.creational.factory;

import com.example.patterns.creational.models.Vehicle;

public interface Factory {
  Vehicle createVehicle(String name);
}
