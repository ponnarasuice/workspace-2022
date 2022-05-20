package com.example.basics;

import com.example.basics.prototype.SingletonClass;
import com.example.basics.prototype.SingletonClass2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrototypeApplication implements CommandLineRunner {

  @Autowired
  SingletonClass singletonClass;

  @Autowired
  SingletonClass2 singletonClass2;

  public static void main(String args[]) {
    System.out.println("second main class");
    // run() method for springBootApplication to execute
    SpringApplication.run(PrototypeApplication .class, args);

  }

  @Override
  public void run(String... args) throws Exception {
    System.out.println("run method is called");

    // Default behaviour is singeton obj is created and its autowired is also binded once.
    singletonClass.getPrototypeClass();
    singletonClass.getPrototypeClass();

    // if I want each new prototype to be created , we need to follow few ways.
    // cglib  scoped proxy in config class or @lookup in method level or application context aware
    singletonClass2.getPrototypeClass();
    singletonClass2.getPrototypeClass();





  }
}
