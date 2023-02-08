package interfaces;

import enums.Teams;
import exceptions.ListIsEmptyException;
import exceptions.PlayerNotFoundException;
import exceptions.TeamNotFoundException;
import players.Players;

/*
    This Interface is used to Manage the players , PlayerManager implements the interface
 */

public interface IPlayerManager {



    public void addPlayer (Players player) throws PlayerNotFoundException;

    public void removePlayers(Players player) throws PlayerNotFoundException;

    /**
     *
     * @param name
     * @return
     * @throws PlayerNotFoundException
     */

    public Players findPlayerName(String name) throws  PlayerNotFoundException;

    /**
     * Change the oldPlayer by a newPlayer
     * @param oldPlayer we check the player to switch from the new
     * @param newPlayer we change the old for the new player created
     * @throws PlayerNotFoundException
     */

    public void updatePlayers(Players oldPlayer, Players newPlayer) throws PlayerNotFoundException;

    public void listPlayers() throws ListIsEmptyException;

    /**
     * List all the players from the desired team
     * @param team where we choose the team we want to find
     * @throws TeamNotFoundException
     * @throws ListIsEmptyException
     */

    public void listPlayers(Teams team) throws TeamNotFoundException, ListIsEmptyException;

    /**
     * List all players by level
     * @throws ListIsEmptyException
     */
    public void listPlayersByLevel() throws ListIsEmptyException;
}
