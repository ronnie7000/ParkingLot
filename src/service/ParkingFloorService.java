package src.service;

import src.model.ParkingFloor;
import src.model.ParkingSpot;
import src.model.enums.ParkingSpotType;
import src.model.enums.VehicleType;
import src.repository.ParkingFloorRepository;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloorService {
    private static int id = 0;
    private final ParkingSpotService parkingSpotService;
    private final ParkingFloorRepository parkingFloorRepository;

    public ParkingFloorService(ParkingSpotService parkingSpotService, ParkingFloorRepository parkingFloorRepository) {
        this.parkingSpotService = parkingSpotService;
        this.parkingFloorRepository = parkingFloorRepository;
    }

    public ParkingFloor createParkingFloor(int floorNumber,
                                           int spotCount,
                                           ParkingSpotType parkingSpotType,
                                           VehicleType vehicleType) {
        List<ParkingSpot> parkingSpots = new ArrayList<>();
        for (int i = 0; i < spotCount; i++) {
            parkingSpots.add(parkingSpotService.createParkingSpot(parkingSpotType,
                                                                  floorNumber * 100 + i,
                                                                  vehicleType));
        }
        ParkingFloor parkingFloor = new ParkingFloor();
        parkingFloor.setId(id++);
        parkingFloor.setFloorNumber(floorNumber);
        parkingFloor.setParkingSpots(parkingSpots);

        return parkingFloorRepository.saveParkingFloor(parkingFloor);
    }
}
