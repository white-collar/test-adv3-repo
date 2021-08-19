package com.alavel.inheritance;

public class Vehicle extends Transport {

    static {
        System.out.println("init block");
    }


    String name;

    public Vehicle() {
        System.out.println("I am constructor");
    }

    public Vehicle(String name) {
        System.out.println(name);
        this.name = name;
    }

    @Override
    public void setName(String name) {
        this.name = "Morgenstern " + name;
    }

    public void setPlaces(long places) {
        System.out.println(places);
    }

}
