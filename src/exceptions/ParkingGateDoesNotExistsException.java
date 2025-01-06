package src.exceptions;

public class ParkingGateDoesNotExistsException extends RuntimeException {
    public ParkingGateDoesNotExistsException(String message) {
        super(message);
    }
}
