package com.example.patterns.creational.prototype;

public class Employee implements Cloneable{
    String name, address;

    public Employee(String name, String address) {
        this.address = address;
        this.name = name;
    }

    public Object clone(){
        var tempname = this.name;
        var tempaddress = this.address;

        return new Employee(name, address);
    }
}
