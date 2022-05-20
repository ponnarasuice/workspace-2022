package com.example.basics.prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class SingletonClass2 {

  @Autowired
  PrototypeClass prototypeClass;

//  @Lookup
  public PrototypeClass getPrototypeClass() {
    System.out.println("get prototype bean from singleton class 2");
    return prototypeClass;
  }

}
