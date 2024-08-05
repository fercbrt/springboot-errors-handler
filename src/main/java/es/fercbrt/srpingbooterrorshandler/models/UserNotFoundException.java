package es.fercbrt.srpingbooterrorshandler.models;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String message) {
        super(message);
    }
}
