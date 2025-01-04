package src.model;

import java.util.List;

public class ParkingFloor {
    int id;
    int floorNumber;
    List<ParkingSpot> parkingSpots;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getFloorNumber() {
        return floorNumber;
    }
    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }
    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }
    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }    
}
