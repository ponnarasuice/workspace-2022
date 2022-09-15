package com.example.patterns.behaviour.command;

public class SellOrder implements Order{

    public SellOrder(Stock stock){
        this.stock = stock;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    Stock stock;
    @Override
    public void execute() {
        System.out.println("sell order:" + this.stock.name);
    }
}
