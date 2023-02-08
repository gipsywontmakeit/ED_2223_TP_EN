package exceptions;

public class PlayerNotFoundException extends Exception{
    public PlayerNotFoundException() {
        super("Player Not Found");
    }
}
