package players;

import interfaces.Connector;
import interfaces.IPlayerInteraction;
import interfaces.Player;

public class PlayerInteraction {

    Player player;
    Connector connector;
    String playerName;
    long timestamp;

    public PlayerInteraction(String playerName, Connector connector, long timestamp) {
        this.playerName = playerName;
        this.connector = connector;
        this.timestamp = timestamp;
    }

    public String getPlayerName() {
        return playerName = player.getName();
    }

    public int getConnectorID() {
        return connector.getId();
    }

    @Override
    public String toString() {
        return "PlayerInteraction{" +
                "playerName='" + playerName + '\'' +
                ", connectorID=" + connector +
                ", timestamp=" + timestamp +
                '}';
    }
}
