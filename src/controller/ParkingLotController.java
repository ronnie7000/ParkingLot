package src.controller;

import src.exceptions.InvalidParkingLotPropertiesException;
import src.model.ParkingLot;
import src.model.enums.ParkingSpotType;
import src.service.ParkingLotService;

public class ParkingLotController {

    private final ParkingLotService parkingLotService;

    public ParkingLotController(ParkingLotService parkingLotService) {
        this.parkingLotService = parkingLotService;
    }

    public ParkingLot createParkingLot(String name,
                                       String address,
                                       int floorCount,
                                       int entryGateCount,
                                       int exitGateCount,
                                       int spotPerFloor) {

        if (name.isEmpty() ||
                address.isEmpty() ||
                floorCount < 1 ||
                entryGateCount < 1 ||
                exitGateCount < 1 ||
                spotPerFloor < 10) {
            throw new InvalidParkingLotPropertiesException("Invalid properties fro creating a new parking lot");
        }
        return parkingLotService.createParkingLot(name, address, floorCount, entryGateCount, exitGateCount, spotPerFloor);
        
    }
}
