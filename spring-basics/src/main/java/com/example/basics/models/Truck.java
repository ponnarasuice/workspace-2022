package com.example.basics.models;

import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Truck implements Vehicle{
// javax annotation - can be used on fields - not for constructor injection or setter injection
  // more object type engine present. so gave qualifier name
  //@Resource(name = "engine1")
      @Autowired
    @Qualifier(value = "engine2")
      Engine engine;

  String type;

  //if component annotation used for bean creation and constructor injection.
  //@Autowired
  public Truck(String type) {
    this.type = type;
  }

  @Override
  public void rideType() {
    System.out.println("in :" + type +" with engine " + engine.getName());
  }
}
