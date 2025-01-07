package src.service.strategy.spotAllocation;

import src.exceptions.ParkingSpotNotAvailableException;
import src.model.ParkingFloor;
import src.model.ParkingLot;
import src.model.ParkingSpot;
import src.model.enums.ParkingSpotStatus;
import src.model.enums.ParkingSpotType;
import src.model.enums.VehicleType;

public class SimpleSpotAllocationStrategy implements SpotAllocationStrategy {
    @Override
    public ParkingSpot getParkingSpot(ParkingLot parkingLot, VehicleType vehicleType, ParkingSpotType parkingSpotType) {
        for (ParkingFloor parkingFloor : parkingLot.getParkingFloors()) {
            for (ParkingSpot parkingSpot : parkingFloor.getParkingSpots()) {
                if (validateParkingSpot(parkingSpot, vehicleType, parkingSpotType)) {
                    return parkingSpot;
                }
            }
        }
        throw new ParkingSpotNotAvailableException("Parking lot is full.");
    }

    private boolean validateParkingSpot(ParkingSpot parkingSpot, VehicleType vehicleType, ParkingSpotType parkingSpotType) {
        return ParkingSpotStatus.FREE.equals(parkingSpot.getParkingSpotStatus()) &&
                parkingSpotType.equals(parkingSpot.getParkingSpotType()) &&
                vehicleType.equals(parkingSpot.getVehicleType());
    }
}
