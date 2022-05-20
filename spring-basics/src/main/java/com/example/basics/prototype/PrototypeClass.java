package com.example.basics.prototype;

import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@Component
public class PrototypeClass {

  private static final AtomicInteger instaneCounter = new AtomicInteger(0);

  PrototypeClass(){
    System.out.println("initialise prototype class");
    System.out.println(instaneCounter.incrementAndGet());
  }

}
