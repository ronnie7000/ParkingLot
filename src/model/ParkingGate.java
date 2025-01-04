package src.model;

import src.model.enums.ParkingGateType;

public class ParkingGate {
    int id;
    String gateNumber;
    ParkingGateType parkingGateType;
    ParkingAttendant parkingAttendant;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getGateNumber() {
        return gateNumber;
    }
    public void setGateNumber(String gateNumber) {
        this.gateNumber = gateNumber;
    }
    public ParkingGateType getParkingGateType() {
        return parkingGateType;
    }
    public void setParkingGateType(ParkingGateType parkingGateType) {
        this.parkingGateType = parkingGateType;
    }
    public ParkingAttendant getParkingAttendant() {
        return parkingAttendant;
    }
    public void setParkingAttendant(ParkingAttendant parkingAttendant) {
        this.parkingAttendant = parkingAttendant;
    }    
}
