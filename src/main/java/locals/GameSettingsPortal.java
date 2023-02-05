package locals;

import interfaces.IGameSettingsPortal;
import players.Players;

public class GameSettingsPortal implements IGameSettingsPortal {

    private int energy;
    private int maxEnergy;
    private Players owner;

    public GameSettingsPortal(int energy, int maxEnergy, Players owner) {
        this.energy = energy;
        this.maxEnergy = maxEnergy;
        this.owner = owner;
    }

    @Override
    public int getEnergy() {
        return this.energy;
    }

    @Override
    public void setEnergy(int energy) {
        this.energy = energy;
    }

    @Override
    public int getMaxEnergy() {
        return this.maxEnergy;
    }

    @Override
    public Players getOwner() {
        return this.owner;
    }

    @Override
    public void setOwner(Players owner) {
        this.owner = owner;
    }
}
