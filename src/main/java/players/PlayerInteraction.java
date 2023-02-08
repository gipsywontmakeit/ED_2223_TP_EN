package players;

import interfaces.IConnector;
import interfaces.IPlayer;

public class PlayerInteraction {

    private IPlayer player;
    private IConnector connector;

    private int energyLevelBefore;

    private int energyLevelAfter;

    public PlayerInteraction(IPlayer player, IConnector connector, int energyLevelBefore, int energyLevelAfter) {
        this.player = player;
        this.connector = connector;
        this.energyLevelBefore = energyLevelBefore;
        this.energyLevelAfter = energyLevelAfter;
    }


    public IPlayer getPlayer() {
        return this.player;
    }

    public IConnector getConnector() {
        return this.connector;
    }

    public int getEnergyLevelBefore() {
        return this.energyLevelBefore;
    }

    public int getEnergyLevelAfter() {
        return this.energyLevelAfter;
    }

}
