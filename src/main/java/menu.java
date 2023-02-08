import enums.LocalType;
import enums.Teams;
import exceptions.ListIsEmptyException;
import game_settings.GameSettingsConnector;
import game_settings.GameSettingsPortal;
import graphs.Graph;
import interfaces.IConnector;
import interfaces.ILocal;
import interfaces.IPlayerManager;
import interfaces.IPortal;
import json.JsonFile;
import lists.ArrayUnorderedList;
import lists.LinkedList;
import locals.*;
import players.PlayerManager;
import players.Players;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class menu {
    private static LocalManagement localManagement = new LocalManagement();
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


        System.out.println(graphMap.toString());


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

                System.out.println("\n\n↓ Insert your Position ↓");

                for ( int i = 0; i < graphMap.size();i++) {
                    System.out.println(ANSI_BOLD + "  [" + i + "]" + ANSI_RESET + " ➜ " + graphMap + "");

                }

                System.out.println("Escolha entre 0-5 o local onde deseja começar: ");
               option = scanner.nextInt();
                ILocal current = portal1;
                switch (option){

                    case 0:
                       current = graphMap.getVertice(0);
                       break;
                    default:
                        break;
                }



                Players players = new Players(name, teams, current);
                playerManager.addPlayer(players);
                playerManager.listPlayers();
                System.out.println(players.getCurrent());

                count++;
            } while (count < numplayers);
        }





        System.out.println("\n         ==================================================");
        System.out.println("\n==================== LET THE GAME BEGINS=============================\n");

        ArrayUnorderedList player = playerManager.getPlayersList();



        int times = 10; // quantidade de vezes que a lista será percorrida
        for (int j = 1; j < times; j++) {
            Iterator<Players> iterator = player.iterator();
            while (iterator.hasNext()) {
                System.out.println("========================Round " + j + "========================");
                System.out.println("Player Turn " + iterator.next().getName());

                //ATIVIDADE DOS JOGADORES OU SEJA MOVIMENTAÇOES ETC

            }
        }
    }


}





