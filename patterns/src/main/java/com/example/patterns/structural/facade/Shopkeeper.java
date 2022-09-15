package com.example.patterns.structural.facade;

public class Shopkeeper {
    private Phone iphone;
    private Phone samsung;

    public Shopkeeper() {
        iphone = new Iphone();
        samsung = new Samsung();
    }

    public void iphoneSale(){
        System.out.println(iphone.modelname());
        System.out.println(iphone.price());
    }

    public void samsungSale(){
        System.out.println(samsung.modelname());
        System.out.println(samsung.price());
    }

}
