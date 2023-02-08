import enums.LocalType;
import enums.Teams;
import exceptions.InvalidActionException;
import exceptions.ListIsEmptyException;
import game_settings.GameSettingsConnector;
import game_settings.GameSettingsPortal;
import interfaces.IConnector;
import interfaces.ILocal;
import interfaces.IPlayer;
import interfaces.IPortal;
import json.JsonFile;
import lists.ArrayUnorderedList;
import locals.*;
import players.PlayerManager;
import players.Players;

import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Menu {
    private static LocalManagement localManagement = new LocalManagement();
    private static Players playerManipulate = new Players();
    private static JsonFile jsonFile = new JsonFile();
    private static PlayerManager playerManager = new PlayerManager();

    static final int TURNS = 10;

    public static void startGame() throws ListIsEmptyException, InterruptedException, InvalidActionException {
        Teams teams = null;
        Scanner scanner = new Scanner(System.in);
        int option = 1;
        int numplayers = 0;
        int count = 0;

        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_BOLD = "\u001B[1m";

        Coordinates coordinates1 = new Coordinates(12.132313123, -14.12312313);
        Coordinates coordinates2 = new Coordinates(12.137647123, -14.00012313);
        Coordinates coordinates3 = new Coordinates(15.132313123, -16.12312313);
        Coordinates coordinates4 = new Coordinates(16.132313123, -17.12312313);

        GameSettingsPortal gameSettingsPortal1 = new GameSettingsPortal(100, 200, null);
        GameSettingsPortal gameSettingsPortal2 = new GameSettingsPortal(150, 300, null);
        GameSettingsPortal gameSettingsPortal3 = new GameSettingsPortal(200, 400, null);

        GameSettingsConnector gameSettingsConnector1 = new GameSettingsConnector(100, 5);
        GameSettingsConnector gameSettingsConnector2 = new GameSettingsConnector(150, 10);
        GameSettingsConnector gameSettingsConnector3 = new GameSettingsConnector(200, 15);

        IPortal portal1 = new Portals(1, LocalType.Portal, coordinates1, "Portal 1", gameSettingsPortal1);
        IPortal portal2 = new Portals(2, LocalType.Portal, coordinates2, "Portal 2", gameSettingsPortal2);
        IPortal portal3 = new Portals(3, LocalType.Portal, coordinates3, "Portal 3", gameSettingsPortal3);

        IConnector connector1 = new Connectors(1, LocalType.Connector, coordinates2, gameSettingsConnector1);
        IConnector connector2 = new Connectors(2, LocalType.Connector, coordinates3, gameSettingsConnector2);
        IConnector connector3 = new Connectors(3, LocalType.Connector, coordinates4, gameSettingsConnector3);
        GraphMap graphMap = new GraphMap();


        graphMap.addVertex(portal1);
        graphMap.addVertex(portal2);
        graphMap.addVertex(portal3);
        graphMap.addVertex(connector1);
        graphMap.addVertex(connector2);
        graphMap.addVertex(connector3);

        graphMap.addEdge(portal1, connector1);
        graphMap.addEdge(connector1, portal3);
        graphMap.addEdge(portal3, connector2);
        graphMap.addEdge(connector2, portal2);
        graphMap.addEdge(portal2, connector3);


        ILocal newCurrent = null;


        if (playerManager.getPlayersList().isEmpty()) {
            System.out.println("\n\n=================" + ANSI_GREEN + " Create player " + ANSI_RESET
                    + "=================\n");
            System.out.println(ANSI_BOLD + "  [1]" + ANSI_RESET + " ➜ How many players?");
            numplayers = scanner.nextInt();
            do {
                System.out.println(ANSI_BOLD + "  [1]" + ANSI_RESET + " ➜ Enter your username");
                System.out.println(ANSI_BOLD + "  [2]" + ANSI_RESET + " ➜ Enter your Team");
                System.out.println(ANSI_BOLD + "  [3]" + ANSI_RESET + " ➜ Enter your Position");
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

                System.out.println("\n\n↓ Insert your Position ↓");
                System.out.println(graphMap);
                System.out.println("Escolha entre 0-5 o local onde deseja começar: ");
                int current = scanner.nextInt();
                while (current < 0 || current > 5) {
                    System.out.println("Escolha entre 0-5 o local onde deseja começar: ");
                    current = scanner.nextInt();
                }
                newCurrent = (ILocal) graphMap.getVertices()[current];


                if (newCurrent != null) {
                    players.setCurrentLocal(newCurrent);
                } else {
                    System.out.println("Local não encontrado");
                }
                playerManager.addPlayer(players);
                //playerManager.listPlayers();
                //System.out.println(players.getCurrent());

                count++;
            } while (count < numplayers);
        }

        playerManager.listPlayers();


        System.out.println("\n         ==================================================");
        System.out.println("\n==================== LET THE GAME BEGINS=============================\n");

        ArrayUnorderedList<Players> player = playerManager.getPlayersList();
        System.out.println(player.toString());

        for (int j = 1; j < TURNS; j++) {
            Iterator<Players> iterator = player.iterator();
            while (iterator.hasNext()) {
                System.out.println("========================Round " + j + "========================");
                System.out.println("Player Turn: " + iterator.next().getName());
                System.out.println("==================================================");
                System.out.println("\n\n====================" + ANSI_GREEN + " Actions " + ANSI_RESET
                        + "====================\n");
                System.out.println(ANSI_BOLD + "  [1]" + ANSI_RESET + " ➜ Move");
                System.out.println(ANSI_BOLD + "  [2]" + ANSI_RESET + " ➜ Attack");
                System.out.println(ANSI_BOLD + "  [3]" + ANSI_RESET + " ➜ Collect Energy");
                System.out.println("\n==================================================");
                System.out.println("\n\n↓ Insert your option ↓");
                option = scanner.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("Choose the local you want to move to: ");
                        System.out.println(graphMap);
                        int current = scanner.nextInt();
                        while (current < 0 || current > 5) {
                            System.out.println("Escolha entre 0-5 o local onde deseja começar: ");
                            current = scanner.nextInt();
                        }
                        newCurrent = (ILocal) graphMap.getVertices()[current];
                        if (newCurrent != null) {
                            playerManipulate.move(playerManipulate.getCurrentLocal(), newCurrent);
                            System.out.println("You moved to " + newCurrent);
                        } else {
                            System.out.println("Local not found");
                        }
                        break;
                    case 2:
                        if (newCurrent instanceof IPortal) {
                            System.out.println("Enter the amount of energy you want to use to attack the portal: ");
                            int energy = scanner.nextInt();
                            IPortal portal = (IPortal) newCurrent;
                            if (playerManipulate.conquerPortal(portal, energy)) {
                                System.out.println("You successfully conquered the portal!");
                            } else {
                                System.out.println("Not enough energy to conquer the portal.");
                            }
                        } else {
                            System.out.println("You can only attack a portal.");
                        }
                        break;
                    case 3:
                        if (newCurrent instanceof IConnector) {
                            System.out.println("Collecting Energy...");
                            Thread.sleep(2000);
                            playerManipulate.rechargeEnergy((IConnector) newCurrent);
                            System.out.println("Energy Collected");
                        } else {
                            System.out.println("You can't collect energy here");
                        }
                        break;
                    default:
                        System.out.println("Invalid option");
                        break;
                }

            }
        }
    }


}







