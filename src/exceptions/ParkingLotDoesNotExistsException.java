package src.exceptions;

public class ParkingLotDoesNotExistsException extends RuntimeException{

    public ParkingLotDoesNotExistsException() {}

    public ParkingLotDoesNotExistsException(String message) {
        super(message);
    }
}
