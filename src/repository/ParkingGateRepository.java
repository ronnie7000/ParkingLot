package src.repository;

import java.util.HashMap;
import java.util.Map;

import src.exceptions.ParkingGateDoesNotExistsException;
import src.model.ParkingGate;

public class ParkingGateRepository {
    private static int id = 0;
    private final Map<Integer, ParkingGate> parkingGateMap;

    public ParkingGateRepository() {
        this.parkingGateMap = new HashMap<>();
    }

    public ParkingGate saveParkingGate(ParkingGate parkingGate) {
        parkingGate.setId(id++);
        parkingGateMap.put(id++, parkingGate);
        return parkingGate;
    }

    public ParkingGate findById(int parkingGateId) {
        if (parkingGateMap.containsKey(parkingGateId)) {
            return parkingGateMap.get(id);
        } else {
            throw new ParkingGateDoesNotExistsException("Parking Gate does not exists.");
        }
    }

    public ParkingGate updateParkingGate(int parkingGateId, ParkingGate newParkingGate) {
        if (parkingGateMap.containsKey(parkingGateId)) {
            parkingGateMap.put(parkingGateId, newParkingGate);
            return newParkingGate;
        } else {
            throw new ParkingGateDoesNotExistsException("Parking Gate does not exists.");
        }
    }

    public void deleteParkingGate(int parkingGateId) {
        if (parkingGateMap.containsKey(parkingGateId)) {
            parkingGateMap.remove(parkingGateId);
        } else {
            throw new ParkingGateDoesNotExistsException("Parking Gate does not exists.");
        }
    }
}
