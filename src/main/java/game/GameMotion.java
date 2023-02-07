package game;

import interfaces.Connector;
import interfaces.Player;
import interfaces.Portal;
import lists.ArrayUnorderedList;

public class GameMotion {
    private ArrayUnorderedList<Player> players;
    private ArrayUnorderedList<Connector> connectors;
    private ArrayUnorderedList<Portal> portals;

    public GameMotion(ArrayUnorderedList<Player> players, ArrayUnorderedList<Connector> connectors, ArrayUnorderedList<Portal> portals) {
        this.players = players;
        this.connectors = connectors;
        this.portals = portals;
    }

    public void playerMoves(Player player, Connector fromConnector, Connector toConnector) {
        int xpGain = player.getExperiencePoints() + 10;
    }
}
