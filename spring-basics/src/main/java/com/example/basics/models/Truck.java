package com.example.basics.models;

public class Truck implements Vehicle{
  String type;
  public Truck(String type) {
    this.type = type;
  }

  @Override
  public void rideType() {
    System.out.println("in truck:" + type);
  }
}
