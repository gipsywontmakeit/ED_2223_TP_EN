package game_settings;

import interfaces.IGameSettingsPortal;
import players.Players;

public class GameSettingsPortal extends GameSettings implements IGameSettingsPortal {

    private Players owner;
    private int maxEnergy;

    public GameSettingsPortal(int energy, int maxEnergy,Players owner) {
        super(energy);
        this.maxEnergy = energy;
        this.owner = owner;
    }

    @Override
    public int getMaxEnergy() {
        return this.maxEnergy;
    }

    @Override
    public void setMaxEnergy(int maxEnergy) {
        this.maxEnergy = maxEnergy;
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
