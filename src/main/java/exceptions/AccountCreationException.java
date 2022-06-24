package exceptions;

public class AccountCreationException extends Exception{
    public AccountCreationException(String errorMessage) {
        super(errorMessage);
    }
}
