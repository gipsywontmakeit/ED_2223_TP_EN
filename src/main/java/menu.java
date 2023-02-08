import enums.Teams;
import exceptions.ListIsEmptyException;
import interfaces.IPlayerManager;
import json.JsonFile;
import players.PlayerManager;
import players.Players;

import java.util.InputMismatchException;
import java.util.Scanner;

public class menu {

    private static Players player;
    private static JsonFile jsonFile = new JsonFile();
    private static PlayerManager playerManager = new PlayerManager();

    public static void startGame() throws ListIsEmptyException {
        Teams teams = null;
        Scanner scanner = new Scanner(System.in);
        int option = 1;
        int numplayers = 0;
        int count = 0;

        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_BOLD = "\u001B[1m";


        if (playerManager.getPlayersList().isEmpty()) {
            System.out.println("\n\n=================" + ANSI_GREEN + " Create player " + ANSI_RESET
                    + "=================\n");
            System.out.println(ANSI_BOLD + "  [1]" + ANSI_RESET + " ➜ How many players?");
            numplayers = scanner.nextInt();
            do {
                System.out.println(ANSI_BOLD + "  [1]" + ANSI_RESET + " ➜ Enter your username");
                System.out.println(ANSI_BOLD + "  [2]" + ANSI_RESET + " ➜ Enter your Team");
                System.out.println("\n==================================================");
                System.out.println("\n\n↓ Insert your username ↓");
                String name = scanner.next();

                System.out.println("\n\n↓ Insert your Team ↓");
                System.out.println(ANSI_BOLD + "  [1]" + ANSI_RESET + " ➜ Giants");
                System.out.println(ANSI_BOLD + "  [2]" + ANSI_RESET + " ➜ Sparks");
                option = scanner.nextInt();

                if (option == 1) {
                    teams = Teams.Giants;
                } else if (option == 2) {

                    teams = Teams.Sparks;

                }

                Players players = new Players(name, teams);
                playerManager.addPlayer(players);
                playerManager.listPlayers();
                count++;
            } while (count < numplayers);
        }
    }
}





