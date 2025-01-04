package src.model;

import java.time.LocalDateTime;

public class ParkingTicket {
    int id;
    String ticketNumber;
    ParkingSpot parkingSpot;
    LocalDateTime entryTime;
    Vehicle vehicle;
    ParkingGate parkingGate;
    ParkingAttendant parkingAttendant;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTicketNumber() {
        return ticketNumber;
    }
    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }
    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
    public LocalDateTime getEntryTime() {
        return entryTime;
    }
    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public ParkingGate getParkingGate() {
        return parkingGate;
    }
    public void setParkingGate(ParkingGate parkingGate) {
        this.parkingGate = parkingGate;
    }
    public ParkingAttendant getParkingAttendant() {
        return parkingAttendant;
    }
    public void setParkingAttendant(ParkingAttendant parkingAttendant) {
        this.parkingAttendant = parkingAttendant;
    }    
}
