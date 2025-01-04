package src.exceptions;

public class ParkingSpotDoesNotExistsException extends RuntimeException{

    public ParkingSpotDoesNotExistsException() {}

    public ParkingSpotDoesNotExistsException(String message) {
        super(message);
    }
}
