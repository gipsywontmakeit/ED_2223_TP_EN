package players;

import interfaces.Connector;
import interfaces.Player;

public class PlayerInteraction {

    private Player player;
    private Connector connector;

    private int EnergyLevelBefore;

    private int EnergyLevelAfter;

    public PlayerInteraction(Player player, Connector connector) {
        this.player = player;
        this.connector = connector;
    }


    public Player getPlayer() {
        return this.player;
    }

    public Connector getConnector() {
        return this.connector;
    }

}
