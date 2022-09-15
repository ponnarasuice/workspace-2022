package com.example.patterns.creational.prototype;

public class Demo {
    public static void main(String[] args) {
        Employee employee = new Employee("yugi", "salem");
        Employee cloneEmployee = (Employee) employee.clone();
        System.out.println(cloneEmployee.name);
        System.out.println(cloneEmployee.address);
    }
}
