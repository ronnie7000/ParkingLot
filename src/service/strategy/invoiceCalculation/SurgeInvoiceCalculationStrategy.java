package src.service.strategy.invoiceCalculation;

import src.model.enums.ParkingSpotType;
import src.model.enums.VehicleType;

public class SurgeInvoiceCalculationStrategy implements InvoiceCalculationStrategy {

    private static final double SURGE_MULTIPLIER_1 = 1;     //CAPACITY <50%
    private static final double SURGE_MULTIPLIER_2 = 1.5;   //CAPACITY >=50% AND <75%
    private static final double SURGE_MULTIPLIER_3 = 2;     //CAPACITY >=75% AND <90%
    private static final double SURGE_MULTIPLIER_4 = 2.5;   //CAPACITY >=90%

    private static SimpleInvoiceCalculationStrategy simpleInvoiceCalculationStrategy;

    public SurgeInvoiceCalculationStrategy() {
        this.simpleInvoiceCalculationStrategy = new SimpleInvoiceCalculationStrategy();
    }

    @Override
    public double generateInvoiceAmount(int numberOfMinutes,
                                        VehicleType vehicleType,
                                        ParkingSpotType parkingSpotType,
                                        int totalSpotsCount,
                                        int occupiedSpotsCount) {
        double amount = simpleInvoiceCalculationStrategy.generateInvoiceAmount(numberOfMinutes,
                                                                               vehicleType,
                                                                               parkingSpotType,
                                                                               totalSpotsCount,
                                                                               occupiedSpotsCount);
        double ratio = (double) occupiedSpotsCount / totalSpotsCount;
        if (ratio < 0.5) {
            return amount * SURGE_MULTIPLIER_1;
        } else if (ratio >= 0.5 && ratio < 0.75) {
            return amount * SURGE_MULTIPLIER_2;
        } else if (ratio >= 0.75 && ratio < 0.90) {
            return amount * SURGE_MULTIPLIER_3;
        } else {
            return amount * SURGE_MULTIPLIER_4;
        }
    }
}
