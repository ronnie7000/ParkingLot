package src.exceptions;

public class ParkingFloorDoesNotExistsException extends RuntimeException{

    public ParkingFloorDoesNotExistsException() {}

    public ParkingFloorDoesNotExistsException(String message) {
        super(message);
    }
}
