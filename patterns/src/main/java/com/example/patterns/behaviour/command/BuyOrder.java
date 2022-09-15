package com.example.patterns.behaviour.command;

public class BuyOrder implements Order{

    protected Stock stock;

    public BuyOrder(Stock stock){
        this.stock = stock;
    }
    @Override
    public void execute() {
        System.out.println("buy order" + this.stock.name);
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }
}
