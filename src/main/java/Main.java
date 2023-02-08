import java.io.IOException;
import java.util.Random;

import enums.LocalType;
import enums.Teams;
import game_settings.GameSettingsConnector;
import game_settings.GameSettingsPortal;
import graphs.Graph;
import interfaces.*;

import lists.ArrayUnorderedList;

import locals.*;

import players.*;

import exceptions.ListIsEmptyException;


public class Main {
    public static void main(String[] args) throws IOException, ListIsEmptyException {

        Players[] players = {
                new Players("ze", Teams.Giants, 0),
                new Players("joao", Teams.Giants, 1),
                new Players("maria", Teams.Sparks, 2),
                new Players("joana", Teams.Sparks, 3),
                new Players("pedro", Teams.Giants, 4),
                new Players("jose", Teams.Giants, 5),

        };




        Players player1 = new Players("ze", Teams.Giants, 0);
        Players player2 = new Players("joao", Teams.Giants, 1);
        Players player3 = new Players("maria", Teams.Sparks, 2);

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

        ILocal[] locals = {
            new Portals(1, LocalType.Portal,coordinates1, "Portal 1", gameSettingsPortal1),
            new Portals(2, LocalType.Portal,coordinates2, "Portal 2", gameSettingsPortal2),
            new Portals(3, LocalType.Portal,coordinates3, "Portal 3", gameSettingsPortal3),
            new Connectors(4, LocalType.Connector,coordinates2, gameSettingsConnector1),
            new Connectors(5, LocalType.Connector,coordinates3, gameSettingsConnector2),
            new Connectors(6, LocalType.Connector,coordinates4, gameSettingsConnector3)
        };


        Graph graphMap = new GraphMap();
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






        ArrayUnorderedList<ILocal> list = ShortestPath.shortestPath(graphMap, portal1, portal3);
        for(ILocal local : list){
            System.out.println(local);
        }



        menu menu = new menu();
        menu.startGame();



    }

}