package com.example.patterns.creational.abstractfactory;

// factory of factories
// usually factory creates a single object say vehicle object. if we want multiple objects
// say vehicle obj and rental obj. we create seperate factory for vehicle and rental - abstract the
// factories and then creates required obj.
// OR instead of creating vehicle factory if we create factories for bike factory/airfactory we can abstract them
// and create required objects
public class Application {
  public static void main(String args[]) {
    System.out.println("starting");

    AbstractFactory factory = FactoryCreator.getFactory("vehicle");
    factory.createVehicle("bike");

  }
}
