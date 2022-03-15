package com.example.patterns;

import com.example.patterns.factory.Factory;
import com.example.patterns.factory.FactoryImpl;
import com.example.patterns.factory.models.Bike;
import com.example.patterns.factory.models.Truck;
import com.example.patterns.factory.models.Vehicle;

public class Application {
  public static void main(String args[]) {
    System.out.println("starting");

    /*usually we create object using new operator. */
//    Vehicle vehicle = new Bike();
//    vehicle.rideType();
//    Vehicle vehicle1 = new Truck();
//    vehicle1.rideType();

    /*we can centralise the object creation instead of using new operator */

    Factory factory = new FactoryImpl();
    Vehicle vehicle = factory.createVehicle("truck");
    vehicle.rideType();


  }
}
