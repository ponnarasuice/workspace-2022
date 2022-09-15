package com.example.patterns.creational.singleton;

public class Demo {
    public static void main(String[] args) {
        System.out.println(SingletonObject.getInstance().hashCode());
        System.out.println(SingletonObject.getInstance().hashCode());

        System.out.println("**********");
        System.out.println(SingletonObject2.getInstance().hashCode());
        System.out.println(SingletonObject2.getInstance().hashCode());

        System.out.println("**********");
        System.out.println(SingletonObjectEnum.INSTANCE.hashCode());
        System.out.println(SingletonObjectEnum.INSTANCE.hashCode());
        SingletonObjectEnum obj = SingletonObjectEnum.INSTANCE;
        obj.hello();

    }
}
