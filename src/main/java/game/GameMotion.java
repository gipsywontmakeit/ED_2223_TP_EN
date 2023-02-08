package game;


import interfaces.IConnector;
import interfaces.IPlayer;
import interfaces.IPortal;
import lists.ArrayUnorderedList;

public class GameMotion {
    private ArrayUnorderedList<IPlayer> players;
    private ArrayUnorderedList<IConnector> connectors;
    private ArrayUnorderedList<IPortal> portals;



    public GameMotion(ArrayUnorderedList<IPlayer> players, ArrayUnorderedList<IConnector> connectors, ArrayUnorderedList<IPortal> portals) {
        this.players = players;
        this.connectors = connectors;
        this.portals = portals;
    }

    public void playerMoves(IPlayer player, IConnector fromConnector, IConnector toConnector) {
        

    }
}
