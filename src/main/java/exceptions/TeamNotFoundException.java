package exceptions;

public class TeamNotFoundException extends Exception {
    public TeamNotFoundException(String message) {
        super("Team Not Found");
    }
}
