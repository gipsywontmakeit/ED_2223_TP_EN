package exceptions;

public class CooldownTimeException extends Exception{
    public CooldownTimeException(String message) {
        super(message);
    }
}
