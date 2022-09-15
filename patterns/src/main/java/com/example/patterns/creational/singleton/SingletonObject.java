package com.example.patterns.creational.singleton;

public class SingletonObject {

    private static SingletonObject instance;

    private SingletonObject(){

    }

    public static SingletonObject getInstance() {

        if(instance == null) {
            synchronized (SingletonObject.class){
                instance = new SingletonObject();
            }
        }

        return instance;

    }
}
