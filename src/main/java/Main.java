import enums.LocalType;
import enums.Teams;
import game_settings.GameSettingsConnector;
import game_settings.GameSettingsPortal;
import interfaces.Portal;

import java.io.IOException;
import java.time.LocalDateTime;

import interfaces.*;
import json.JsonFile;
import lists.ArrayUnorderedList;
import locals.*;
import players.*;


import players.PlayerManager;

public class Main {
    public static void main(String[] args) throws IOException {
        JsonFile json = new JsonFile() ;
        PlayerManager playerManager = new PlayerManager();
        GraphMap graphMap = new GraphMap();
        PlayerInteractionLinkedList playerInteractionLinkedList = new PlayerInteractionLinkedList();

        Local local = new Portals(1, LocalType.Portal, new Coordinates(1, 2), "Portal 1", new GameSettingsPortal(1, 2,new Players("nico",Teams.Giants)));
        local.setCoordinates(new Coordinates(2, 3));
        ILocalManagement localManagement = new LocalManagement();


        Players player3 = new Players("Manel", Teams.Giants);
        Players player4 = new Players("fra", Teams.Giants,3);
        Players player5 = new Players("TESTEEEEEEEEEEEEEEEEEEEEEEE", Teams.Giants);
        Players player6 = new Players("tuts", Teams.Giants, 2);
        Players player7 = new Players("abcd", Teams.Giants, 2, 200, 100);
        Portal portal = new Portals(1, LocalType.Portal, new Coordinates(1,  2), "Portal 1", new GameSettingsPortal(1, 2, player3));
        Connector connector = new Connectors(2, LocalType.Connector, new Coordinates(1, 2), new GameSettingsConnector(1, 2));
        //PlayerInteraction Movimento = new PlayerInteraction("Manel",1,10);

        ArrayUnorderedList<GameSettingsPortal> realPortals = new ArrayUnorderedList<>();

        playerManager.addPlayer(player5);
        playerManager.addPlayer(player3);
        playerManager.addPlayer(player4);
        playerManager.addPlayer(player6);
        playerManager.addPlayer(player7);
        PlayerInteraction playerInteraction = new PlayerInteraction(player7, connector, player7.getCurrentEnergy(), 1 + 2);
        InteractionRecord interactionRecord = new InteractionRecord(player7, LocalDateTime.now());


        localManagement.addLocal(portal);
        localManagement.addLocal(connector);
        localManagement.addEdge(portal, connector, 1);

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