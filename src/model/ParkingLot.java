package src.model;

import java.util.List;

public class ParkingLot {
    int id;
    String name;
    String address;
    List<ParkingFloor> parkingFloors;
    List<ParkingGate> parkingGates;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }
    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }
    public List<ParkingGate> getParkingGates() {
        return parkingGates;
    }
    public void setParkingGates(List<ParkingGate> parkingGates) {
        this.parkingGates = parkingGates;
    }    
}
