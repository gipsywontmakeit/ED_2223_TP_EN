<<<<<<< HEAD
import enums.Teams;
=======
import enums.LocalType;
import enums.Teams;
import interfaces.Portal;
>>>>>>> fac0b7703badfe1f75945b85b9c9d567a0df2ec5
import json.JsonFile;
import locals.Portals;
import players.PlayerManager;
import players.Players;

import java.io.IOException;
import interfaces.*;
import locals.*;
import players.Players;

public class Main {
    public static void main(String[] args) throws IOException {
<<<<<<< HEAD
        JsonFile json = new JsonFile();
        PlayerManager playerManager = new PlayerManager();

=======
        //JsonFile json = new JsonFile() ;
        //json.createFile();
>>>>>>> fac0b7703badfe1f75945b85b9c9d567a0df2ec5

        Local local = new Portals(1, LocalType.Portal, new Coordinates(1, 2), "Portal 1", new GameSettingsPortal(1, 2, new Players("Ze", Teams.Giants)));
        local.setCoordinates(new Coordinates(2, 3));
        ILocalManagement localManagement = new LocalManagement();

<<<<<<< HEAD
        Players Nico = new Players("Nico", Teams.Sparks);
        Players t2 = new Players("Manuel", Teams.Sparks);
        Players t3 = new Players("CLisman", Teams.Giants);
        Players t4 = new Players("Gastro", Teams.Giants);
        Players Daniel = new Players("Daniel", Teams.Sparks);

        playerManager.addPlayer(Nico);
        playerManager.addPlayer(t2);
        playerManager.addPlayer(t3);
        playerManager.addPlayer(t4);
        playerManager.addPlayer(Daniel);


        playerManager.listPlayers();
        System.out.println("-------------------");
        playerManager.listPlayerTeam(Teams.Sparks);
        json.createFile();
        json.addPlayer(playerManager);




=======
        Players player = new Players("Ze", Teams.Giants);
        Portal portal = new Portals(1, LocalType.Portal, new Coordinates(1,  2), "Portal 1", new GameSettingsPortal(1, 2, player));
        Connector connector = new Connectors(2, LocalType.Connector, new Coordinates(1, 2), new GameSettingsConnector(1, 2));

        localManagement.addLocal(portal);
        localManagement.addLocal(connector);
        localManagement.addEdge(portal, connector);

        System.out.println(localManagement.getGraphMap().toString());
>>>>>>> fac0b7703badfe1f75945b85b9c9d567a0df2ec5

    }

}