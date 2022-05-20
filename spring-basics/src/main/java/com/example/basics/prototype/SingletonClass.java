package com.example.basics.prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SingletonClass {

  @Autowired
  PrototypeClass prototypeClass;

  public PrototypeClass getPrototypeClass() {
    System.out.println("invoke get prototype obj");
    return prototypeClass;
  }


}
