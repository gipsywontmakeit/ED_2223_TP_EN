package players;

import enums.Teams;
import exceptions.PlayerNotFoundException;
import interfaces.IPlayerManager;
import lists.ArrayOrderedList;
import lists.ArrayUnorderedList;

import java.util.Iterator;

/**
 * The class used to Manage the players created
 */


public class PlayerManager implements IPlayerManager {

    private ArrayUnorderedList<Players> playersList;



    public PlayerManager() {
        playersList = new ArrayUnorderedList<>();
    }

    /**
     * Method Addplayer used to add the player to the list playersList
     * @param player
     */

    public void addPlayer(Players player) {
        playersList.addToRear(player);
    }

    /**
     * Method used to remove the player instanced from the list
     * @param player
     */

    public void removePlayers(Players player) {
        playersList.remove(player);
    }

    /* INGLES NÃO MUITO BEM APLICADO TER EM ATENÇÃO*/
    /**
     * Method that return the player from a list, the for cicle runs the list and stops when a player whit the same name is founded
     * @param name
     * @return
     * @throws PlayerNotFoundException
     */

    public Players findPlayerName(String name)throws PlayerNotFoundException {
        for (Players players : playersList) {
            if (players.getName().equals(name)) {
                return players;
            }
        }
            throw new PlayerNotFoundException("Jogador "+ name + " não encontrado");
    }

    /**
     *  This method use the method contain to check if he have the oldplayer, after that the iterator goes node in node checking the player we want
     *  he remove the player from that position in the list and add the updated one in the back of the list
     * @param oldPlayer the player who will be changed
     * @param newPlayer the player who will switch the old
     * @throws PlayerNotFoundException
     */

    public void updatePlayers(Players oldPlayer, Players newPlayer) throws PlayerNotFoundException {
        if (playersList.contains(oldPlayer)) {
            Iterator<Players> iterator = playersList.iterator();
            while (iterator.hasNext()) {
                Players player = iterator.next();
                if (player.equals(oldPlayer)) {
                    iterator.remove();
                    playersList.addToRear(newPlayer);
                    return;
                }

            }
        }else{
            throw new PlayerNotFoundException("Jogador "+ oldPlayer + " não encontrado");
        }
    }

    /**
     * List all the players whit an iterator
     */

    public void listPlayers() {
        if (!playersList.isEmpty()) {
            Iterator<Players> iterator = playersList.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        } else {
            System.out.println("lista vazia");

        }
    }

    /**
     * Lists all the players from the team we choose.
     * @param team parameter where we insert the team name
     */
    public void listPlayers(Teams team) {
        if (!playersList.isEmpty()) {
            Iterator<Players> iterator = playersList.iterator();
            while (iterator.hasNext()) {
                Players player = iterator.next();
                if (player.getTeam() == team) {
                    System.out.println(player);
                }
            }
        } else {
            System.out.println("Jogador dessa equipa não encontrada " + team.toString());
        }
    }

    /**
     * AINDA A ELABORAR
     */
    /**
    public void listPlayerLevel(){

        if (!playersList.isEmpty()){
            Iterator<Players> iterator = playersList.iterator();
            while (iterator.hasNext()){
                playersList.
                Players player = iterator.next();
            }
        }
    }
     */

    public ArrayUnorderedList<Players> getPlayersList() {
        return playersList;
    }



}
