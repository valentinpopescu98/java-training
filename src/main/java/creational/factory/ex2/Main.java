package creational.factory.ex2;

import creational.factory.ex2.parking_lots.ParkingLot;
import creational.factory.ex2.parking_lots.ParkingLotFactory;
import creational.factory.ex2.parking_lots.ParkingLotType;

public class Main {
    public static void main(String[] args) {
        ParkingLot privateParkingLot = ParkingLotFactory.getParkingLot(ParkingLotType.PRIVATE);
        System.out.println(privateParkingLot.getClass());

        ParkingLot agriculturalParkingLot = ParkingLotFactory.getParkingLot(ParkingLotType.AGRICULTURAL);
        System.out.println(agriculturalParkingLot.getClass());
    }
}
