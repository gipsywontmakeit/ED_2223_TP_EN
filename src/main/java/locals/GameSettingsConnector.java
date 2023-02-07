package locals;

import interfaces.IGameSettingsConnector;

public class GameSettingsConnector implements IGameSettingsConnector {

    private int energy;

    private int cooldown;

    public GameSettingsConnector(int energy, int cooldown) {
        this.energy = energy;
        this.cooldown = cooldown;
    }

    @Override
    public int getEnergy() {
        return this.energy;
    }

    @Override
    public int getCooldown() {
        return this.cooldown;
    }

}
