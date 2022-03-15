package creational.factory.ex2.parking_lots;

import creational.factory.ex2.Vehicle;

import java.util.List;

public abstract class ParkingLot {
    List<Vehicle> vehicles;

    public abstract void addVehicle();
}
