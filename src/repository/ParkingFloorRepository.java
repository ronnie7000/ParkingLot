package src.repository;

import java.util.HashMap;
import java.util.Map;

import src.exceptions.ParkingFloorDoesNotExistsException;
import src.model.ParkingFloor;

public class ParkingFloorRepository {
    private static int id = 0;
    private Map<Integer, ParkingFloor> parkingFloorMap;

    public ParkingFloorRepository() {
        this.parkingFloorMap = new HashMap<>();
    }

    public ParkingFloor saveParkingFloor(ParkingFloor parkingFloor) {
        parkingFloor.setId(id++);
        parkingFloorMap.put(id++, parkingFloor);
        return parkingFloor;
    }

    public ParkingFloor findById(int parkingFloorId) {
        if(parkingFloorMap.containsKey(parkingFloorId)) {
            return parkingFloorMap.get(id);
        } else {
            throw new ParkingFloorDoesNotExistsException("Parking Floor does not exists.");
        }
    }

    public ParkingFloor updateParkingFloor(int parkingFloorId, ParkingFloor newParkingFloor) {
        if(parkingFloorMap.containsKey(parkingFloorId)) {
            parkingFloorMap.put(parkingFloorId, newParkingFloor);
            return newParkingFloor;
        } else {
            throw new ParkingFloorDoesNotExistsException("Parking Floor does not exists.");
        }        
    }

    public void deleteParkingFloor(int parkingFloorId) {
        if(parkingFloorMap.containsKey(parkingFloorId)) {
            parkingFloorMap.remove(parkingFloorId);
        } else {
            throw new ParkingFloorDoesNotExistsException("Parking Floor does not exists.");
        }
    } 
}
