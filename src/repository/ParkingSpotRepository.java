package src.repository;

import java.util.HashMap;
import java.util.Map;

import src.exceptions.ParkingSpotDoesNotExistsException;
import src.model.ParkingSpot;

public class ParkingSpotRepository {
    private static int id = 0;
    private Map<Integer, ParkingSpot> parkingSpotMap;

    public ParkingSpotRepository() {
        this.parkingSpotMap = new HashMap<>();
    }

    public ParkingSpot saveParkingSpot(ParkingSpot parkingSpot) {
        parkingSpot.setId(id++);
        parkingSpotMap.put(id++, parkingSpot);
        return parkingSpot;
    }

    public ParkingSpot findById(int parkingSpotId) {
        if(parkingSpotMap.containsKey(parkingSpotId)) {
            return parkingSpotMap.get(id);
        } else {
            throw new ParkingSpotDoesNotExistsException("Parking Spot does not exists.");
        }
    }

    public ParkingSpot updateParkingSpot(int parkingSpotId, ParkingSpot newParkingSpot) {
        if(parkingSpotMap.containsKey(parkingSpotId)) {
            parkingSpotMap.put(parkingSpotId, newParkingSpot);
            return newParkingSpot;
        } else {
            throw new ParkingSpotDoesNotExistsException("Parking Spot does not exists.");
        }        
    }

    public void deleteParkingSpot(int parkingSpotId) {
        if(parkingSpotMap.containsKey(parkingSpotId)) {
            parkingSpotMap.remove(parkingSpotId);
        } else {
            throw new ParkingSpotDoesNotExistsException("Parking Spot does not exists.");
        }
    } 
}
