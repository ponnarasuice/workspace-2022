package com.example.application;

public class Singletondemo {

  private static Singletondemo singletondemo;
  private Singletondemo(){
    this.singletondemo = singletondemo;
  }

//  public static Singletondemo create(){
//    if (singletondemo == null) {
//     return new Singletondemo();
//    } else {
////      synchronized {
////          return singletondemo;
////    }
//
//    }
//  }
}
