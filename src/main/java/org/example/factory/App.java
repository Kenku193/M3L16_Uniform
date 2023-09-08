package org.example.factory;

import org.example.factory.entity.Vehicle;

public class App {

    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle vehicle = vehicleFactory.create("Car");
        System.out.println(vehicle);
    }


}
