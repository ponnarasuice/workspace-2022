package com.example.patterns.structural.adaptor;

public class SocketAdapterImpl implements SocketAdapter {
    Socket socket = new Socket();

    @Override
    public Volt get120Volt() {
        Volt v = socket.getVolt();
        return new Volt(v.getVolt()/2);
    }

    @Override
    public Volt get40Volt() {
        Volt v = socket.getVolt();
        return new Volt(v.getVolt()/4);
    }
}
