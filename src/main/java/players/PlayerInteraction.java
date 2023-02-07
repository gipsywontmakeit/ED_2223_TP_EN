package players;

import interfaces.Connector;
import interfaces.Player;

public class PlayerInteraction {

    private Player player;
    private Connector connector;

    private int energyLevelBefore;

    private int energyLevelAfter;

    public PlayerInteraction(Player player, Connector connector, int energyLevelBefore, int energyLevelAfter) {
        this.player = player;
        this.connector = connector;
        this.energyLevelBefore = energyLevelBefore;
        this.energyLevelAfter = energyLevelAfter;
    }


    public Player getPlayer() {
        return this.player;
    }

    public Connector getConnector() {
        return this.connector;
    }

    public int getEnergyLevelBefore() {
        return this.energyLevelBefore;
    }

    public int getEnergyLevelAfter() {
        return this.energyLevelAfter;
    }

}
