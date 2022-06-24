package exceptions;

public class AccountAuthorizationException extends Exception{
    public AccountAuthorizationException(String errorMessage) {
        super(errorMessage);
    }
}
