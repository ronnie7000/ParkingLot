package src.exceptions;

public class InvalidParkingLotPropertiesException extends RuntimeException{

    public InvalidParkingLotPropertiesException() {
    }

    public InvalidParkingLotPropertiesException(String message) {
        super(message);
    }
}
