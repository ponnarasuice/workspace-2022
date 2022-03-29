package com.trimble.bootbasics;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application  /*implements CommandLineRunner*/ {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);

  }

/*  @Override
  public void run(String... args) throws Exception {

  }*/
}
