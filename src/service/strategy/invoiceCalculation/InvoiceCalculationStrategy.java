package src.service.strategy.invoiceCalculation;

import src.model.enums.ParkingSpotType;
import src.model.enums.VehicleType;

public interface InvoiceCalculationStrategy {

    double TWO_WHEELER_RATE = 1;
    double FOUR_WHEELER_RATE = 2;
    double LUX_MULTIPLIER = 10;
    double EV_MULTIPLIER = 5;

    double generateInvoiceAmount(int numberOfMinutes,
                                 VehicleType vehicleType,
                                 ParkingSpotType parkingSpotType,
                                 int totalSpotsCount,
                                 int occupiedSpotsCount);
}

