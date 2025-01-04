package src.repository;

import java.util.HashMap;
import java.util.Map;

import src.exceptions.ParkingLotDoesNotExistsException;
import src.model.ParkingLot;

public class ParkingLotRepository {
    private static int id = 0;
    private Map<Integer, ParkingLot> parkingLotMap;

    public ParkingLotRepository() {
        this.parkingLotMap = new HashMap<>();
    }

    public ParkingLot saveParkingLot(ParkingLot parkingLot) {
        parkingLot.setId(id++);
        parkingLotMap.put(id++, parkingLot);
        return parkingLot;
    }

    public ParkingLot findById(int parkingLotId) {
        if(parkingLotMap.containsKey(parkingLotId)) {
            return parkingLotMap.get(id);
        } else {
            throw new ParkingLotDoesNotExistsException("Parking Lot does not exists.");
        }
    }

    public ParkingLot updateParkingLot(int parkingLotId, ParkingLot newParkingLot) {
        if(parkingLotMap.containsKey(parkingLotId)) {
            parkingLotMap.put(parkingLotId, newParkingLot);
            return newParkingLot;
        } else {
            throw new ParkingLotDoesNotExistsException("Parking Lot does not exists.");
        }        
    }

    public void deleteParkingLot(int parkingLotId) {
        if(parkingLotMap.containsKey(parkingLotId)) {
            parkingLotMap.remove(parkingLotId);
        } else {
            throw new ParkingLotDoesNotExistsException("Parking Lot does not exists.");
        }
    } 
}
