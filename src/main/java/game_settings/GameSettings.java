package game_settings;

public abstract class GameSettings {
    private int energy;

    public GameSettings(int energy) {
        this.energy = energy;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

}
