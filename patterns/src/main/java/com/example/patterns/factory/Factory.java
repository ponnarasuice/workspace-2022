package com.example.patterns.factory;

import com.example.patterns.factory.models.Vehicle;

public interface Factory {
  Vehicle createVehicle(String name);
}
