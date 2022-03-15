package com.example.patterns.factory.models;

public class Bike implements Vehicle{
  @Override
  public void rideType() {
    System.out.println("riding in bike");
  }
}
