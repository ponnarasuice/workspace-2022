package com.example.features.fninterfaces;
// SAM - single abstract method only allowed
// can have multiple default or static. java revolves around object -
// here without objects we can use functions. kind of functional programming
@FunctionalInterface
public interface GreetingInterface1 {
  public void greetMorning();
  public default void greetDefaultMethod1(){
    System.out.println("greeting from default method 1");
  }
  public default void greetDefaultMethod2(){
    System.out.println("greeting from default method 2");
  }

  static void greetStaticMethod1(){
    System.out.println("greeting from static method 1");
  }

  static void greetStaticMethod2(){
    System.out.println("greeting from static method 2");
  }
}
