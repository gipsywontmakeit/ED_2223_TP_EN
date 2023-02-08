import java.io.IOException;


import exceptions.ListIsEmptyException;
import players.PlayerManager;

public class Main {
    public static void main(String[] args) throws IOException, ListIsEmptyException {
        PlayerManager playerManager = new PlayerManager();
        menu menu = new menu();
        menu.startGame();

    }

}