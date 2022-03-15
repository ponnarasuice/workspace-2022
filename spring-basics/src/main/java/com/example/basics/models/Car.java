package com.example.basics.models;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
  @Override
  public void rideType() {
    System.out.println("in car");
  }
}
