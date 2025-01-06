package src.utils;

import src.model.ParkingFloor;
import src.model.ParkingLot;
import src.model.ParkingSpot;
import src.model.enums.ParkingSpotStatus;

public class ParkingLotUtils {

    public void print(ParkingLot parkingLot) {
        System.out.println(parkingLot.getName());
        for (ParkingFloor parkingFloor : parkingLot.getParkingFloors()) {
            print(parkingFloor);
            System.out.println("__________________________________");
        }
    }

    public void print(ParkingFloor parkingFloor) {
        System.out.println(parkingFloor.getFloorNumber());
        System.out.print("| ");
        for (ParkingSpot parkingSpot : parkingFloor.getParkingSpots()) {
            print(parkingSpot);
            System.out.print(" | ");
        }

    }

    public void print(ParkingSpot parkingSpot) {
        System.out.print(parkingSpot.getSlotNumber() +
                                 (ParkingSpotStatus.FREE.equals(parkingSpot.getParkingSpotStatus()) ?
                                         "T" : "F"));

    }
}
