package com.example.patterns.behaviour.command;

public class Demo {
    public static void main(String[] args) {
        Stock stock = new Stock("infy", 10);

        Order order = new BuyOrder(stock);
        order.execute();
    }
}
