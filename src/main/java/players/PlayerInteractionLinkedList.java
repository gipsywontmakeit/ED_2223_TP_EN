package players;

import interfaces.IPlayerInteractionLinkedList;
import lists.LinkedList;
import lists.Node;

import java.util.Iterator;

public class PlayerInteractionLinkedList extends LinkedList implements IPlayerInteractionLinkedList {


    private LinkedList<PlayerInteraction> interactionLinkedList;



    public PlayerInteractionLinkedList() {
        this.interactionLinkedList =  new LinkedList<>();
    }

    public void addInteraction(PlayerInteraction interaction, Players players) {

            interactionLinkedList.addFirstNode(interaction);

    }

    @Override
    public PlayerInteraction readInteraction(String name, LinkedList<PlayerInteraction> linkedList) {


        return null;
    }

        @Override
        public void updateLastInteraction (String name){

        }



    }
