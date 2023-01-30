import enums.LocalType;
import enums.Teams;
import interfaces.Portal;
import json.JsonFile;

import java.io.IOException;
import interfaces.*;
import locals.*;
import players.Players;

public class Main {
    public static void main(String[] args) throws IOException {
        //JsonFile json = new JsonFile() ;
        //json.createFile();

        Local local = new Portals(1, LocalType.Portal, new Coordinates(1, 2), "Portal 1", new GameSettingsPortal(1, 2, new Players("Ze", Teams.Giants)));
        local.setCoordinates(new Coordinates(2, 3));
        ILocalManagement localManagement = new LocalManagement();

        Players player = new Players("Ze", Teams.Giants);
        Portal portal = new Portals(1, LocalType.Portal, new Coordinates(1,  2), "Portal 1", new GameSettingsPortal(1, 2, player));
        Connector connector = new Connectors(2, LocalType.Connector, new Coordinates(1, 2), new GameSettingsConnector(1, 2));

        localManagement.addLocal(portal);
        localManagement.addLocal(connector);
        localManagement.addEdge(portal, connector);

        System.out.println(localManagement.getGraphMap().toString());

    }

}