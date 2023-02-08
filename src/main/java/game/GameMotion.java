package game;


import interfaces.IConnector;
import interfaces.ILocal;
import interfaces.IPlayer;
import interfaces.IPortal;
import lists.ArrayUnorderedList;
import locals.Portals;
import queues.LinkedQueue;
import queues.QueueADT;


public class GameMotion {
    private ArrayUnorderedList<IPlayer> players;
    private ArrayUnorderedList<IConnector> connectors;
    private ArrayUnorderedList<IPortal> portals;



    public GameMotion(ArrayUnorderedList<IPlayer> players, ArrayUnorderedList<IConnector> connectors, ArrayUnorderedList<IPortal> portals) {
        this.players = players;
        this.connectors = connectors;
        this.portals = portals;
    }



}
