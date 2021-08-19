package com.alavel.inheritance;

public class Passenger {
    public static void main(String[] args) {
        Transport transport = new Transport();

        Vehicle vehicle =  new Vehicle();
        vehicle.setName("Vehicle");
        vehicle.getPlaces();
        vehicle.setName("Batman");

        System.out.println(vehicle);

        vehicle.setPlaces(219);
        vehicle.setPlaces((long) 34.76);

        System.out.println(vehicle);
    }
}
