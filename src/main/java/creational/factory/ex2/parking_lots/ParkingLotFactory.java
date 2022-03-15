package creational.factory.ex2.parking_lots;

public class ParkingLotFactory {
    public static ParkingLot getParkingLot(ParkingLotType type) {
        switch (type) {
            case PRIVATE:
                return new PrivateParkingLot();
            case AGRICULTURAL:
                return new AgriculturalParkingLot();
            default:
                throw new RuntimeException("Parking lot type not supported.");
        }
    }
}
