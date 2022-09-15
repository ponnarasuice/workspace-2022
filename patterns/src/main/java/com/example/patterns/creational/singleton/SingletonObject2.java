package com.example.patterns.creational.singleton;

public class SingletonObject2 {
    private static final SingletonObject2 instance = new SingletonObject2();
//    private constructor so that others cant initialise
    private SingletonObject2(){}

    public static SingletonObject2 getInstance() {
        return  instance;
    }

}
