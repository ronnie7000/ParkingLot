package src.service;

import src.model.ParkingSpot;
import src.model.enums.ParkingSpotStatus;
import src.model.enums.ParkingSpotType;
import src.model.enums.VehicleType;
import src.repository.ParkingSpotRepository;

public class ParkingSpotService {

    private static int id = 0;

    private ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }

    public ParkingSpot createParkingSpot(ParkingSpotType parkingSpotType,
                                         int slotNumber,
                                         VehicleType vehicleType) {
        ParkingSpot parkingSpot = new ParkingSpot();
        parkingSpot.setId(id++);
        parkingSpot.setParkingSpotStatus(ParkingSpotStatus.FREE);
        parkingSpot.setParkingSpotType(parkingSpotType);
        parkingSpot.setVehicleType(vehicleType);
        parkingSpot.setSlotNumber(slotNumber);

        return parkingSpotRepository.saveParkingSpot(parkingSpot);
    }

}
