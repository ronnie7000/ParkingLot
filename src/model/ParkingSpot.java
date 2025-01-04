package src.model;

import src.model.enums.ParkingSpotStatus;
import src.model.enums.ParkingSpotType;

public class ParkingSpot {
    int id;
    int spotNumber;
    ParkingSpotType parkingSpotType;
    ParkingSpotStatus parkingSpotStatus;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getSpotNumber() {
        return spotNumber;
    }
    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }
    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }
    public void setParkingSpotType(ParkingSpotType parkingSpotType) {
        this.parkingSpotType = parkingSpotType;
    }
    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }
    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }
}
