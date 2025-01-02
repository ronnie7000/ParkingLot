package src.model;

import src.model.enums.ParkingGateType;

public class ParkingGate {
    long id;
    String gateNumber;
    ParkingGateType parkingGateType;
    ParkingAttendant parkingAttendant;

    public long getId() {
        return id;
    }
    public void setId(long id) {
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
