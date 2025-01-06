package src.service;

import src.model.ParkingAttendant;

public class ParkingAttendantService {
    private static int id = 0;

    public ParkingAttendant createParkingAttendant(String name, String email) {
        ParkingAttendant parkingAttendant = new ParkingAttendant();
        parkingAttendant.setName(name);
        parkingAttendant.setEmail(email);
        parkingAttendant.setId(id++);

        return parkingAttendant;
    }
}
