package Exceptions;

public class PlayerNotFoundException extends Exception{
    public PlayerNotFoundException(String errorNotFound){
        super(errorNotFound);
    }
}
