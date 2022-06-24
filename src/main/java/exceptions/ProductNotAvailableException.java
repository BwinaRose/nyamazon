package exceptions;

public class ProductNotAvailableException extends Exception{
    public ProductNotAvailableException(String errorMessage) {
        super(errorMessage);
    }
}
