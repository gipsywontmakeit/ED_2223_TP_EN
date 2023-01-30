import enums.Teams;
import json.JsonFile;
import locals.Portals;
import players.PlayerManager;
import players.Players;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        JsonFile json = new JsonFile();
        PlayerManager playerManager = new PlayerManager();


        System.out.println("Hello World!");

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





    }
}
