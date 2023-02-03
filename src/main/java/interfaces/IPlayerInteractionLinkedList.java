package interfaces;

import lists.LinkedList;
import players.PlayerInteraction;
import players.Players;

public interface IPlayerInteractionLinkedList {
    /**
     * Add the interaction in the respective client if already exists, if not add the interaction
     *
     * @param interaction
     */
    public void addInteraction(PlayerInteraction interaction, Players players);

    /**
     * Run all the List to
     *
     * @param name
     */
    PlayerInteraction readInteraction(String name, LinkedList<PlayerInteraction> linkedList);


    public void updateLastInteraction(String name);
}
