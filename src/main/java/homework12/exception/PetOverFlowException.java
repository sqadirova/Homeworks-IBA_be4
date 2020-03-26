package homework12.exception;

public class PetOverFlowException extends RuntimeException {
    public PetOverFlowException(String errorMessage) {
        super(errorMessage);
    }
}
