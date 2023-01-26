package game_settings;

import interfaces.IGameSettings;

public class GameSettings implements IGameSettings {
    private int energy;

    public GameSettings(int energy) {
        this.energy = energy;
    }


    @Override
    public int getEnergy() {
        return energy;
    }

    @Override
    public void setEnergy(int energy) {
        this.energy = energy;
    }
}
