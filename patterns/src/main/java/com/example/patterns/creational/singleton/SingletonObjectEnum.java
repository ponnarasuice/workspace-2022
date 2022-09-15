package com.example.patterns.creational.singleton;

public enum SingletonObjectEnum {
    INSTANCE;

    public void hello() {
        System.out.println("from enum class");
    }
}
