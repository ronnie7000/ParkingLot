package src.service;

import src.model.ParkingGate;
import src.model.enums.ParkingGateType;
import src.repository.ParkingGateRepository;

public class ParkingGateService {

    private final ParkingGateRepository parkingGateRepository;
    private final ParkingAttendantService parkingAttendantService;

    public ParkingGateService(ParkingGateRepository parkingGateRepository, ParkingAttendantService parkingAttendantService) {
        this.parkingGateRepository = parkingGateRepository;
        this.parkingAttendantService = parkingAttendantService;
    }

    public ParkingGate createParkingGate(String gateNumber,
                                         ParkingGateType parkingGateType,
                                         String parkingAttendantName,
                                         String parkingAttendantEmail) {
        ParkingGate parkingGate = new ParkingGate();
        parkingGate.setGateNumber(gateNumber);
        parkingGate.setParkingGateType(parkingGateType);
        parkingGate.setParkingAttendant(parkingAttendantService.createParkingAttendant(parkingAttendantName,
                                                                                       parkingAttendantEmail));

        return parkingGateRepository.saveParkingGate(parkingGate);
    }
}
