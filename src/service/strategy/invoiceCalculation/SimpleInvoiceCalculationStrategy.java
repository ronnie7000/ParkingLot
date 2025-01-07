package src.service.strategy.invoiceCalculation;

import src.exceptions.UnsupportedVehicleTypeException;
import src.model.enums.ParkingSpotType;
import src.model.enums.VehicleType;

public class SimpleInvoiceCalculationStrategy implements InvoiceCalculationStrategy {
    @Override
    public double generateInvoiceAmount(int numberOfMinutes,
                                        VehicleType vehicleType,
                                        ParkingSpotType parkingSpotType,
                                        int totalSlotCount,
                                        int occupiedSlotsCount) {
        if (numberOfMinutes <= 60 && VehicleType.TWO_WHEELER.equals(vehicleType)) {
            return 50.00;
        }
        if (numberOfMinutes <= 60 && VehicleType.FOUR_WHEELER.equals(vehicleType)) {
            return 100.00;
        }

        int difference = numberOfMinutes - 60;

        if (VehicleType.FOUR_WHEELER.equals(vehicleType) && ParkingSpotType.LUXURY.equals(parkingSpotType)) {
            return difference * FOUR_WHEELER_RATE * LUX_MULTIPLIER;
        }

        if (VehicleType.FOUR_WHEELER.equals(vehicleType) && ParkingSpotType.EV.equals(parkingSpotType)) {
            return difference * FOUR_WHEELER_RATE * EV_MULTIPLIER;
        }

        if (VehicleType.TWO_WHEELER.equals(vehicleType)) {
            return difference * TWO_WHEELER_RATE;
        }
        throw new UnsupportedVehicleTypeException("Unsupported vehicle type. Cannot generate amount.");
    }
}
