package src.service;

import src.model.ParkingFloor;
import src.model.ParkingGate;
import src.model.ParkingLot;
import src.model.ParkingSpot;
import src.model.enums.ParkingGateType;
import src.model.enums.ParkingSpotType;
import src.model.enums.VehicleType;
import src.repository.ParkingLotRepository;
import src.utils.ParkingLotUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ParkingLotService {

    private final ParkingFloorService parkingFloorService;
    private final ParkingLotRepository parkingLotRepository;
    private final ParkingGateService parkingGateService;
    private final ParkingLotUtils parkingLotUtils;

    public ParkingLotService(ParkingFloorService parkingFloorService,
                             ParkingLotRepository parkingLotRepository,
                             ParkingGateService parkingGateService,
                             ParkingLotUtils parkingLotUtils) {
        this.parkingFloorService = parkingFloorService;
        this.parkingLotRepository = parkingLotRepository;
        this.parkingGateService = parkingGateService;
        this.parkingLotUtils = parkingLotUtils;
    }

    public ParkingLot createParkingLot(String name,
                                       String address,
                                       int floorCount,
                                       int entryGateCount,
                                       int exitGateCount,
                                       int spotPerFloor) {
        List<ParkingFloor> parkingFloors = new ArrayList<>();

        for (int i = 0; i < floorCount; i++) {
            parkingFloors.add(parkingFloorService.createParkingFloor(
                    i + 1,
                    spotPerFloor,
                    ParkingSpotType.NORMAL,
                    VehicleType.CAR
            ));
        }

        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setParkingFloors(parkingFloors);
        parkingLot.setName(name);
        parkingLot.setAddress(address);

        List<ParkingGate> parkingGates = new ArrayList<>();
        for (int i = 0; i < entryGateCount; i++) {
            parkingGates.add(parkingGateService.createParkingGate(
                    (ParkingGateType.ENTRY.name() + "Gate Number : " + i + 1),
                    ParkingGateType.ENTRY,
                    ("Attendant " + (i + 1)),
                    ("Email_" + (i + 1) + "@gmail.com")
            ));
        }

        for (int i = 0; i < exitGateCount; i++) {
            parkingGates.add(parkingGateService.createParkingGate(
                    (ParkingGateType.EXIT.name() + "Gate Number : " + i + 1),
                    ParkingGateType.EXIT,
                    ("Attendant " + (i + 1)),
                    ("Email_" + (i + 1) + "@gmail.com")
            ));
        }
        parkingLot.setParkingGates(parkingGates);

        return parkingLotRepository.saveParkingLot(parkingLot);
    }

    public void displayParkingLot(ParkingLot parkingLot) {
        if(Objects.isNull(parkingLot)) {
            System.out.println("Unable to display the parking lot. Please check request.");
            return;
        }
        parkingLotUtils.print(parkingLot);
    }
}
