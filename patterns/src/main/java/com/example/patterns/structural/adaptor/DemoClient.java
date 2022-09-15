package com.example.patterns.structural.adaptor;

public class DemoClient {
    public static void main(String[] args) {
        SocketAdapter socketAdapter = new SocketAdapterImpl();
        System.out.println(socketAdapter.get40Volt().getVolt());
    }
}
