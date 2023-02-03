import enums.LocalType;
import enums.Teams;
import interfaces.Portal;
import json.JsonFile;

import java.io.IOException;
import interfaces.*;
import locals.*;
import players.PlayerInteraction;
import players.PlayerInteractionLinkedList;
import players.PlayerManager;
import players.Players;

public class Main {
    public static void main(String[] args) throws IOException {
        JsonFile json = new JsonFile() ;
        PlayerManager playerManager = new PlayerManager();
        GraphMap graphMap = new GraphMap();
        PlayerInteractionLinkedList playerInteractionLinkedList = new PlayerInteractionLinkedList();

        Local local = new Portals(1, LocalType.Portal, new Coordinates(1, 2), "Portal 1", new GameSettingsPortal(1, 2, new Players("Ze", Teams.Giants)));
        local.setCoordinates(new Coordinates(2, 3));
        ILocalManagement localManagement = new LocalManagement();


        Players player3 = new Players("Manel", Teams.Giants);
        Players player4 = new Players("fra", Teams.Giants,3);
        Players player5 = new Players("TESTEEEEEEEEEEEEEEEEEEEEEEE", Teams.Giants);
        Players player6 = new Players("tuts", Teams.Giants, 2);
        Portal portal = new Portals(1, LocalType.Portal, new Coordinates(1,  2), "Portal 1", new GameSettingsPortal(1, 2, player3));
        Connector connector = new Connectors(2, LocalType.Connector, new Coordinates(1, 2), new GameSettingsConnector(1, 2));
        PlayerInteraction Movimento = new PlayerInteraction("Manel",1,10);


        playerManager.addPlayer(player5);
        playerManager.addPlayer(player3);
        playerManager.addPlayer(player4);
        playerManager.addPlayer(player6);
        playerInteractionLinkedList.addInteraction(Movimento, player3);
        json.addPlayer(playerManager);
        //playerManager.listPlayersByLevel();


        localManagement.addLocal(portal);
        localManagement.addLocal(connector);
        localManagement.addEdge(portal, connector);

        //graphMap.printAllVertices();

        System.out.println(localManagement.getGraphMap().toString());

        double lat1 = 40.7656918;
        double lon1 = -73.9737489;
        double lat2 = 40.7697989;
        double lon2 = -73.9723702;

        double distance = Haversine.haversine(lat1, lon1, lat2, lon2);
        System.out.println("The distance between the two points is: " + String.valueOf(distance).replace(".0", "") + " meters");

    }

}