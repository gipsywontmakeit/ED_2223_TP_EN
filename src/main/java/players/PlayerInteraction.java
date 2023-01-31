package players;

import interfaces.Connector;
import interfaces.Player;

public class PlayerInteraction {

    Player player;
    Connector connector;
    String playerName;
    int connectorID;
    long timestamp;

    public PlayerInteraction(String playerName, int connectorID, long timestamp) {
        this.playerName = playerName;
        this.connectorID = connectorID;
        this.timestamp = timestamp;
    }

    public String getPlayerName() {
        return playerName = player.getName();
    }

    public int getConnectorID() {
        return connectorID = connector.getId();
    }

}
