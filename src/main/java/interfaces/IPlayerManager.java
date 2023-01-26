package interfaces;

import Exceptions.PlayerNotFoundException;
import players.Players;

/*
    This Interface is used to Manage the players , PlayerManager implements the interface
 */

public interface IPlayerManager {



    public void addPlayer (Players player) throws PlayerNotFoundException;

    public void removePlayers(Players player) throws PlayerNotFoundException;

    public Players findPlayerName(String name) throws  PlayerNotFoundException;

    public void updatePlayers(Players oldPlayer, Players newPlayer) throws PlayerNotFoundException;

    public void listPlayers();
}
