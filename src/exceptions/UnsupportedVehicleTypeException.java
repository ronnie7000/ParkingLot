package src.exceptions;

public class UnsupportedVehicleTypeException extends RuntimeException {
    public UnsupportedVehicleTypeException() {
    }

    public UnsupportedVehicleTypeException(String message) {
        super(message);
    }
}
