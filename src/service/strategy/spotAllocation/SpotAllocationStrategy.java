package src.service.strategy.spotAllocation;

import src.model.ParkingLot;
import src.model.ParkingSpot;
import src.model.enums.ParkingSpotType;
import src.model.enums.VehicleType;

/***
 * Multiple strategies can be implemented. As of now brute force spot allocation is implemented
 */
public interface SpotAllocationStrategy {
    ParkingSpot getParkingSpot(ParkingLot parkingLot,
                               VehicleType vehicleType,
                               ParkingSpotType parkingSpotType);
}
