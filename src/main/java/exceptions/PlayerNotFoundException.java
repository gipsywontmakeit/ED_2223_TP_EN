package exceptions;

public class PlayerNotFoundException extends Exception{
    public PlayerNotFoundException(String errorNotFound){
        super(errorNotFound);
    }
}
