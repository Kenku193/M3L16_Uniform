package org.example.factory;

import org.example.factory.entity.Boat;
import org.example.factory.entity.Vehicle;

public class BoatFactory extends VehicleFactory{

    public Vehicle create() {return new Boat();
    }

}
